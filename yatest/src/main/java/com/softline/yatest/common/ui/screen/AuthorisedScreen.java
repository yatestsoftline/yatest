package com.softline.yatest.common.ui.screen;


/**
 * Any view screen, with clickable logout link
 */
public interface AuthorisedScreen extends Screen
{
  public abstract Screen logout( Screen screen );
}