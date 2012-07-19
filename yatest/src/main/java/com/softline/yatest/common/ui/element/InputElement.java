package com.softline.yatest.common.ui.element;


import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.behavior.TypeWriteElement;
import com.softline.yatest.common.ui.element.search_strategy.IdSearchStrategy;
import com.softline.yatest.common.ui.element.wait_strategy.DomWithElementWaitStrategy;



/**
 * Simple inputs
 */
public class InputElement extends ElementBase implements TypeWriteElement
{

  public InputElement( WebDriver webDriver, String id )
  {
    super( new IdSearchStrategy(), new DomWithElementWaitStrategy(), webDriver, id );
  }

  @Override
  public String getContent()
  {
    return waitAndGetWebElement().getAttribute( "value" );
  }

  @Override
  public void typeWrite( String value )
  {
    waitAndGetWebElement().clear();
    waitAndGetWebElement().sendKeys( value );
  }
}
