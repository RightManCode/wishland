// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.suke.widget.SwitchButton;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131558767;

  private View view2131558766;

  private View view2131558604;

  private View view2131558772;

  private View view2131558771;

  private View view2131558763;

  private View view2131558765;

  private View view2131558592;

  private View view2131558770;

  private View view2131558759;

  private View view2131558756;

  private View view2131558773;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.etUserName = Utils.findRequiredViewAsType(source, R.id.et_user_name, "field 'etUserName'", EditText.class);
    target.etPassWord = Utils.findRequiredViewAsType(source, R.id.et_user_password, "field 'etPassWord'", EditText.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    target.llFastLogin = Utils.findRequiredViewAsType(source, R.id.ll_fast_login, "field 'llFastLogin'", LinearLayout.class);
    target.llNormalLogin = Utils.findRequiredViewAsType(source, R.id.ll_normal_login, "field 'llNormalLogin'", LinearLayout.class);
    target.tvFastLogin = Utils.findRequiredViewAsType(source, R.id.tv_fast_login, "field 'tvFastLogin'", TextView.class);
    target.tvNormalLogin = Utils.findRequiredViewAsType(source, R.id.tv_normal_login, "field 'tvNormalLogin'", TextView.class);
    target.tvFastView = Utils.findRequiredViewAsType(source, R.id.tv_fast_view, "field 'tvFastView'", TextView.class);
    target.tvNormalView = Utils.findRequiredViewAsType(source, R.id.tv_normal_view, "field 'tvNormalView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_forget, "field 'tvForget' and method 'onViewClicked'");
    target.tvForget = Utils.castView(view, R.id.tv_forget, "field 'tvForget'", TextView.class);
    view2131558767 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.switchButton = Utils.findRequiredViewAsType(source, R.id.bt_switch, "field 'switchButton'", SwitchButton.class);
    view = Utils.findRequiredView(source, R.id.cb_eye, "field 'cbEye' and method 'onViewClicked'");
    target.cbEye = Utils.castView(view, R.id.cb_eye, "field 'cbEye'", CheckBox.class);
    view2131558766 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_code, "field 'tv_code' and method 'onViewClicked'");
    target.tv_code = Utils.castView(view, R.id.tv_code, "field 'tv_code'", TextView.class);
    view2131558604 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.phoneNumber = Utils.findRequiredViewAsType(source, R.id.login_edit_username, "field 'phoneNumber'", TextView.class);
    target.vertifyNum = Utils.findRequiredViewAsType(source, R.id.login_edit_passwork, "field 'vertifyNum'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_login_advertising, "field 'loginAdvertising' and method 'onViewClicked'");
    target.loginAdvertising = Utils.castView(view, R.id.iv_login_advertising, "field 'loginAdvertising'", ImageView.class);
    view2131558772 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tx_connection_problem, "field 'tx_connection_problem' and method 'onViewClicked'");
    target.tx_connection_problem = Utils.castView(view, R.id.tx_connection_problem, "field 'tx_connection_problem'", TextView.class);
    view2131558771 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_cha1, "field 'ivCha1' and method 'onViewClicked'");
    target.ivCha1 = Utils.castView(view, R.id.iv_cha1, "field 'ivCha1'", ImageView.class);
    view2131558763 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_cha2, "field 'ivCha2' and method 'onViewClicked'");
    target.ivCha2 = Utils.castView(view, R.id.iv_cha2, "field 'ivCha2'", ImageView.class);
    view2131558765 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_login, "method 'onViewClicked'");
    view2131558592 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_register, "method 'onViewClicked'");
    view2131558770 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_fast, "method 'onViewClicked'");
    view2131558759 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_normal, "method 'onViewClicked'");
    view2131558756 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_close, "method 'onViewClicked'");
    view2131558773 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etUserName = null;
    target.etPassWord = null;
    target.emptyLayout = null;
    target.llFastLogin = null;
    target.llNormalLogin = null;
    target.tvFastLogin = null;
    target.tvNormalLogin = null;
    target.tvFastView = null;
    target.tvNormalView = null;
    target.tvForget = null;
    target.switchButton = null;
    target.cbEye = null;
    target.tv_code = null;
    target.phoneNumber = null;
    target.vertifyNum = null;
    target.loginAdvertising = null;
    target.tx_connection_problem = null;
    target.ivCha1 = null;
    target.ivCha2 = null;

    view2131558767.setOnClickListener(null);
    view2131558767 = null;
    view2131558766.setOnClickListener(null);
    view2131558766 = null;
    view2131558604.setOnClickListener(null);
    view2131558604 = null;
    view2131558772.setOnClickListener(null);
    view2131558772 = null;
    view2131558771.setOnClickListener(null);
    view2131558771 = null;
    view2131558763.setOnClickListener(null);
    view2131558763 = null;
    view2131558765.setOnClickListener(null);
    view2131558765 = null;
    view2131558592.setOnClickListener(null);
    view2131558592 = null;
    view2131558770.setOnClickListener(null);
    view2131558770 = null;
    view2131558759.setOnClickListener(null);
    view2131558759 = null;
    view2131558756.setOnClickListener(null);
    view2131558756 = null;
    view2131558773.setOnClickListener(null);
    view2131558773 = null;
  }
}
