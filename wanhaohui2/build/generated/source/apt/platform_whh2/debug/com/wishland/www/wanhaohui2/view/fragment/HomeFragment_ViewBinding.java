// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import com.wishland.www.wanhaohui2.view.customlayout.MarqueeTextView;
import com.wishland.www.wanhaohui2.view.customlayout.MyScrollView;
import com.youth.banner.Banner;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFragment_ViewBinding implements Unbinder {
  private HomeFragment target;

  private View view2131558936;

  private View view2131558938;

  @UiThread
  public HomeFragment_ViewBinding(final HomeFragment target, View source) {
    this.target = target;

    View view;
    target.llHomeGame = Utils.findRequiredViewAsType(source, R.id.ll_home_game, "field 'llHomeGame'", RecyclerView.class);
    target.myCollection = Utils.findRequiredViewAsType(source, R.id.my_collection, "field 'myCollection'", RecyclerView.class);
    target.homeBanner = Utils.findRequiredViewAsType(source, R.id.home_banner, "field 'homeBanner'", Banner.class);
    target.refreshView = Utils.findRequiredViewAsType(source, R.id.refreshView, "field 'refreshView'", SwipeRefreshLayout.class);
    target.homeTextvhiewPmd = Utils.findRequiredViewAsType(source, R.id.home_textvhiew_pmd, "field 'homeTextvhiewPmd'", MarqueeTextView.class);
    target.llMyCollection = Utils.findRequiredViewAsType(source, R.id.ll_my_collection, "field 'llMyCollection'", LinearLayout.class);
    target.llHotGame = Utils.findRequiredViewAsType(source, R.id.ll_hot_game, "field 'llHotGame'", LinearLayout.class);
    target.recyclerHotGame = Utils.findRequiredViewAsType(source, R.id.recycler_hot_game, "field 'recyclerHotGame'", RecyclerView.class);
    target.scrollView = Utils.findRequiredViewAsType(source, R.id.sv_home, "field 'scrollView'", MyScrollView.class);
    target.rl_footView = Utils.findRequiredViewAsType(source, R.id.rl_footView, "field 'rl_footView'", RelativeLayout.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_edit, "field 'tvEdit' and method 'onViewClicked'");
    target.tvEdit = Utils.castView(view, R.id.tv_edit, "field 'tvEdit'", TextView.class);
    view2131558936 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvFooter = Utils.findRequiredViewAsType(source, R.id.tv_footer, "field 'tvFooter'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_line_down_collection, "field 'llLineDownCollection' and method 'onViewClicked'");
    target.llLineDownCollection = Utils.castView(view, R.id.ll_line_down_collection, "field 'llLineDownCollection'", LinearLayout.class);
    view2131558938 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.ivIndicateCollection = Utils.findRequiredViewAsType(source, R.id.iv_indicate_collection, "field 'ivIndicateCollection'", ImageView.class);
    target.tvIndicateCollection = Utils.findRequiredViewAsType(source, R.id.tv_indicate_collection, "field 'tvIndicateCollection'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.llHomeGame = null;
    target.myCollection = null;
    target.homeBanner = null;
    target.refreshView = null;
    target.homeTextvhiewPmd = null;
    target.llMyCollection = null;
    target.llHotGame = null;
    target.recyclerHotGame = null;
    target.scrollView = null;
    target.rl_footView = null;
    target.emptyLayout = null;
    target.tvEdit = null;
    target.tvFooter = null;
    target.llLineDownCollection = null;
    target.ivIndicateCollection = null;
    target.tvIndicateCollection = null;

    view2131558936.setOnClickListener(null);
    view2131558936 = null;
    view2131558938.setOnClickListener(null);
    view2131558938 = null;
  }
}
