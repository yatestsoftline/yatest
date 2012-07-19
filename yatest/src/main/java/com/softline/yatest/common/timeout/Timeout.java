package com.softline.yatest.common.timeout;

/**
 * Selenium timeouts enumeration
 */
public enum Timeout
{
  DEFAULT_ELEMENT_WAIT_TIMEOUT( 5 ), DEFAULT_SELENIUM_IMPLICIT_TIMEOUT( 5 );

  private final int timeoutValue;

  private Timeout( int timeoutValue )
  {
    this.timeoutValue = timeoutValue;
  }

  public int getTimeoutValue()
  {
    return timeoutValue;
  }
}
