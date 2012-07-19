package com.softline.yatest.common.ui.element.css_wrapper;

/**
 * Wrapper of CSS selector for some links
 */
public class LinkFromTdWithClassCssWrapper implements CssWrapper
{
  private static final String LINK_FROM_TD_WITH_CLASS = "td.%s > a";

  @Override
  public String wrapToCssSelector( String className )
  {
    return String.format( LINK_FROM_TD_WITH_CLASS, className );
  }
}
