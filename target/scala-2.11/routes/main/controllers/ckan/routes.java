
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/routes
// @DATE:Tue Aug 14 17:32:48 CEST 2018

package controllers.ckan;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ckan.ReverseCkanController CkanController = new controllers.ckan.ReverseCkanController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.ckan.javascript.ReverseCkanController CkanController = new controllers.ckan.javascript.ReverseCkanController(RoutesPrefix.byNamePrefix());
  }

}
