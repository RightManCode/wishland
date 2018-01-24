// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyDiscountListFragment_ViewBinding implements Unbinder {
  private MyDiscountListFragment target;

  @UiThread
  public MyDiscountListFragment_ViewBinding(MyDiscountListFragment target, View source) {
    this.target = target;

    target.rv_my_discount = Utils.findRequiredViewAsType(source, R.id.rv_my_discount, "field 'rv_my_discount'", RecyclerView.class);
    target.srl_discount = Utils.findRequiredViewAsType(source, R.id.srl_discount, "field 'srl_discount'", SwipeRefreshLayout.class);
    target.tv_no_info = Utils.findRequiredViewAsType(source, R.id.tv_no_info, "field 'tv_no_info'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyDiscountListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rv_my_discount = null;
    target.srl_discount = null;
    target.tv_no_info = null;
  }
}
