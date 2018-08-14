
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/routes
// @DATE:Tue Aug 14 17:32:48 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
