package com.softline.yatest.common.ui.element;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.behavior.CheckableElement;
import com.softline.yatest.common.ui.element.search_strategy.IdSearchStrategy;
import com.softline.yatest.common.ui.element.wait_strategy.DomWithElementWaitStrategy;

/**
 * Simple checkboxes
 */
public class CheckboxElement extends ElementBase implements CheckableElement
{
  public CheckboxElement( WebDriver webDriver, String id )
  {
    super( new IdSearchStrategy(), new DomWithElementWaitStrategy(), webDriver, id );
  }

  @Override
  public void set( boolean status )
  {
    if( ( status && !waitAndGetWebElement().isSelected() ) || ( !status && waitAndGetWebElement().isSelected() ) )
    {
      waitAndGetWebElement().click();
    }
  }

  @Override
  public void enable()
  {
    set( true );
  }

  @Override
  public void disable()
  {
    set( false );
  }

  @Override
  public boolean isChecked()
  {
    return waitAndGetWebElement().isSelected();
  }
}
