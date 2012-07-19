package com.softline.yatest.common.service;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.service.BrowserService;

/**
 * Shared functionality for all UI service, include open and close session with authorisation support
 */
public class UiServiceBase implements UiService
{
    private WebDriver webDriver;

  private BrowserService browserService = new BrowserService();

  private BrowserService getBrowserService()
  {
    return browserService;
  }

  protected WebDriver getWebDriver()
  {
    return webDriver;
  }

  private void setWebDriver( WebDriver webDriver )
  {
    this.webDriver = webDriver;
  }

  @Override
  public void openBrowser()
  {
    setWebDriver( getBrowserService().openBrowser() );
  }

  @Override
  public void closeBrowser()
  {
    getBrowserService().closeBrowser();
  }
}