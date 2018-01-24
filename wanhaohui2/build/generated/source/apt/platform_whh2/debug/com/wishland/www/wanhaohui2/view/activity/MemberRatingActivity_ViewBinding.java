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

public class MemberRatingActivity_ViewBinding implements Unbinder {
  private MemberRatingActivity target;

  @UiThread
  public MemberRatingActivity_ViewBinding(MemberRatingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MemberRatingActivity_ViewBinding(MemberRatingActivity target, View source) {
    this.target = target;

    target.rv_vip_ranking = Utils.findRequiredViewAsType(source, R.id.rv_vip_ranking, "field 'rv_vip_ranking'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MemberRatingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rv_vip_ranking = null;
  }
}
