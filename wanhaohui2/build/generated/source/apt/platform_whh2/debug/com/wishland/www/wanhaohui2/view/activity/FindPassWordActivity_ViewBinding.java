// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FindPassWordActivity_ViewBinding implements Unbinder {
  private FindPassWordActivity target;

  private View view2131558589;

  private View view2131558591;

  private View view2131558592;

  @UiThread
  public FindPassWordActivity_ViewBinding(FindPassWordActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FindPassWordActivity_ViewBinding(final FindPassWordActivity target, View source) {
    this.target = target;

    View view;
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    target.etNewPassword = Utils.findRequiredViewAsType(source, R.id.et_new_password, "field 'etNewPassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.cb_new_eye, "field 'cbNewEye' and method 'onViewClicked'");
    target.cbNewEye = Utils.castView(view, R.id.cb_new_eye, "field 'cbNewEye'", CheckBox.class);
    view2131558589 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.etSurePassword = Utils.findRequiredViewAsType(source, R.id.et_sure_password, "field 'etSurePassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.cb_new_psw, "field 'cbNewPsw' and method 'onViewClicked'");
    target.cbNewPsw = Utils.castView(view, R.id.cb_new_psw, "field 'cbNewPsw'", CheckBox.class);
    view2131558591 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_login, "field 'btLogin' and method 'onViewClicked'");
    target.btLogin = Utils.castView(view, R.id.bt_login, "field 'btLogin'", Button.class);
    view2131558592 = view;
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
    FindPassWordActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emptyLayout = null;
    target.etNewPassword = null;
    target.cbNewEye = null;
    target.etSurePassword = null;
    target.cbNewPsw = null;
    target.btLogin = null;

    view2131558589.setOnClickListener(null);
    view2131558589 = null;
    view2131558591.setOnClickListener(null);
    view2131558591 = null;
    view2131558592.setOnClickListener(null);
    view2131558592 = null;
  }
}
