// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangeUserNameActivity_ViewBinding implements Unbinder {
  private ChangeUserNameActivity target;

  private View view2131558616;

  @UiThread
  public ChangeUserNameActivity_ViewBinding(ChangeUserNameActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangeUserNameActivity_ViewBinding(final ChangeUserNameActivity target, View source) {
    this.target = target;

    View view;
    target.etUserName = Utils.findRequiredViewAsType(source, R.id.et_user_name, "field 'etUserName'", EditText.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.bt_register, "method 'onViewClicked'");
    view2131558616 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ChangeUserNameActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etUserName = null;
    target.emptyLayout = null;

    view2131558616.setOnClickListener(null);
    view2131558616 = null;
  }
}
