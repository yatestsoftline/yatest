package com.softline.yatest.common.ui.service;

/**
 * Shared functionality for all UI service, include open and close browser
 */
public interface UiService
{
  /**
   * Open browser, now used only in proxy for UI services methods
   */
  public abstract void openBrowser();

  /**
   * Close browser, now used only in proxy for UI services methods
   * 
   */
  public abstract void closeBrowser();
}