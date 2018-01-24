// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RecordQueryActivity_ViewBinding implements Unbinder {
  private RecordQueryActivity target;

  private View view2131558751;

  private View view2131558753;

  private View view2131558755;

  private View view2131558834;

  @UiThread
  public RecordQueryActivity_ViewBinding(RecordQueryActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RecordQueryActivity_ViewBinding(final RecordQueryActivity target, View source) {
    this.target = target;

    View view;
    target.tv_record_type = Utils.findRequiredViewAsType(source, R.id.tv_record_type, "field 'tv_record_type'", TextView.class);
    target.tv_record_time = Utils.findRequiredViewAsType(source, R.id.tv_record_time, "field 'tv_record_time'", TextView.class);
    target.tv_money_content = Utils.findRequiredViewAsType(source, R.id.tv_money_content, "field 'tv_money_content'", TextView.class);
    target.ll_content_money = Utils.findRequiredViewAsType(source, R.id.ll_content_money, "field 'll_content_money'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.ll_record_type, "method 'onViewClicked'");
    view2131558751 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_time_range, "method 'onViewClicked'");
    view2131558753 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.bt_query_record, "method 'onViewClicked'");
    view2131558755 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_money_content, "method 'onViewClicked'");
    view2131558834 = view;
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
    RecordQueryActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_record_type = null;
    target.tv_record_time = null;
    target.tv_money_content = null;
    target.ll_content_money = null;

    view2131558751.setOnClickListener(null);
    view2131558751 = null;
    view2131558753.setOnClickListener(null);
    view2131558753 = null;
    view2131558755.setOnClickListener(null);
    view2131558755 = null;
    view2131558834.setOnClickListener(null);
    view2131558834 = null;
  }
}
