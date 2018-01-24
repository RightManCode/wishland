// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.flyco.tablayout.SlidingTabLayout;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyDiscountActivity_ViewBinding implements Unbinder {
  private MyDiscountActivity target;

  @UiThread
  public MyDiscountActivity_ViewBinding(MyDiscountActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyDiscountActivity_ViewBinding(MyDiscountActivity target, View source) {
    this.target = target;

    target.mTabLayout = Utils.findRequiredViewAsType(source, R.id.tab_layout, "field 'mTabLayout'", SlidingTabLayout.class);
    target.main_viewpager = Utils.findRequiredViewAsType(source, R.id.main_viewpager, "field 'main_viewpager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyDiscountActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTabLayout = null;
    target.main_viewpager = null;
  }
}
