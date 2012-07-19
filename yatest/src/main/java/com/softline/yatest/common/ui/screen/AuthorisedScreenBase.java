package com.softline.yatest.common.ui.screen;


import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.LinkElement;



/**
 * Shared functionality (logout and validation) for any view screen
 */
public class AuthorisedScreenBase extends ScreenBase implements AuthorisedScreen
{
  private LinkElement logoutLink = new LinkElement( getDriver(), "b-head-userinfo__exit" );

  protected AuthorisedScreenBase( WebDriver webDriver, String directUrl )
  {
    super( webDriver, directUrl );
  }

  @Override
  public Screen logout( Screen screen )
  {
    logoutLink.clickAndWaitForScreen( screen );
    return screen;
  }

  @Override
  public void validateScreen()
  {
    logoutLink.waitAndGetWebElement();
  }
}
