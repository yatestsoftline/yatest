package com.softline.yatest.common.ui.element;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.behavior.ContentElement;
import com.softline.yatest.common.ui.element.css_wrapper.CssWrapperSelector;
import com.softline.yatest.common.ui.element.search_strategy.CssSearchStrategy;
import com.softline.yatest.common.ui.element.wait_strategy.DomWithElementWaitStrategy;

/**
 * Different types of links
 */
public class FieldElement extends ElementBase implements ContentElement
{
  public FieldElement( WebDriver webDriver, String className )
  {
    super( new CssSearchStrategy(), new DomWithElementWaitStrategy(), webDriver, CssWrapperSelector.FIELD_FROM_TD_WITH_CLASS.getLinkCssWrapper().wrapToCssSelector( className ) );
  }

  @Override
  public String getContent()
  {
    return waitAndGetWebElement().getText();
  }
}
