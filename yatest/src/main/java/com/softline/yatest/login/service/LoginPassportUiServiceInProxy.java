package com.softline.yatest.login.service;

import com.softline.yatest.login.object.LoginInfo;

/**
 * TODO Should be eliminated after Guice or some another AOP solution implemented
 */
public interface LoginPassportUiServiceInProxy
{
  /**
   * True if user from session can login correctly
   * 
   * @param loginInfo
   * @return
   */
  public abstract boolean isAuthPassed( LoginInfo loginInfo );

  /**
   * True if user from session can not login correctly and error message shown
   * 
   * @param loginInfo
   * @return
   */
  public abstract boolean isAuthFailedWithError( LoginInfo loginInfo );
}