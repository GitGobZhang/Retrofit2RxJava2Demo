package com.gitgob.retrofit2rxjava2demo.service;

import com.gitgob.retrofit2rxjava2demo.entity.SortBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @version V1.0 <描述当前版本功能>
 * @FileName:ApiService.java
 * @author: Zch
 * @date: 2017-03-10 13:46
 */
public interface ApiService {

    @GET("app/appStoreKind/bsCertificateInfo/kind")
    Observable<SortBean> getSortData();

}
