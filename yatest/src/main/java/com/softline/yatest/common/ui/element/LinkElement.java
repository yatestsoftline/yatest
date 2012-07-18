package com.softline.yatest.common.ui.element;


import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.behavior.ClickableElement;
import com.softline.yatest.common.ui.element.css_wrapper.CssWrapperSelector;
import com.softline.yatest.common.ui.element.search_strategy.CssSearchStrategy;
import com.softline.yatest.common.ui.element.wait_strategy.DomWithElementWaitStrategy;
import com.softline.yatest.common.ui.element.wait_strategy.EnabledElementWaitStrategy;
import com.softline.yatest.common.ui.screen.Screen;


/**
 * Different types of links
 */
public class LinkElement extends ElementBase implements ClickableElement
{
  public LinkElement( WebDriver webDriver, String hrefattrsSuffix )
  {
    super( new CssSearchStrategy(), new DomWithElementWaitStrategy(), webDriver,
      CssWrapperSelector.LINK_WITH_HREFATTRS_SUFFIX.getLinkCssWrapper().wrapToCssSelector( hrefattrsSuffix ) );
  }

  public LinkElement( WebDriver webDriver, CssWrapperSelector cssWrapperSelector, String cssSelectorPart )
  {
    super( new CssSearchStrategy(), new EnabledElementWaitStrategy(), webDriver, cssWrapperSelector.getLinkCssWrapper()
      .wrapToCssSelector( cssSelectorPart ) );
  }

  @Override
  public void clickAndWaitForScreen( Screen screen )
  {
    waitAndGetWebElement().click();
    screen.validateScreen();
  }
}
