
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/routes
// @DATE:Tue Aug 14 17:32:48 CEST 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:25
package controllers.ckan.javascript {
  import ReverseRouteContext.empty

  // @LINE:25
  class ReverseCkanController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def getOrganizationDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.getOrganizationDataset",
      """
        function(organizationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/organization/datasets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("organizationId", encodeURIComponent(organizationId0))})
        }
      """
    )
  
    // @LINE:25
    def getOrganizationList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.getOrganizationList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/organizations"})
        }
      """
    )
  
    // @LINE:39
    def getOrganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.getOrganization",
      """
        function(orgId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/organization/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("orgId", encodeURIComponent(orgId0))})
        }
      """
    )
  
    // @LINE:45
    def purgeDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.purgeDataset",
      """
        function(datasetId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/purgeDataset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("datasetId", encodeURIComponent(datasetId0))})
        }
      """
    )
  
    // @LINE:34
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/createUser"})
        }
      """
    )
  
    // @LINE:33
    def createOrganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.createOrganization",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/createOrganization"})
        }
      """
    )
  
    // @LINE:38
    def autocompleteDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.autocompleteDataset",
      """
        function(q0,limit1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/autocompleteDataset" + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("q", q0), (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("limit", limit1)])})
        }
      """
    )
  
    // @LINE:44
    def deleteOrganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.deleteOrganization",
      """
        function(orgId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/deleteOrganization/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("orgId", encodeURIComponent(orgId0))})
        }
      """
    )
  
    // @LINE:30
    def getUserOrganizations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.getUserOrganizations",
      """
        function(userId0,permission1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/userOrganizations/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userId", encodeURIComponent(userId0)) + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("permission", permission1)])})
        }
      """
    )
  
    // @LINE:36
    def getDatasetListWithResources: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.getDatasetListWithResources",
      """
        function(limit0,offset1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/datasetsWithResources" + _qS([(""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("limit", limit0), (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("offset", offset1)])})
        }
      """
    )
  
    // @LINE:29
    def getUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.getUser",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userId", encodeURIComponent(userId0))})
        }
      """
    )
  
    // @LINE:32
    def createDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.createDataset",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/createDataset"})
        }
      """
    )
  
    // @LINE:40
    def updateDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.updateDataset",
      """
        function(datasetId0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/updateDataset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("datasetId", encodeURIComponent(datasetId0))})
        }
      """
    )
  
    // @LINE:35
    def getDatasetList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.getDatasetList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/datasets"})
        }
      """
    )
  
    // @LINE:37
    def searchDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.searchDataset",
      """
        function(q0,sort1,rows2,start3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/searchDataset" + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("q", q0), (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("sort", sort1), (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("rows", rows2), (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("start", start3)])})
        }
      """
    )
  
    // @LINE:41
    def updateOrganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.updateOrganization",
      """
        function(orgId0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/updateOrganization/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("orgId", encodeURIComponent(orgId0))})
        }
      """
    )
  
    // @LINE:43
    def deleteDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.deleteDataset",
      """
        function(datasetId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/deleteDataset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("datasetId", encodeURIComponent(datasetId0))})
        }
      """
    )
  
    // @LINE:46
    def purgeOrganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.purgeOrganization",
      """
        function(orgId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/purgeOrganization/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("orgId", encodeURIComponent(orgId0))})
        }
      """
    )
  
    // @LINE:27
    def getDataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.getDataset",
      """
        function(datasetId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/dataset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("datasetId", encodeURIComponent(datasetId0))})
        }
      """
    )
  
    // @LINE:42
    def patchOrganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.patchOrganization",
      """
        function(orgId0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/patchOrganization/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("orgId", encodeURIComponent(orgId0))})
        }
      """
    )
  
    // @LINE:26
    def getOganizationRevisionList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ckan.CkanController.getOganizationRevisionList",
      """
        function(organizationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/organizations/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("organizationId", encodeURIComponent(organizationId0))})
        }
      """
    )
  
  }


}
