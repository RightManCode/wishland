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

public class PlaceOrderActivity_ViewBinding implements Unbinder {
  private PlaceOrderActivity target;

  private View view2131558751;

  private View view2131558753;

  private View view2131558755;

  @UiThread
  public PlaceOrderActivity_ViewBinding(PlaceOrderActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlaceOrderActivity_ViewBinding(final PlaceOrderActivity target, View source) {
    this.target = target;

    View view;
    target.orderType = Utils.findRequiredViewAsType(source, R.id.tv_record_type, "field 'orderType'", TextView.class);
    target.orderTime = Utils.findRequiredViewAsType(source, R.id.tv_record_time, "field 'orderTime'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_record_type, "method 'onViewClicked'");
    view2131558751 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
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
    PlaceOrderActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.orderType = null;
    target.orderTime = null;

    view2131558751.setOnClickListener(null);
    view2131558751 = null;
    view2131558753.setOnClickListener(null);
    view2131558753 = null;
    view2131558755.setOnClickListener(null);
    view2131558755 = null;
  }
}
