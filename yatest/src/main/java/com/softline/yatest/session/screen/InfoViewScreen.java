package com.softline.yatest.session.screen;


import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.LinkElement;
import com.softline.yatest.common.ui.screen.ViewScreenBase;



/**
 * Screen for persona info dashboard
 * TODO shold be added check of some personal info parameters, like ages or name
 */
public class InfoViewScreen extends ViewScreenBase
{
  public InfoViewScreen( WebDriver webDriver )
  {
    super( webDriver );
  }

  LinkElement editLink = new LinkElement( getDriver(), "UserProfile_editOwn" );


}
