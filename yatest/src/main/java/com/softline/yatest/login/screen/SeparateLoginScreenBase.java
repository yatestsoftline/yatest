package com.softline.yatest.login.screen;

import org.openqa.selenium.WebDriver;

import com.softline.yatest.common.ui.element.ButtonElement;
import com.softline.yatest.common.ui.element.CheckboxElement;
import com.softline.yatest.common.ui.element.ErrorNoteElement;
import com.softline.yatest.common.ui.element.InputElement;
import com.softline.yatest.common.ui.screen.AuthorisedScreen;
import com.softline.yatest.common.ui.screen.ScreenBase;

/**
 * Login page, used not main page for checking drawing button somethere in code
 */
public class SeparateLoginScreenBase extends ScreenBase implements LoginScreen
{
  private InputElement loginInput = new InputElement( getDriver(), "b-domik-username" );

  private InputElement passwordInput = new InputElement( getDriver(), "b-domik-password" );

  private CheckboxElement saveSessionCheckbox = new CheckboxElement( getDriver(), "b-domik-permanent" );

  private ButtonElement loginButton = new ButtonElement( getDriver(), "b-domik__submit" );

  private ErrorNoteElement errorNoteLogin = new ErrorNoteElement( getDriver(), "b-login-error" );

  protected SeparateLoginScreenBase( WebDriver webDriver, String directUrl )
  {
    super( webDriver, directUrl );
  }

  @Override
  public void login( String login, String password, boolean saveSession, AuthorisedScreen screen )
  {
    loginInput.typeWrite( login );
    passwordInput.typeWrite( password );
    saveSessionCheckbox.set( saveSession );
    loginButton.clickAndWaitForScreen( screen );
  }

  @Override
  public void loginFailed( String login, String password, boolean saveSession, LoginScreen screen )
  {
    loginInput.typeWrite( login );
    passwordInput.typeWrite( password );
    saveSessionCheckbox.set( saveSession );
    loginButton.clickAndWaitForScreen( screen );
  }

  @Override
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
