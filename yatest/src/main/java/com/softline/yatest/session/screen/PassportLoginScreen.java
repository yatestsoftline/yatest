package com.softline.yatest.session.screen;


import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.screen.SeparatePassportLoginScreenBase;


/**
 * Login page, used not main page for checking drawing button somethere in code
 */
public class PassportLoginScreen extends SeparatePassportLoginScreenBase
{
  public PassportLoginScreen( WebDriver webDriver )
  {
    super( webDriver, "http://passport.yandex.ru/passport" );
  }

  public PassportScreen login( String login, String password, boolean saveSession )
  {
    PassportScreen passportScreen = new PassportScreen( getDriver() );
    login( login, password, saveSession,  passportScreen );
    return passportScreen;
  }

  public PassportLoginScreen loginFailed( String login, String password, boolean saveSession )
  {
    PassportLoginScreen passportLoginScreen = new PassportLoginScreen( getDriver() );
    loginFailed( login, password, saveSession,  passportLoginScreen );
    return passportLoginScreen;
  }
}
