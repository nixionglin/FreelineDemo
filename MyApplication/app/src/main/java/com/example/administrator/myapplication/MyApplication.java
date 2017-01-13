package com.example.administrator.myapplication;

import com.antfortune.freeline.FreelineCore;
import com.example.mylibrary.core.BaseApplication;

/**
 * Created by Administrator on 2017/1/12.
 */

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        FreelineCore.init(this);
        super.onCreate();
    }
}
