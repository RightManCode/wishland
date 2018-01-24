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
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisterActivity_ViewBinding implements Unbinder {
  private RegisterActivity target;

  private View view2131558845;

  private View view2131558840;

  private View view2131558842;

  private View view2131558604;

  private View view2131558847;

  private View view2131558616;

  private View view2131558759;

  private View view2131558756;

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterActivity_ViewBinding(final RegisterActivity target, View source) {
    this.target = target;

    View view;
    target.etUserName = Utils.findRequiredViewAsType(source, R.id.et_user_name, "field 'etUserName'", EditText.class);
    target.etFirstPassWord = Utils.findRequiredViewAsType(source, R.id.et_first_pass_word, "field 'etFirstPassWord'", EditText.class);
    target.etSecondPassWord = Utils.findRequiredViewAsType(source, R.id.et_second_pass_word, "field 'etSecondPassWord'", EditText.class);
    target.etTrueName = Utils.findRequiredViewAsType(source, R.id.et_true_name, "field 'etTrueName'", EditText.class);
    target.etCode = Utils.findRequiredViewAsType(source, R.id.et_code, "field 'etCode'", EditText.class);
    view = Utils.findRequiredView(source, R.id.iv_register_code, "field 'ivCode' and method 'onViewClicked'");
    target.ivCode = Utils.castView(view, R.id.iv_register_code, "field 'ivCode'", ImageView.class);
    view2131558845 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    target.tvFastRegister = Utils.findRequiredViewAsType(source, R.id.tv_fast_register, "field 'tvFastRegister'", TextView.class);
    target.tvNormalRegister = Utils.findRequiredViewAsType(source, R.id.tv_normal_register, "field 'tvNormalRegister'", TextView.class);
    target.llFastRegister = Utils.findRequiredViewAsType(source, R.id.ll_fast_register, "field 'llFastRegister'", LinearLayout.class);
    target.llNormalRegister = Utils.findRequiredViewAsType(source, R.id.ll_normal_register, "field 'llNormalRegister'", LinearLayout.class);
    target.tvFastView = Utils.findRequiredViewAsType(source, R.id.tv_fast_view, "field 'tvFastView'", TextView.class);
    target.tvNormalView = Utils.findRequiredViewAsType(source, R.id.tv_normal_view, "field 'tvNormalView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.cb_eye1, "field 'cbEye1' and method 'onViewClicked'");
    target.cbEye1 = Utils.castView(view, R.id.cb_eye1, "field 'cbEye1'", CheckBox.class);
    view2131558840 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cb_eye2, "field 'cbEye2' and method 'onViewClicked'");
    target.cbEye2 = Utils.castView(view, R.id.cb_eye2, "field 'cbEye2'", CheckBox.class);
    view2131558842 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_code, "field 'sendVertify' and method 'onViewClicked'");
    target.sendVertify = Utils.castView(view, R.id.tv_code, "field 'sendVertify'", TextView.class);
    view2131558604 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.vertifyCode = Utils.findRequiredViewAsType(source, R.id.login_edit_passwork, "field 'vertifyCode'", EditText.class);
    target.phoneNumber = Utils.findRequiredViewAsType(source, R.id.login_edit_username, "field 'phoneNumber'", EditText.class);
    view = Utils.findRequiredView(source, R.id.ll_login, "method 'onViewClicked'");
    view2131558847 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_register, "method 'onViewClicked'");
    view2131558616 = view;
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
  }

  @Override
  @CallSuper
  public void unbind() {
    RegisterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etUserName = null;
    target.etFirstPassWord = null;
    target.etSecondPassWord = null;
    target.etTrueName = null;
    target.etCode = null;
    target.ivCode = null;
    target.emptyLayout = null;
    target.tvFastRegister = null;
    target.tvNormalRegister = null;
    target.llFastRegister = null;
    target.llNormalRegister = null;
    target.tvFastView = null;
    target.tvNormalView = null;
    target.cbEye1 = null;
    target.cbEye2 = null;
    target.sendVertify = null;
    target.vertifyCode = null;
    target.phoneNumber = null;

    view2131558845.setOnClickListener(null);
    view2131558845 = null;
    view2131558840.setOnClickListener(null);
    view2131558840 = null;
    view2131558842.setOnClickListener(null);
    view2131558842 = null;
    view2131558604.setOnClickListener(null);
    view2131558604 = null;
    view2131558847.setOnClickListener(null);
    view2131558847 = null;
    view2131558616.setOnClickListener(null);
    view2131558616 = null;
    view2131558759.setOnClickListener(null);
    view2131558759 = null;
    view2131558756.setOnClickListener(null);
    view2131558756 = null;
  }
}
