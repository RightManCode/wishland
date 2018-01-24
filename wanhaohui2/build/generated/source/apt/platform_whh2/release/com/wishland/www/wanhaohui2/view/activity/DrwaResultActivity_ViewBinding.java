// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DrwaResultActivity_ViewBinding implements Unbinder {
  private DrwaResultActivity target;

  @UiThread
  public DrwaResultActivity_ViewBinding(DrwaResultActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DrwaResultActivity_ViewBinding(DrwaResultActivity target, View source) {
    this.target = target;

    target.drawNumber = Utils.findRequiredViewAsType(source, R.id.tv_draw_num, "field 'drawNumber'", TextView.class);
    target.bankName = Utils.findRequiredViewAsType(source, R.id.tv_to_num, "field 'bankName'", TextView.class);
    target.bankNumber = Utils.findRequiredViewAsType(source, R.id.tv_bank_number, "field 'bankNumber'", TextView.class);
    target.payStatus = Utils.findRequiredViewAsType(source, R.id.tv_draw_statu_num, "field 'payStatus'", TextView.class);
    target.tv_pay_status = Utils.findRequiredViewAsType(source, R.id.tv_pay_status, "field 'tv_pay_status'", TextView.class);
    target.payImage = Utils.findRequiredViewAsType(source, R.id.iv_draw_success, "field 'payImage'", ImageView.class);
    target.back = Utils.findRequiredViewAsType(source, R.id.rl_draw_back, "field 'back'", RelativeLayout.class);
    target.view1 = Utils.findRequiredView(source, R.id.view1, "field 'view1'");
    target.view2 = Utils.findRequiredView(source, R.id.view2, "field 'view2'");
    target.iv_pay_img = Utils.findRequiredViewAsType(source, R.id.iv_pay_img, "field 'iv_pay_img'", ImageView.class);
    target.iv_finish_img = Utils.findRequiredViewAsType(source, R.id.iv_finish_img, "field 'iv_finish_img'", ImageView.class);
    target.tv_pay_text = Utils.findRequiredViewAsType(source, R.id.tv_pay_text, "field 'tv_pay_text'", TextView.class);
    target.tv_finish = Utils.findRequiredViewAsType(source, R.id.tv_finish, "field 'tv_finish'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DrwaResultActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.drawNumber = null;
    target.bankName = null;
    target.bankNumber = null;
    target.payStatus = null;
    target.tv_pay_status = null;
    target.payImage = null;
    target.back = null;
    target.view1 = null;
    target.view2 = null;
    target.iv_pay_img = null;
    target.iv_finish_img = null;
    target.tv_pay_text = null;
    target.tv_finish = null;
  }
}
