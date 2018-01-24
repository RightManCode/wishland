// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EGameListActivity_ViewBinding implements Unbinder {
  private EGameListActivity target;

  private View view2131558729;

  @UiThread
  public EGameListActivity_ViewBinding(EGameListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EGameListActivity_ViewBinding(final EGameListActivity target, View source) {
    this.target = target;

    View view;
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshView, "field 'refreshLayout'", SwipeRefreshLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    target.etSearch = Utils.findRequiredViewAsType(source, R.id.et_search, "field 'etSearch'", EditText.class);
    view = Utils.findRequiredView(source, R.id.iv_search, "method 'onViewClicked'");
    view2131558729 = view;
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
    EGameListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.refreshLayout = null;
    target.recyclerView = null;
    target.emptyLayout = null;
    target.etSearch = null;

    view2131558729.setOnClickListener(null);
    view2131558729 = null;
  }
}
