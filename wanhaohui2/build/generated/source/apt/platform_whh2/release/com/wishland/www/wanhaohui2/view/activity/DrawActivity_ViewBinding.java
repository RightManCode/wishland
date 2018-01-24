// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DrawActivity_ViewBinding implements Unbinder {
  private DrawActivity target;

  private View view2131558698;

  private View view2131558705;

  private View view2131558701;

  @UiThread
  public DrawActivity_ViewBinding(DrawActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DrawActivity_ViewBinding(final DrawActivity target, View source) {
    this.target = target;

    View view;
    target.et_draw_money = Utils.findRequiredViewAsType(source, R.id.et_draw_money, "field 'et_draw_money'", EditText.class);
    target.et_draw_password = Utils.findRequiredViewAsType(source, R.id.et_draw_password, "field 'et_draw_password'", EditText.class);
    target.textView6 = Utils.findRequiredViewAsType(source, R.id.textView6, "field 'textView6'", TextView.class);
    view = Utils.findRequiredView(source, R.id.rl_add_bank, "field 'rl_add_bank' and method 'onViewClick'");
    target.rl_add_bank = Utils.castView(view, R.id.rl_add_bank, "field 'rl_add_bank'", RelativeLayout.class);
    view2131558698 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.ll_add_bank = Utils.findRequiredViewAsType(source, R.id.ll_add_bank, "field 'll_add_bank'", LinearLayout.class);
    target.tv_bank_name = Utils.findRequiredViewAsType(source, R.id.tv_bank_name, "field 'tv_bank_name'", TextView.class);
    target.tv_bank_number = Utils.findRequiredViewAsType(source, R.id.tv_bank_number, "field 'tv_bank_number'", TextView.class);
    target.iv_bank_icon = Utils.findRequiredViewAsType(source, R.id.iv_bank_icon, "field 'iv_bank_icon'", ImageView.class);
    target.empty_layout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'empty_layout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.rl_submit_draw, "method 'onViewClick'");
    view2131558705 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_bank_change, "method 'onViewClick'");
    view2131558701 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    DrawActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.et_draw_money = null;
    target.et_draw_password = null;
    target.textView6 = null;
    target.rl_add_bank = null;
    target.ll_add_bank = null;
    target.tv_bank_name = null;
    target.tv_bank_number = null;
    target.iv_bank_icon = null;
    target.empty_layout = null;

    view2131558698.setOnClickListener(null);
    view2131558698 = null;
    view2131558705.setOnClickListener(null);
    view2131558705 = null;
    view2131558701.setOnClickListener(null);
    view2131558701 = null;
  }
}
