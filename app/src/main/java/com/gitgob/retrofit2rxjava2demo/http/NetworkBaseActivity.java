package com.gitgob.retrofit2rxjava2demo.http;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @version V1.0 <描述当前版本功能>
 * @FileName:NetworkBaseActivity.java
 * @author: Zch
 * @date: 2017-03-10 14:05
 */
public class NetworkBaseActivity extends AppCompatActivity {

    public ProgressDialog pd;

    public ObservableTransformer mTransformer;

    private final long RETRY_TIMES = 1;

    private boolean showloading = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
    }

    private void init() {

        pd = new ProgressDialog(this);

        mTransformer = new ObservableTransformer() {
            @Override
            public ObservableSource apply(Observable upstream) {
                return upstream.retry(RETRY_TIMES)
                        .subscribeOn(Schedulers.io())
                        .doOnSubscribe(new Consumer<Disposable>() {
                            @Override
                            public void accept(@NonNull Disposable disposable) throws Exception {
                                if (NetworkUtil.isNetworkAvailable(NetworkBaseActivity.this)){
                                    if (showloading){
                                        if (pd != null && !pd.isShowing()){
                                            pd.show();
                                        }
                                    }
                                }else {
                                    Toast.makeText(NetworkBaseActivity.this, "网络连接异常，请检查网络", Toast.LENGTH_LONG).show();
                                }
                            }
                        }).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public void setLoadingFlag(boolean show){
        showloading = show;
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (pd != null && pd.isShowing()){
            pd.dismiss();
        }
    }
}
