package com.example.levivas.configuredapp.ui.second;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.levivas.configuredapp.R;
import com.example.levivas.configuredapp.BR;
import com.example.levivas.configuredapp.databinding.ActivitySecondBinding;
import com.example.levivas.configuredapp.ui.base.BaseActivity;
import com.example.levivas.configuredapp.ui.second.viewmodel.SecondViewModel;

import javax.inject.Inject;

public class SecondActivity extends BaseActivity<ActivitySecondBinding, SecondViewModel> {
    @Inject
    SecondViewModel mSecondViewModel;

    public static Intent newIntent(Context context) {
        return new Intent(context, SecondActivity.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_second;
    }

    @Override
    public SecondViewModel getViewModel() {
        return mSecondViewModel;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
}