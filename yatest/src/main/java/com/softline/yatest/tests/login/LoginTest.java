package com.softline.yatest.tests.login;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.softline.yatest.common.ui.service.UiServiceProxyFactory;
import com.softline.yatest.login.factory.LoginInfoFactory;
import com.softline.yatest.login.service.LoginPassportUiService;
import com.softline.yatest.login.service.LoginPassportUiServiceInProxy;
import com.softline.yatest.tests.BaseTest;

public class LoginTest extends BaseTest
{
  private LoginInfoFactory loginInfoFactory = new LoginInfoFactory();

  /**
   * TODO Should be eliminated after Guice or some another AOP solution implemented
   */
  private LoginPassportUiServiceInProxy sessionUiService = UiServiceProxyFactory.getUiServiceProxy(
    LoginPassportUiServiceInProxy.class, new LoginPassportUiService() );

  @Test( enabled = true, description = "Test check, that predefined user can succesfully login to Yandex Passport" )
  public void testSuccesfullAuthorisation() throws Exception
  {
    assertTrue( sessionUiService.isAuthPassed( loginInfoFactory.getValidSession() ) );
  }

  @Test( enabled = true, description = "Test check, that user can't succesfully login to Yandex Passport with incorrect password for predefined user" )
  public void testNotPassedAuthorisation() throws Exception
  {
    assertTrue( sessionUiService.isAuthFailedWithError( loginInfoFactory.getNotValidSession() ) );
  }
}
