package it.gov.***REMOVED***.catalogmanager.client

import it.gov.***REMOVED***.catalogmanager._

import it.gov.***REMOVED***.catalogmanager.json._

import play.api.libs.ws._

import play.api.libs.json._

import javax.inject._

import play.api.libs.concurrent.Execution.Implicits._

class Catalog_managerClient @Inject() (WS: WSClient) (baseUrl: String) {
  def test(Authorization: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/test").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Token]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def datasetcatalogs(Authorization: String, page: Option[Int], limit: Option[Int]) = {
    WS.url(s"$baseUrl/catalog-manager/v1/dataset-catalogs" + this._render_url_params("page" -> page, "limit" -> limit)).withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[MetaCatalog]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def standardsuri(Authorization: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/dataset-catalogs/standard-uris").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[StdUris]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def datasetcatalogbyid(Authorization: String, catalog_id: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/catalog-ds/get/$catalog_id").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[MetaCatalog]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def publicdatasetcatalogbyname(Authorization: String, name: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/public/catalog-ds/getbyname/$name").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[MetaCatalog]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def datasetcatalogbyname(Authorization: String, name: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/catalog-ds/getbyname/$name").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[MetaCatalog]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def isPresentOnCatalog(Authorization: String, name: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/catalog-ds/is_present/$name").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def createdatasetcatalog(Authorization: String, catalog: MetaCatalog) = {
    WS.url(s"$baseUrl/catalog-manager/v1/catalog-ds/add").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).post(Json.toJson(catalog)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def addQueueCatalog(Authorization: String, catalog: MetaCatalog) = {
    WS.url(s"$baseUrl/catalog-manager/v1/catalog-ds/add-queue").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).post(Json.toJson(catalog)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def createdatasetcatalogExtOpenData(Authorization: String, catalog: MetaCatalog) = {
    WS.url(s"$baseUrl/catalog-manager/v1/catalog-ds/ext/add").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).post(Json.toJson(catalog)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def createckandataset(Authorization: String, dataset: Dataset) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/create/dataset").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).post(Json.toJson(dataset)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def getckandatasetbyid(Authorization: String, dataset_id: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/datasets/$dataset_id").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Dataset]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def createckanorganization(Authorization: String, organization: Organization) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/create/organization").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).post(Json.toJson(organization)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def updateckanorganization(Authorization: String, org_id: String, organization: Organization) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/update/organization/$org_id").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).put(Json.toJson(organization)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def patchckanorganization(Authorization: String, org_id: String, organization: Organization) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/patch/organization/$org_id").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).put(Json.toJson(organization)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def getckanorganizationbyid(Authorization: String, org_id: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/organization/$org_id").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Organization]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def getckanorganizationList(Authorization: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/organizations").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[String]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def getckanuserorganizationList(Authorization: String, username: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/userOrganizations/$username").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[Organization]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def getckandatasetList(Authorization: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/datasets").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[String]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def getckandatasetListWithRes(Authorization: String, limit: Option[Int], offset: Option[Int]) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/datasetsWithResources" + this._render_url_params("limit" -> limit, "offset" -> offset)).withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[Dataset]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def searchdataset(q: Option[String], sort: Option[String], start: Option[Int], Authorization: String, rows: Option[Int]) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/searchDataset" + this._render_url_params("q" -> q, "sort" -> sort, "rows" -> rows, "start" -> start)).withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[Dataset]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def autocompletedataset(Authorization: String, q: Option[String], limit: Option[Int]) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/autocompleteDataset" + this._render_url_params("q" -> q, "limit" -> limit)).withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[AutocompRes]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def autocompletedummy(Authorization: String, autocompRes: AutocompRes) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/autocompleteDummy").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).post(Json.toJson(autocompRes)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def createckanuser(Authorization: String, user: User) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/create/user").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).post(Json.toJson(user)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def verifycredentials(Authorization: String, credentials: Credentials) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/verifyCredentials").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).post(Json.toJson(credentials)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def getckanuser(Authorization: String, username: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/ckan/user/$username").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[User]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_themesgetall(Authorization: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/themes/getall").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[KeyValue]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_subthemesgetall(Authorization: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/subthemes/getall").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[VocKeyValueSubtheme]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_subthemesgetbyid(Authorization: String, themeid: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/subthemes/getbyid/$themeid").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[KeyValue]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_dcat2Daftheme(Authorization: String, themeid: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/themes/dcat2***REMOVED***/$themeid").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[KeyValue]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_dcat2***REMOVED***subtheme(Authorization: String, themeid: String, subthemeid: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/subthemes/dcat2***REMOVED***/$themeid/$subthemeid").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[VocKeyValueSubtheme]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_dcatthemegetall(Authorization: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/dcatthemes/getall").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[KeyValue]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_dcatsubthemesgetall(Authorization: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/dcatsubthemes/getall").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[VocKeyValueSubtheme]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_dcatsubthemesgetbyid(Authorization: String, themeid: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/dcatsubthemes/getbyid/$themeid").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[KeyValue]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_***REMOVED***2dcattheme(Authorization: String, themeid: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/dcatthemes/***REMOVED***2dcat/$themeid").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[KeyValue]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def voc_***REMOVED***2dcatsubtheme(Authorization: String, themeid: String, subthemeid: String) = {
    WS.url(s"$baseUrl/catalog-manager/v1/voc/dcatsubthemes/***REMOVED***2dcat/$themeid/$subthemeid").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).get().map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[List[VocKeyValueSubtheme]]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  def startKyloFedd(Authorization: String, file_type: String, feed: MetaCatalog) = {
    WS.url(s"$baseUrl/catalog-manager/v1/kylo/feed/$file_type").withHeaders((this._render_header_params("Authorization" -> Some(Authorization)): _*)).post(Json.toJson(feed)).map({ resp =>
      if ((resp.status >= 200) && (resp.status <= 299)) Json.parse(resp.body).as[Success]
      else throw new java.lang.RuntimeException("unexpected response status: " + resp.status + " " + resp.body.toString)
    })
  }
  private def _render_url_params(pairs: (String, Option[Any])*) = {
    val parts = pairs.collect({
      case (k, Some(v)) => k + "=" + v
    })
    if (parts.nonEmpty) parts.mkString("?", "&", "")
    else ""
  }
  private def _render_header_params(pairs: (String, Option[Any])*) = {
    pairs.collect({
      case (k, Some(v)) => k -> v.toString
    })
  }
}