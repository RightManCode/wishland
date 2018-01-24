// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EGameDetailActivity_ViewBinding implements Unbinder {
  private EGameDetailActivity target;

  private View view2131558730;

  private View view2131558726;

  private View view2131558729;

  private View view2131558733;

  @UiThread
  public EGameDetailActivity_ViewBinding(EGameDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EGameDetailActivity_ViewBinding(final EGameDetailActivity target, View source) {
    this.target = target;

    View view;
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    target.etSearch = Utils.findRequiredViewAsType(source, R.id.et_search, "field 'etSearch'", EditText.class);
    target.llFilterData = Utils.findRequiredViewAsType(source, R.id.ll_filter_data, "field 'llFilterData'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.ll_background, "field 'llBackground' and method 'onViewClicked'");
    target.llBackground = Utils.castView(view, R.id.ll_background, "field 'llBackground'", LinearLayout.class);
    view2131558730 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_filter, "field 'llFilter' and method 'onViewClicked'");
    target.llFilter = Utils.castView(view, R.id.ll_filter, "field 'llFilter'", LinearLayout.class);
    view2131558726 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.ivFilter = Utils.findRequiredViewAsType(source, R.id.iv_filter, "field 'ivFilter'", ImageView.class);
    target.mLlCheckBox = Utils.findRequiredViewAsType(source, R.id.ll_checkbox, "field 'mLlCheckBox'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_search, "method 'onViewClicked'");
    view2131558729 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_search, "method 'onViewClicked'");
    view2131558733 = view;
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
    EGameDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.emptyLayout = null;
    target.etSearch = null;
    target.llFilterData = null;
    target.llBackground = null;
    target.llFilter = null;
    target.ivFilter = null;
    target.mLlCheckBox = null;

    view2131558730.setOnClickListener(null);
    view2131558730 = null;
    view2131558726.setOnClickListener(null);
    view2131558726 = null;
    view2131558729.setOnClickListener(null);
    view2131558729 = null;
    view2131558733.setOnClickListener(null);
    view2131558733 = null;
  }
}
