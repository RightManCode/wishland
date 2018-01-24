// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HotGameMoreActivity_ViewBinding implements Unbinder {
  private HotGameMoreActivity target;

  @UiThread
  public HotGameMoreActivity_ViewBinding(HotGameMoreActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HotGameMoreActivity_ViewBinding(HotGameMoreActivity target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    target.refreshView = Utils.findRequiredViewAsType(source, R.id.refreshView, "field 'refreshView'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HotGameMoreActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.emptyLayout = null;
    target.refreshView = null;
  }
}
