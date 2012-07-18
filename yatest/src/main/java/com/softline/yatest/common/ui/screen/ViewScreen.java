package com.softline.yatest.common.ui.screen;

import com.softline.yatest.session.screen.LoginScreen;

/**
 * Any view screen, with clickable logout link
 */
public interface ViewScreen extends Screen
{
  public abstract LoginScreen logout();
}