// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ComplaintAdviceActivity_ViewBinding implements Unbinder {
  private ComplaintAdviceActivity target;

  private View view2131558624;

  private View view2131558620;

  @UiThread
  public ComplaintAdviceActivity_ViewBinding(ComplaintAdviceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ComplaintAdviceActivity_ViewBinding(final ComplaintAdviceActivity target, View source) {
    this.target = target;

    View view;
    target.et_complaint_content = Utils.findRequiredViewAsType(source, R.id.et_complaint_content, "field 'et_complaint_content'", EditText.class);
    target.login_edit_username = Utils.findRequiredViewAsType(source, R.id.login_edit_username, "field 'login_edit_username'", EditText.class);
    target.login_edit_passwork = Utils.findRequiredViewAsType(source, R.id.login_edit_passwork, "field 'login_edit_passwork'", EditText.class);
    target.et_complaint_wecat = Utils.findRequiredViewAsType(source, R.id.et_complaint_wecat, "field 'et_complaint_wecat'", EditText.class);
    view = Utils.findRequiredView(source, R.id.bt_submit_complaint, "field 'bt_submit_complaint' and method 'onViewClick'");
    target.bt_submit_complaint = Utils.castView(view, R.id.bt_submit_complaint, "field 'bt_submit_complaint'", Button.class);
    view2131558624 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    target.ll_submit_complaint = Utils.findRequiredViewAsType(source, R.id.ll_submit_complaint, "field 'll_submit_complaint'", LinearLayout.class);
    target.ll_submit_success = Utils.findRequiredViewAsType(source, R.id.ll_submit_success, "field 'll_submit_success'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.bt_submit_close, "method 'onViewClick'");
    view2131558620 = view;
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
    ComplaintAdviceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.et_complaint_content = null;
    target.login_edit_username = null;
    target.login_edit_passwork = null;
    target.et_complaint_wecat = null;
    target.bt_submit_complaint = null;
    target.ll_submit_complaint = null;
    target.ll_submit_success = null;

    view2131558624.setOnClickListener(null);
    view2131558624 = null;
    view2131558620.setOnClickListener(null);
    view2131558620 = null;
  }
}
