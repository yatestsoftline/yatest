package com.softline.yatest.tests;

import static com.softline.yatest.common.log.SystemOutputLogger.log;
import static com.softline.yatest.common.log.SystemOutputLogger.outputLoggerConfigure;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.softline.yatest.common.config.BrowserParameters;


/**
 * Common configuration steps, all parameters get from testng XML
 */
public class BaseTest
{
  @Parameters( {"webDriverURL", "firefoxVersion", "firefoxPlatform"} )
  @BeforeSuite
  public void prepareConfig( String webDriverURL, String firefoxVersion, String firefoxPlatform )
    throws Exception
  {
    outputLoggerConfigure();
    BrowserParameters.getInstance().setWebDriverUrl( webDriverURL );
    BrowserParameters.getInstance().setFirefoxVersion( firefoxVersion );
    BrowserParameters.getInstance().setPlatform( firefoxPlatform );
    log().info( "Set WebDriver URL to: " + webDriverURL );
  }
}
