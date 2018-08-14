
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cmonti/***REMOVED***/catalog_manager/conf/routes
// @DATE:Tue Aug 14 17:32:48 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.***REMOVED***.HttpErrorHandler, 
  // @LINE:5
  Swagger_3: controllers.Swagger,
  // @LINE:9
  Assets_0: controllers.Assets,
  // @LINE:19
  catalog_manager_yaml_Routes_0: catalog_manager.yaml.Routes,
  // @LINE:21
  MetricsController_1: controllers.MetricsController,
  // @LINE:25
  CkanController_2: controllers.ckan.CkanController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.***REMOVED***.HttpErrorHandler,
    // @LINE:5
    Swagger_3: controllers.Swagger,
    // @LINE:9
    Assets_0: controllers.Assets,
    // @LINE:19
    catalog_manager_yaml_Routes_0: catalog_manager.yaml.Routes,
    // @LINE:21
    MetricsController_1: controllers.MetricsController,
    // @LINE:25
    CkanController_2: controllers.ckan.CkanController
  ) = this(errorHandler, Swagger_3, Assets_0, catalog_manager_yaml_Routes_0, MetricsController_1, CkanController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Swagger_3, Assets_0, catalog_manager_yaml_Routes_0, MetricsController_1, CkanController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """spec/catalog_manager.yaml""", """controllers.Swagger.swaggerSpec(name:String = "catalog_manager.yaml")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """catalog-manager""", """controllers.Assets.versioned(path:String = "/public/swagger-ui", file:Asset = "index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index.html""", """controllers.Assets.versioned(path:String = "/public/swagger-ui", file:Asset = "index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """o2c.html""", """controllers.Assets.versioned(path:String = "/public/swagger-ui", file:Asset = "o2c.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """favicon.ico""", """controllers.Assets.versioned(path:String = "/public/swagger-ui/images", file:Asset = "favicon.ico")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public/swagger-ui", file:Asset)"""),
    prefixed_catalog_manager_yaml_Routes_0_6.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """metrics""", """controllers.MetricsController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/organizations""", """controllers.ckan.CkanController.getOrganizationList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/organizations/""" + "$" + """organizationId<[^/]+>""", """controllers.ckan.CkanController.getOganizationRevisionList(organizationId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/dataset/""" + "$" + """datasetId<[^/]+>""", """controllers.ckan.CkanController.getDataset(datasetId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/organization/datasets/""" + "$" + """organizationId<[^/]+>""", """controllers.ckan.CkanController.getOrganizationDataset(organizationId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/user/""" + "$" + """userId<[^/]+>""", """controllers.ckan.CkanController.getUser(userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/userOrganizations/""" + "$" + """userId<[^/]+>""", """controllers.ckan.CkanController.getUserOrganizations(userId:String, permission:Option[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/createDataset""", """controllers.ckan.CkanController.createDataset"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/createOrganization""", """controllers.ckan.CkanController.createOrganization"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/createUser""", """controllers.ckan.CkanController.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/datasets""", """controllers.ckan.CkanController.getDatasetList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/datasetsWithResources""", """controllers.ckan.CkanController.getDatasetListWithResources(limit:Option[Int], offset:Option[Int])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/searchDataset""", """controllers.ckan.CkanController.searchDataset(q:Option[String], sort:Option[String], rows:Option[Int], start:Option[Int])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/autocompleteDataset""", """controllers.ckan.CkanController.autocompleteDataset(q:Option[String], limit:Option[Int])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/organization/""" + "$" + """orgId<[^/]+>""", """controllers.ckan.CkanController.getOrganization(orgId:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/updateDataset/""" + "$" + """datasetId<[^/]+>""", """controllers.ckan.CkanController.updateDataset(datasetId:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/updateOrganization/""" + "$" + """orgId<[^/]+>""", """controllers.ckan.CkanController.updateOrganization(orgId:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/patchOrganization/""" + "$" + """orgId<[^/]+>""", """controllers.ckan.CkanController.patchOrganization(orgId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/deleteDataset/""" + "$" + """datasetId<[^/]+>""", """controllers.ckan.CkanController.deleteDataset(datasetId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/deleteOrganization/""" + "$" + """orgId<[^/]+>""", """controllers.ckan.CkanController.deleteOrganization(orgId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/purgeDataset/""" + "$" + """datasetId<[^/]+>""", """controllers.ckan.CkanController.purgeDataset(datasetId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ckan/purgeOrganization/""" + "$" + """orgId<[^/]+>""", """controllers.ckan.CkanController.purgeOrganization(orgId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """docs/swagger-ui/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public/lib/swagger-ui", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public/swagger-ui", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Swagger_swaggerSpec0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spec/catalog_manager.yaml")))
  )
  private[this] lazy val controllers_Swagger_swaggerSpec0_invoker = createInvoker(
    Swagger_3.swaggerSpec(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Swagger",
      "swaggerSpec",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """spec/catalog_manager.yaml"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("catalog-manager")))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """catalog-manager"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index.html")))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """index.html"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("o2c.html")))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """o2c.html"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favicon.ico")))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """favicon.ico"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """api/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:19
  private[this] val prefixed_catalog_manager_yaml_Routes_0_6 = Include(catalog_manager_yaml_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "catalog-manager/v1"))

  // @LINE:21
  private[this] lazy val controllers_MetricsController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("metrics")))
  )
  private[this] lazy val controllers_MetricsController_index7_invoker = createInvoker(
    MetricsController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MetricsController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """metrics"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ckan_CkanController_getOrganizationList8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/organizations")))
  )
  private[this] lazy val controllers_ckan_CkanController_getOrganizationList8_invoker = createInvoker(
    CkanController_2.getOrganizationList,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "getOrganizationList",
      Nil,
      "GET",
      """ Temporary Ckan API outside swagger file""",
      this.prefix + """ckan/organizations"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ckan_CkanController_getOganizationRevisionList9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/organizations/"), DynamicPart("organizationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_getOganizationRevisionList9_invoker = createInvoker(
    CkanController_2.getOganizationRevisionList(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "getOganizationRevisionList",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ckan/organizations/""" + "$" + """organizationId<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ckan_CkanController_getDataset10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/dataset/"), DynamicPart("datasetId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_getDataset10_invoker = createInvoker(
    CkanController_2.getDataset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "getDataset",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ckan/dataset/""" + "$" + """datasetId<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ckan_CkanController_getOrganizationDataset11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/organization/datasets/"), DynamicPart("organizationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_getOrganizationDataset11_invoker = createInvoker(
    CkanController_2.getOrganizationDataset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "getOrganizationDataset",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ckan/organization/datasets/""" + "$" + """organizationId<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ckan_CkanController_getUser12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_getUser12_invoker = createInvoker(
    CkanController_2.getUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "getUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ckan/user/""" + "$" + """userId<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ckan_CkanController_getUserOrganizations13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/userOrganizations/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_getUserOrganizations13_invoker = createInvoker(
    CkanController_2.getUserOrganizations(fakeValue[String], fakeValue[Option[String]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "getUserOrganizations",
      Seq(classOf[String], classOf[Option[String]]),
      "GET",
      """""",
      this.prefix + """ckan/userOrganizations/""" + "$" + """userId<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ckan_CkanController_createDataset14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/createDataset")))
  )
  private[this] lazy val controllers_ckan_CkanController_createDataset14_invoker = createInvoker(
    CkanController_2.createDataset,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "createDataset",
      Nil,
      "POST",
      """""",
      this.prefix + """ckan/createDataset"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ckan_CkanController_createOrganization15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/createOrganization")))
  )
  private[this] lazy val controllers_ckan_CkanController_createOrganization15_invoker = createInvoker(
    CkanController_2.createOrganization,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "createOrganization",
      Nil,
      "POST",
      """""",
      this.prefix + """ckan/createOrganization"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ckan_CkanController_createUser16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/createUser")))
  )
  private[this] lazy val controllers_ckan_CkanController_createUser16_invoker = createInvoker(
    CkanController_2.createUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "createUser",
      Nil,
      "POST",
      """""",
      this.prefix + """ckan/createUser"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ckan_CkanController_getDatasetList17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/datasets")))
  )
  private[this] lazy val controllers_ckan_CkanController_getDatasetList17_invoker = createInvoker(
    CkanController_2.getDatasetList,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "getDatasetList",
      Nil,
      "GET",
      """""",
      this.prefix + """ckan/datasets"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ckan_CkanController_getDatasetListWithResources18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/datasetsWithResources")))
  )
  private[this] lazy val controllers_ckan_CkanController_getDatasetListWithResources18_invoker = createInvoker(
    CkanController_2.getDatasetListWithResources(fakeValue[Option[Int]], fakeValue[Option[Int]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "getDatasetListWithResources",
      Seq(classOf[Option[Int]], classOf[Option[Int]]),
      "GET",
      """""",
      this.prefix + """ckan/datasetsWithResources"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ckan_CkanController_searchDataset19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/searchDataset")))
  )
  private[this] lazy val controllers_ckan_CkanController_searchDataset19_invoker = createInvoker(
    CkanController_2.searchDataset(fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Option[Int]], fakeValue[Option[Int]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "searchDataset",
      Seq(classOf[Option[String]], classOf[Option[String]], classOf[Option[Int]], classOf[Option[Int]]),
      "GET",
      """""",
      this.prefix + """ckan/searchDataset"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ckan_CkanController_autocompleteDataset20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/autocompleteDataset")))
  )
  private[this] lazy val controllers_ckan_CkanController_autocompleteDataset20_invoker = createInvoker(
    CkanController_2.autocompleteDataset(fakeValue[Option[String]], fakeValue[Option[Int]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "autocompleteDataset",
      Seq(classOf[Option[String]], classOf[Option[Int]]),
      "GET",
      """""",
      this.prefix + """ckan/autocompleteDataset"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ckan_CkanController_getOrganization21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/organization/"), DynamicPart("orgId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_getOrganization21_invoker = createInvoker(
    CkanController_2.getOrganization(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "getOrganization",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """ckan/organization/""" + "$" + """orgId<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_ckan_CkanController_updateDataset22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/updateDataset/"), DynamicPart("datasetId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_updateDataset22_invoker = createInvoker(
    CkanController_2.updateDataset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "updateDataset",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """ckan/updateDataset/""" + "$" + """datasetId<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ckan_CkanController_updateOrganization23_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/updateOrganization/"), DynamicPart("orgId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_updateOrganization23_invoker = createInvoker(
    CkanController_2.updateOrganization(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "updateOrganization",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """ckan/updateOrganization/""" + "$" + """orgId<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_ckan_CkanController_patchOrganization24_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/patchOrganization/"), DynamicPart("orgId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_patchOrganization24_invoker = createInvoker(
    CkanController_2.patchOrganization(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "patchOrganization",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """ckan/patchOrganization/""" + "$" + """orgId<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ckan_CkanController_deleteDataset25_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/deleteDataset/"), DynamicPart("datasetId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_deleteDataset25_invoker = createInvoker(
    CkanController_2.deleteDataset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "deleteDataset",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """ckan/deleteDataset/""" + "$" + """datasetId<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ckan_CkanController_deleteOrganization26_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/deleteOrganization/"), DynamicPart("orgId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_deleteOrganization26_invoker = createInvoker(
    CkanController_2.deleteOrganization(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "deleteOrganization",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """ckan/deleteOrganization/""" + "$" + """orgId<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ckan_CkanController_purgeDataset27_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/purgeDataset/"), DynamicPart("datasetId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_purgeDataset27_invoker = createInvoker(
    CkanController_2.purgeDataset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "purgeDataset",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """ckan/purgeDataset/""" + "$" + """datasetId<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ckan_CkanController_purgeOrganization28_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ckan/purgeOrganization/"), DynamicPart("orgId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ckan_CkanController_purgeOrganization28_invoker = createInvoker(
    CkanController_2.purgeOrganization(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ckan.CkanController",
      "purgeOrganization",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """ckan/purgeOrganization/""" + "$" + """orgId<[^/]+>"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Assets_at29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("docs/swagger-ui/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at29_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """## NoDocs ###""",
      this.prefix + """docs/swagger-ui/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_Assets_versioned30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned30_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """## NoDocs ###""",
      this.prefix + """""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Swagger_swaggerSpec0_route(params) =>
      call(Param[String]("name", Right("catalog_manager.yaml"))) { (name) =>
        controllers_Swagger_swaggerSpec0_invoker.call(Swagger_3.swaggerSpec(name))
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public/swagger-ui")), Param[Asset]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_Assets_versioned2_route(params) =>
      call(Param[String]("path", Right("/public/swagger-ui")), Param[Asset]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_versioned2_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public/swagger-ui")), Param[Asset]("file", Right("o2c.html"))) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public/swagger-ui/images")), Param[Asset]("file", Right("favicon.ico"))) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public/swagger-ui")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:19
    case prefixed_catalog_manager_yaml_Routes_0_6(handler) => handler
  
    // @LINE:21
    case controllers_MetricsController_index7_route(params) =>
      call { 
        controllers_MetricsController_index7_invoker.call(MetricsController_1.index)
      }
  
    // @LINE:25
    case controllers_ckan_CkanController_getOrganizationList8_route(params) =>
      call { 
        controllers_ckan_CkanController_getOrganizationList8_invoker.call(CkanController_2.getOrganizationList)
      }
  
    // @LINE:26
    case controllers_ckan_CkanController_getOganizationRevisionList9_route(params) =>
      call(params.fromPath[String]("organizationId", None)) { (organizationId) =>
        controllers_ckan_CkanController_getOganizationRevisionList9_invoker.call(CkanController_2.getOganizationRevisionList(organizationId))
      }
  
    // @LINE:27
    case controllers_ckan_CkanController_getDataset10_route(params) =>
      call(params.fromPath[String]("datasetId", None)) { (datasetId) =>
        controllers_ckan_CkanController_getDataset10_invoker.call(CkanController_2.getDataset(datasetId))
      }
  
    // @LINE:28
    case controllers_ckan_CkanController_getOrganizationDataset11_route(params) =>
      call(params.fromPath[String]("organizationId", None)) { (organizationId) =>
        controllers_ckan_CkanController_getOrganizationDataset11_invoker.call(CkanController_2.getOrganizationDataset(organizationId))
      }
  
    // @LINE:29
    case controllers_ckan_CkanController_getUser12_route(params) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_ckan_CkanController_getUser12_invoker.call(CkanController_2.getUser(userId))
      }
  
    // @LINE:30
    case controllers_ckan_CkanController_getUserOrganizations13_route(params) =>
      call(params.fromPath[String]("userId", None), params.fromQuery[Option[String]]("permission", None)) { (userId, permission) =>
        controllers_ckan_CkanController_getUserOrganizations13_invoker.call(CkanController_2.getUserOrganizations(userId, permission))
      }
  
    // @LINE:32
    case controllers_ckan_CkanController_createDataset14_route(params) =>
      call { 
        controllers_ckan_CkanController_createDataset14_invoker.call(CkanController_2.createDataset)
      }
  
    // @LINE:33
    case controllers_ckan_CkanController_createOrganization15_route(params) =>
      call { 
        controllers_ckan_CkanController_createOrganization15_invoker.call(CkanController_2.createOrganization)
      }
  
    // @LINE:34
    case controllers_ckan_CkanController_createUser16_route(params) =>
      call { 
        controllers_ckan_CkanController_createUser16_invoker.call(CkanController_2.createUser)
      }
  
    // @LINE:35
    case controllers_ckan_CkanController_getDatasetList17_route(params) =>
      call { 
        controllers_ckan_CkanController_getDatasetList17_invoker.call(CkanController_2.getDatasetList)
      }
  
    // @LINE:36
    case controllers_ckan_CkanController_getDatasetListWithResources18_route(params) =>
      call(params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("offset", None)) { (limit, offset) =>
        controllers_ckan_CkanController_getDatasetListWithResources18_invoker.call(CkanController_2.getDatasetListWithResources(limit, offset))
      }
  
    // @LINE:37
    case controllers_ckan_CkanController_searchDataset19_route(params) =>
      call(params.fromQuery[Option[String]]("q", None), params.fromQuery[Option[String]]("sort", None), params.fromQuery[Option[Int]]("rows", None), params.fromQuery[Option[Int]]("start", None)) { (q, sort, rows, start) =>
        controllers_ckan_CkanController_searchDataset19_invoker.call(CkanController_2.searchDataset(q, sort, rows, start))
      }
  
    // @LINE:38
    case controllers_ckan_CkanController_autocompleteDataset20_route(params) =>
      call(params.fromQuery[Option[String]]("q", None), params.fromQuery[Option[Int]]("limit", None)) { (q, limit) =>
        controllers_ckan_CkanController_autocompleteDataset20_invoker.call(CkanController_2.autocompleteDataset(q, limit))
      }
  
    // @LINE:39
    case controllers_ckan_CkanController_getOrganization21_route(params) =>
      call(params.fromPath[String]("orgId", None)) { (orgId) =>
        controllers_ckan_CkanController_getOrganization21_invoker.call(CkanController_2.getOrganization(orgId))
      }
  
    // @LINE:40
    case controllers_ckan_CkanController_updateDataset22_route(params) =>
      call(params.fromPath[String]("datasetId", None)) { (datasetId) =>
        controllers_ckan_CkanController_updateDataset22_invoker.call(CkanController_2.updateDataset(datasetId))
      }
  
    // @LINE:41
    case controllers_ckan_CkanController_updateOrganization23_route(params) =>
      call(params.fromPath[String]("orgId", None)) { (orgId) =>
        controllers_ckan_CkanController_updateOrganization23_invoker.call(CkanController_2.updateOrganization(orgId))
      }
  
    // @LINE:42
    case controllers_ckan_CkanController_patchOrganization24_route(params) =>
      call(params.fromPath[String]("orgId", None)) { (orgId) =>
        controllers_ckan_CkanController_patchOrganization24_invoker.call(CkanController_2.patchOrganization(orgId))
      }
  
    // @LINE:43
    case controllers_ckan_CkanController_deleteDataset25_route(params) =>
      call(params.fromPath[String]("datasetId", None)) { (datasetId) =>
        controllers_ckan_CkanController_deleteDataset25_invoker.call(CkanController_2.deleteDataset(datasetId))
      }
  
    // @LINE:44
    case controllers_ckan_CkanController_deleteOrganization26_route(params) =>
      call(params.fromPath[String]("orgId", None)) { (orgId) =>
        controllers_ckan_CkanController_deleteOrganization26_invoker.call(CkanController_2.deleteOrganization(orgId))
      }
  
    // @LINE:45
    case controllers_ckan_CkanController_purgeDataset27_route(params) =>
      call(params.fromPath[String]("datasetId", None)) { (datasetId) =>
        controllers_ckan_CkanController_purgeDataset27_invoker.call(CkanController_2.purgeDataset(datasetId))
      }
  
    // @LINE:46
    case controllers_ckan_CkanController_purgeOrganization28_route(params) =>
      call(params.fromPath[String]("orgId", None)) { (orgId) =>
        controllers_ckan_CkanController_purgeOrganization28_invoker.call(CkanController_2.purgeOrganization(orgId))
      }
  
    // @LINE:50
    case controllers_Assets_at29_route(params) =>
      call(Param[String]("path", Right("/public/lib/swagger-ui")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at29_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:53
    case controllers_Assets_versioned30_route(params) =>
      call(Param[String]("path", Right("/public/swagger-ui")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned30_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
