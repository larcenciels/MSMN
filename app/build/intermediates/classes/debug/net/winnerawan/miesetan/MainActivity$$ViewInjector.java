// Generated code from Butter Knife. Do not modify!
package net.winnerawan.miesetan;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends net.winnerawan.miesetan.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427408, "field 'bSign'");
    target.bSign = finder.castView(view, 2131427408, "field 'bSign'");
    view = finder.findRequiredView(source, 2131427409, "field 'tvReg'");
    target.tvReg = finder.castView(view, 2131427409, "field 'tvReg'");
    view = finder.findRequiredView(source, 2131427414, "field 'bGuest'");
    target.bGuest = finder.castView(view, 2131427414, "field 'bGuest'");
  }

  @Override public void reset(T target) {
    target.bSign = null;
    target.tvReg = null;
    target.bGuest = null;
  }
}
