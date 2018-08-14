
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/routes
// @DATE:Tue Aug 14 17:32:48 CEST 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:25
package controllers.ckan {

  // @LINE:25
  class ReverseCkanController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def getOrganizationDataset(organizationId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/organization/datasets/" + implicitly[PathBindable[String]].unbind("organizationId", dynamicString(organizationId)))
    }
  
    // @LINE:25
    def getOrganizationList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/organizations")
    }
  
    // @LINE:39
    def getOrganization(orgId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/organization/" + implicitly[PathBindable[String]].unbind("orgId", dynamicString(orgId)))
    }
  
    // @LINE:45
    def purgeDataset(datasetId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "ckan/purgeDataset/" + implicitly[PathBindable[String]].unbind("datasetId", dynamicString(datasetId)))
    }
  
    // @LINE:34
    def createUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ckan/createUser")
    }
  
    // @LINE:33
    def createOrganization(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ckan/createOrganization")
    }
  
    // @LINE:38
    def autocompleteDataset(q:Option[String], limit:Option[Int]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/autocompleteDataset" + queryString(List(Some(implicitly[QueryStringBindable[Option[String]]].unbind("q", q)), Some(implicitly[QueryStringBindable[Option[Int]]].unbind("limit", limit)))))
    }
  
    // @LINE:44
    def deleteOrganization(orgId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "ckan/deleteOrganization/" + implicitly[PathBindable[String]].unbind("orgId", dynamicString(orgId)))
    }
  
    // @LINE:30
    def getUserOrganizations(userId:String, permission:Option[String]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/userOrganizations/" + implicitly[PathBindable[String]].unbind("userId", dynamicString(userId)) + queryString(List(Some(implicitly[QueryStringBindable[Option[String]]].unbind("permission", permission)))))
    }
  
    // @LINE:36
    def getDatasetListWithResources(limit:Option[Int], offset:Option[Int]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/datasetsWithResources" + queryString(List(Some(implicitly[QueryStringBindable[Option[Int]]].unbind("limit", limit)), Some(implicitly[QueryStringBindable[Option[Int]]].unbind("offset", offset)))))
    }
  
    // @LINE:29
    def getUser(userId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/user/" + implicitly[PathBindable[String]].unbind("userId", dynamicString(userId)))
    }
  
    // @LINE:32
    def createDataset(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ckan/createDataset")
    }
  
    // @LINE:40
    def updateDataset(datasetId:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "ckan/updateDataset/" + implicitly[PathBindable[String]].unbind("datasetId", dynamicString(datasetId)))
    }
  
    // @LINE:35
    def getDatasetList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/datasets")
    }
  
    // @LINE:37
    def searchDataset(q:Option[String], sort:Option[String], rows:Option[Int], start:Option[Int]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/searchDataset" + queryString(List(Some(implicitly[QueryStringBindable[Option[String]]].unbind("q", q)), Some(implicitly[QueryStringBindable[Option[String]]].unbind("sort", sort)), Some(implicitly[QueryStringBindable[Option[Int]]].unbind("rows", rows)), Some(implicitly[QueryStringBindable[Option[Int]]].unbind("start", start)))))
    }
  
    // @LINE:41
    def updateOrganization(orgId:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "ckan/updateOrganization/" + implicitly[PathBindable[String]].unbind("orgId", dynamicString(orgId)))
    }
  
    // @LINE:43
    def deleteDataset(datasetId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "ckan/deleteDataset/" + implicitly[PathBindable[String]].unbind("datasetId", dynamicString(datasetId)))
    }
  
    // @LINE:46
    def purgeOrganization(orgId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "ckan/purgeOrganization/" + implicitly[PathBindable[String]].unbind("orgId", dynamicString(orgId)))
    }
  
    // @LINE:27
    def getDataset(datasetId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/dataset/" + implicitly[PathBindable[String]].unbind("datasetId", dynamicString(datasetId)))
    }
  
    // @LINE:42
    def patchOrganization(orgId:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "ckan/patchOrganization/" + implicitly[PathBindable[String]].unbind("orgId", dynamicString(orgId)))
    }
  
    // @LINE:26
    def getOganizationRevisionList(organizationId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/organizations/" + implicitly[PathBindable[String]].unbind("organizationId", dynamicString(organizationId)))
    }
  
  }


}
