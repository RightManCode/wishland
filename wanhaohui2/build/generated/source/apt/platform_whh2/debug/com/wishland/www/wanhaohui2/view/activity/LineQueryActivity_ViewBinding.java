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
import java.lang.IllegalStateException;
import java.lang.Override;

public class LineQueryActivity_ViewBinding implements Unbinder {
  private LineQueryActivity target;

  private View view2131558753;

  private View view2131558755;

  @UiThread
  public LineQueryActivity_ViewBinding(LineQueryActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LineQueryActivity_ViewBinding(final LineQueryActivity target, View source) {
    this.target = target;

    View view;
    target.orderTime = Utils.findRequiredViewAsType(source, R.id.tv_record_time, "field 'orderTime'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_time_range, "method 'onViewClicked'");
    view2131558753 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_query_record, "method 'onViewClicked'");
    view2131558755 = view;
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
    LineQueryActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.orderTime = null;

    view2131558753.setOnClickListener(null);
    view2131558753 = null;
    view2131558755.setOnClickListener(null);
    view2131558755 = null;
  }
}
