// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LottoDeluxeActivity_ViewBinding implements Unbinder {
  private LottoDeluxeActivity target;

  private View view2131558774;

  private View view2131558777;

  private View view2131558780;

  @UiThread
  public LottoDeluxeActivity_ViewBinding(LottoDeluxeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LottoDeluxeActivity_ViewBinding(final LottoDeluxeActivity target, View source) {
    this.target = target;

    View view;
    target.flGame = Utils.findRequiredViewAsType(source, R.id.fl_game, "field 'flGame'", FrameLayout.class);
    target.sdvWHH = Utils.findRequiredViewAsType(source, R.id.sdv_whh, "field 'sdvWHH'", SimpleDraweeView.class);
    target.tvWhh = Utils.findRequiredViewAsType(source, R.id.tv_whh, "field 'tvWhh'", TextView.class);
    target.sdvIG = Utils.findRequiredViewAsType(source, R.id.sdv_ig, "field 'sdvIG'", SimpleDraweeView.class);
    target.tvIg = Utils.findRequiredViewAsType(source, R.id.tv_ig, "field 'tvIg'", TextView.class);
    target.sdvVR = Utils.findRequiredViewAsType(source, R.id.sdv_vr, "field 'sdvVR'", SimpleDraweeView.class);
    target.tvVr = Utils.findRequiredViewAsType(source, R.id.tv_vr, "field 'tvVr'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_whh, "method 'onViewClicked'");
    view2131558774 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_ig, "method 'onViewClicked'");
    view2131558777 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_vr, "method 'onViewClicked'");
    view2131558780 = view;
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
    LottoDeluxeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.flGame = null;
    target.sdvWHH = null;
    target.tvWhh = null;
    target.sdvIG = null;
    target.tvIg = null;
    target.sdvVR = null;
    target.tvVr = null;

    view2131558774.setOnClickListener(null);
    view2131558774 = null;
    view2131558777.setOnClickListener(null);
    view2131558777 = null;
    view2131558780.setOnClickListener(null);
    view2131558780 = null;
  }
}
