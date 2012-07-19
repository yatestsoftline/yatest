package com.softline.yatest.login.object;

/**
 * Class for authentification data representation
 */
public class LoginInfo
{
  private String login;

  private String password;

  private boolean saveSession;

  public LoginInfo( String login, String password, boolean saveSession )
  {
    setLogin( login );
    setPassword( password );
    setSaveSession( saveSession );
  }

  public String getLogin()
  {
    return login;
  }

  private void setLogin( String login )
  {
    this.login = login;
  }

  public String getPassword()
  {
    return password;
  }

  private void setPassword( String password )
  {
    this.password = password;
  }

  public boolean isSaveSession()
  {
    return saveSession;
  }

  private void setSaveSession( boolean saveSession )
  {
    this.saveSession = saveSession;
  }

  @Override
  public String toString()
  {
    return getLogin() + "/" + getPassword() + ", save session: " + isSaveSession();
  }
}
