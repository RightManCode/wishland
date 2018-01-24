// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

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

public class DrawHistoryActivity_ViewBinding implements Unbinder {
  private DrawHistoryActivity target;

  @UiThread
  public DrawHistoryActivity_ViewBinding(DrawHistoryActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DrawHistoryActivity_ViewBinding(DrawHistoryActivity target, View source) {
    this.target = target;

    target.rlv_draw_list = Utils.findRequiredViewAsType(source, R.id.rlv_draw_list, "field 'rlv_draw_list'", RecyclerView.class);
    target.tv_no_info = Utils.findRequiredViewAsType(source, R.id.tv_no_info, "field 'tv_no_info'", ImageView.class);
    target.srl_draw_history = Utils.findRequiredViewAsType(source, R.id.srl_draw_history, "field 'srl_draw_history'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DrawHistoryActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rlv_draw_list = null;
    target.tv_no_info = null;
    target.srl_draw_history = null;
  }
}
