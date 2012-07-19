package com.softline.yatest.common.ui.screen;


import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.ButtonElement;
import com.softline.yatest.common.ui.element.CheckboxElement;
import com.softline.yatest.common.ui.element.ErrorNoteElement;
import com.softline.yatest.common.ui.element.InputElement;
import com.softline.yatest.common.ui.element.search_strategy.SearchStrategySelector;


/**
 * Login page, used not main page for checking drawing button somethere in code
 */
public class LoginScreenBase extends ScreenBase
{
  private InputElement loginInput = new InputElement( getDriver(), "b-domik-username" );

  private InputElement passwordInput = new InputElement( getDriver(), "b-domik-password" );

  private CheckboxElement saveSessionCheckbox = new CheckboxElement( getDriver(), "b-domik-permanent" );

  private ButtonElement loginButton = new ButtonElement( getDriver(), SearchStrategySelector.BUTTON_BY_CLASS_NAME,
    "b-domik__submit" );
  
  private ErrorNoteElement errorNoteLogin = new ErrorNoteElement( getDriver(), "l-centered b-login-error i-popup i-popup_visibility_visible");

  protected LoginScreenBase( WebDriver webDriver, String directUrl )
  {
    super( webDriver, directUrl );
  }

  protected void login( String login, String password, boolean saveSession, Screen screen )
  {
    loginInput.typeWrite( login );
    passwordInput.typeWrite( password );
    saveSessionCheckbox.set( saveSession );
    loginButton.clickAndWaitForScreen( screen );
  }

  public void validateScreen()
  {
    loginInput.waitAndGetWebElement();
    passwordInput.waitAndGetWebElement();
    saveSessionCheckbox.waitAndGetWebElement();
    loginButton.waitAndGetWebElement();
  }
  
  public boolean isLoginErrorShown()
  {
    return errorNoteLogin.isErrorShown();
  }
}
