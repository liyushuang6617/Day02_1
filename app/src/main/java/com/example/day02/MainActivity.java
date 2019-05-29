package com.example.day02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.day02.adapter.RlvWerAdapter;
import com.example.day02.bean.WerBean;
import com.example.day02.model.WerMImple;
import com.example.day02.presenter.WerP;
import com.example.day02.presenter.WerPImple;
import com.example.day02.view.WerView;

import java.util.ArrayList;

//李玉爽   1810A
public class MainActivity extends AppCompatActivity implements WerView {

    private RecyclerView mRe;
    private ArrayList<WerBean.ResultsBean> list;
    private RlvWerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        WerP werP = new WerPImple(new WerMImple(), this);
        werP.getData();
    }

    private void initView() {
        mRe = (RecyclerView) findViewById(R.id.re);
        list = new ArrayList<>();
        adapter = new RlvWerAdapter(this, list);
        mRe.setAdapter(adapter);
        mRe.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onSuccess(WerBean bean) {
        list.addAll(bean.getResults());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onFail(String msg) {

    }
}
