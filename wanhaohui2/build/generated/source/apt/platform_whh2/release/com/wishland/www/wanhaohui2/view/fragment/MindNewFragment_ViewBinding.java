// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import com.wishland.www.wanhaohui2.view.customlayout.MyProgress;
import com.wishland.www.wanhaohui2.view.customlayout.MyProgress2;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MindNewFragment_ViewBinding implements Unbinder {
  private MindNewFragment target;

  private View view2131558965;

  private View view2131558944;

  private View view2131558943;

  private View view2131558805;

  private View view2131558959;

  private View view2131558942;

  private View view2131558960;

  private View view2131558952;

  private View view2131558953;

  private View view2131558954;

  private View view2131558956;

  private View view2131558957;

  private View view2131558958;

  private View view2131558961;

  private View view2131558962;

  private View view2131558806;

  private View view2131558807;

  private View view2131558964;

  @UiThread
  public MindNewFragment_ViewBinding(final MindNewFragment target, View source) {
    this.target = target;

    View view;
    target.tv_account_money = Utils.findRequiredViewAsType(source, R.id.tv_account_money, "field 'tv_account_money'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_login_out, "field 'llLoginOut' and method 'onViewClicked'");
    target.llLoginOut = Utils.castView(view, R.id.ll_login_out, "field 'llLoginOut'", LinearLayout.class);
    view2131558965 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_vip1, "field 'ivVip1' and method 'onViewClicked'");
    target.ivVip1 = Utils.castView(view, R.id.iv_vip1, "field 'ivVip1'", ImageView.class);
    view2131558944 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvVip = Utils.findRequiredViewAsType(source, R.id.tv_vip, "field 'tvVip'", TextView.class);
    target.mp = Utils.findRequiredViewAsType(source, R.id.mp, "field 'mp'", MyProgress.class);
    target.mp_two = Utils.findRequiredViewAsType(source, R.id.mp_two, "field 'mp_two'", MyProgress2.class);
    target.srl_refresh_account = Utils.findRequiredViewAsType(source, R.id.srl_refresh_mind, "field 'srl_refresh_account'", SwipeRefreshLayout.class);
    target.view_red_bg = Utils.findRequiredView(source, R.id.view_red_bg, "field 'view_red_bg'");
    target.userName = Utils.findRequiredViewAsType(source, R.id.tv_user_name, "field 'userName'", TextView.class);
    target.llUV = Utils.findRequiredViewAsType(source, R.id.ll_uv, "field 'llUV'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.ll_pb, "method 'onViewClicked'");
    view2131558943 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_contact_us, "method 'onViewClicked'");
    view2131558805 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_zhuanhuan_info, "method 'onViewClicked'");
    view2131558959 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_sign_in, "method 'onViewClicked'");
    view2131558942 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_zhudan_info, "method 'onViewClicked'");
    view2131558960 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_user_detail, "method 'onViewClicked'");
    view2131558952 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_deposit, "method 'onViewClicked'");
    view2131558953 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_with_draw, "method 'onViewClicked'");
    view2131558954 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_line_conversion, "method 'onViewClicked'");
    view2131558956 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_discounts, "method 'onViewClicked'");
    view2131558957 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_records_query, "method 'onViewClicked'");
    view2131558958 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_personal_info, "method 'onViewClicked'");
    view2131558961 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_mind_message, "method 'onViewClicked'");
    view2131558962 = view;
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
    view = Utils.findRequiredView(source, R.id.ll_Others, "method 'onViewClicked'");
    view2131558964 = view;
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
    MindNewFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_account_money = null;
    target.llLoginOut = null;
    target.emptyLayout = null;
    target.ivVip1 = null;
    target.tvVip = null;
    target.mp = null;
    target.mp_two = null;
    target.srl_refresh_account = null;
    target.view_red_bg = null;
    target.userName = null;
    target.llUV = null;

    view2131558965.setOnClickListener(null);
    view2131558965 = null;
    view2131558944.setOnClickListener(null);
    view2131558944 = null;
    view2131558943.setOnClickListener(null);
    view2131558943 = null;
    view2131558805.setOnClickListener(null);
    view2131558805 = null;
    view2131558959.setOnClickListener(null);
    view2131558959 = null;
    view2131558942.setOnClickListener(null);
    view2131558942 = null;
    view2131558960.setOnClickListener(null);
    view2131558960 = null;
    view2131558952.setOnClickListener(null);
    view2131558952 = null;
    view2131558953.setOnClickListener(null);
    view2131558953 = null;
    view2131558954.setOnClickListener(null);
    view2131558954 = null;
    view2131558956.setOnClickListener(null);
    view2131558956 = null;
    view2131558957.setOnClickListener(null);
    view2131558957 = null;
    view2131558958.setOnClickListener(null);
    view2131558958 = null;
    view2131558961.setOnClickListener(null);
    view2131558961 = null;
    view2131558962.setOnClickListener(null);
    view2131558962 = null;
    view2131558806.setOnClickListener(null);
    view2131558806 = null;
    view2131558807.setOnClickListener(null);
    view2131558807 = null;
    view2131558964.setOnClickListener(null);
    view2131558964 = null;
  }
}
