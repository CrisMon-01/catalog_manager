
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/catalog_manager.yaml
// @DATE:Tue Aug 14 17:33:03 CEST 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.catalog_manager.yaml._
import _root_.controllers.Assets.Asset

// @LINE:0
package catalog_manager.yaml.javascript {
  import ReverseRouteContext.empty

  // @LINE:0
  class ReverseCatalog_managerYaml(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:0
    def createckanuser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.createckanuser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/create/user"})
        }
      """
    )
  
    // @LINE:0
    def datasetcatalogbyname: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.datasetcatalogbyname",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "catalog-ds/getbyname/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:0
    def voc_dcat2***REMOVED***subtheme: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_dcat2***REMOVED***subtheme",
      """
        function(themeid0,subthemeid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/subthemes/dcat2***REMOVED***/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("themeid", encodeURIComponent(themeid0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("subthemeid", encodeURIComponent(subthemeid1))})
        }
      """
    )
  
    // @LINE:0
    def getckanorganizationbyid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.getckanorganizationbyid",
      """
        function(org_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/organization/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("org_id", encodeURIComponent(org_id0))})
        }
      """
    )
  
    // @LINE:0
    def voc_themesgetall: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_themesgetall",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/themes/getall"})
        }
      """
    )
  
    // @LINE:0
    def isPresentOnCatalog: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.isPresentOnCatalog",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "catalog-ds/is_present/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:0
    def startKyloFedd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.startKyloFedd",
      """
        function(file_type0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "kylo/feed/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file_type", encodeURIComponent(file_type0))})
        }
      """
    )
  
    // @LINE:0
    def datasetcatalogbyid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.datasetcatalogbyid",
      """
        function(catalog_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "catalog-ds/get/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("catalog_id", encodeURIComponent(catalog_id0))})
        }
      """
    )
  
    // @LINE:0
    def addQueueCatalog: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.addQueueCatalog",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "catalog-ds/add-queue"})
        }
      """
    )
  
    // @LINE:0
    def createdatasetcatalogExtOpenData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.createdatasetcatalogExtOpenData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "catalog-ds/ext/add"})
        }
      """
    )
  
    // @LINE:0
    def autocompletedataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.autocompletedataset",
      """
        function(q0,limit1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/autocompleteDataset" + _qS([(""" + implicitly[QueryStringBindable[MetadataCat]].javascriptUnbind + """)("q", q0), (""" + implicitly[QueryStringBindable[ResourceSize]].javascriptUnbind + """)("limit", limit1)])})
        }
      """
    )
  
    // @LINE:0
    def getckanuserorganizationList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.getckanuserorganizationList",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/userOrganizations/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
    // @LINE:0
    def getckanuser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.getckanuser",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
    // @LINE:0
    def datasetcatalogs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.datasetcatalogs",
      """
        function(page0,limit1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset-catalogs" + _qS([(""" + implicitly[QueryStringBindable[MetadataRequired]].javascriptUnbind + """)("page", page0), (""" + implicitly[QueryStringBindable[Dataset_catalogsGetLimit]].javascriptUnbind + """)("limit", limit1)])})
        }
      """
    )
  
    // @LINE:0
    def getckandatasetListWithRes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.getckandatasetListWithRes",
      """
        function(limit0,offset1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/datasetsWithResources" + _qS([(""" + implicitly[QueryStringBindable[ResourceSize]].javascriptUnbind + """)("limit", limit0), (""" + implicitly[QueryStringBindable[ResourceSize]].javascriptUnbind + """)("offset", offset1)])})
        }
      """
    )
  
    // @LINE:0
    def getckandatasetList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.getckandatasetList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/datasets"})
        }
      """
    )
  
    // @LINE:0
    def voc_dcat2Daftheme: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_dcat2Daftheme",
      """
        function(themeid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/themes/dcat2***REMOVED***/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("themeid", encodeURIComponent(themeid0))})
        }
      """
    )
  
    // @LINE:0
    def createckandataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.createckandataset",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/create/dataset"})
        }
      """
    )
  
    // @LINE:0
    def verifycredentials: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.verifycredentials",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/verifyCredentials"})
        }
      """
    )
  
    // @LINE:0
    def autocompletedummy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.autocompletedummy",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/autocompleteDummy"})
        }
      """
    )
  
    // @LINE:0
    def voc_***REMOVED***2dcatsubtheme: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_***REMOVED***2dcatsubtheme",
      """
        function(themeid0,subthemeid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/dcatsubthemes/***REMOVED***2dcat/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("themeid", encodeURIComponent(themeid0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("subthemeid", encodeURIComponent(subthemeid1))})
        }
      """
    )
  
    // @LINE:0
    def updateckanorganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.updateckanorganization",
      """
        function(org_id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/update/organization/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("org_id", encodeURIComponent(org_id0))})
        }
      """
    )
  
    // @LINE:0
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:0
    def voc_subthemesgetall: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_subthemesgetall",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/subthemes/getall"})
        }
      """
    )
  
    // @LINE:0
    def getckandatasetbyid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.getckandatasetbyid",
      """
        function(dataset_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/datasets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("dataset_id", encodeURIComponent(dataset_id0))})
        }
      """
    )
  
    // @LINE:0
    def getckanorganizationList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.getckanorganizationList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/organizations"})
        }
      """
    )
  
    // @LINE:0
    def voc_dcatsubthemesgetall: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_dcatsubthemesgetall",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/dcatsubthemes/getall"})
        }
      """
    )
  
    // @LINE:0
    def voc_subthemesgetbyid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_subthemesgetbyid",
      """
        function(themeid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/subthemes/getbyid/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("themeid", encodeURIComponent(themeid0))})
        }
      """
    )
  
    // @LINE:0
    def voc_dcatthemegetall: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_dcatthemegetall",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/dcatthemes/getall"})
        }
      """
    )
  
    // @LINE:0
    def searchdataset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.searchdataset",
      """
        function(q0,sort1,rows2,start3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/searchDataset" + _qS([(""" + implicitly[QueryStringBindable[MetadataCat]].javascriptUnbind + """)("q", q0), (""" + implicitly[QueryStringBindable[MetadataCat]].javascriptUnbind + """)("sort", sort1), (""" + implicitly[QueryStringBindable[ResourceSize]].javascriptUnbind + """)("rows", rows2), (""" + implicitly[QueryStringBindable[ResourceSize]].javascriptUnbind + """)("start", start3)])})
        }
      """
    )
  
    // @LINE:0
    def publicdatasetcatalogbyname: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.publicdatasetcatalogbyname",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/catalog-ds/getbyname/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:0
    def voc_dcatsubthemesgetbyid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_dcatsubthemesgetbyid",
      """
        function(themeid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/dcatsubthemes/getbyid/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("themeid", encodeURIComponent(themeid0))})
        }
      """
    )
  
    // @LINE:0
    def voc_***REMOVED***2dcattheme: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.voc_***REMOVED***2dcattheme",
      """
        function(themeid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voc/dcatthemes/***REMOVED***2dcat/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("themeid", encodeURIComponent(themeid0))})
        }
      """
    )
  
    // @LINE:0
    def createckanorganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.createckanorganization",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/create/organization"})
        }
      """
    )
  
    // @LINE:0
    def createdatasetcatalog: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.createdatasetcatalog",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "catalog-ds/add"})
        }
      """
    )
  
    // @LINE:0
    def patchckanorganization: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.patchckanorganization",
      """
        function(org_id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ckan/patch/organization/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("org_id", encodeURIComponent(org_id0))})
        }
      """
    )
  
    // @LINE:0
    def standardsuri: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "catalog_manager.yaml.Catalog_managerYaml.standardsuri",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataset-catalogs/standard-uris"})
        }
      """
    )
  
  }


}
