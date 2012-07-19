package com.softline.yatest.session.screen;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.FieldElement;
import com.softline.yatest.common.ui.screen.AuthorisedScreenBase;


/**
 * Screen for user dashboard view
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
