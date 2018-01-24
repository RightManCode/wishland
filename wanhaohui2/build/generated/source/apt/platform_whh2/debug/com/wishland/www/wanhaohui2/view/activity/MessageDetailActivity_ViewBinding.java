// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MessageDetailActivity_ViewBinding implements Unbinder {
  private MessageDetailActivity target;

  private View view2131558803;

  @UiThread
  public MessageDetailActivity_ViewBinding(MessageDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MessageDetailActivity_ViewBinding(final MessageDetailActivity target, View source) {
    this.target = target;

    View view;
    target.tv_message_title = Utils.findRequiredViewAsType(source, R.id.tv_message_title, "field 'tv_message_title'", TextView.class);
    target.tv_message_time = Utils.findRequiredViewAsType(source, R.id.tv_message_time, "field 'tv_message_time'", TextView.class);
    target.tv_message_info = Utils.findRequiredViewAsType(source, R.id.tv_message_info, "field 'tv_message_info'", TextView.class);
    view = Utils.findRequiredView(source, R.id.bt_message_back, "method 'onViewClick'");
    view2131558803 = view;
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
    MessageDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_message_title = null;
    target.tv_message_time = null;
    target.tv_message_info = null;

    view2131558803.setOnClickListener(null);
    view2131558803 = null;
  }
}
