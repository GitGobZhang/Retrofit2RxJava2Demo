package com.gitgob.retrofit2rxjava2demo.rxjava;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.widget.Toast;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * @version V1.0 <描述当前版本功能>
 * @FileName:BaseObserver.java
 * @author: Zch
 * @date: 2017-03-10 14:18
 */
public abstract class BaseObserver<T> implements Observer<T> {

    private Context mContext;
    private ProgressDialog mDialog;
    private Disposable mDisposable;
    private final int SUCCESS_CODE = 0;

    public BaseObserver(Context context, ProgressDialog dialog){
        this.mContext = context;
        this.mDialog = dialog;

        dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                mDisposable.dispose();
            }
        });
    }

    @Override
    public void onSubscribe(Disposable d) {
        mDisposable = d;
    }

    @Override
    public void onNext(T t) {
        if (t != null){
            onHandleSuccess(t);
        }else {
            onHandleError(t);
        }
    }

    @Override
    public void onError(Throwable e) {
        Log.d("gesanri", "error:" + e.toString());

        if (mDialog != null && mDialog.isShowing()){
            mDialog.dismiss();
        }

        Toast.makeText(mContext, "网络异常，请稍后再试", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onComplete() {
        Log.d("gesanri", "onComplete");

        if(mDialog != null && mDialog.isShowing()){
            mDialog.dismiss();
        }
    }

    public abstract void onHandleSuccess(T t);

    private void onHandleError(T t) {
        Toast.makeText(mContext, "----", Toast.LENGTH_LONG).show();
    }
}
