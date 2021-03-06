// This file was generated by PermissionsDispatcher. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.v4.app.ActivityCompat;
import java.lang.String;
import permissions.dispatcher.PermissionUtils;

final class WelcomeNewActivityPermissionsDispatcher {
  private static final int REQUEST_DOCALL = 1;

  private static final String[] PERMISSION_DOCALL = new String[] {"android.permission.READ_EXTERNAL_STORAGE","android.permission.WRITE_EXTERNAL_STORAGE","android.permission.READ_PHONE_STATE","android.permission.GET_TASKS"};

  private WelcomeNewActivityPermissionsDispatcher() {
  }

  static void doCallWithCheck(WelcomeNewActivity target) {
    if (PermissionUtils.hasSelfPermissions(target, PERMISSION_DOCALL)) {
      target.doCall();
    } else {
      ActivityCompat.requestPermissions(target, PERMISSION_DOCALL, REQUEST_DOCALL);
    }
  }

  static void onRequestPermissionsResult(WelcomeNewActivity target, int requestCode,
      int[] grantResults) {
    switch (requestCode) {
      case REQUEST_DOCALL:
      if (PermissionUtils.verifyPermissions(grantResults)) {
        target.doCall();
      } else {
        target.refuse();
      }
      break;
      default:
      break;
    }
  }
}
