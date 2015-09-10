// Generated code from Butter Knife. Do not modify!
package net.winnerawan.miesetan;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class LoginActivity$$ViewInjector<T extends net.winnerawan.miesetan.LoginActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427408, "field 'signin'");
    target.signin = finder.castView(view, 2131427408, "field 'signin'");
    view = finder.findRequiredView(source, 2131427409, "field 'tvReg'");
    target.tvReg = finder.castView(view, 2131427409, "field 'tvReg'");
    view = finder.findRequiredView(source, 2131427410, "field 'txtEmail'");
    target.txtEmail = finder.castView(view, 2131427410, "field 'txtEmail'");
    view = finder.findRequiredView(source, 2131427411, "field 'txtPassword'");
    target.txtPassword = finder.castView(view, 2131427411, "field 'txtPassword'");
    view = finder.findRequiredView(source, 2131427406, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131427406, "field 'toolbar'");
  }

  @Override public void reset(T target) {
    target.signin = null;
    target.tvReg = null;
    target.txtEmail = null;
    target.txtPassword = null;
    target.toolbar = null;
  }
}
