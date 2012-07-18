package com.softline.yatest.common.ui.screen;


import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.ButtonElement;
import com.softline.yatest.common.ui.element.LinkElement;
import com.softline.yatest.session.screen.LoginScreen;



/**
 * Shared functionality (logout and validation) for any view screen
 */
public class ViewScreenBase extends ScreenBase implements ViewScreen
{
  private LinkElement logoutLink = new LinkElement( getDriver(), "MRGT_Logoff" );

  private ButtonElement logoutButton = new ButtonElement( getDriver(), "hook_FormButton_button_logoff" );

  protected ViewScreenBase( WebDriver webDriver )
  {
    super( webDriver );
  }

  @Override
  public LoginScreen logout()
  {
    logoutLink.clickAndWaitForScreen( new ViewScreenBase( getDriver() ) );
    logoutButton.clickAndWaitForScreen( new LoginScreen( getDriver() ) );
    return new LoginScreen( getDriver() );
  }

  @Override
  public void validateScreen()
  {
    logoutLink.waitAndGetWebElement();
  }
}
