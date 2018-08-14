
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/routes
// @DATE:Tue Aug 14 17:32:48 CEST 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseSwagger(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def swaggerSpec(): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("name", "catalog_manager.yaml")))
      Call("GET", _prefix + { _defaultPrefix } + "spec/catalog_manager.yaml")
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib/swagger-ui")))
      Call("GET", _prefix + { _defaultPrefix } + "docs/swagger-ui/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:9
    def versioned(path:String, file:Asset): Call = {
    
      (path: @unchecked, file: @unchecked) match {
      
        // @LINE:9
        case (path, file) if path == "/public/swagger-ui" && file == "index.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger-ui"), ("file", "index.html")))
          Call("GET", _prefix + { _defaultPrefix } + "catalog-manager")
      
        // @LINE:13
        case (path, file) if path == "/public/swagger-ui" && file == "o2c.html" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger-ui"), ("file", "o2c.html")))
          Call("GET", _prefix + { _defaultPrefix } + "o2c.html")
      
        // @LINE:15
        case (path, file) if path == "/public/swagger-ui/images" && file == "favicon.ico" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger-ui/images"), ("file", "favicon.ico")))
          Call("GET", _prefix + { _defaultPrefix } + "favicon.ico")
      
        // @LINE:17
        case (path, file) if path == "/public/swagger-ui" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/swagger-ui")))
          Call("GET", _prefix + { _defaultPrefix } + "api/" + implicitly[PathBindable[Asset]].unbind("file", file))
      
      }
    
    }
  
  }

  // @LINE:21
  class ReverseMetricsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "metrics")
    }
  
  }


}
