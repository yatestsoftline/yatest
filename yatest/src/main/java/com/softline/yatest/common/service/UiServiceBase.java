package com.softline.yatest.common.service;


import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.screen.EditScreen;
import com.softline.yatest.common.ui.screen.ViewScreen;
import com.softline.yatest.common.ui.service.BrowserService;
import com.softline.yatest.session.object.Session;
import com.softline.yatest.session.screen.DashboardViewScreen;
import com.softline.yatest.session.screen.LoginScreen;


/**
 * Shared functionality for all UI service, include open and close session with authorisation support
 */
public class UiServiceBase implements UiService
{
  private Session session;

  private BrowserService browserService = new BrowserService();

  public UiServiceBase( Session session )
  {
    setSession( session );
  }

  private Session getSession()
  {
    return session;
  }

  private void setSession( Session session )
  {
    this.session = session;
  }

  private BrowserService getBrowserService()
  {
    return browserService;
  }

  @Override
  public DashboardViewScreen openSession()
  {
    WebDriver webDriver = getBrowserService().openBrowser();

    LoginScreen loginScreen = new LoginScreen( webDriver );
    DashboardViewScreen dashboardViewScreen =
      loginScreen.login( getSession().getLogin(), getSession().getPassword(), getSession().isSaveSession() );
    return dashboardViewScreen;
  }

  public void closeSession( ViewScreen viewScreen )
  {
    viewScreen.logout();
    closeSessionBrowser();
  }

  public void closeSession( EditScreen editScreen )
  {
    ViewScreen viewScreen = editScreen.close();
    viewScreen.logout();
    closeSessionBrowser();
  }

  @Override
  public void closeSessionBrowser()
  {
    getBrowserService().closeBrowser();
  }
}
