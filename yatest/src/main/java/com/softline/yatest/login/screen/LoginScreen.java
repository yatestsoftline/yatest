package com.softline.yatest.login.screen;

import com.softline.yatest.common.ui.screen.AuthorisedScreen;
import com.softline.yatest.common.ui.screen.Screen;

public interface LoginScreen extends Screen
{
  public abstract void login( String login, String password, boolean saveSession, AuthorisedScreen screen );

  public abstract void loginFailed( String login, String password, boolean saveSession, LoginScreen screen );
}