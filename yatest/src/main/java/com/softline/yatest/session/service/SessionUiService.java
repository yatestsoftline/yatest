package com.softline.yatest.session.service;

import static com.softline.yatest.common.log.SystemOutputLogger.log;

import com.softline.yatest.common.service.UiServiceBase;
import com.softline.yatest.session.object.Session;
import com.softline.yatest.session.screen.DashboardViewScreen;

public class SessionUiService extends UiServiceBase implements SessionUiServiceInProxy
{
  public SessionUiService( Session session )
  {
    super( session );
  }

  @Override
  public boolean isSessionPrepared()
  {
    try
    {
      DashboardViewScreen dashboardViewScreen = openSession();
      closeSession( dashboardViewScreen );
      return true;
    }
    catch( Exception e )
    {
      log().info( e.getMessage() );
      closeSessionBrowser();
      return false;
    }
  }
}
