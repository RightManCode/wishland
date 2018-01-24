// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaceOrderDealActivity_ViewBinding implements Unbinder {
  private PlaceOrderDealActivity target;

  private View view2131558883;

  @UiThread
  public PlaceOrderDealActivity_ViewBinding(PlaceOrderDealActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlaceOrderDealActivity_ViewBinding(final PlaceOrderDealActivity target, View source) {
    this.target = target;

    View view;
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_place_order, "field 'recyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.tv_title, "field 'tv_title' and method 'onViewClicked'");
    target.tv_title = Utils.castView(view, R.id.tv_title, "field 'tv_title'", TextView.class);
    view2131558883 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.rl_title = Utils.findRequiredViewAsType(source, R.id.rl_title, "field 'rl_title'", FrameLayout.class);
    target.tv_no_info = Utils.findRequiredViewAsType(source, R.id.tv_no_info, "field 'tv_no_info'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PlaceOrderDealActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.tv_title = null;
    target.rl_title = null;
    target.tv_no_info = null;

    view2131558883.setOnClickListener(null);
    view2131558883 = null;
  }
}
