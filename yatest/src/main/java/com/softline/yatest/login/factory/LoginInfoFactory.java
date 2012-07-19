package com.softline.yatest.login.factory;

import com.softline.yatest.login.object.LoginInfo;

/**
 * Factory for different authorisation data sets
 * TODO rewrite to get data from file or some persistence objects for correct support of data driven testing 
 */
public class LoginInfoFactory
{
  public LoginInfo getValidSession()
  {
    return new LoginInfo( "yatestsoftline", "123qweqwe", true );
  }

  public LoginInfo getNotValidSession()
  {
    return new LoginInfo( "yatestsoftline", "123qwe", true );
  }
}
