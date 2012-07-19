package com.softline.yatest.common.ui.element;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.behavior.ClickableElement;
import com.softline.yatest.common.ui.element.search_strategy.ClassNameSearchStrategy;
import com.softline.yatest.common.ui.element.wait_strategy.DomWithElementWaitStrategy;
import com.softline.yatest.common.ui.screen.Screen;

/**
 * Simple buttons
 */
public class ButtonElement extends ElementBase implements ClickableElement
{
  public ButtonElement( WebDriver webDriver, String id )
  {
    super( new ClassNameSearchStrategy(), new DomWithElementWaitStrategy(), webDriver, id );
  }

  @Override
  public void clickAndWaitForScreen( Screen screen )
  {
    waitAndGetWebElement().click();
    screen.validateScreen();
  }
}
