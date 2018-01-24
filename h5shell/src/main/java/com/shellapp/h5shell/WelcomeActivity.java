package com.shellapp.h5shell;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.AbsCallback;

import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Response;
import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;

/**
 * Created by admin on 2017/10/13.
 */

@RuntimePermissions
public class WelcomeActivity extends AppCompatActivity {
    private String baseUrl = "";
    private boolean isLoadHttp = false;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (isLoadHttp) {
                return;
            }
            switch (msg.what) {
                case 1: {
                    String ip = (String) msg.obj;
                    if (ip != null) {
                        isLoadHttp = true;
                        initHttp(ip);
                    } else {
                        isLoadHttp = true;

                        initHttp(baseUrl);
                    }
                }
                break;
            }
        }
    };

    private void initHttp(String ip) {
//        String url = "";
//        if (ip.contains("http")) {
//            url = ip;
//        } else {
//            url = "http://" + ip + "/";
//        }

        Intent intent = new Intent(WelcomeActivity.this, DetailsHtmlPageActivityNew.class);
        intent.putExtra("url", ip);
        startActivity(intent);
        finish();



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //判断是否有网络
        if (!JudgeNewWorkUtil.isNetworkAvalible(this)) {
            setContentView(R.layout.view_nonetwork);
            ToastUtil.showUI(this, "网络异常,请检查设置！");
            return;
        }
        setContentView(R.layout.welcome);
        ButterKnife.bind(this);


        WelcomeActivityPermissionsDispatcher.doCallWithCheck(this);

    }

    private void init() {
        try {
            baseUrl = getString(R.string.AliUrl);
            RequestHttpDnsIp.initHttpDns(this, mHandler, baseUrl);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @NeedsPermission({Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    void doCall() {
        init();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        WelcomeActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    }

    @OnShowRationale({Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    void showDialog(final PermissionRequest request) {
        request.proceed();
    }

    @OnPermissionDenied({Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    void refuse() {
        init();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }


    @Override
    public void onResume() {
        super.onResume();
//
    }

    @Override
    public void onPause() {
        super.onPause();
//
    }

}