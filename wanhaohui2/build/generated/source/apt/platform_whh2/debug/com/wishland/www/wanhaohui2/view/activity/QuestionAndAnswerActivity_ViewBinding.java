// Generated code from Butter Knife. Do not modify!
package com.wishland.www.wanhaohui2.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.wanhaohui2.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class QuestionAndAnswerActivity_ViewBinding implements Unbinder {
  private QuestionAndAnswerActivity target;

  private View view2131558828;

  private View view2131558829;

  private View view2131558830;

  @UiThread
  public QuestionAndAnswerActivity_ViewBinding(QuestionAndAnswerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public QuestionAndAnswerActivity_ViewBinding(final QuestionAndAnswerActivity target,
      View source) {
    this.target = target;

    View view;
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.rv_question_list, "field 'recyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.tv_question, "field 'tv_question' and method 'onViewClick'");
    target.tv_question = Utils.castView(view, R.id.tv_question, "field 'tv_question'", TextView.class);
    view2131558828 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_game_tz, "field 'tv_game_tz' and method 'onViewClick'");
    target.tv_game_tz = Utils.castView(view, R.id.tv_game_tz, "field 'tv_game_tz'", TextView.class);
    view2131558829 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_jishu, "field 'tv_jishu' and method 'onViewClick'");
    target.tv_jishu = Utils.castView(view, R.id.tv_jishu, "field 'tv_jishu'", TextView.class);
    view2131558830 = view;
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
    QuestionAndAnswerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.tv_question = null;
    target.tv_game_tz = null;
    target.tv_jishu = null;

    view2131558828.setOnClickListener(null);
    view2131558828 = null;
    view2131558829.setOnClickListener(null);
    view2131558829 = null;
    view2131558830.setOnClickListener(null);
    view2131558830 = null;
  }
}
