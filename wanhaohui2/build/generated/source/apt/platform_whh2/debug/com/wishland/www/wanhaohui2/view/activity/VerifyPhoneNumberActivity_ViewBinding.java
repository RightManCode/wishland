// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VerifyPhoneNumberActivity_ViewBinding implements Unbinder {
  private VerifyPhoneNumberActivity target;

  @UiThread
  public VerifyPhoneNumberActivity_ViewBinding(VerifyPhoneNumberActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VerifyPhoneNumberActivity_ViewBinding(VerifyPhoneNumberActivity target, View source) {
    this.target = target;

    target.login_new_phone = Utils.findRequiredViewAsType(source, R.id.login_new_phone, "field 'login_new_phone'", EditText.class);
    target.sendVertify = Utils.findRequiredViewAsType(source, R.id.bt_vertify_send, "field 'sendVertify'", Button.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VerifyPhoneNumberActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.login_new_phone = null;
    target.sendVertify = null;
    target.emptyLayout = null;
  }
}
