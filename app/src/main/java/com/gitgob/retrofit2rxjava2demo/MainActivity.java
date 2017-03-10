package com.gitgob.retrofit2rxjava2demo;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.gitgob.retrofit2rxjava2demo.entity.SortBean;
import com.gitgob.retrofit2rxjava2demo.http.NetworkBaseActivity;
import com.gitgob.retrofit2rxjava2demo.retrofit.RetrofitFactory;
import com.gitgob.retrofit2rxjava2demo.rxjava.BaseObserver;

public class MainActivity extends NetworkBaseActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.text_view);

       RetrofitFactory.getInstance().mApiService.getSortData().compose(mTransformer).subscribe(new BaseObserver<SortBean>(MainActivity.this,pd){
            @Override
            public void onHandleSuccess(SortBean sortBean) {
                Log.e(TAG,sortBean.getResultMap().getCatListOne().get(0).getBcatName()+"");
                textView.setText(sortBean.getResultMap().getCatListOne().get(0).getBcatName());
            }
        });
    }
}
