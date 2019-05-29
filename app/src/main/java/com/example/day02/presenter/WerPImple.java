package com.example.day02.presenter;

import com.example.day02.bean.WerBean;
import com.example.day02.callback.CallBack;
import com.example.day02.model.WerM;
import com.example.day02.view.WerView;

public class WerPImple implements WerP, CallBack {

    private WerM werM;
    private WerView werView;

    public WerPImple(WerM werM, WerView werView) {
        this.werM = werM;
        this.werView = werView;
    }

    @Override
    public void getData() {
        if (werM != null) {
            werM.getData(this);
        }
    }

    @Override
    public void onSuccess(WerBean bean) {
        werView.onSuccess(bean);
    }

    @Override
    public void onFail(String msg) {
        werView.onFail(msg);
    }
}
