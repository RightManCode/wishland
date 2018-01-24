// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
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

public class ContactUsActivity_ViewBinding implements Unbinder {
  private ContactUsActivity target;

  private View view2131558635;

  private View view2131558640;

  private View view2131558620;

  private View view2131558630;

  private View view2131558627;

  private View view2131558632;

  private View view2131558636;

  @UiThread
  public ContactUsActivity_ViewBinding(ContactUsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ContactUsActivity_ViewBinding(final ContactUsActivity target, View source) {
    this.target = target;

    View view;
    target.et_contact_number = Utils.findRequiredViewAsType(source, R.id.et_contact_number, "field 'et_contact_number'", EditText.class);
    target.ll_submit_success = Utils.findRequiredViewAsType(source, R.id.ll_submit_success, "field 'll_submit_success'", LinearLayout.class);
    target.ll_submit_contactUs = Utils.findRequiredViewAsType(source, R.id.ll_submit_contactUs, "field 'll_submit_contactUs'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.ll_click_kf, "field 'll_click_kf' and method 'onViewClick'");
    target.ll_click_kf = Utils.castView(view, R.id.ll_click_kf, "field 'll_click_kf'", LinearLayout.class);
    view2131558635 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.tv_contact_wx = Utils.findRequiredViewAsType(source, R.id.tv_contact_wx, "field 'tv_contact_wx'", TextView.class);
    target.tv_contact_qq = Utils.findRequiredViewAsType(source, R.id.tv_contact_qq, "field 'tv_contact_qq'", TextView.class);
    target.tv_contact_skype = Utils.findRequiredViewAsType(source, R.id.tv_contact_skype, "field 'tv_contact_skype'", TextView.class);
    target.tv_contact_email = Utils.findRequiredViewAsType(source, R.id.tv_contact_email, "field 'tv_contact_email'", TextView.class);
    target.empty_layout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'empty_layout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.fl_submit_contact, "method 'onViewClick'");
    view2131558640 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_submit_close, "method 'onViewClick'");
    view2131558620 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_click_qq, "method 'onViewClick'");
    view2131558630 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_contact_wx, "method 'onViewClick'");
    view2131558627 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_contact_skype, "method 'onViewClick'");
    view2131558632 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_contact_email, "method 'onViewClick'");
    view2131558636 = view;
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
    ContactUsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.et_contact_number = null;
    target.ll_submit_success = null;
    target.ll_submit_contactUs = null;
    target.ll_click_kf = null;
    target.tv_contact_wx = null;
    target.tv_contact_qq = null;
    target.tv_contact_skype = null;
    target.tv_contact_email = null;
    target.empty_layout = null;

    view2131558635.setOnClickListener(null);
    view2131558635 = null;
    view2131558640.setOnClickListener(null);
    view2131558640 = null;
    view2131558620.setOnClickListener(null);
    view2131558620 = null;
    view2131558630.setOnClickListener(null);
    view2131558630 = null;
    view2131558627.setOnClickListener(null);
    view2131558627 = null;
    view2131558632.setOnClickListener(null);
    view2131558632 = null;
    view2131558636.setOnClickListener(null);
    view2131558636 = null;
  }
}
