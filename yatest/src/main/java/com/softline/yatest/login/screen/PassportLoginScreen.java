package com.softline.yatest.login.screen;

import org.openqa.selenium.WebDriver;


/**
 * Screen for Yandex Passport page for not authorised user
 */
public class PassportLoginScreen extends SeparateLoginScreenBase
{
  public PassportLoginScreen( WebDriver webDriver )
  {
    super( webDriver, "http://passport.yandex.ru/passport" );
  }

  public PassportScreen login( String login, String password, boolean saveSession )
  {
    PassportScreen passportScreen = new PassportScreen( getDriver() );
    login( login, password, saveSession, passportScreen );
    return passportScreen;
  }

  public PassportLoginScreen loginFailed( String login, String password, boolean saveSession )
  {
    PassportLoginScreen passportLoginScreen = new PassportLoginScreen( getDriver() );
    loginFailed( login, password, saveSession, passportLoginScreen );
    return passportLoginScreen;
  }
}
