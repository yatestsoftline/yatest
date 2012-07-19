package com.softline.yatest.common.ui.screen;

/**
 * Any screen
 */
public interface Screen
{
  /**
   * Validate, that screen load correctly
   */
  public abstract void validateScreen();

  /**
   * Open screen directly, througth permanent URL
   */
  public abstract void open();
}