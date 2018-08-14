
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/catalog_manager.yaml
// @DATE:Tue Aug 14 17:33:03 CEST 2018

package catalog_manager.yaml

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.catalog_manager.yaml._
import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.***REMOVED***.HttpErrorHandler, 
  // @LINE:0
  Catalog_managerYaml_0: catalog_manager.yaml.Catalog_managerYaml,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.***REMOVED***.HttpErrorHandler,
    // @LINE:0
    Catalog_managerYaml_0: catalog_manager.yaml.Catalog_managerYaml
  ) = this(errorHandler, Catalog_managerYaml_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    catalog_manager.yaml.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Catalog_managerYaml_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/autocompleteDummy""", """catalog_manager.yaml.Catalog_managerYaml.autocompletedummy()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/searchDataset""", """catalog_manager.yaml.Catalog_managerYaml.searchdataset(q:MetadataCat, sort:MetadataCat, rows:ResourceSize, start:ResourceSize)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/organization/""" + "$" + """org_id<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.getckanorganizationbyid(org_id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catalog-ds/ext/add""", """catalog_manager.yaml.Catalog_managerYaml.createdatasetcatalogExtOpenData()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/datasets""", """catalog_manager.yaml.Catalog_managerYaml.getckandatasetList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/subthemes/getall""", """catalog_manager.yaml.Catalog_managerYaml.voc_subthemesgetall()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dataset-catalogs""", """catalog_manager.yaml.Catalog_managerYaml.datasetcatalogs(page:MetadataRequired, limit:Dataset_catalogsGetLimit)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/subthemes/getbyid/""" + "$" + """themeid<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.voc_subthemesgetbyid(themeid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/subthemes/dcat2***REMOVED***/""" + "$" + """themeid<[^/]+>/""" + "$" + """subthemeid<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.voc_dcat2***REMOVED***subtheme(themeid:String, subthemeid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catalog-ds/add-queue""", """catalog_manager.yaml.Catalog_managerYaml.addQueueCatalog()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dataset-catalogs/standard-uris""", """catalog_manager.yaml.Catalog_managerYaml.standardsuri()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catalog-ds/getbyname/""" + "$" + """name<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.datasetcatalogbyname(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/autocompleteDataset""", """catalog_manager.yaml.Catalog_managerYaml.autocompletedataset(q:MetadataCat, limit:ResourceSize)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catalog-ds/is_present/""" + "$" + """name<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.isPresentOnCatalog(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catalog-ds/add""", """catalog_manager.yaml.Catalog_managerYaml.createdatasetcatalog()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """catalog_manager.yaml.Catalog_managerYaml.test()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/verifyCredentials""", """catalog_manager.yaml.Catalog_managerYaml.verifycredentials()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/dcatthemes/getall""", """catalog_manager.yaml.Catalog_managerYaml.voc_dcatthemegetall()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/create/dataset""", """catalog_manager.yaml.Catalog_managerYaml.createckandataset()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/datasetsWithResources""", """catalog_manager.yaml.Catalog_managerYaml.getckandatasetListWithRes(limit:ResourceSize, offset:ResourceSize)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/userOrganizations/""" + "$" + """username<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.getckanuserorganizationList(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/themes/getall""", """catalog_manager.yaml.Catalog_managerYaml.voc_themesgetall()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/dcatsubthemes/getall""", """catalog_manager.yaml.Catalog_managerYaml.voc_dcatsubthemesgetall()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/dcatsubthemes/***REMOVED***2dcat/""" + "$" + """themeid<[^/]+>/""" + "$" + """subthemeid<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.voc_***REMOVED***2dcatsubtheme(themeid:String, subthemeid:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/create/organization""", """catalog_manager.yaml.Catalog_managerYaml.createckanorganization()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/update/organization/""" + "$" + """org_id<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.updateckanorganization(org_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/user/""" + "$" + """username<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.getckanuser(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/create/user""", """catalog_manager.yaml.Catalog_managerYaml.createckanuser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/datasets/""" + "$" + """dataset_id<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.getckandatasetbyid(dataset_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/themes/dcat2***REMOVED***/""" + "$" + """themeid<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.voc_dcat2Daftheme(themeid:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/patch/organization/""" + "$" + """org_id<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.patchckanorganization(org_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catalog-ds/get/""" + "$" + """catalog_id<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.datasetcatalogbyid(catalog_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/dcatthemes/***REMOVED***2dcat/""" + "$" + """themeid<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.voc_***REMOVED***2dcattheme(themeid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """voc/dcatsubthemes/getbyid/""" + "$" + """themeid<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.voc_dcatsubthemesgetbyid(themeid:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/catalog-ds/getbyname/""" + "$" + """name<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.publicdatasetcatalogbyname(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/organizations""", """catalog_manager.yaml.Catalog_managerYaml.getckanorganizationList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kylo/feed/""" + "$" + """file_type<[^/]+>""", """catalog_manager.yaml.Catalog_managerYaml.startKyloFedd(file_type:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_autocompletedummy0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/autocompleteDummy")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_autocompletedummy0_invoker = createInvoker(
    Catalog_managerYaml_0.autocompletedummy(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "autocompletedummy",
      Nil,
      "POST",
      """""",
      this.prefix + """ckan/autocompleteDummy"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_searchdataset1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/searchDataset")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_searchdataset1_invoker = createInvoker(
    Catalog_managerYaml_0.searchdataset(fakeValue[MetadataCat], fakeValue[MetadataCat], fakeValue[ResourceSize], fakeValue[ResourceSize]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "searchdataset",
      Seq(classOf[MetadataCat], classOf[MetadataCat], classOf[ResourceSize], classOf[ResourceSize]),
      "GET",
      """""",
      this.prefix + """ckan/searchDataset"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckanorganizationbyid2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/organization/"), DynamicPart("org_id", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckanorganizationbyid2_invoker = createInvoker(
    Catalog_managerYaml_0.getckanorganizationbyid(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "getckanorganizationbyid",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ckan/organization/""" + "$" + """org_id<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createdatasetcatalogExtOpenData3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catalog-ds/ext/add")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createdatasetcatalogExtOpenData3_invoker = createInvoker(
    Catalog_managerYaml_0.createdatasetcatalogExtOpenData(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "createdatasetcatalogExtOpenData",
      Nil,
      "POST",
      """""",
      this.prefix + """catalog-ds/ext/add"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckandatasetList4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/datasets")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckandatasetList4_invoker = createInvoker(
    Catalog_managerYaml_0.getckandatasetList(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "getckandatasetList",
      Nil,
      "GET",
      """""",
      this.prefix + """ckan/datasets"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_subthemesgetall5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/subthemes/getall")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_subthemesgetall5_invoker = createInvoker(
    Catalog_managerYaml_0.voc_subthemesgetall(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_subthemesgetall",
      Nil,
      "GET",
      """""",
      this.prefix + """voc/subthemes/getall"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_datasetcatalogs6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dataset-catalogs")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_datasetcatalogs6_invoker = createInvoker(
    Catalog_managerYaml_0.datasetcatalogs(fakeValue[MetadataRequired], fakeValue[Dataset_catalogsGetLimit]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "datasetcatalogs",
      Seq(classOf[MetadataRequired], classOf[Dataset_catalogsGetLimit]),
      "GET",
      """""",
      this.prefix + """dataset-catalogs"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_subthemesgetbyid7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/subthemes/getbyid/"), DynamicPart("themeid", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_subthemesgetbyid7_invoker = createInvoker(
    Catalog_managerYaml_0.voc_subthemesgetbyid(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_subthemesgetbyid",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """voc/subthemes/getbyid/""" + "$" + """themeid<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcat2***REMOVED***subtheme8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/subthemes/dcat2***REMOVED***/"), DynamicPart("themeid", """[^/]+""",true), StaticPart("/"), DynamicPart("subthemeid", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcat2***REMOVED***subtheme8_invoker = createInvoker(
    Catalog_managerYaml_0.voc_dcat2***REMOVED***subtheme(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_dcat2***REMOVED***subtheme",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """voc/subthemes/dcat2***REMOVED***/""" + "$" + """themeid<[^/]+>/""" + "$" + """subthemeid<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_addQueueCatalog9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catalog-ds/add-queue")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_addQueueCatalog9_invoker = createInvoker(
    Catalog_managerYaml_0.addQueueCatalog(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "addQueueCatalog",
      Nil,
      "POST",
      """""",
      this.prefix + """catalog-ds/add-queue"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_standardsuri10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dataset-catalogs/standard-uris")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_standardsuri10_invoker = createInvoker(
    Catalog_managerYaml_0.standardsuri(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "standardsuri",
      Nil,
      "GET",
      """""",
      this.prefix + """dataset-catalogs/standard-uris"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_datasetcatalogbyname11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catalog-ds/getbyname/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_datasetcatalogbyname11_invoker = createInvoker(
    Catalog_managerYaml_0.datasetcatalogbyname(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "datasetcatalogbyname",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """catalog-ds/getbyname/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_autocompletedataset12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/autocompleteDataset")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_autocompletedataset12_invoker = createInvoker(
    Catalog_managerYaml_0.autocompletedataset(fakeValue[MetadataCat], fakeValue[ResourceSize]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "autocompletedataset",
      Seq(classOf[MetadataCat], classOf[ResourceSize]),
      "GET",
      """""",
      this.prefix + """ckan/autocompleteDataset"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_isPresentOnCatalog13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catalog-ds/is_present/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_isPresentOnCatalog13_invoker = createInvoker(
    Catalog_managerYaml_0.isPresentOnCatalog(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "isPresentOnCatalog",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """catalog-ds/is_present/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createdatasetcatalog14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catalog-ds/add")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createdatasetcatalog14_invoker = createInvoker(
    Catalog_managerYaml_0.createdatasetcatalog(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "createdatasetcatalog",
      Nil,
      "POST",
      """""",
      this.prefix + """catalog-ds/add"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_test15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_test15_invoker = createInvoker(
    Catalog_managerYaml_0.test(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "test",
      Nil,
      "GET",
      """""",
      this.prefix + """test"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_verifycredentials16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/verifyCredentials")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_verifycredentials16_invoker = createInvoker(
    Catalog_managerYaml_0.verifycredentials(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "verifycredentials",
      Nil,
      "POST",
      """""",
      this.prefix + """ckan/verifyCredentials"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcatthemegetall17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/dcatthemes/getall")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcatthemegetall17_invoker = createInvoker(
    Catalog_managerYaml_0.voc_dcatthemegetall(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_dcatthemegetall",
      Nil,
      "GET",
      """""",
      this.prefix + """voc/dcatthemes/getall"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createckandataset18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/create/dataset")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createckandataset18_invoker = createInvoker(
    Catalog_managerYaml_0.createckandataset(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "createckandataset",
      Nil,
      "POST",
      """""",
      this.prefix + """ckan/create/dataset"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckandatasetListWithRes19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/datasetsWithResources")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckandatasetListWithRes19_invoker = createInvoker(
    Catalog_managerYaml_0.getckandatasetListWithRes(fakeValue[ResourceSize], fakeValue[ResourceSize]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "getckandatasetListWithRes",
      Seq(classOf[ResourceSize], classOf[ResourceSize]),
      "GET",
      """""",
      this.prefix + """ckan/datasetsWithResources"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckanuserorganizationList20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/userOrganizations/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckanuserorganizationList20_invoker = createInvoker(
    Catalog_managerYaml_0.getckanuserorganizationList(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "getckanuserorganizationList",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ckan/userOrganizations/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_themesgetall21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/themes/getall")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_themesgetall21_invoker = createInvoker(
    Catalog_managerYaml_0.voc_themesgetall(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_themesgetall",
      Nil,
      "GET",
      """""",
      this.prefix + """voc/themes/getall"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcatsubthemesgetall22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/dcatsubthemes/getall")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcatsubthemesgetall22_invoker = createInvoker(
    Catalog_managerYaml_0.voc_dcatsubthemesgetall(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_dcatsubthemesgetall",
      Nil,
      "GET",
      """""",
      this.prefix + """voc/dcatsubthemes/getall"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_***REMOVED***2dcatsubtheme23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/dcatsubthemes/***REMOVED***2dcat/"), DynamicPart("themeid", """[^/]+""",true), StaticPart("/"), DynamicPart("subthemeid", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_***REMOVED***2dcatsubtheme23_invoker = createInvoker(
    Catalog_managerYaml_0.voc_***REMOVED***2dcatsubtheme(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_***REMOVED***2dcatsubtheme",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """voc/dcatsubthemes/***REMOVED***2dcat/""" + "$" + """themeid<[^/]+>/""" + "$" + """subthemeid<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createckanorganization24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/create/organization")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createckanorganization24_invoker = createInvoker(
    Catalog_managerYaml_0.createckanorganization(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "createckanorganization",
      Nil,
      "POST",
      """""",
      this.prefix + """ckan/create/organization"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_updateckanorganization25_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/update/organization/"), DynamicPart("org_id", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_updateckanorganization25_invoker = createInvoker(
    Catalog_managerYaml_0.updateckanorganization(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "updateckanorganization",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """ckan/update/organization/""" + "$" + """org_id<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckanuser26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/user/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckanuser26_invoker = createInvoker(
    Catalog_managerYaml_0.getckanuser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "getckanuser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ckan/user/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createckanuser27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/create/user")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_createckanuser27_invoker = createInvoker(
    Catalog_managerYaml_0.createckanuser(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "createckanuser",
      Nil,
      "POST",
      """""",
      this.prefix + """ckan/create/user"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckandatasetbyid28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/datasets/"), DynamicPart("dataset_id", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckandatasetbyid28_invoker = createInvoker(
    Catalog_managerYaml_0.getckandatasetbyid(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "getckandatasetbyid",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ckan/datasets/""" + "$" + """dataset_id<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcat2Daftheme29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/themes/dcat2***REMOVED***/"), DynamicPart("themeid", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcat2Daftheme29_invoker = createInvoker(
    Catalog_managerYaml_0.voc_dcat2Daftheme(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_dcat2Daftheme",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """voc/themes/dcat2***REMOVED***/""" + "$" + """themeid<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_patchckanorganization30_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/patch/organization/"), DynamicPart("org_id", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_patchckanorganization30_invoker = createInvoker(
    Catalog_managerYaml_0.patchckanorganization(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "patchckanorganization",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """ckan/patch/organization/""" + "$" + """org_id<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_datasetcatalogbyid31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catalog-ds/get/"), DynamicPart("catalog_id", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_datasetcatalogbyid31_invoker = createInvoker(
    Catalog_managerYaml_0.datasetcatalogbyid(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "datasetcatalogbyid",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """catalog-ds/get/""" + "$" + """catalog_id<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_***REMOVED***2dcattheme32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/dcatthemes/***REMOVED***2dcat/"), DynamicPart("themeid", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_***REMOVED***2dcattheme32_invoker = createInvoker(
    Catalog_managerYaml_0.voc_***REMOVED***2dcattheme(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_***REMOVED***2dcattheme",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """voc/dcatthemes/***REMOVED***2dcat/""" + "$" + """themeid<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcatsubthemesgetbyid33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("voc/dcatsubthemes/getbyid/"), DynamicPart("themeid", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_voc_dcatsubthemesgetbyid33_invoker = createInvoker(
    Catalog_managerYaml_0.voc_dcatsubthemesgetbyid(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "voc_dcatsubthemesgetbyid",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """voc/dcatsubthemes/getbyid/""" + "$" + """themeid<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_publicdatasetcatalogbyname34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/catalog-ds/getbyname/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_publicdatasetcatalogbyname34_invoker = createInvoker(
    Catalog_managerYaml_0.publicdatasetcatalogbyname(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "publicdatasetcatalogbyname",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """public/catalog-ds/getbyname/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckanorganizationList35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/organizations")))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_getckanorganizationList35_invoker = createInvoker(
    Catalog_managerYaml_0.getckanorganizationList(),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "getckanorganizationList",
      Nil,
      "GET",
      """""",
      this.prefix + """ckan/organizations"""
    )
  )

  // @LINE:0
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_startKyloFedd36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kylo/feed/"), DynamicPart("file_type", """[^/]+""",true)))
  )
  private[this] lazy val catalog_manager_yaml_Catalog_managerYaml_startKyloFedd36_invoker = createInvoker(
    Catalog_managerYaml_0.startKyloFedd(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "catalog_manager.yaml",
      "catalog_manager.yaml.Catalog_managerYaml",
      "startKyloFedd",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """kylo/feed/""" + "$" + """file_type<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_autocompletedummy0_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_autocompletedummy0_invoker.call(Catalog_managerYaml_0.autocompletedummy())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_searchdataset1_route(params) =>
      call(params.fromQuery[MetadataCat]("q", None), params.fromQuery[MetadataCat]("sort", None), params.fromQuery[ResourceSize]("rows", None), params.fromQuery[ResourceSize]("start", None)) { (q, sort, rows, start) =>
        catalog_manager_yaml_Catalog_managerYaml_searchdataset1_invoker.call(Catalog_managerYaml_0.searchdataset(q, sort, rows, start))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_getckanorganizationbyid2_route(params) =>
      call(params.fromPath[String]("org_id", None)) { (org_id) =>
        catalog_manager_yaml_Catalog_managerYaml_getckanorganizationbyid2_invoker.call(Catalog_managerYaml_0.getckanorganizationbyid(org_id))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_createdatasetcatalogExtOpenData3_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_createdatasetcatalogExtOpenData3_invoker.call(Catalog_managerYaml_0.createdatasetcatalogExtOpenData())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_getckandatasetList4_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_getckandatasetList4_invoker.call(Catalog_managerYaml_0.getckandatasetList())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_subthemesgetall5_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_voc_subthemesgetall5_invoker.call(Catalog_managerYaml_0.voc_subthemesgetall())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_datasetcatalogs6_route(params) =>
      call(params.fromQuery[MetadataRequired]("page", None), params.fromQuery[Dataset_catalogsGetLimit]("limit", None)) { (page, limit) =>
        catalog_manager_yaml_Catalog_managerYaml_datasetcatalogs6_invoker.call(Catalog_managerYaml_0.datasetcatalogs(page, limit))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_subthemesgetbyid7_route(params) =>
      call(params.fromPath[String]("themeid", None)) { (themeid) =>
        catalog_manager_yaml_Catalog_managerYaml_voc_subthemesgetbyid7_invoker.call(Catalog_managerYaml_0.voc_subthemesgetbyid(themeid))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_dcat2***REMOVED***subtheme8_route(params) =>
      call(params.fromPath[String]("themeid", None), params.fromPath[String]("subthemeid", None)) { (themeid, subthemeid) =>
        catalog_manager_yaml_Catalog_managerYaml_voc_dcat2***REMOVED***subtheme8_invoker.call(Catalog_managerYaml_0.voc_dcat2***REMOVED***subtheme(themeid, subthemeid))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_addQueueCatalog9_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_addQueueCatalog9_invoker.call(Catalog_managerYaml_0.addQueueCatalog())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_standardsuri10_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_standardsuri10_invoker.call(Catalog_managerYaml_0.standardsuri())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_datasetcatalogbyname11_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        catalog_manager_yaml_Catalog_managerYaml_datasetcatalogbyname11_invoker.call(Catalog_managerYaml_0.datasetcatalogbyname(name))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_autocompletedataset12_route(params) =>
      call(params.fromQuery[MetadataCat]("q", None), params.fromQuery[ResourceSize]("limit", None)) { (q, limit) =>
        catalog_manager_yaml_Catalog_managerYaml_autocompletedataset12_invoker.call(Catalog_managerYaml_0.autocompletedataset(q, limit))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_isPresentOnCatalog13_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        catalog_manager_yaml_Catalog_managerYaml_isPresentOnCatalog13_invoker.call(Catalog_managerYaml_0.isPresentOnCatalog(name))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_createdatasetcatalog14_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_createdatasetcatalog14_invoker.call(Catalog_managerYaml_0.createdatasetcatalog())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_test15_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_test15_invoker.call(Catalog_managerYaml_0.test())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_verifycredentials16_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_verifycredentials16_invoker.call(Catalog_managerYaml_0.verifycredentials())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_dcatthemegetall17_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_voc_dcatthemegetall17_invoker.call(Catalog_managerYaml_0.voc_dcatthemegetall())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_createckandataset18_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_createckandataset18_invoker.call(Catalog_managerYaml_0.createckandataset())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_getckandatasetListWithRes19_route(params) =>
      call(params.fromQuery[ResourceSize]("limit", None), params.fromQuery[ResourceSize]("offset", None)) { (limit, offset) =>
        catalog_manager_yaml_Catalog_managerYaml_getckandatasetListWithRes19_invoker.call(Catalog_managerYaml_0.getckandatasetListWithRes(limit, offset))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_getckanuserorganizationList20_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        catalog_manager_yaml_Catalog_managerYaml_getckanuserorganizationList20_invoker.call(Catalog_managerYaml_0.getckanuserorganizationList(username))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_themesgetall21_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_voc_themesgetall21_invoker.call(Catalog_managerYaml_0.voc_themesgetall())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_dcatsubthemesgetall22_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_voc_dcatsubthemesgetall22_invoker.call(Catalog_managerYaml_0.voc_dcatsubthemesgetall())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_***REMOVED***2dcatsubtheme23_route(params) =>
      call(params.fromPath[String]("themeid", None), params.fromPath[String]("subthemeid", None)) { (themeid, subthemeid) =>
        catalog_manager_yaml_Catalog_managerYaml_voc_***REMOVED***2dcatsubtheme23_invoker.call(Catalog_managerYaml_0.voc_***REMOVED***2dcatsubtheme(themeid, subthemeid))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_createckanorganization24_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_createckanorganization24_invoker.call(Catalog_managerYaml_0.createckanorganization())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_updateckanorganization25_route(params) =>
      call(params.fromPath[String]("org_id", None)) { (org_id) =>
        catalog_manager_yaml_Catalog_managerYaml_updateckanorganization25_invoker.call(Catalog_managerYaml_0.updateckanorganization(org_id))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_getckanuser26_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        catalog_manager_yaml_Catalog_managerYaml_getckanuser26_invoker.call(Catalog_managerYaml_0.getckanuser(username))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_createckanuser27_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_createckanuser27_invoker.call(Catalog_managerYaml_0.createckanuser())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_getckandatasetbyid28_route(params) =>
      call(params.fromPath[String]("dataset_id", None)) { (dataset_id) =>
        catalog_manager_yaml_Catalog_managerYaml_getckandatasetbyid28_invoker.call(Catalog_managerYaml_0.getckandatasetbyid(dataset_id))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_dcat2Daftheme29_route(params) =>
      call(params.fromPath[String]("themeid", None)) { (themeid) =>
        catalog_manager_yaml_Catalog_managerYaml_voc_dcat2Daftheme29_invoker.call(Catalog_managerYaml_0.voc_dcat2Daftheme(themeid))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_patchckanorganization30_route(params) =>
      call(params.fromPath[String]("org_id", None)) { (org_id) =>
        catalog_manager_yaml_Catalog_managerYaml_patchckanorganization30_invoker.call(Catalog_managerYaml_0.patchckanorganization(org_id))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_datasetcatalogbyid31_route(params) =>
      call(params.fromPath[String]("catalog_id", None)) { (catalog_id) =>
        catalog_manager_yaml_Catalog_managerYaml_datasetcatalogbyid31_invoker.call(Catalog_managerYaml_0.datasetcatalogbyid(catalog_id))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_***REMOVED***2dcattheme32_route(params) =>
      call(params.fromPath[String]("themeid", None)) { (themeid) =>
        catalog_manager_yaml_Catalog_managerYaml_voc_***REMOVED***2dcattheme32_invoker.call(Catalog_managerYaml_0.voc_***REMOVED***2dcattheme(themeid))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_voc_dcatsubthemesgetbyid33_route(params) =>
      call(params.fromPath[String]("themeid", None)) { (themeid) =>
        catalog_manager_yaml_Catalog_managerYaml_voc_dcatsubthemesgetbyid33_invoker.call(Catalog_managerYaml_0.voc_dcatsubthemesgetbyid(themeid))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_publicdatasetcatalogbyname34_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        catalog_manager_yaml_Catalog_managerYaml_publicdatasetcatalogbyname34_invoker.call(Catalog_managerYaml_0.publicdatasetcatalogbyname(name))
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_getckanorganizationList35_route(params) =>
      call { 
        catalog_manager_yaml_Catalog_managerYaml_getckanorganizationList35_invoker.call(Catalog_managerYaml_0.getckanorganizationList())
      }
  
    // @LINE:0
    case catalog_manager_yaml_Catalog_managerYaml_startKyloFedd36_route(params) =>
      call(params.fromPath[String]("file_type", None)) { (file_type) =>
        catalog_manager_yaml_Catalog_managerYaml_startKyloFedd36_invoker.call(Catalog_managerYaml_0.startKyloFedd(file_type))
      }
  }
}
