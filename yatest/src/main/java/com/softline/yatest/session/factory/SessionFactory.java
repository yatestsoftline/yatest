package com.softline.yatest.session.factory;

import com.softline.yatest.session.object.Session;

/**
 * Factory for different authorisation types
 * TODO rewrite to get data from file or some persistence objects for correct support of data driven testing 
 */
public class SessionFactory
{
  public Session getDefaultSession()
  {
    return new Session( "classmatestest", "4vtufntcnth", true );
  }
}
