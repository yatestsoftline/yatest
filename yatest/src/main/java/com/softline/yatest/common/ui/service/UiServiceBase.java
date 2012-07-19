package com.softline.yatest.common.ui.service;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.softline.yatest.common.config.BrowserParameters;
import com.softline.yatest.common.timeout.Timeout;

public class UiServiceBase implements UiService
{
  private WebDriver webDriver;

  protected WebDriver getWebDriver()
  {
    return webDriver;
  }

  private void setWebDriver( WebDriver webDriver )
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

  @Override
  public void openBrowser()
  {
    setWebDriver( configureWebDriver() );
  }

  @Override
  public void closeBrowser()
  {
    getWebDriver().quit();
  }
}