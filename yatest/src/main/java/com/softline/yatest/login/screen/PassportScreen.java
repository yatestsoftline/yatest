package com.softline.yatest.login.screen;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.FieldElement;
import com.softline.yatest.common.ui.screen.AuthorisedScreenBase;

/**
 * Screen for Yandex Passport page for authorised user
 */
public class PassportScreen extends AuthorisedScreenBase
{

  private FieldElement loginField = new FieldElement( getDriver(), "b-user" );

  public PassportScreen( WebDriver webDriver )
  {
    super( webDriver, "http://passport.yandex.ru/passport" );
  }

  public String getLogin()
  {
    return loginField.getContent();
  }
}
