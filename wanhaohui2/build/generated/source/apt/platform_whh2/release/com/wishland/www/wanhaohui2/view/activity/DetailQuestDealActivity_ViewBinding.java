// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailQuestDealActivity_ViewBinding implements Unbinder {
  private DetailQuestDealActivity target;

  @UiThread
  public DetailQuestDealActivity_ViewBinding(DetailQuestDealActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailQuestDealActivity_ViewBinding(DetailQuestDealActivity target, View source) {
    this.target = target;

    target.fundslistview = Utils.findRequiredViewAsType(source, R.id.rv_detail_quest, "field 'fundslistview'", ListView.class);
    target.rv_line_detail = Utils.findRequiredViewAsType(source, R.id.rv_line_detail, "field 'rv_line_detail'", RecyclerView.class);
    target.swipeRefresh = Utils.findRequiredViewAsType(source, R.id.srl_my_message, "field 'swipeRefresh'", SwipeRefreshLayout.class);
    target.tv_no_info = Utils.findRequiredViewAsType(source, R.id.tv_no_info, "field 'tv_no_info'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailQuestDealActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fundslistview = null;
    target.rv_line_detail = null;
    target.swipeRefresh = null;
    target.tv_no_info = null;
  }
}
