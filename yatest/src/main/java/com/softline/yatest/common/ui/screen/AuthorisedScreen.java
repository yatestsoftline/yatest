package com.softline.yatest.common.ui.screen;

/**
 * Any view screen, with clickable logout link
 */
public interface AuthorisedScreen extends Screen
{
  /**
   * Click logout link
   * 
   * @param screen
   * @return
   */
  public abstract Screen logout( Screen screen );
}