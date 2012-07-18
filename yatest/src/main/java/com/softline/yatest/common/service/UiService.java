package com.softline.yatest.common.service;

import com.softline.yatest.session.screen.DashboardViewScreen;

public interface UiService
{
  public abstract DashboardViewScreen openSession();

  /**
   * Close browser without logout processing, needed for accident resolving
   * 
   */
  public abstract void closeSessionBrowser();
}