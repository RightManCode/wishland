// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OthersActivity_ViewBinding implements Unbinder {
  private OthersActivity target;

  private View view2131558805;

  private View view2131558806;

  private View view2131558807;

  @UiThread
  public OthersActivity_ViewBinding(OthersActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OthersActivity_ViewBinding(final OthersActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.ll_contact_us, "method 'onViewClicked'");
    view2131558805 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_complain_advice, "method 'onViewClicked'");
    view2131558806 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_clean_cache, "method 'onViewClicked'");
    view2131558807 = view;
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
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131558805.setOnClickListener(null);
    view2131558805 = null;
    view2131558806.setOnClickListener(null);
    view2131558806 = null;
    view2131558807.setOnClickListener(null);
    view2131558807 = null;
  }
}
