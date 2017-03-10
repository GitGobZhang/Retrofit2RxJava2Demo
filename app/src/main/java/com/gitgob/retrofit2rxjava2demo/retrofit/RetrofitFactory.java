package com.gitgob.retrofit2rxjava2demo.retrofit;


import com.gitgob.retrofit2rxjava2demo.service.ApiService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @version V1.0 <描述当前版本功能>
 * @FileName:RetrofitFactory.java
 * @author: Zch
 * @date: 2017-03-10 13:44
 */
public class RetrofitFactory {

    private static String baseUrl = "http://101.201.44.70:8086/";

    public ApiService mApiService;

    private static RetrofitFactory instance;

    private RetrofitFactory(){

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10,TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request.Builder builder = chain.request().newBuilder();
                        builder.addHeader("token","abc");
                        return chain.proceed(builder.build());
                    }
                }).build();

        mApiService = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
                .create(ApiService.class);

    }

    public static RetrofitFactory getInstance(){
        if (instance == null){
            synchronized (RetrofitFactory.class){
                if (instance == null){
                    instance = new RetrofitFactory();
                }
            }
        }
        return instance;
    }
}
