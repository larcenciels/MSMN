// Generated code from Butter Knife. Do not modify!
package net.winnerawan.miesetan;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class RegisterActivity$$ViewInjector<T extends net.winnerawan.miesetan.RegisterActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427406, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131427406, "field 'toolbar'");
  }

  @Override public void reset(T target) {
    target.toolbar = null;
  }
}
