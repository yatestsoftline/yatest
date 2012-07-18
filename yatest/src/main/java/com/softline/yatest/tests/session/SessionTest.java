package com.softline.yatest.tests.session;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.softline.yatest.common.service.UiServiceProxyFactory;
import com.softline.yatest.session.factory.SessionFactory;
import com.softline.yatest.session.service.SessionUiService;
import com.softline.yatest.session.service.SessionUiServiceInProxy;
import com.softline.yatest.tests.BaseTest;


public class SessionTest extends BaseTest
{
  private SessionFactory sessionFactory = new SessionFactory();

  /**
   * Very ugly
   * TODO Should be eliminated after Guice or some another AOP solution implemented
   */
  private SessionUiServiceInProxy sessionUiService = UiServiceProxyFactory.getUiServiceProxy( SessionUiServiceInProxy.class, new SessionUiService( sessionFactory.getDefaultSession() ) );

  @Test( enabled = true )
  public void testSuccesfullAuthorisation() throws Exception
  {
    assertTrue( sessionUiService.isSessionPrepared() );
  }
}
