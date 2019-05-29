package com.example.day02.callback;

import com.example.day02.bean.WerBean;

public interface CallBack {


    void onSuccess(WerBean bean);

    void onFail(String msg);
}
