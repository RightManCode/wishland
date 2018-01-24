// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LinearPupopAdapter$ViewHolder_ViewBinding implements Unbinder {
  private LinearPupopAdapter.ViewHolder target;

  @UiThread
  public LinearPupopAdapter$ViewHolder_ViewBinding(LinearPupopAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.fundsPopupItemText = Utils.findRequiredViewAsType(source, R.id.funds_popup_item_text, "field 'fundsPopupItemText'", TextView.class);
    target.funds_popup_item_count = Utils.findRequiredViewAsType(source, R.id.funds_popup_item_count, "field 'funds_popup_item_count'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LinearPupopAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fundsPopupItemText = null;
    target.funds_popup_item_count = null;
  }
}
