package com.example.day02.view;

import com.example.day02.bean.WerBean;

public interface WerView {

    void onSuccess(WerBean bean);

    void onFail(String msg);
}
