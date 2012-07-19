package com.softline.yatest.common.ui.element.css_wrapper;

/**
 * List of all CSS selectors, available for tests
 */
public enum CssWrapperSelector
{
  LINK_FROM_TD_WITH_CLASS( new LinkFromTdWithClassCssWrapper() ),
  FIELD_FROM_TD_WITH_CLASS( new FieldFromTdWithClassCssWrapper() );

  private final CssWrapper linkCssWrapper;

  private CssWrapperSelector( CssWrapper linkCssWrapper )
  {
    this.linkCssWrapper = linkCssWrapper;
  }

  public CssWrapper getLinkCssWrapper()
  {
    return linkCssWrapper;
  }
}
