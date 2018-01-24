// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangePhoneActivity_ViewBinding implements Unbinder {
  private ChangePhoneActivity target;

  private View view2131558595;

  private View view2131558599;

  @UiThread
  public ChangePhoneActivity_ViewBinding(ChangePhoneActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangePhoneActivity_ViewBinding(final ChangePhoneActivity target, View source) {
    this.target = target;

    View view;
    target.empty_layout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'empty_layout'", EmptyLayout.class);
    target.moblieNumber = Utils.findRequiredViewAsType(source, R.id.tv_moblie_num, "field 'moblieNumber'", TextView.class);
    view = Utils.findRequiredView(source, R.id.rl_send_vertify, "method 'onViewClick'");
    view2131558595 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_send_person, "method 'onViewClick'");
    view2131558599 = view;
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
    ChangePhoneActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.empty_layout = null;
    target.moblieNumber = null;

    view2131558595.setOnClickListener(null);
    view2131558595 = null;
    view2131558599.setOnClickListener(null);
    view2131558599 = null;
  }
}
