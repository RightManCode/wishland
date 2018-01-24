// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DiscountFragment_ViewBinding implements Unbinder {
  private DiscountFragment target;

  @UiThread
  public DiscountFragment_ViewBinding(DiscountFragment target, View source) {
    this.target = target;

    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.recyclerType = Utils.findRequiredViewAsType(source, R.id.recycler_type, "field 'recyclerType'", RecyclerView.class);
    target.refreshView = Utils.findRequiredViewAsType(source, R.id.refreshView, "field 'refreshView'", SwipeRefreshLayout.class);
    target.flVieTop = Utils.findRequiredViewAsType(source, R.id.fl_view_top, "field 'flVieTop'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DiscountFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTitle = null;
    target.recyclerView = null;
    target.recyclerType = null;
    target.refreshView = null;
    target.flVieTop = null;
  }
}
