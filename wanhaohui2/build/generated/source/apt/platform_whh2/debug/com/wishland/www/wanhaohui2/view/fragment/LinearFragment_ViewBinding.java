// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import com.wishland.www.wanhaohui2.view.customlayout.LineScrollView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LinearFragment_ViewBinding implements Unbinder {
  private LinearFragment target;

  private View view2131558856;

  private View view2131558859;

  private View view2131558875;

  private View view2131558853;

  private View view2131558864;

  private View view2131558866;

  private View view2131558868;

  private View view2131558870;

  private View view2131558872;

  private View view2131558876;

  private View view2131558860;

  @UiThread
  public LinearFragment_ViewBinding(final LinearFragment target, View source) {
    this.target = target;

    View view;
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_select_account_out, "field 'll_select_account_out' and method 'onViewClick'");
    target.ll_select_account_out = Utils.castView(view, R.id.ll_select_account_out, "field 'll_select_account_out'", LinearLayout.class);
    view2131558856 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.editText_account_out = Utils.findRequiredViewAsType(source, R.id.editText_account_out, "field 'editText_account_out'", TextView.class);
    target.tv_account_name_out = Utils.findRequiredViewAsType(source, R.id.tv_account_name_out, "field 'tv_account_name_out'", TextView.class);
    target.tv_account_name_in = Utils.findRequiredViewAsType(source, R.id.tv_account_name_in, "field 'tv_account_name_in'", TextView.class);
    target.editText_account_in = Utils.findRequiredViewAsType(source, R.id.editText_account_in, "field 'editText_account_in'", TextView.class);
    target.tv_account_money = Utils.findRequiredViewAsType(source, R.id.tv_account_money, "field 'tv_account_money'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_change_account, "field 'iv_change_account' and method 'onViewClick'");
    target.iv_change_account = Utils.castView(view, R.id.iv_change_account, "field 'iv_change_account'", ImageView.class);
    view2131558859 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.et_account_counts = Utils.findRequiredViewAsType(source, R.id.et_account_counts, "field 'et_account_counts'", EditText.class);
    view = Utils.findRequiredView(source, R.id.bt_submit_transfer, "field 'bt_submit_transfer' and method 'onViewClick'");
    target.bt_submit_transfer = Utils.castView(view, R.id.bt_submit_transfer, "field 'bt_submit_transfer'", Button.class);
    view2131558875 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.srl_refresh_account = Utils.findRequiredViewAsType(source, R.id.srl_refresh_account, "field 'srl_refresh_account'", SwipeRefreshLayout.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    target.rv_account_list = Utils.findRequiredViewAsType(source, R.id.rv_account_list, "field 'rv_account_list'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.ll_money_yue, "field 'll_money_yue' and method 'onViewClick'");
    target.ll_money_yue = Utils.castView(view, R.id.ll_money_yue, "field 'll_money_yue'", LinearLayout.class);
    view2131558853 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.lsc_parent = Utils.findRequiredViewAsType(source, R.id.lsc_parent, "field 'lsc_parent'", LineScrollView.class);
    target.iv_line_up = Utils.findRequiredViewAsType(source, R.id.iv_line_up, "field 'iv_line_up'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.cb_1, "field 'cb_1' and method 'onViewClick'");
    target.cb_1 = Utils.castView(view, R.id.cb_1, "field 'cb_1'", CheckBox.class);
    view2131558864 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cb_2, "field 'cb_2' and method 'onViewClick'");
    target.cb_2 = Utils.castView(view, R.id.cb_2, "field 'cb_2'", CheckBox.class);
    view2131558866 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cb_3, "field 'cb_3' and method 'onViewClick'");
    target.cb_3 = Utils.castView(view, R.id.cb_3, "field 'cb_3'", CheckBox.class);
    view2131558868 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cb_4, "field 'cb_4' and method 'onViewClick'");
    target.cb_4 = Utils.castView(view, R.id.cb_4, "field 'cb_4'", CheckBox.class);
    view2131558870 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cb_5, "field 'cb_5' and method 'onViewClick'");
    target.cb_5 = Utils.castView(view, R.id.cb_5, "field 'cb_5'", CheckBox.class);
    view2131558872 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_recycle_all, "method 'onViewClick'");
    view2131558876 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_selsect_account_in, "method 'onViewClick'");
    view2131558860 = view;
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
    LinearFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTitle = null;
    target.ll_select_account_out = null;
    target.editText_account_out = null;
    target.tv_account_name_out = null;
    target.tv_account_name_in = null;
    target.editText_account_in = null;
    target.tv_account_money = null;
    target.iv_change_account = null;
    target.et_account_counts = null;
    target.bt_submit_transfer = null;
    target.srl_refresh_account = null;
    target.emptyLayout = null;
    target.rv_account_list = null;
    target.ll_money_yue = null;
    target.lsc_parent = null;
    target.iv_line_up = null;
    target.cb_1 = null;
    target.cb_2 = null;
    target.cb_3 = null;
    target.cb_4 = null;
    target.cb_5 = null;

    view2131558856.setOnClickListener(null);
    view2131558856 = null;
    view2131558859.setOnClickListener(null);
    view2131558859 = null;
    view2131558875.setOnClickListener(null);
    view2131558875 = null;
    view2131558853.setOnClickListener(null);
    view2131558853 = null;
    view2131558864.setOnClickListener(null);
    view2131558864 = null;
    view2131558866.setOnClickListener(null);
    view2131558866 = null;
    view2131558868.setOnClickListener(null);
    view2131558868 = null;
    view2131558870.setOnClickListener(null);
    view2131558870 = null;
    view2131558872.setOnClickListener(null);
    view2131558872 = null;
    view2131558876.setOnClickListener(null);
    view2131558876 = null;
    view2131558860.setOnClickListener(null);
    view2131558860 = null;
  }
}
