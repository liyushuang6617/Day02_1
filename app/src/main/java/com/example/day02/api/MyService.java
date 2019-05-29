package com.example.day02.api;

import com.example.day02.bean.WerBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MyService {

    public String url = "http://gank.io/api/data/";
    @GET("%E7%A6%8F%E5%88%A9/20/1")
    Observable<WerBean> wer();
}
