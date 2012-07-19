package com.softline.yatest.common.service;


public interface UiService
{
  public abstract void openBrowser();

  /**
   * Close browser without logout processing, needed for accident resolving
   * 
   */
  public abstract void closeBrowser();
}