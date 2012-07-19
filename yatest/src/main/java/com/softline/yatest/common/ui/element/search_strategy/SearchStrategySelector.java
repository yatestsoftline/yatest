package com.softline.yatest.common.ui.element.search_strategy;

/**
 * List of all search strategy, which can be used in same elements
 */
public enum SearchStrategySelector
{
  BUTTON_BY_ID( new IdSearchStrategy() ), BUTTON_BY_NAME( new NameSearchStrategy() ), BUTTON_BY_CLASS_NAME( new ClassNameSearchStrategy() );

  private final SearchStrategy searchStrategyForButton;

  private SearchStrategySelector( SearchStrategy searchStrategyForButton )
  {
    this.searchStrategyForButton = searchStrategyForButton;
  }

  public SearchStrategy getSearchStrategyForButtonValue()
  {
    return searchStrategyForButton;
  }
}
