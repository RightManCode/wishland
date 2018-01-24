// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ForgetPassWordActivity_ViewBinding implements Unbinder {
  private ForgetPassWordActivity target;

  private View view2131558738;

  private View view2131558735;

  private View view2131558737;

  private View view2131558742;

  private View view2131558746;

  private View view2131558748;

  @UiThread
  public ForgetPassWordActivity_ViewBinding(ForgetPassWordActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ForgetPassWordActivity_ViewBinding(final ForgetPassWordActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.bt_find_custom_dis, "field 'btFindCustomDis' and method 'onViewClicked'");
    target.btFindCustomDis = Utils.castView(view, R.id.bt_find_custom_dis, "field 'btFindCustomDis'", Button.class);
    view2131558738 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.btFindPhone = Utils.findRequiredViewAsType(source, R.id.bt_find_phone, "field 'btFindPhone'", Button.class);
    view = Utils.findRequiredView(source, R.id.bt_find_phone_dis, "field 'btFindPhoneDis' and method 'onViewClicked'");
    target.btFindPhoneDis = Utils.castView(view, R.id.bt_find_phone_dis, "field 'btFindPhoneDis'", Button.class);
    view2131558735 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.btFindEmail = Utils.findRequiredViewAsType(source, R.id.bt_find_email, "field 'btFindEmail'", Button.class);
    view = Utils.findRequiredView(source, R.id.bt_find_email_dis, "field 'btFindEmailDis' and method 'onViewClicked'");
    target.btFindEmailDis = Utils.castView(view, R.id.bt_find_email_dis, "field 'btFindEmailDis'", Button.class);
    view2131558737 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.edPhoneNumber = Utils.findRequiredViewAsType(source, R.id.edit_phone_number, "field 'edPhoneNumber'", EditText.class);
    target.edPhoneCode = Utils.findRequiredViewAsType(source, R.id.edit_phone_code, "field 'edPhoneCode'", EditText.class);
    target.edEmail = Utils.findRequiredViewAsType(source, R.id.edit_email, "field 'edEmail'", EditText.class);
    target.edEmailCode = Utils.findRequiredViewAsType(source, R.id.edit_email_code, "field 'edEmailCode'", EditText.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_get_code1, "field 'tvGetCode1' and method 'onViewClicked'");
    target.tvGetCode1 = Utils.castView(view, R.id.tv_get_code1, "field 'tvGetCode1'", TextView.class);
    view2131558742 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_get_code2, "field 'tvGetCode2' and method 'onViewClicked'");
    target.tvGetCode2 = Utils.castView(view, R.id.tv_get_code2, "field 'tvGetCode2'", TextView.class);
    view2131558746 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.llPhone = Utils.findRequiredViewAsType(source, R.id.ll_phone, "field 'llPhone'", LinearLayout.class);
    target.llEmail = Utils.findRequiredViewAsType(source, R.id.ll_email, "field 'llEmail'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.bt_verify, "method 'onViewClicked'");
    view2131558748 = view;
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
    ForgetPassWordActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btFindCustomDis = null;
    target.btFindPhone = null;
    target.btFindPhoneDis = null;
    target.btFindEmail = null;
    target.btFindEmailDis = null;
    target.edPhoneNumber = null;
    target.edPhoneCode = null;
    target.edEmail = null;
    target.edEmailCode = null;
    target.emptyLayout = null;
    target.tvGetCode1 = null;
    target.tvGetCode2 = null;
    target.llPhone = null;
    target.llEmail = null;

    view2131558738.setOnClickListener(null);
    view2131558738 = null;
    view2131558735.setOnClickListener(null);
    view2131558735 = null;
    view2131558737.setOnClickListener(null);
    view2131558737 = null;
    view2131558742.setOnClickListener(null);
    view2131558742 = null;
    view2131558746.setOnClickListener(null);
    view2131558746 = null;
    view2131558748.setOnClickListener(null);
    view2131558748 = null;
  }
}
