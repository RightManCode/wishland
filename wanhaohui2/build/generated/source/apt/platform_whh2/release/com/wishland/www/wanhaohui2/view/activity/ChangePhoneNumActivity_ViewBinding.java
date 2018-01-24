// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangePhoneNumActivity_ViewBinding implements Unbinder {
  private ChangePhoneNumActivity target;

  private View view2131558604;

  private View view2131558606;

  private View view2131558607;

  @UiThread
  public ChangePhoneNumActivity_ViewBinding(ChangePhoneNumActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangePhoneNumActivity_ViewBinding(final ChangePhoneNumActivity target, View source) {
    this.target = target;

    View view;
    target.phoneNumber = Utils.findRequiredViewAsType(source, R.id.login_edit_username, "field 'phoneNumber'", TextView.class);
    target.vertifyCode = Utils.findRequiredViewAsType(source, R.id.login_edit_passwork, "field 'vertifyCode'", EditText.class);
    target.newPhoneNum = Utils.findRequiredViewAsType(source, R.id.login_new_phone, "field 'newPhoneNum'", EditText.class);
    view = Utils.findRequiredView(source, R.id.tv_code, "field 'tv_code' and method 'onViewClick'");
    target.tv_code = Utils.castView(view, R.id.tv_code, "field 'tv_code'", TextView.class);
    view2131558604 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.point = Utils.findRequiredViewAsType(source, R.id.tv_tishi, "field 'point'", TextView.class);
    view = Utils.findRequiredView(source, R.id.bt_vertify_send, "field 'sendVertify' and method 'onViewClick'");
    target.sendVertify = Utils.castView(view, R.id.bt_vertify_send, "field 'sendVertify'", Button.class);
    view2131558606 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_contact_kf, "field 'tv_contact_kf' and method 'onViewClick'");
    target.tv_contact_kf = Utils.castView(view, R.id.tv_contact_kf, "field 'tv_contact_kf'", TextView.class);
    view2131558607 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChangePhoneNumActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.phoneNumber = null;
    target.vertifyCode = null;
    target.newPhoneNum = null;
    target.tv_code = null;
    target.point = null;
    target.sendVertify = null;
    target.tv_contact_kf = null;
    target.emptyLayout = null;

    view2131558604.setOnClickListener(null);
    view2131558604 = null;
    view2131558606.setOnClickListener(null);
    view2131558606 = null;
    view2131558607.setOnClickListener(null);
    view2131558607 = null;
  }
}
