package com.softline.yatest.common.ui.element.css_wrapper;

/**
 * Any wrapper of some CSS selector fragment to full css selector
 */
public interface CssWrapper
{
  public abstract String wrapToCssSelector( String cssSelectorPart );
}
