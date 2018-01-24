// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyMessageActivity_ViewBinding implements Unbinder {
  private MyMessageActivity target;

  private View view2131558794;

  private View view2131558795;

  private View view2131558796;

  private View view2131558886;

  @UiThread
  public MyMessageActivity_ViewBinding(MyMessageActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyMessageActivity_ViewBinding(final MyMessageActivity target, View source) {
    this.target = target;

    View view;
    target.rv_my_message = Utils.findRequiredViewAsType(source, R.id.rv_my_message, "field 'rv_my_message'", RecyclerView.class);
    target.srl_my_message = Utils.findRequiredViewAsType(source, R.id.srl_my_message, "field 'srl_my_message'", SwipeRefreshLayout.class);
    target.tv_no_info = Utils.findRequiredViewAsType(source, R.id.tv_no_info, "field 'tv_no_info'", TextView.class);
    view = Utils.findRequiredView(source, R.id.cb_check_all, "field 'cb_check_all' and method 'onViewClick'");
    target.cb_check_all = Utils.castView(view, R.id.cb_check_all, "field 'cb_check_all'", CheckBox.class);
    view2131558794 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.rl_change_view = Utils.findRequiredViewAsType(source, R.id.rl_change_view, "field 'rl_change_view'", RelativeLayout.class);
    view = Utils.findRequiredView(source, R.id.tv_read_all, "method 'onViewClick'");
    view2131558795 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_delete_item, "method 'onViewClick'");
    view2131558796 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_btn, "method 'onViewClick'");
    view2131558886 = view;
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
    MyMessageActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rv_my_message = null;
    target.srl_my_message = null;
    target.tv_no_info = null;
    target.cb_check_all = null;
    target.rl_change_view = null;

    view2131558794.setOnClickListener(null);
    view2131558794 = null;
    view2131558795.setOnClickListener(null);
    view2131558795 = null;
    view2131558796.setOnClickListener(null);
    view2131558796 = null;
    view2131558886.setOnClickListener(null);
    view2131558886 = null;
  }
}
