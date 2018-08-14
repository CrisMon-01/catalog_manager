package it.gov.***REMOVED***.catalogmanager.service

import it.gov.***REMOVED***.catalogmanager.repository.catalog.{CatalogRepository, CatalogRepositoryComponent, CatalogRepositoryDev}
import it.gov.***REMOVED***.catalogmanager.repository.ckan.{CkanRepository, CkanRepositoryComponent, CkanRepositoryDev}
import play.api.{Configuration, Environment}

/**
  * Created by ale on 08/05/17.
  */
object ServiceRegistry extends CatalogServiceComponent
  with CatalogRepositoryComponent with CkanRepositoryComponent {
  val conf = Configuration.load(Environment.simple())
  val app: String = conf.getString("app.type").getOrElse("dev")
  val catalogRepository =  CatalogRepository(app)
  val ckanRepository = CkanRepository(app)
  val catalogService = new CatalogService
}

