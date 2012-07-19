package com.softline.yatest.common.ui.element;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.behavior.ClickableElement;
import com.softline.yatest.common.ui.element.css_wrapper.CssWrapperSelector;
import com.softline.yatest.common.ui.element.search_strategy.CssSearchStrategy;
import com.softline.yatest.common.ui.element.wait_strategy.DomWithElementWaitStrategy;
import com.softline.yatest.common.ui.screen.Screen;

/**
 * Different types of links
 */
public class LinkElement extends ElementBase implements ClickableElement
{
  public LinkElement( WebDriver webDriver, String className )
  {
    super( new CssSearchStrategy(), new DomWithElementWaitStrategy(), webDriver, CssWrapperSelector.LINK_FROM_TD_WITH_CLASS.getLinkCssWrapper().wrapToCssSelector( className ) );
  }

  @Override
  public void clickAndWaitForScreen( Screen screen )
  {
    waitAndGetWebElement().click();
    screen.validateScreen();
  }
}
