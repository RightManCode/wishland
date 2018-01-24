// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BindBankActivity_ViewBinding implements Unbinder {
  private BindBankActivity target;

  private View view2131558581;

  private View view2131558586;

  @UiThread
  public BindBankActivity_ViewBinding(BindBankActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BindBankActivity_ViewBinding(final BindBankActivity target, View source) {
    this.target = target;

    View view;
    target.tv_bank_name = Utils.findRequiredViewAsType(source, R.id.tv_bank_name, "field 'tv_bank_name'", TextView.class);
    target.et_bind_number = Utils.findRequiredViewAsType(source, R.id.et_bind_number, "field 'et_bind_number'", EditText.class);
    target.et_bind_address = Utils.findRequiredViewAsType(source, R.id.et_bind_address, "field 'et_bind_address'", EditText.class);
    target.et_bind_psw = Utils.findRequiredViewAsType(source, R.id.et_bind_psw, "field 'et_bind_psw'", EditText.class);
    view = Utils.findRequiredView(source, R.id.rl_choose_bank, "field 'rl_choose_bank' and method 'onViewClick'");
    target.rl_choose_bank = Utils.castView(view, R.id.rl_choose_bank, "field 'rl_choose_bank'", RelativeLayout.class);
    view2131558581 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.et_bind_pay_name = Utils.findRequiredViewAsType(source, R.id.et_bind_pay_name, "field 'et_bind_pay_name'", EditText.class);
    view = Utils.findRequiredView(source, R.id.bt_bind_close, "method 'onViewClick'");
    view2131558586 = view;
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
    BindBankActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_bank_name = null;
    target.et_bind_number = null;
    target.et_bind_address = null;
    target.et_bind_psw = null;
    target.rl_choose_bank = null;
    target.et_bind_pay_name = null;

    view2131558581.setOnClickListener(null);
    view2131558581 = null;
    view2131558586.setOnClickListener(null);
    view2131558586 = null;
  }
}
