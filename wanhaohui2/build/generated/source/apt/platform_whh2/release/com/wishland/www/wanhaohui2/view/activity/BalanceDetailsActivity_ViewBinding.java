// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BalanceDetailsActivity_ViewBinding implements Unbinder {
  private BalanceDetailsActivity target;

  @UiThread
  public BalanceDetailsActivity_ViewBinding(BalanceDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BalanceDetailsActivity_ViewBinding(BalanceDetailsActivity target, View source) {
    this.target = target;

    target.rv_balance_detail_list = Utils.findRequiredViewAsType(source, R.id.rv_balance_detail_list, "field 'rv_balance_detail_list'", RecyclerView.class);
    target.tv_account_money = Utils.findRequiredViewAsType(source, R.id.tv_account_money, "field 'tv_account_money'", TextView.class);
    target.srl_refresh_account_money = Utils.findRequiredViewAsType(source, R.id.srl_refresh_account_money, "field 'srl_refresh_account_money'", SwipeRefreshLayout.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BalanceDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rv_balance_detail_list = null;
    target.tv_account_money = null;
    target.srl_refresh_account_money = null;
    target.emptyLayout = null;
  }
}
