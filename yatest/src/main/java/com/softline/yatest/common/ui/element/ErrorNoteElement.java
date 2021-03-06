package com.softline.yatest.common.ui.element;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.behavior.ContentElement;
import com.softline.yatest.common.ui.element.search_strategy.ClassNameSearchStrategy;
import com.softline.yatest.common.ui.element.wait_strategy.DomWithElementWaitStrategy;

/**
 * Error notes
 */
public class ErrorNoteElement extends ElementBase implements ContentElement
{
  public ErrorNoteElement( WebDriver webDriver, String className, int number )
  {
    super( new ClassNameSearchStrategy(), new DomWithElementWaitStrategy(), webDriver, className, number );
  }

  public ErrorNoteElement( WebDriver webDriver, String className )
  {
    this( webDriver, className, 1 );
  }

  @Override
  public String getContent()
  {
    return waitAndGetWebElement().getText();
  }

  public boolean isErrorShown()
  {
    if( getContent().equals( "" ) )
    {
      return false;
    }
    return true;
  }
}
