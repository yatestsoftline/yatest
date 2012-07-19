package com.softline.yatest.common.ui.element.css_wrapper;

/**
 * Wrapper of CSS selector for some text fields
 */
public class FieldFromTdWithClassCssWrapper implements CssWrapper
{
  private static final String FIELD_FROM_TD_WITH_CLASS = "td > span > b.%s";

  @Override
  public String wrapToCssSelector( String className )
  {
    return String.format( FIELD_FROM_TD_WITH_CLASS, className );
  }
}
