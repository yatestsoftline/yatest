package com.softline.yatest.session.service;

import com.softline.yatest.common.service.UiServiceBase;
import com.softline.yatest.session.object.Session;
import com.softline.yatest.session.screen.PassportLoginScreen;
import com.softline.yatest.session.screen.PassportScreen;

public class SessionUiService extends UiServiceBase implements SessionUiServiceInProxy
{

  private PassportLoginScreen openLoginScreen()
  {
    PassportLoginScreen loginScreen = new PassportLoginScreen( getWebDriver() );
    loginScreen.open();
    return loginScreen;
  }

  @Override
  public boolean isAuthPassed( Session session )
  {
    PassportScreen passportScreen =
      openLoginScreen().login( session.getLogin(), session.getPassword(), session.isSaveSession() );
    return ( passportScreen.getLogin().equals( session.getLogin() ) );
  }

  @Override
  public boolean isAuthFailedWithError( Session session )
  {
    PassportLoginScreen loginScreen =
      openLoginScreen().loginFailed( session.getLogin(), session.getPassword(), session.isSaveSession() );
    return loginScreen.isLoginErrorShown();
  }

}
