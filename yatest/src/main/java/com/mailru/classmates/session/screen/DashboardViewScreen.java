package com.mailru.classmates.session.screen;

import org.openqa.selenium.WebDriver;

import com.mailru.classmates.common.ui.element.LinkElement;
import com.mailru.classmates.common.ui.screen.ViewScreenBase;


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
