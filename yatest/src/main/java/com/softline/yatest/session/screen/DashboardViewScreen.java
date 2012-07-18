package com.softline.yatest.session.screen;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.LinkElement;
import com.softline.yatest.common.ui.screen.ViewScreenBase;


/**
 * Screen for user dashboard view
 */
public class DashboardViewScreen extends ViewScreenBase
{

  private LinkElement personalLink = new LinkElement( getDriver(), "FatFooter_userProfile" );

  public DashboardViewScreen( WebDriver webDriver )
  {
    super( webDriver );
  }

  /**
   * TODO should be used dropdown in right of screen in future
   * 
   * @return
   */
  public InfoViewScreen openPersonalInfo()
  {
    personalLink.clickAndWaitForScreen( new InfoViewScreen( getDriver() ) );
    return new InfoViewScreen( getDriver() );
  }
}
