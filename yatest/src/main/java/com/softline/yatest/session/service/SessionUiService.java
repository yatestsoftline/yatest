package com.softline.yatest.session.service;

import com.softline.yatest.common.service.UiServiceBase;
import com.softline.yatest.session.object.Session;
import com.softline.yatest.session.screen.PassportViewLoginScreen;
import com.softline.yatest.session.screen.PassportViewScreen;

public class SessionUiService extends UiServiceBase implements SessionUiServiceInProxy
{

  private PassportViewScreen processAuth( Session session )
  {
    PassportViewLoginScreen loginScreen = new PassportViewLoginScreen( getWebDriver() );
    loginScreen.open();
    return loginScreen.login( session.getLogin(), session.getPassword(), session.isSaveSession() );
  }
  
  @Override
  public boolean isAuthPassed( Session session )
  {
    PassportViewScreen passportViewScreen = processAuth( session );
    return ( passportViewScreen.getLogin().equals( session.getLogin() ) );
  }

  @Override
  public boolean isAuthFailedWithError( Session session )
  {
    processAuth( session );
    PassportViewLoginScreen loginScreen = new PassportViewLoginScreen( getWebDriver() );
    return loginScreen.isLoginErrorShown();
  }

}
