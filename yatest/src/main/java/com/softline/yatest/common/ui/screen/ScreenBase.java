package com.softline.yatest.common.ui.screen;

import org.openqa.selenium.WebDriver;

/**
 * Shared screens functionality
 */
public abstract class ScreenBase implements Screen
{
  private WebDriver webDriver;
  private String directUrl;

  protected ScreenBase( WebDriver webDriver, String directUrl )
  {
    setDriver( webDriver );
    setDirectUrl( directUrl ); 
  }

  protected WebDriver getDriver()
  {
    return webDriver;
  }

  private void setDriver( WebDriver webDriver )
  {
    this.webDriver = webDriver;
  }

  private String getDirectUrl()
  {
    return directUrl;
  }

  private void setDirectUrl( String directUrl )
  {
    this.directUrl = directUrl;
  }
  
  public void open()
  {
    getDriver().get( getDirectUrl() );
  }

  @Override
  public abstract void validateScreen();
}
