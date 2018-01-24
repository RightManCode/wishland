// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.flyco.tablayout.CommonTabLayout;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131559106;

  private View view2131558770;

  private View view2131559108;

  private View view2131559110;

  private View view2131559107;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.tl1 = Utils.findRequiredViewAsType(source, R.id.tl_1, "field 'tl1'", CommonTabLayout.class);
    target.llMainTop = Utils.findRequiredViewAsType(source, R.id.ll_main_top, "field 'llMainTop'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_function, "field 'leftPopup' and method 'onViewClicked'");
    target.leftPopup = Utils.castView(view, R.id.iv_function, "field 'leftPopup'", ImageView.class);
    view2131559106 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.main_linearLayout = Utils.findRequiredViewAsType(source, R.id.main_linearLayout, "field 'main_linearLayout'", FrameLayout.class);
    view = Utils.findRequiredView(source, R.id.ll_register, "field 'llRegister' and method 'onViewClicked'");
    target.llRegister = Utils.castView(view, R.id.ll_register, "field 'llRegister'", LinearLayout.class);
    view2131558770 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_play_try, "field 'llPlayTry' and method 'onViewClicked'");
    target.llPlayTry = Utils.castView(view, R.id.ll_play_try, "field 'llPlayTry'", LinearLayout.class);
    view2131559108 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvModel = Utils.findRequiredViewAsType(source, R.id.tv_model, "field 'tvModel'", TextView.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_hongbao, "field 'ivHongbao' and method 'onViewClicked'");
    target.ivHongbao = Utils.castView(view, R.id.iv_hongbao, "field 'ivHongbao'", ImageView.class);
    view2131559110 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.flHongbaoMoneyMiss = Utils.findRequiredViewAsType(source, R.id.fl_hongbao_money_miss, "field 'flHongbaoMoneyMiss'", FrameLayout.class);
    target.ivHongbaoTopMiss = Utils.findRequiredViewAsType(source, R.id.iv_hongbao_top_miss, "field 'ivHongbaoTopMiss'", ImageView.class);
    target.tvHongbaoMiss = Utils.findRequiredViewAsType(source, R.id.tv_hongbao_miss, "field 'tvHongbaoMiss'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_service, "method 'onViewClicked'");
    view2131559107 = view;
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
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tl1 = null;
    target.llMainTop = null;
    target.leftPopup = null;
    target.main_linearLayout = null;
    target.llRegister = null;
    target.llPlayTry = null;
    target.tvModel = null;
    target.emptyLayout = null;
    target.ivHongbao = null;
    target.flHongbaoMoneyMiss = null;
    target.ivHongbaoTopMiss = null;
    target.tvHongbaoMiss = null;

    view2131559106.setOnClickListener(null);
    view2131559106 = null;
    view2131558770.setOnClickListener(null);
    view2131558770 = null;
    view2131559108.setOnClickListener(null);
    view2131559108 = null;
    view2131559110.setOnClickListener(null);
    view2131559110 = null;
    view2131559107.setOnClickListener(null);
    view2131559107 = null;
  }
}
