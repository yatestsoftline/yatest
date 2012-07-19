package com.softline.yatest.session.service;

import com.softline.yatest.session.object.Session;

/**
 * TODO Should be eliminated after Guice or some another AOP solution implemented
 */
public interface SessionUiServiceInProxy
{
  /**
   * True if user from session can login correctly
   * 
   * @return
   */
  public abstract boolean isAuthPassed( Session session );
  
  public abstract boolean isAuthFailedWithError( Session session );
}