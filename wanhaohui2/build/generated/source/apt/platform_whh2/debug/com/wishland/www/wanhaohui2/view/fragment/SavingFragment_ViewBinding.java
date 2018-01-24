// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SavingFragment_ViewBinding implements Unbinder {
  private SavingFragment target;

  private View view2131558672;

  private View view2131558644;

  private View view2131558645;

  private View view2131558646;

  private View view2131558647;

  private View view2131558648;

  private View view2131558649;

  private View view2131558659;

  private View view2131558667;

  private View view2131558669;

  private View view2131558671;

  private View view2131558651;

  private View view2131558653;

  private View view2131558658;

  private View view2131558673;

  private View view2131558694;

  private View view2131558685;

  private View view2131558655;

  private View view2131558657;

  @UiThread
  public SavingFragment_ViewBinding(final SavingFragment target, View source) {
    this.target = target;

    View view;
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.refreshLayout = Utils.findRequiredViewAsType(source, R.id.refreshView, "field 'refreshLayout'", SwipeRefreshLayout.class);
    target.etMoney = Utils.findRequiredViewAsType(source, R.id.et_money, "field 'etMoney'", EditText.class);
    target.recyclerViewPayType = Utils.findRequiredViewAsType(source, R.id.recycler_view_pay_type, "field 'recyclerViewPayType'", RecyclerView.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    target.llPayWayType1 = Utils.findRequiredViewAsType(source, R.id.ll_pay_way_type1, "field 'llPayWayType1'", LinearLayout.class);
    target.llPayWayType2 = Utils.findRequiredViewAsType(source, R.id.ll_pay_way_type2, "field 'llPayWayType2'", LinearLayout.class);
    target.tvAttention1 = Utils.findRequiredViewAsType(source, R.id.tv_attention1, "field 'tvAttention1'", TextView.class);
    target.tvAttention2 = Utils.findRequiredViewAsType(source, R.id.tv_attention2, "field 'tvAttention2'", TextView.class);
    target.tvAttention3 = Utils.findRequiredViewAsType(source, R.id.tv_attention3, "field 'tvAttention3'", TextView.class);
    target.recyclerViewCardType = Utils.findRequiredViewAsType(source, R.id.recycler_view_card_type, "field 'recyclerViewCardType'", RecyclerView.class);
    target.tvUserName = Utils.findRequiredViewAsType(source, R.id.tv_user_name, "field 'tvUserName'", TextView.class);
    target.tvBankNumber = Utils.findRequiredViewAsType(source, R.id.tv_bank_number, "field 'tvBankNumber'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_remit_type, "field 'tvRemitType' and method 'onViewClicked'");
    target.tvRemitType = Utils.castView(view, R.id.tv_remit_type, "field 'tvRemitType'", TextView.class);
    view2131558672 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.llOtherPayWay = Utils.findRequiredViewAsType(source, R.id.ll_other_pay_way, "field 'llOtherPayWay'", LinearLayout.class);
    target.llRemitPeople = Utils.findRequiredViewAsType(source, R.id.ll_remit_people, "field 'llRemitPeople'", LinearLayout.class);
    target.tvRemitBackground = Utils.findRequiredViewAsType(source, R.id.tv_remit_background, "field 'tvRemitBackground'", TextView.class);
    target.llPayName = Utils.findRequiredViewAsType(source, R.id.ll_pay_name, "field 'llPayName'", LinearLayout.class);
    target.tvPayName = Utils.findRequiredViewAsType(source, R.id.tv_pay_name, "field 'tvPayName'", TextView.class);
    target.llPayPlace = Utils.findRequiredViewAsType(source, R.id.ll_pay_place, "field 'llPayPlace'", LinearLayout.class);
    target.tvPayPlace = Utils.findRequiredViewAsType(source, R.id.tv_pay_place, "field 'tvPayPlace'", TextView.class);
    target.recyclerViewAliAccount = Utils.findRequiredViewAsType(source, R.id.recycler_view_ali_account, "field 'recyclerViewAliAccount'", RecyclerView.class);
    target.etRemitMoney = Utils.findRequiredViewAsType(source, R.id.et_remit_money, "field 'etRemitMoney'", EditText.class);
    target.tvPayWay = Utils.findRequiredViewAsType(source, R.id.tv_pay_way, "field 'tvPayWay'", TextView.class);
    target.tvRemitDate = Utils.findRequiredViewAsType(source, R.id.tv_remit_date, "field 'tvRemitDate'", TextView.class);
    target.etRemitPlace = Utils.findRequiredViewAsType(source, R.id.et_remit_place, "field 'etRemitPlace'", EditText.class);
    target.etRemitName = Utils.findRequiredViewAsType(source, R.id.et_remit_name, "field 'etRemitName'", EditText.class);
    target.etOrderNumber = Utils.findRequiredViewAsType(source, R.id.et_order_number, "field 'etOrderNumber'", EditText.class);
    target.llAliName = Utils.findRequiredViewAsType(source, R.id.ll_ali_name, "field 'llAliName'", LinearLayout.class);
    target.etAliName = Utils.findRequiredViewAsType(source, R.id.et_ali_name, "field 'etAliName'", EditText.class);
    target.tvAliName = Utils.findRequiredViewAsType(source, R.id.tv_ali_name, "field 'tvAliName'", TextView.class);
    target.etOtherPay = Utils.findRequiredViewAsType(source, R.id.et_other_pay, "field 'etOtherPay'", EditText.class);
    target.llPayBank = Utils.findRequiredViewAsType(source, R.id.ll_pay_bank, "field 'llPayBank'", LinearLayout.class);
    target.tvPayBank = Utils.findRequiredViewAsType(source, R.id.tv_pay_bank, "field 'tvPayBank'", TextView.class);
    view = Utils.findRequiredView(source, R.id.bt1, "field 'bt1' and method 'onViewClicked'");
    target.bt1 = Utils.castView(view, R.id.bt1, "field 'bt1'", CheckBox.class);
    view2131558644 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt2, "field 'bt2' and method 'onViewClicked'");
    target.bt2 = Utils.castView(view, R.id.bt2, "field 'bt2'", CheckBox.class);
    view2131558645 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt3, "field 'bt3' and method 'onViewClicked'");
    target.bt3 = Utils.castView(view, R.id.bt3, "field 'bt3'", CheckBox.class);
    view2131558646 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt4, "field 'bt4' and method 'onViewClicked'");
    target.bt4 = Utils.castView(view, R.id.bt4, "field 'bt4'", CheckBox.class);
    view2131558647 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt5, "field 'bt5' and method 'onViewClicked'");
    target.bt5 = Utils.castView(view, R.id.bt5, "field 'bt5'", CheckBox.class);
    view2131558648 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt6, "field 'bt6' and method 'onViewClicked'");
    target.bt6 = Utils.castView(view, R.id.bt6, "field 'bt6'", CheckBox.class);
    view2131558649 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvRemitHour = Utils.findRequiredViewAsType(source, R.id.tv_remit_hour, "field 'tvRemitHour'", TextView.class);
    target.tvRemitMinute = Utils.findRequiredViewAsType(source, R.id.tv_remit_minute, "field 'tvRemitMinute'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tip_faster_go_to_bank_card, "field 'tip_faster_go_to_bank_card' and method 'onCopyClicked'");
    target.tip_faster_go_to_bank_card = Utils.castView(view, R.id.tip_faster_go_to_bank_card, "field 'tip_faster_go_to_bank_card'", TextView.class);
    view2131558659 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCopyClicked(p0);
      }
    });
    target.tvCardAddress = Utils.findRequiredViewAsType(source, R.id.tv_card_address, "field 'tvCardAddress'", TextView.class);
    view = Utils.findRequiredView(source, R.id.personal_text_copy, "method 'onCopyClicked'");
    view2131558667 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCopyClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bank_number_text_copy, "method 'onCopyClicked'");
    view2131558669 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCopyClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.address_text_copy, "method 'onCopyClicked'");
    view2131558671 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onCopyClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_pay_way, "method 'onViewClicked'");
    view2131558651 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_pay_way, "method 'onViewClicked'");
    view2131558653 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_commit, "method 'onViewClicked'");
    view2131558658 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_remit_type, "method 'onViewClicked'");
    view2131558673 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_pay_type_commit2, "method 'onViewClicked'");
    view2131558694 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_remit_date, "method 'onViewClicked'");
    view2131558685 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_pay_bank_name, "method 'onViewClicked'");
    view2131558655 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_pay_bank, "method 'onViewClicked'");
    view2131558657 = view;
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
    SavingFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTitle = null;
    target.refreshLayout = null;
    target.etMoney = null;
    target.recyclerViewPayType = null;
    target.emptyLayout = null;
    target.llPayWayType1 = null;
    target.llPayWayType2 = null;
    target.tvAttention1 = null;
    target.tvAttention2 = null;
    target.tvAttention3 = null;
    target.recyclerViewCardType = null;
    target.tvUserName = null;
    target.tvBankNumber = null;
    target.tvRemitType = null;
    target.llOtherPayWay = null;
    target.llRemitPeople = null;
    target.tvRemitBackground = null;
    target.llPayName = null;
    target.tvPayName = null;
    target.llPayPlace = null;
    target.tvPayPlace = null;
    target.recyclerViewAliAccount = null;
    target.etRemitMoney = null;
    target.tvPayWay = null;
    target.tvRemitDate = null;
    target.etRemitPlace = null;
    target.etRemitName = null;
    target.etOrderNumber = null;
    target.llAliName = null;
    target.etAliName = null;
    target.tvAliName = null;
    target.etOtherPay = null;
    target.llPayBank = null;
    target.tvPayBank = null;
    target.bt1 = null;
    target.bt2 = null;
    target.bt3 = null;
    target.bt4 = null;
    target.bt5 = null;
    target.bt6 = null;
    target.tvRemitHour = null;
    target.tvRemitMinute = null;
    target.tip_faster_go_to_bank_card = null;
    target.tvCardAddress = null;

    view2131558672.setOnClickListener(null);
    view2131558672 = null;
    view2131558644.setOnClickListener(null);
    view2131558644 = null;
    view2131558645.setOnClickListener(null);
    view2131558645 = null;
    view2131558646.setOnClickListener(null);
    view2131558646 = null;
    view2131558647.setOnClickListener(null);
    view2131558647 = null;
    view2131558648.setOnClickListener(null);
    view2131558648 = null;
    view2131558649.setOnClickListener(null);
    view2131558649 = null;
    view2131558659.setOnClickListener(null);
    view2131558659 = null;
    view2131558667.setOnClickListener(null);
    view2131558667 = null;
    view2131558669.setOnClickListener(null);
    view2131558669 = null;
    view2131558671.setOnClickListener(null);
    view2131558671 = null;
    view2131558651.setOnClickListener(null);
    view2131558651 = null;
    view2131558653.setOnClickListener(null);
    view2131558653 = null;
    view2131558658.setOnClickListener(null);
    view2131558658 = null;
    view2131558673.setOnClickListener(null);
    view2131558673 = null;
    view2131558694.setOnClickListener(null);
    view2131558694 = null;
    view2131558685.setOnClickListener(null);
    view2131558685 = null;
    view2131558655.setOnClickListener(null);
    view2131558655 = null;
    view2131558657.setOnClickListener(null);
    view2131558657 = null;
  }
}
