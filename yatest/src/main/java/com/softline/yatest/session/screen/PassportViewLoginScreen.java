package com.softline.yatest.session.screen;


import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.screen.LoginScreenBase;


/**
 * Login page, used not main page for checking drawing button somethere in code
 */
public class PassportViewLoginScreen extends LoginScreenBase
{
  public PassportViewLoginScreen( WebDriver webDriver )
  {
    super( webDriver, "http://passport.yandex.ru/passport" );
  }

  public PassportViewScreen login( String login, String password, boolean saveSession )
  {
    PassportViewScreen passportViewScreen = new PassportViewScreen( getDriver() );
    login( login, password, saveSession,  passportViewScreen );
    return passportViewScreen;
  }
}
