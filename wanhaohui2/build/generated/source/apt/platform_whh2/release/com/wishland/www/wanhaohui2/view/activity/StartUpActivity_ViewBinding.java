// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StartUpActivity_ViewBinding implements Unbinder {
  private StartUpActivity target;

  private View view2131558847;

  @UiThread
  public StartUpActivity_ViewBinding(StartUpActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StartUpActivity_ViewBinding(final StartUpActivity target, View source) {
    this.target = target;

    View view;
    target.ivStartUp = Utils.findRequiredViewAsType(source, R.id.iv_start_up, "field 'ivStartUp'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.tv_time, "field 'tvTime' and method 'onViewClicked'");
    target.tvTime = Utils.castView(view, R.id.tv_time, "field 'tvTime'", TextView.class);
    view2131558847 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    StartUpActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivStartUp = null;
    target.tvTime = null;

    view2131558847.setOnClickListener(null);
    view2131558847 = null;
  }
}
