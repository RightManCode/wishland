// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangePswActivity_ViewBinding implements Unbinder {
  private ChangePswActivity target;

  private View view2131558592;

  private View view2131558608;

  private View view2131558610;

  private View view2131558613;

  private View view2131558589;

  private View view2131558591;

  @UiThread
  public ChangePswActivity_ViewBinding(ChangePswActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangePswActivity_ViewBinding(final ChangePswActivity target, View source) {
    this.target = target;

    View view;
    target.et_old_password = Utils.findRequiredViewAsType(source, R.id.et_old_password, "field 'et_old_password'", EditText.class);
    target.et_new_password = Utils.findRequiredViewAsType(source, R.id.et_new_password, "field 'et_new_password'", EditText.class);
    target.et_sure_password = Utils.findRequiredViewAsType(source, R.id.et_sure_password, "field 'et_sure_password'", EditText.class);
    view = Utils.findRequiredView(source, R.id.bt_login, "field 'bt_login' and method 'onViewClick'");
    target.bt_login = Utils.castView(view, R.id.bt_login, "field 'bt_login'", Button.class);
    view2131558592 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_login_psw, "field 'rl_login_psw' and method 'onViewClick'");
    target.rl_login_psw = Utils.castView(view, R.id.rl_login_psw, "field 'rl_login_psw'", RelativeLayout.class);
    view2131558608 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_pay_psw, "field 'rl_pay_psw' and method 'onViewClick'");
    target.rl_pay_psw = Utils.castView(view, R.id.rl_pay_psw, "field 'rl_pay_psw'", RelativeLayout.class);
    view2131558610 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.tv_login_psw = Utils.findRequiredViewAsType(source, R.id.tv_login_psw, "field 'tv_login_psw'", TextView.class);
    target.tv_pay_psw = Utils.findRequiredViewAsType(source, R.id.tv_pay_psw, "field 'tv_pay_psw'", TextView.class);
    target.empty_layout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'empty_layout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.cb_old_eye, "field 'cb_old_eye' and method 'onViewClick'");
    target.cb_old_eye = Utils.castView(view, R.id.cb_old_eye, "field 'cb_old_eye'", CheckBox.class);
    view2131558613 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cb_new_eye, "field 'cb_new_eye' and method 'onViewClick'");
    target.cb_new_eye = Utils.castView(view, R.id.cb_new_eye, "field 'cb_new_eye'", CheckBox.class);
    view2131558589 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cb_new_psw, "field 'cb_new_psw' and method 'onViewClick'");
    target.cb_new_psw = Utils.castView(view, R.id.cb_new_psw, "field 'cb_new_psw'", CheckBox.class);
    view2131558591 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ChangePswActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.et_old_password = null;
    target.et_new_password = null;
    target.et_sure_password = null;
    target.bt_login = null;
    target.rl_login_psw = null;
    target.rl_pay_psw = null;
    target.tv_login_psw = null;
    target.tv_pay_psw = null;
    target.empty_layout = null;
    target.cb_old_eye = null;
    target.cb_new_eye = null;
    target.cb_new_psw = null;

    view2131558592.setOnClickListener(null);
    view2131558592 = null;
    view2131558608.setOnClickListener(null);
    view2131558608 = null;
    view2131558610.setOnClickListener(null);
    view2131558610 = null;
    view2131558613.setOnClickListener(null);
    view2131558613 = null;
    view2131558589.setOnClickListener(null);
    view2131558589 = null;
    view2131558591.setOnClickListener(null);
    view2131558591 = null;
  }
}
