package com.softline.yatest.login.service;

import com.softline.yatest.common.ui.service.UiServiceBase;
import com.softline.yatest.login.object.LoginInfo;
import com.softline.yatest.login.screen.PassportLoginScreen;
import com.softline.yatest.login.screen.PassportScreen;

public class LoginPassportUiService extends UiServiceBase implements LoginPassportUiServiceInProxy
{
  private PassportLoginScreen openLoginScreen()
  {
    PassportLoginScreen loginScreen = new PassportLoginScreen( getWebDriver() );
    loginScreen.open();
    return loginScreen;
  }

  @Override
  public boolean isAuthPassed( LoginInfo loginInfo )
  {
    PassportScreen passportScreen =
      openLoginScreen().login( loginInfo.getLogin(), loginInfo.getPassword(), loginInfo.isSaveSession() );
    return ( passportScreen.getLogin().equals( loginInfo.getLogin() ) );
  }

  @Override
  public boolean isAuthFailedWithError( LoginInfo loginInfo )
  {
    PassportLoginScreen loginScreen =
      openLoginScreen().loginFailed( loginInfo.getLogin(), loginInfo.getPassword(), loginInfo.isSaveSession() );
    return loginScreen.isLoginErrorShown();
  }
}
