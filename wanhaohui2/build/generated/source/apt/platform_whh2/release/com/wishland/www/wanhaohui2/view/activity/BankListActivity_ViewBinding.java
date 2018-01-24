// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BankListActivity_ViewBinding implements Unbinder {
  private BankListActivity target;

  @UiThread
  public BankListActivity_ViewBinding(BankListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BankListActivity_ViewBinding(BankListActivity target, View source) {
    this.target = target;

    target.rv_bank_list = Utils.findRequiredViewAsType(source, R.id.rv_bank_list, "field 'rv_bank_list'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BankListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rv_bank_list = null;
  }
}
