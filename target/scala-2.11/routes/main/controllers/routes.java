
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/routes
// @DATE:Tue Aug 14 17:32:48 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseSwagger Swagger = new controllers.ReverseSwagger(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMetricsController MetricsController = new controllers.ReverseMetricsController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseSwagger Swagger = new controllers.javascript.ReverseSwagger(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMetricsController MetricsController = new controllers.javascript.ReverseMetricsController(RoutesPrefix.byNamePrefix());
  }

}
