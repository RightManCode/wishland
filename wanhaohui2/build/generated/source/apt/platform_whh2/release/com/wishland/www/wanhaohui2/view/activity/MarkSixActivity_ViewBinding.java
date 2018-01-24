// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.customlayout.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MarkSixActivity_ViewBinding implements Unbinder {
  private MarkSixActivity target;

  @UiThread
  public MarkSixActivity_ViewBinding(MarkSixActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MarkSixActivity_ViewBinding(MarkSixActivity target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MarkSixActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.emptyLayout = null;
  }
}
