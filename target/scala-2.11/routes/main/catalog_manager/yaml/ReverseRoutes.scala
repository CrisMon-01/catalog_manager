
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/catalog_manager.yaml
// @DATE:Tue Aug 14 17:33:03 CEST 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.catalog_manager.yaml._
import _root_.controllers.Assets.Asset

// @LINE:0
package catalog_manager.yaml {

  // @LINE:0
  class ReverseCatalog_managerYaml(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:0
    def createckanuser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ckan/create/user")
    }
  
    // @LINE:0
    def datasetcatalogbyname(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "catalog-ds/getbyname/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:0
    def voc_dcat2***REMOVED***subtheme(themeid:String, subthemeid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/subthemes/dcat2***REMOVED***/" + implicitly[PathBindable[String]].unbind("themeid", dynamicString(themeid)) + "/" + implicitly[PathBindable[String]].unbind("subthemeid", dynamicString(subthemeid)))
    }
  
    // @LINE:0
    def getckanorganizationbyid(org_id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/organization/" + implicitly[PathBindable[String]].unbind("org_id", dynamicString(org_id)))
    }
  
    // @LINE:0
    def voc_themesgetall(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/themes/getall")
    }
  
    // @LINE:0
    def isPresentOnCatalog(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "catalog-ds/is_present/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:0
    def startKyloFedd(file_type:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "kylo/feed/" + implicitly[PathBindable[String]].unbind("file_type", dynamicString(file_type)))
    }
  
    // @LINE:0
    def datasetcatalogbyid(catalog_id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "catalog-ds/get/" + implicitly[PathBindable[String]].unbind("catalog_id", dynamicString(catalog_id)))
    }
  
    // @LINE:0
    def addQueueCatalog(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "catalog-ds/add-queue")
    }
  
    // @LINE:0
    def createdatasetcatalogExtOpenData(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "catalog-ds/ext/add")
    }
  
    // @LINE:0
    def autocompletedataset(q:MetadataCat, limit:ResourceSize): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/autocompleteDataset" + queryString(List(Some(implicitly[QueryStringBindable[MetadataCat]].unbind("q", q)), Some(implicitly[QueryStringBindable[ResourceSize]].unbind("limit", limit)))))
    }
  
    // @LINE:0
    def getckanuserorganizationList(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/userOrganizations/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
    // @LINE:0
    def getckanuser(username:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/user/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
    }
  
    // @LINE:0
    def datasetcatalogs(page:MetadataRequired, limit:Dataset_catalogsGetLimit): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dataset-catalogs" + queryString(List(Some(implicitly[QueryStringBindable[MetadataRequired]].unbind("page", page)), Some(implicitly[QueryStringBindable[Dataset_catalogsGetLimit]].unbind("limit", limit)))))
    }
  
    // @LINE:0
    def getckandatasetListWithRes(limit:ResourceSize, offset:ResourceSize): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/datasetsWithResources" + queryString(List(Some(implicitly[QueryStringBindable[ResourceSize]].unbind("limit", limit)), Some(implicitly[QueryStringBindable[ResourceSize]].unbind("offset", offset)))))
    }
  
    // @LINE:0
    def getckandatasetList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/datasets")
    }
  
    // @LINE:0
    def voc_dcat2Daftheme(themeid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/themes/dcat2***REMOVED***/" + implicitly[PathBindable[String]].unbind("themeid", dynamicString(themeid)))
    }
  
    // @LINE:0
    def createckandataset(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ckan/create/dataset")
    }
  
    // @LINE:0
    def verifycredentials(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ckan/verifyCredentials")
    }
  
    // @LINE:0
    def autocompletedummy(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ckan/autocompleteDummy")
    }
  
    // @LINE:0
    def voc_***REMOVED***2dcatsubtheme(themeid:String, subthemeid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/dcatsubthemes/***REMOVED***2dcat/" + implicitly[PathBindable[String]].unbind("themeid", dynamicString(themeid)) + "/" + implicitly[PathBindable[String]].unbind("subthemeid", dynamicString(subthemeid)))
    }
  
    // @LINE:0
    def updateckanorganization(org_id:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "ckan/update/organization/" + implicitly[PathBindable[String]].unbind("org_id", dynamicString(org_id)))
    }
  
    // @LINE:0
    def test(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:0
    def voc_subthemesgetall(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/subthemes/getall")
    }
  
    // @LINE:0
    def getckandatasetbyid(dataset_id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/datasets/" + implicitly[PathBindable[String]].unbind("dataset_id", dynamicString(dataset_id)))
    }
  
    // @LINE:0
    def getckanorganizationList(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/organizations")
    }
  
    // @LINE:0
    def voc_dcatsubthemesgetall(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/dcatsubthemes/getall")
    }
  
    // @LINE:0
    def voc_subthemesgetbyid(themeid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/subthemes/getbyid/" + implicitly[PathBindable[String]].unbind("themeid", dynamicString(themeid)))
    }
  
    // @LINE:0
    def voc_dcatthemegetall(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/dcatthemes/getall")
    }
  
    // @LINE:0
    def searchdataset(q:MetadataCat, sort:MetadataCat, rows:ResourceSize, start:ResourceSize): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ckan/searchDataset" + queryString(List(Some(implicitly[QueryStringBindable[MetadataCat]].unbind("q", q)), Some(implicitly[QueryStringBindable[MetadataCat]].unbind("sort", sort)), Some(implicitly[QueryStringBindable[ResourceSize]].unbind("rows", rows)), Some(implicitly[QueryStringBindable[ResourceSize]].unbind("start", start)))))
    }
  
    // @LINE:0
    def publicdatasetcatalogbyname(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "public/catalog-ds/getbyname/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:0
    def voc_dcatsubthemesgetbyid(themeid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/dcatsubthemes/getbyid/" + implicitly[PathBindable[String]].unbind("themeid", dynamicString(themeid)))
    }
  
    // @LINE:0
    def voc_***REMOVED***2dcattheme(themeid:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "voc/dcatthemes/***REMOVED***2dcat/" + implicitly[PathBindable[String]].unbind("themeid", dynamicString(themeid)))
    }
  
    // @LINE:0
    def createckanorganization(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ckan/create/organization")
    }
  
    // @LINE:0
    def createdatasetcatalog(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "catalog-ds/add")
    }
  
    // @LINE:0
    def patchckanorganization(org_id:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "ckan/patch/organization/" + implicitly[PathBindable[String]].unbind("org_id", dynamicString(org_id)))
    }
  
    // @LINE:0
    def standardsuri(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dataset-catalogs/standard-uris")
    }
  
  }


}
