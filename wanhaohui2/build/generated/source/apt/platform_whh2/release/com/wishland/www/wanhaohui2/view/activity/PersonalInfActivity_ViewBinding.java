// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PersonalInfActivity_ViewBinding implements Unbinder {
  private PersonalInfActivity target;

  private View view2131558701;

  private View view2131558809;

  private View view2131558811;

  private View view2131558815;

  private View view2131558816;

  private View view2131558886;

  @UiThread
  public PersonalInfActivity_ViewBinding(PersonalInfActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PersonalInfActivity_ViewBinding(final PersonalInfActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.rl_bank_change, "field 'rl_bank_change' and method 'onViewClick'");
    target.rl_bank_change = Utils.castView(view, R.id.rl_bank_change, "field 'rl_bank_change'", RelativeLayout.class);
    view2131558701 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.personalaccount_user_SR = Utils.findRequiredViewAsType(source, R.id.personalaccount_user_SR, "field 'personalaccount_user_SR'", EditText.class);
    view = Utils.findRequiredView(source, R.id.tv_account_phoneNum, "field 'tv_account_phoneNum' and method 'onViewClick'");
    target.tv_account_phoneNum = Utils.castView(view, R.id.tv_account_phoneNum, "field 'tv_account_phoneNum'", EditText.class);
    view2131558809 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.tv_account_wecat = Utils.findRequiredViewAsType(source, R.id.tv_account_wecat, "field 'tv_account_wecat'", EditText.class);
    target.tv_account_qq = Utils.findRequiredViewAsType(source, R.id.tv_account_qq, "field 'tv_account_qq'", EditText.class);
    target.tv_account_address = Utils.findRequiredViewAsType(source, R.id.tv_account_address, "field 'tv_account_address'", EditText.class);
    view = Utils.findRequiredView(source, R.id.tv_tv_account_email, "field 'tv_tv_account_email' and method 'onViewClick'");
    target.tv_tv_account_email = Utils.castView(view, R.id.tv_tv_account_email, "field 'tv_tv_account_email'", EditText.class);
    view2131558811 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_account_change_psw, "field 'll_account_change_psw' and method 'onViewClick'");
    target.ll_account_change_psw = Utils.castView(view, R.id.ll_account_change_psw, "field 'll_account_change_psw'", LinearLayout.class);
    view2131558815 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_bank_info_nothing, "field 'rl_bank_info_nothing' and method 'onViewClick'");
    target.rl_bank_info_nothing = Utils.castView(view, R.id.rl_bank_info_nothing, "field 'rl_bank_info_nothing'", FrameLayout.class);
    view2131558816 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.rl_bank_info = Utils.findRequiredViewAsType(source, R.id.rl_bank_info, "field 'rl_bank_info'", RelativeLayout.class);
    target.tv_bank_name = Utils.findRequiredViewAsType(source, R.id.tv_bank_name, "field 'tv_bank_name'", TextView.class);
    target.tv_jiejika = Utils.findRequiredViewAsType(source, R.id.tv_jiejika, "field 'tv_jiejika'", TextView.class);
    target.tv_bank_number = Utils.findRequiredViewAsType(source, R.id.tv_bank_number, "field 'tv_bank_number'", TextView.class);
    target.tv_bank_address = Utils.findRequiredViewAsType(source, R.id.tv_bank_address, "field 'tv_bank_address'", TextView.class);
    target.tv_right = Utils.findRequiredViewAsType(source, R.id.tv_right, "field 'tv_right'", TextView.class);
    target.empty_layout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'empty_layout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_btn, "method 'onViewClick'");
    view2131558886 = view;
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
    PersonalInfActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rl_bank_change = null;
    target.personalaccount_user_SR = null;
    target.tv_account_phoneNum = null;
    target.tv_account_wecat = null;
    target.tv_account_qq = null;
    target.tv_account_address = null;
    target.tv_tv_account_email = null;
    target.ll_account_change_psw = null;
    target.rl_bank_info_nothing = null;
    target.rl_bank_info = null;
    target.tv_bank_name = null;
    target.tv_jiejika = null;
    target.tv_bank_number = null;
    target.tv_bank_address = null;
    target.tv_right = null;
    target.empty_layout = null;

    view2131558701.setOnClickListener(null);
    view2131558701 = null;
    view2131558809.setOnClickListener(null);
    view2131558809 = null;
    view2131558811.setOnClickListener(null);
    view2131558811 = null;
    view2131558815.setOnClickListener(null);
    view2131558815 = null;
    view2131558816.setOnClickListener(null);
    view2131558816 = null;
    view2131558886.setOnClickListener(null);
    view2131558886 = null;
  }
}
