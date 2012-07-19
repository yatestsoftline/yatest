package com.softline.yatest.login.screen;

import com.softline.yatest.common.ui.screen.AuthorisedScreen;
import com.softline.yatest.common.ui.screen.Screen;

public interface LoginScreen extends Screen
{
  /**
   * Fill login info, push login button and go to screen with authorisation
   * 
   * @param login
   * @param password
   * @param saveSession
   * @param screen
   */
  public abstract void login( String login, String password, boolean saveSession, AuthorisedScreen screen );

  /**
   * Fill login info, push login button and go to screen with some error
   * 
   * @param login
   * @param password
   * @param saveSession
   * @param screen
   */
  public abstract void loginFailed( String login, String password, boolean saveSession, LoginScreen screen );
}