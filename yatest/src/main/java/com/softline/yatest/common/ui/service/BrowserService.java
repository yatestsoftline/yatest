package com.softline.yatest.common.ui.service;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.softline.yatest.common.config.BrowserParameters;
import com.softline.yatest.common.timeout.Timeout;

/**
 * Service, which provide WebDriver object to any UI service, should be rewrite to us pool of selenium URL for
 * multithread support
 */
public class BrowserService
{
  private WebDriver webDriver;

  private WebDriver getDriver()
  {
    return webDriver;
  }

  private void setDriver( WebDriver webDriver )
  {
    this.webDriver = webDriver;
  }

  private WebDriver configureWebDriver()
  {
    WebDriver webDriver =
      new RemoteWebDriver( BrowserParameters.getInstance().getWebDriverUrl(), BrowserParameters.getInstance()
        .getDesiredCapabilities() );
    webDriver.manage().timeouts()
      .implicitlyWait( Timeout.DEFAULT_SELENIUM_IMPLICIT_TIMEOUT.getTimeoutValue(), TimeUnit.SECONDS );
    return webDriver;
  }

  public WebDriver openBrowser()
  {
    setDriver( configureWebDriver() );
    return getDriver();
  }

  public void closeBrowser()
  {
    getDriver().quit();
  }
}
