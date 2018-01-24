// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SetLoginPWActivity_ViewBinding implements Unbinder {
  private SetLoginPWActivity target;

  private View view2131558766;

  private View view2131558616;

  @UiThread
  public SetLoginPWActivity_ViewBinding(SetLoginPWActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SetLoginPWActivity_ViewBinding(final SetLoginPWActivity target, View source) {
    this.target = target;

    View view;
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.et_password, "field 'etPassword'", EditText.class);
    target.tvHit = Utils.findRequiredViewAsType(source, R.id.tv_hit, "field 'tvHit'", TextView.class);
    view = Utils.findRequiredView(source, R.id.cb_eye, "field 'cb' and method 'onViewClicked'");
    target.cb = Utils.castView(view, R.id.cb_eye, "field 'cb'", CheckBox.class);
    view2131558766 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.bt_register, "method 'onViewClicked'");
    view2131558616 = view;
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
    SetLoginPWActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etPassword = null;
    target.tvHit = null;
    target.cb = null;
    target.emptyLayout = null;

    view2131558766.setOnClickListener(null);
    view2131558766 = null;
    view2131558616.setOnClickListener(null);
    view2131558616 = null;
  }
}
