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

public class LottoThirdFragment_ViewBinding implements Unbinder {
  private LottoThirdFragment target;

  private View view2131558920;

  private View view2131558968;

  private View view2131558971;

  @UiThread
  public LottoThirdFragment_ViewBinding(final LottoThirdFragment target, View source) {
    this.target = target;

    View view;
    target.recyclerViewOfficial = Utils.findRequiredViewAsType(source, R.id.recycler_view_official, "field 'recyclerViewOfficial'", RecyclerView.class);
    target.recyclerViewCredit = Utils.findRequiredViewAsType(source, R.id.recycler_view_credit, "field 'recyclerViewCredit'", RecyclerView.class);
    target.recyclerViewVideo = Utils.findRequiredViewAsType(source, R.id.recycler_view_video, "field 'recyclerViewVideo'", RecyclerView.class);
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
    view = Utils.findRequiredView(source, R.id.tv_video, "field 'tvVideo' and method 'onViewClicked'");
    target.tvVideo = Utils.castView(view, R.id.tv_video, "field 'tvVideo'", TextView.class);
    view2131558971 = view;
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
    LottoThirdFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerViewOfficial = null;
    target.recyclerViewCredit = null;
    target.recyclerViewVideo = null;
    target.emptyLayout = null;
    target.tvOfficial = null;
    target.tvCredit = null;
    target.tvVideo = null;

    view2131558920.setOnClickListener(null);
    view2131558920 = null;
    view2131558968.setOnClickListener(null);
    view2131558968 = null;
    view2131558971.setOnClickListener(null);
    view2131558971 = null;
  }
}
