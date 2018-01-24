// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LottoFirstFragment_ViewBinding implements Unbinder {
  private LottoFirstFragment target;

  private View view2131558920;

  private View view2131558968;

  @UiThread
  public LottoFirstFragment_ViewBinding(final LottoFirstFragment target, View source) {
    this.target = target;

    View view;
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_official, "field 'tvOfficial' and method 'onViewClicked'");
    target.tvOfficial = Utils.castView(view, R.id.tv_official, "field 'tvOfficial'", TextView.class);
    view2131558920 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_credit, "field 'tvCredit' and method 'onViewClicked'");
    target.tvCredit = Utils.castView(view, R.id.tv_credit, "field 'tvCredit'", TextView.class);
    view2131558968 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.recyclerViewOfficial = Utils.findRequiredViewAsType(source, R.id.recycler_view_official, "field 'recyclerViewOfficial'", RecyclerView.class);
    target.recyclerViewCredit = Utils.findRequiredViewAsType(source, R.id.recycler_view_credit, "field 'recyclerViewCredit'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LottoFirstFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emptyLayout = null;
    target.tvOfficial = null;
    target.tvCredit = null;
    target.recyclerViewOfficial = null;
    target.recyclerViewCredit = null;

    view2131558920.setOnClickListener(null);
    view2131558920 = null;
    view2131558968.setOnClickListener(null);
    view2131558968 = null;
  }
}
