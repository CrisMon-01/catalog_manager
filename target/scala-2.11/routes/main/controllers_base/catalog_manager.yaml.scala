package catalog_manager.yaml

import scala.language.existentials
import play.api.i18n.{I18nSupport, Messages}
import play.api.mvc._
import play.api.***REMOVED***._
import play.api.libs.json._
import de.zalando.play.controllers._
import Results.Status
import PlayBodyParsing._
import scala.concurrent.Future

import scala.util._
import scala.math.BigInt

import de.zalando.play.controllers.PlayPathBindables




//noinspection ScalaStyle
trait Catalog_managerYamlBase extends Controller with PlayBodyParsing with I18nSupport with ValidationTranslator {
    import play.api.libs.concurrent.Execution.Implicits.defaultContext
    var currentRequest: Request[Any] = _
    sealed trait AutocompletedummyType[T] extends ResultWrapper[T]
    def Autocompletedummy401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new AutocompletedummyType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Autocompletedummy401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new AutocompletedummyType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Autocompletedummy200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new AutocompletedummyType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Autocompletedummy200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new AutocompletedummyType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type autocompletedummyActionRequestType       = (AutocompRes)
    private type autocompletedummyActionType[T]            = autocompletedummyActionRequestType => Future[AutocompletedummyType[T] forSome { type T }]



        
        import BodyReads._
        
        val autocompletedummyParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[AutocompRes])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val autocompletedummyActionConstructor  = Action

def autocompletedummyAction[T] = (f: autocompletedummyActionType[T]) => autocompletedummyActionConstructor.async(autocompletedummyParser) { implicit request: Request[AutocompRes] =>

        currentRequest = request

        def processValidautocompletedummyRequest(autocompRes: AutocompRes): Either[Result, Future[AutocompletedummyType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((autocompRes)))
            
            new CkanAutocompleteDummyPostValidator(autocompRes).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val autocompRes: AutocompRes = request.body
            
            

            processValidautocompletedummyRequest(autocompRes) match {
                case Left(l) => success(l)
                case Right(r: Future[AutocompletedummyType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { autocompletedummyResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(autocompletedummyResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait SearchdatasetType[T] extends ResultWrapper[T]
    def Searchdataset200(resultP: Seq[Dataset])(implicit writerP: String => Option[Writeable[Seq[Dataset]]]) = success(new SearchdatasetType[Seq[Dataset]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Searchdataset200(resultF: Future[Seq[Dataset]])(implicit writerP: String => Option[Writeable[Seq[Dataset]]]) = resultF map { resultP => (new SearchdatasetType[Seq[Dataset]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    def Searchdataset401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new SearchdatasetType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Searchdataset401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new SearchdatasetType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    

    private type searchdatasetActionRequestType       = (MetadataCat, MetadataCat, ResourceSize, ResourceSize)
    private type searchdatasetActionType[T]            = searchdatasetActionRequestType => Future[SearchdatasetType[T] forSome { type T }]




    val searchdatasetActionConstructor  = Action

def searchdatasetAction[T] = (f: searchdatasetActionType[T]) => (q: MetadataCat, sort: MetadataCat, rows: ResourceSize, start: ResourceSize) => searchdatasetActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidsearchdatasetRequest(q: MetadataCat, sort: MetadataCat, rows: ResourceSize, start: ResourceSize): Either[Result, Future[SearchdatasetType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((q, sort, rows, start)))
            
            new CkanSearchDatasetGetValidator(q, sort, rows, start).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidsearchdatasetRequest(q, sort, rows, start) match {
                case Left(l) => success(l)
                case Right(r: Future[SearchdatasetType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { searchdatasetResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(searchdatasetResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait GetckanorganizationbyidType[T] extends ResultWrapper[T]
    def Getckanorganizationbyid401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new GetckanorganizationbyidType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Getckanorganizationbyid401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new GetckanorganizationbyidType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Getckanorganizationbyid200(resultP: Organization)(implicit writerP: String => Option[Writeable[Organization]]) = success(new GetckanorganizationbyidType[Organization] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Getckanorganizationbyid200(resultF: Future[Organization])(implicit writerP: String => Option[Writeable[Organization]]) = resultF map { resultP => (new GetckanorganizationbyidType[Organization] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type getckanorganizationbyidActionRequestType       = (String)
    private type getckanorganizationbyidActionType[T]            = getckanorganizationbyidActionRequestType => Future[GetckanorganizationbyidType[T] forSome { type T }]




    val getckanorganizationbyidActionConstructor  = Action

def getckanorganizationbyidAction[T] = (f: getckanorganizationbyidActionType[T]) => (org_id: String) => getckanorganizationbyidActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidgetckanorganizationbyidRequest(org_id: String): Either[Result, Future[GetckanorganizationbyidType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((org_id)))
            
            new CkanOrganizationOrg_idGetValidator(org_id).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidgetckanorganizationbyidRequest(org_id) match {
                case Left(l) => success(l)
                case Right(r: Future[GetckanorganizationbyidType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { getckanorganizationbyidResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(getckanorganizationbyidResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait CreatedatasetcatalogExtOpenDataType[T] extends ResultWrapper[T]
    def CreatedatasetcatalogExtOpenData401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new CreatedatasetcatalogExtOpenDataType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def CreatedatasetcatalogExtOpenData401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new CreatedatasetcatalogExtOpenDataType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def CreatedatasetcatalogExtOpenData200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new CreatedatasetcatalogExtOpenDataType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def CreatedatasetcatalogExtOpenData200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new CreatedatasetcatalogExtOpenDataType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type createdatasetcatalogExtOpenDataActionRequestType       = (MetaCatalog)
    private type createdatasetcatalogExtOpenDataActionType[T]            = createdatasetcatalogExtOpenDataActionRequestType => Future[CreatedatasetcatalogExtOpenDataType[T] forSome { type T }]



        
        import BodyReads._
        
        val createdatasetcatalogExtOpenDataParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[MetaCatalog])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val createdatasetcatalogExtOpenDataActionConstructor  = Action

def createdatasetcatalogExtOpenDataAction[T] = (f: createdatasetcatalogExtOpenDataActionType[T]) => createdatasetcatalogExtOpenDataActionConstructor.async(createdatasetcatalogExtOpenDataParser) { implicit request: Request[MetaCatalog] =>

        currentRequest = request

        def processValidcreatedatasetcatalogExtOpenDataRequest(catalog: MetaCatalog): Either[Result, Future[CreatedatasetcatalogExtOpenDataType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((catalog)))
            
            new Catalog_dsExtAddPostValidator(catalog).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val catalog: MetaCatalog = request.body
            
            

            processValidcreatedatasetcatalogExtOpenDataRequest(catalog) match {
                case Left(l) => success(l)
                case Right(r: Future[CreatedatasetcatalogExtOpenDataType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { createdatasetcatalogExtOpenDataResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(createdatasetcatalogExtOpenDataResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait GetckandatasetListType[T] extends ResultWrapper[T]
    def GetckandatasetList401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new GetckandatasetListType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def GetckandatasetList401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new GetckandatasetListType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def GetckandatasetList200(resultP: Seq[String])(implicit writerP: String => Option[Writeable[Seq[String]]]) = success(new GetckandatasetListType[Seq[String]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def GetckandatasetList200(resultF: Future[Seq[String]])(implicit writerP: String => Option[Writeable[Seq[String]]]) = resultF map { resultP => (new GetckandatasetListType[Seq[String]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type getckandatasetListActionRequestType       = (Unit)
    private type getckandatasetListActionType[T]            = getckandatasetListActionRequestType => Future[GetckandatasetListType[T] forSome { type T }]




    val getckandatasetListActionConstructor  = Action

def getckandatasetListAction[T] = (f: getckandatasetListActionType[T]) => getckandatasetListActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidgetckandatasetListRequest(): Either[Result, Future[GetckandatasetListType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f(()))
            apiFirstTempResultHolder
        }

            
            

            processValidgetckandatasetListRequest() match {
                case Left(l) => success(l)
                case Right(r: Future[GetckandatasetListType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { getckandatasetListResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(getckandatasetListResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_subthemesgetallType[T] extends ResultWrapper[T]
    def Voc_subthemesgetall200(resultP: Seq[VocKeyValueSubtheme])(implicit writerP: String => Option[Writeable[Seq[VocKeyValueSubtheme]]]) = success(new Voc_subthemesgetallType[Seq[VocKeyValueSubtheme]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_subthemesgetall200(resultF: Future[Seq[VocKeyValueSubtheme]])(implicit writerP: String => Option[Writeable[Seq[VocKeyValueSubtheme]]]) = resultF map { resultP => (new Voc_subthemesgetallType[Seq[VocKeyValueSubtheme]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    def Voc_subthemesgetall401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_subthemesgetallType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_subthemesgetall401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_subthemesgetallType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    

    private type voc_subthemesgetallActionRequestType       = (Unit)
    private type voc_subthemesgetallActionType[T]            = voc_subthemesgetallActionRequestType => Future[Voc_subthemesgetallType[T] forSome { type T }]




    val voc_subthemesgetallActionConstructor  = Action

def voc_subthemesgetallAction[T] = (f: voc_subthemesgetallActionType[T]) => voc_subthemesgetallActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_subthemesgetallRequest(): Either[Result, Future[Voc_subthemesgetallType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f(()))
            apiFirstTempResultHolder
        }

            
            

            processValidvoc_subthemesgetallRequest() match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_subthemesgetallType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_subthemesgetallResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_subthemesgetallResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait DatasetcatalogsType[T] extends ResultWrapper[T]
    def Datasetcatalogs200(resultP: Seq[MetaCatalog])(implicit writerP: String => Option[Writeable[Seq[MetaCatalog]]]) = success(new DatasetcatalogsType[Seq[MetaCatalog]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Datasetcatalogs200(resultF: Future[Seq[MetaCatalog]])(implicit writerP: String => Option[Writeable[Seq[MetaCatalog]]]) = resultF map { resultP => (new DatasetcatalogsType[Seq[MetaCatalog]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    def Datasetcatalogs401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new DatasetcatalogsType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Datasetcatalogs401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new DatasetcatalogsType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    

    private type datasetcatalogsActionRequestType       = (MetadataRequired, Dataset_catalogsGetLimit)
    private type datasetcatalogsActionType[T]            = datasetcatalogsActionRequestType => Future[DatasetcatalogsType[T] forSome { type T }]




    val datasetcatalogsActionConstructor  = Action

def datasetcatalogsAction[T] = (f: datasetcatalogsActionType[T]) => (page: MetadataRequired, limit: Dataset_catalogsGetLimit) => datasetcatalogsActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValiddatasetcatalogsRequest(page: MetadataRequired, limit: Dataset_catalogsGetLimit): Either[Result, Future[DatasetcatalogsType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((page, limit)))
            
            new Dataset_catalogsGetValidator(page, limit).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValiddatasetcatalogsRequest(page, limit) match {
                case Left(l) => success(l)
                case Right(r: Future[DatasetcatalogsType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { datasetcatalogsResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(datasetcatalogsResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_subthemesgetbyidType[T] extends ResultWrapper[T]
    def Voc_subthemesgetbyid401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_subthemesgetbyidType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_subthemesgetbyid401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_subthemesgetbyidType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Voc_subthemesgetbyid200(resultP: Seq[KeyValue])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = success(new Voc_subthemesgetbyidType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_subthemesgetbyid200(resultF: Future[Seq[KeyValue]])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = resultF map { resultP => (new Voc_subthemesgetbyidType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type voc_subthemesgetbyidActionRequestType       = (String)
    private type voc_subthemesgetbyidActionType[T]            = voc_subthemesgetbyidActionRequestType => Future[Voc_subthemesgetbyidType[T] forSome { type T }]




    val voc_subthemesgetbyidActionConstructor  = Action

def voc_subthemesgetbyidAction[T] = (f: voc_subthemesgetbyidActionType[T]) => (themeid: String) => voc_subthemesgetbyidActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_subthemesgetbyidRequest(themeid: String): Either[Result, Future[Voc_subthemesgetbyidType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((themeid)))
            
            new VocSubthemesGetbyidThemeidGetValidator(themeid).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidvoc_subthemesgetbyidRequest(themeid) match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_subthemesgetbyidType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_subthemesgetbyidResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_subthemesgetbyidResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_dcat2***REMOVED***subthemeType[T] extends ResultWrapper[T]
    def Voc_dcat2***REMOVED***subtheme401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_dcat2***REMOVED***subthemeType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_dcat2***REMOVED***subtheme401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_dcat2***REMOVED***subthemeType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Voc_dcat2***REMOVED***subtheme200(resultP: Seq[VocKeyValueSubtheme])(implicit writerP: String => Option[Writeable[Seq[VocKeyValueSubtheme]]]) = success(new Voc_dcat2***REMOVED***subthemeType[Seq[VocKeyValueSubtheme]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_dcat2***REMOVED***subtheme200(resultF: Future[Seq[VocKeyValueSubtheme]])(implicit writerP: String => Option[Writeable[Seq[VocKeyValueSubtheme]]]) = resultF map { resultP => (new Voc_dcat2***REMOVED***subthemeType[Seq[VocKeyValueSubtheme]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type voc_dcat2***REMOVED***subthemeActionRequestType       = (String, String)
    private type voc_dcat2***REMOVED***subthemeActionType[T]            = voc_dcat2***REMOVED***subthemeActionRequestType => Future[Voc_dcat2***REMOVED***subthemeType[T] forSome { type T }]




    val voc_dcat2***REMOVED***subthemeActionConstructor  = Action

def voc_dcat2***REMOVED***subthemeAction[T] = (f: voc_dcat2***REMOVED***subthemeActionType[T]) => (themeid: String, subthemeid: String) => voc_dcat2***REMOVED***subthemeActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_dcat2***REMOVED***subthemeRequest(themeid: String, subthemeid: String): Either[Result, Future[Voc_dcat2***REMOVED***subthemeType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((themeid, subthemeid)))
            
            new VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetValidator(themeid, subthemeid).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidvoc_dcat2***REMOVED***subthemeRequest(themeid, subthemeid) match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_dcat2***REMOVED***subthemeType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_dcat2***REMOVED***subthemeResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_dcat2***REMOVED***subthemeResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait AddQueueCatalogType[T] extends ResultWrapper[T]
    def AddQueueCatalog500(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new AddQueueCatalogType[Error] { val statusCode = 500; val result = resultP; val writer = writerP })
    def AddQueueCatalog500(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new AddQueueCatalogType[Error] { val statusCode = 500; val result = resultP; val writer = writerP }) }
    def AddQueueCatalog401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new AddQueueCatalogType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def AddQueueCatalog401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new AddQueueCatalogType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def AddQueueCatalog200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new AddQueueCatalogType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def AddQueueCatalog200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new AddQueueCatalogType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type addQueueCatalogActionRequestType       = (MetaCatalog)
    private type addQueueCatalogActionType[T]            = addQueueCatalogActionRequestType => Future[AddQueueCatalogType[T] forSome { type T }]



        
        import BodyReads._
        
        val addQueueCatalogParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[MetaCatalog])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val addQueueCatalogActionConstructor  = Action

def addQueueCatalogAction[T] = (f: addQueueCatalogActionType[T]) => addQueueCatalogActionConstructor.async(addQueueCatalogParser) { implicit request: Request[MetaCatalog] =>

        currentRequest = request

        def processValidaddQueueCatalogRequest(catalog: MetaCatalog): Either[Result, Future[AddQueueCatalogType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((catalog)))
            
            new Catalog_dsAdd_queuePostValidator(catalog).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val catalog: MetaCatalog = request.body
            
            

            processValidaddQueueCatalogRequest(catalog) match {
                case Left(l) => success(l)
                case Right(r: Future[AddQueueCatalogType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { addQueueCatalogResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(addQueueCatalogResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait StandardsuriType[T] extends ResultWrapper[T]
    def Standardsuri200(resultP: Seq[StdUris])(implicit writerP: String => Option[Writeable[Seq[StdUris]]]) = success(new StandardsuriType[Seq[StdUris]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Standardsuri200(resultF: Future[Seq[StdUris]])(implicit writerP: String => Option[Writeable[Seq[StdUris]]]) = resultF map { resultP => (new StandardsuriType[Seq[StdUris]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    def Standardsuri401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new StandardsuriType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Standardsuri401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new StandardsuriType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    

    private type standardsuriActionRequestType       = (Unit)
    private type standardsuriActionType[T]            = standardsuriActionRequestType => Future[StandardsuriType[T] forSome { type T }]




    val standardsuriActionConstructor  = Action

def standardsuriAction[T] = (f: standardsuriActionType[T]) => standardsuriActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidstandardsuriRequest(): Either[Result, Future[StandardsuriType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f(()))
            apiFirstTempResultHolder
        }

            
            

            processValidstandardsuriRequest() match {
                case Left(l) => success(l)
                case Right(r: Future[StandardsuriType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { standardsuriResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(standardsuriResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait DatasetcatalogbynameType[T] extends ResultWrapper[T]
    def Datasetcatalogbyname401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new DatasetcatalogbynameType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Datasetcatalogbyname401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new DatasetcatalogbynameType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Datasetcatalogbyname200(resultP: MetaCatalog)(implicit writerP: String => Option[Writeable[MetaCatalog]]) = success(new DatasetcatalogbynameType[MetaCatalog] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Datasetcatalogbyname200(resultF: Future[MetaCatalog])(implicit writerP: String => Option[Writeable[MetaCatalog]]) = resultF map { resultP => (new DatasetcatalogbynameType[MetaCatalog] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type datasetcatalogbynameActionRequestType       = (String)
    private type datasetcatalogbynameActionType[T]            = datasetcatalogbynameActionRequestType => Future[DatasetcatalogbynameType[T] forSome { type T }]




    val datasetcatalogbynameActionConstructor  = Action

def datasetcatalogbynameAction[T] = (f: datasetcatalogbynameActionType[T]) => (name: String) => datasetcatalogbynameActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValiddatasetcatalogbynameRequest(name: String): Either[Result, Future[DatasetcatalogbynameType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((name)))
            
            new Catalog_dsGetbynameNameGetValidator(name).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValiddatasetcatalogbynameRequest(name) match {
                case Left(l) => success(l)
                case Right(r: Future[DatasetcatalogbynameType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { datasetcatalogbynameResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(datasetcatalogbynameResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait AutocompletedatasetType[T] extends ResultWrapper[T]
    def Autocompletedataset200(resultP: Seq[AutocompRes])(implicit writerP: String => Option[Writeable[Seq[AutocompRes]]]) = success(new AutocompletedatasetType[Seq[AutocompRes]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Autocompletedataset200(resultF: Future[Seq[AutocompRes]])(implicit writerP: String => Option[Writeable[Seq[AutocompRes]]]) = resultF map { resultP => (new AutocompletedatasetType[Seq[AutocompRes]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    def Autocompletedataset401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new AutocompletedatasetType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Autocompletedataset401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new AutocompletedatasetType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    

    private type autocompletedatasetActionRequestType       = (MetadataCat, ResourceSize)
    private type autocompletedatasetActionType[T]            = autocompletedatasetActionRequestType => Future[AutocompletedatasetType[T] forSome { type T }]




    val autocompletedatasetActionConstructor  = Action

def autocompletedatasetAction[T] = (f: autocompletedatasetActionType[T]) => (q: MetadataCat, limit: ResourceSize) => autocompletedatasetActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidautocompletedatasetRequest(q: MetadataCat, limit: ResourceSize): Either[Result, Future[AutocompletedatasetType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((q, limit)))
            
            new CkanAutocompleteDatasetGetValidator(q, limit).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidautocompletedatasetRequest(q, limit) match {
                case Left(l) => success(l)
                case Right(r: Future[AutocompletedatasetType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { autocompletedatasetResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(autocompletedatasetResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait IsPresentOnCatalogType[T] extends ResultWrapper[T]
    def IsPresentOnCatalog404(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new IsPresentOnCatalogType[String] { val statusCode = 404; val result = resultP; val writer = writerP })
    def IsPresentOnCatalog404(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new IsPresentOnCatalogType[String] { val statusCode = 404; val result = resultP; val writer = writerP }) }
    def IsPresentOnCatalog401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new IsPresentOnCatalogType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def IsPresentOnCatalog401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new IsPresentOnCatalogType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def IsPresentOnCatalog200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new IsPresentOnCatalogType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def IsPresentOnCatalog200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new IsPresentOnCatalogType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type isPresentOnCatalogActionRequestType       = (String)
    private type isPresentOnCatalogActionType[T]            = isPresentOnCatalogActionRequestType => Future[IsPresentOnCatalogType[T] forSome { type T }]




    val isPresentOnCatalogActionConstructor  = Action

def isPresentOnCatalogAction[T] = (f: isPresentOnCatalogActionType[T]) => (name: String) => isPresentOnCatalogActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidisPresentOnCatalogRequest(name: String): Either[Result, Future[IsPresentOnCatalogType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((name)))
            
            new Catalog_dsIs_presentNameGetValidator(name).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidisPresentOnCatalogRequest(name) match {
                case Left(l) => success(l)
                case Right(r: Future[IsPresentOnCatalogType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { isPresentOnCatalogResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(isPresentOnCatalogResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait CreatedatasetcatalogType[T] extends ResultWrapper[T]
    def Createdatasetcatalog401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new CreatedatasetcatalogType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Createdatasetcatalog401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new CreatedatasetcatalogType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Createdatasetcatalog200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new CreatedatasetcatalogType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Createdatasetcatalog200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new CreatedatasetcatalogType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type createdatasetcatalogActionRequestType       = (MetaCatalog)
    private type createdatasetcatalogActionType[T]            = createdatasetcatalogActionRequestType => Future[CreatedatasetcatalogType[T] forSome { type T }]



        
        import BodyReads._
        
        val createdatasetcatalogParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[MetaCatalog])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val createdatasetcatalogActionConstructor  = Action

def createdatasetcatalogAction[T] = (f: createdatasetcatalogActionType[T]) => createdatasetcatalogActionConstructor.async(createdatasetcatalogParser) { implicit request: Request[MetaCatalog] =>

        currentRequest = request

        def processValidcreatedatasetcatalogRequest(catalog: MetaCatalog): Either[Result, Future[CreatedatasetcatalogType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((catalog)))
            
            new Catalog_dsAddPostValidator(catalog).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val catalog: MetaCatalog = request.body
            
            

            processValidcreatedatasetcatalogRequest(catalog) match {
                case Left(l) => success(l)
                case Right(r: Future[CreatedatasetcatalogType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { createdatasetcatalogResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(createdatasetcatalogResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait TestType[T] extends ResultWrapper[T]
    def Test200(resultP: Token)(implicit writerP: String => Option[Writeable[Token]]) = success(new TestType[Token] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Test200(resultF: Future[Token])(implicit writerP: String => Option[Writeable[Token]]) = resultF map { resultP => (new TestType[Token] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type testActionRequestType       = (Unit)
    private type testActionType[T]            = testActionRequestType => Future[TestType[T] forSome { type T }]




    val testActionConstructor  = Action

def testAction[T] = (f: testActionType[T]) => testActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidtestRequest(): Either[Result, Future[TestType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f(()))
            apiFirstTempResultHolder
        }

            
            

            processValidtestRequest() match {
                case Left(l) => success(l)
                case Right(r: Future[TestType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { testResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(testResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait VerifycredentialsType[T] extends ResultWrapper[T]
    def Verifycredentials401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new VerifycredentialsType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Verifycredentials401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new VerifycredentialsType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Verifycredentials200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new VerifycredentialsType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Verifycredentials200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new VerifycredentialsType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type verifycredentialsActionRequestType       = (Credentials)
    private type verifycredentialsActionType[T]            = verifycredentialsActionRequestType => Future[VerifycredentialsType[T] forSome { type T }]



        
        import BodyReads._
        
        val verifycredentialsParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[Credentials])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val verifycredentialsActionConstructor  = Action

def verifycredentialsAction[T] = (f: verifycredentialsActionType[T]) => verifycredentialsActionConstructor.async(verifycredentialsParser) { implicit request: Request[Credentials] =>

        currentRequest = request

        def processValidverifycredentialsRequest(credentials: Credentials): Either[Result, Future[VerifycredentialsType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((credentials)))
            
            new CkanVerifyCredentialsPostValidator(credentials).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val credentials: Credentials = request.body
            
            

            processValidverifycredentialsRequest(credentials) match {
                case Left(l) => success(l)
                case Right(r: Future[VerifycredentialsType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { verifycredentialsResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(verifycredentialsResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_dcatthemegetallType[T] extends ResultWrapper[T]
    def Voc_dcatthemegetall401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_dcatthemegetallType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_dcatthemegetall401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_dcatthemegetallType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Voc_dcatthemegetall200(resultP: Seq[KeyValue])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = success(new Voc_dcatthemegetallType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_dcatthemegetall200(resultF: Future[Seq[KeyValue]])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = resultF map { resultP => (new Voc_dcatthemegetallType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type voc_dcatthemegetallActionRequestType       = (Unit)
    private type voc_dcatthemegetallActionType[T]            = voc_dcatthemegetallActionRequestType => Future[Voc_dcatthemegetallType[T] forSome { type T }]




    val voc_dcatthemegetallActionConstructor  = Action

def voc_dcatthemegetallAction[T] = (f: voc_dcatthemegetallActionType[T]) => voc_dcatthemegetallActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_dcatthemegetallRequest(): Either[Result, Future[Voc_dcatthemegetallType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f(()))
            apiFirstTempResultHolder
        }

            
            

            processValidvoc_dcatthemegetallRequest() match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_dcatthemegetallType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_dcatthemegetallResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_dcatthemegetallResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait CreateckandatasetType[T] extends ResultWrapper[T]
    def Createckandataset401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new CreateckandatasetType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Createckandataset401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new CreateckandatasetType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Createckandataset200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new CreateckandatasetType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Createckandataset200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new CreateckandatasetType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type createckandatasetActionRequestType       = (Dataset)
    private type createckandatasetActionType[T]            = createckandatasetActionRequestType => Future[CreateckandatasetType[T] forSome { type T }]



        
        import BodyReads._
        
        val createckandatasetParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[Dataset])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val createckandatasetActionConstructor  = Action

def createckandatasetAction[T] = (f: createckandatasetActionType[T]) => createckandatasetActionConstructor.async(createckandatasetParser) { implicit request: Request[Dataset] =>

        currentRequest = request

        def processValidcreateckandatasetRequest(dataset: Dataset): Either[Result, Future[CreateckandatasetType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((dataset)))
            
            new CkanCreateDatasetPostValidator(dataset).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val dataset: Dataset = request.body
            
            

            processValidcreateckandatasetRequest(dataset) match {
                case Left(l) => success(l)
                case Right(r: Future[CreateckandatasetType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { createckandatasetResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(createckandatasetResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait GetckandatasetListWithResType[T] extends ResultWrapper[T]
    def GetckandatasetListWithRes401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new GetckandatasetListWithResType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def GetckandatasetListWithRes401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new GetckandatasetListWithResType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def GetckandatasetListWithRes200(resultP: Seq[Dataset])(implicit writerP: String => Option[Writeable[Seq[Dataset]]]) = success(new GetckandatasetListWithResType[Seq[Dataset]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def GetckandatasetListWithRes200(resultF: Future[Seq[Dataset]])(implicit writerP: String => Option[Writeable[Seq[Dataset]]]) = resultF map { resultP => (new GetckandatasetListWithResType[Seq[Dataset]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type getckandatasetListWithResActionRequestType       = (ResourceSize, ResourceSize)
    private type getckandatasetListWithResActionType[T]            = getckandatasetListWithResActionRequestType => Future[GetckandatasetListWithResType[T] forSome { type T }]




    val getckandatasetListWithResActionConstructor  = Action

def getckandatasetListWithResAction[T] = (f: getckandatasetListWithResActionType[T]) => (limit: ResourceSize, offset: ResourceSize) => getckandatasetListWithResActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidgetckandatasetListWithResRequest(limit: ResourceSize, offset: ResourceSize): Either[Result, Future[GetckandatasetListWithResType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((limit, offset)))
            
            new CkanDatasetsWithResourcesGetValidator(limit, offset).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidgetckandatasetListWithResRequest(limit, offset) match {
                case Left(l) => success(l)
                case Right(r: Future[GetckandatasetListWithResType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { getckandatasetListWithResResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(getckandatasetListWithResResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait GetckanuserorganizationListType[T] extends ResultWrapper[T]
    def GetckanuserorganizationList200(resultP: Seq[Organization])(implicit writerP: String => Option[Writeable[Seq[Organization]]]) = success(new GetckanuserorganizationListType[Seq[Organization]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def GetckanuserorganizationList200(resultF: Future[Seq[Organization]])(implicit writerP: String => Option[Writeable[Seq[Organization]]]) = resultF map { resultP => (new GetckanuserorganizationListType[Seq[Organization]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    def GetckanuserorganizationList401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new GetckanuserorganizationListType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def GetckanuserorganizationList401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new GetckanuserorganizationListType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    

    private type getckanuserorganizationListActionRequestType       = (String)
    private type getckanuserorganizationListActionType[T]            = getckanuserorganizationListActionRequestType => Future[GetckanuserorganizationListType[T] forSome { type T }]




    val getckanuserorganizationListActionConstructor  = Action

def getckanuserorganizationListAction[T] = (f: getckanuserorganizationListActionType[T]) => (username: String) => getckanuserorganizationListActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidgetckanuserorganizationListRequest(username: String): Either[Result, Future[GetckanuserorganizationListType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((username)))
            
            new CkanUserOrganizationsUsernameGetValidator(username).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidgetckanuserorganizationListRequest(username) match {
                case Left(l) => success(l)
                case Right(r: Future[GetckanuserorganizationListType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { getckanuserorganizationListResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(getckanuserorganizationListResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_themesgetallType[T] extends ResultWrapper[T]
    def Voc_themesgetall401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_themesgetallType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_themesgetall401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_themesgetallType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Voc_themesgetall200(resultP: Seq[KeyValue])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = success(new Voc_themesgetallType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_themesgetall200(resultF: Future[Seq[KeyValue]])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = resultF map { resultP => (new Voc_themesgetallType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type voc_themesgetallActionRequestType       = (Unit)
    private type voc_themesgetallActionType[T]            = voc_themesgetallActionRequestType => Future[Voc_themesgetallType[T] forSome { type T }]




    val voc_themesgetallActionConstructor  = Action

def voc_themesgetallAction[T] = (f: voc_themesgetallActionType[T]) => voc_themesgetallActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_themesgetallRequest(): Either[Result, Future[Voc_themesgetallType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f(()))
            apiFirstTempResultHolder
        }

            
            

            processValidvoc_themesgetallRequest() match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_themesgetallType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_themesgetallResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_themesgetallResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_dcatsubthemesgetallType[T] extends ResultWrapper[T]
    def Voc_dcatsubthemesgetall401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_dcatsubthemesgetallType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_dcatsubthemesgetall401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_dcatsubthemesgetallType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Voc_dcatsubthemesgetall200(resultP: Seq[VocKeyValueSubtheme])(implicit writerP: String => Option[Writeable[Seq[VocKeyValueSubtheme]]]) = success(new Voc_dcatsubthemesgetallType[Seq[VocKeyValueSubtheme]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_dcatsubthemesgetall200(resultF: Future[Seq[VocKeyValueSubtheme]])(implicit writerP: String => Option[Writeable[Seq[VocKeyValueSubtheme]]]) = resultF map { resultP => (new Voc_dcatsubthemesgetallType[Seq[VocKeyValueSubtheme]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type voc_dcatsubthemesgetallActionRequestType       = (Unit)
    private type voc_dcatsubthemesgetallActionType[T]            = voc_dcatsubthemesgetallActionRequestType => Future[Voc_dcatsubthemesgetallType[T] forSome { type T }]




    val voc_dcatsubthemesgetallActionConstructor  = Action

def voc_dcatsubthemesgetallAction[T] = (f: voc_dcatsubthemesgetallActionType[T]) => voc_dcatsubthemesgetallActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_dcatsubthemesgetallRequest(): Either[Result, Future[Voc_dcatsubthemesgetallType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f(()))
            apiFirstTempResultHolder
        }

            
            

            processValidvoc_dcatsubthemesgetallRequest() match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_dcatsubthemesgetallType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_dcatsubthemesgetallResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_dcatsubthemesgetallResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_***REMOVED***2dcatsubthemeType[T] extends ResultWrapper[T]
    def Voc_***REMOVED***2dcatsubtheme401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_***REMOVED***2dcatsubthemeType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_***REMOVED***2dcatsubtheme401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_***REMOVED***2dcatsubthemeType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Voc_***REMOVED***2dcatsubtheme200(resultP: Seq[VocKeyValueSubtheme])(implicit writerP: String => Option[Writeable[Seq[VocKeyValueSubtheme]]]) = success(new Voc_***REMOVED***2dcatsubthemeType[Seq[VocKeyValueSubtheme]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_***REMOVED***2dcatsubtheme200(resultF: Future[Seq[VocKeyValueSubtheme]])(implicit writerP: String => Option[Writeable[Seq[VocKeyValueSubtheme]]]) = resultF map { resultP => (new Voc_***REMOVED***2dcatsubthemeType[Seq[VocKeyValueSubtheme]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type voc_***REMOVED***2dcatsubthemeActionRequestType       = (String, String)
    private type voc_***REMOVED***2dcatsubthemeActionType[T]            = voc_***REMOVED***2dcatsubthemeActionRequestType => Future[Voc_***REMOVED***2dcatsubthemeType[T] forSome { type T }]




    val voc_***REMOVED***2dcatsubthemeActionConstructor  = Action

def voc_***REMOVED***2dcatsubthemeAction[T] = (f: voc_***REMOVED***2dcatsubthemeActionType[T]) => (themeid: String, subthemeid: String) => voc_***REMOVED***2dcatsubthemeActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_***REMOVED***2dcatsubthemeRequest(themeid: String, subthemeid: String): Either[Result, Future[Voc_***REMOVED***2dcatsubthemeType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((themeid, subthemeid)))
            
            new VocDcatsubthemesDaf2dcatThemeidSubthemeidGetValidator(themeid, subthemeid).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidvoc_***REMOVED***2dcatsubthemeRequest(themeid, subthemeid) match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_***REMOVED***2dcatsubthemeType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_***REMOVED***2dcatsubthemeResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_***REMOVED***2dcatsubthemeResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait CreateckanorganizationType[T] extends ResultWrapper[T]
    def Createckanorganization401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new CreateckanorganizationType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Createckanorganization401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new CreateckanorganizationType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Createckanorganization200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new CreateckanorganizationType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Createckanorganization200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new CreateckanorganizationType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type createckanorganizationActionRequestType       = (Organization)
    private type createckanorganizationActionType[T]            = createckanorganizationActionRequestType => Future[CreateckanorganizationType[T] forSome { type T }]



        
        import BodyReads._
        
        val createckanorganizationParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[Organization])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val createckanorganizationActionConstructor  = Action

def createckanorganizationAction[T] = (f: createckanorganizationActionType[T]) => createckanorganizationActionConstructor.async(createckanorganizationParser) { implicit request: Request[Organization] =>

        currentRequest = request

        def processValidcreateckanorganizationRequest(organization: Organization): Either[Result, Future[CreateckanorganizationType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((organization)))
            
            new CkanCreateOrganizationPostValidator(organization).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val organization: Organization = request.body
            
            

            processValidcreateckanorganizationRequest(organization) match {
                case Left(l) => success(l)
                case Right(r: Future[CreateckanorganizationType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { createckanorganizationResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(createckanorganizationResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait UpdateckanorganizationType[T] extends ResultWrapper[T]
    def Updateckanorganization401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new UpdateckanorganizationType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Updateckanorganization401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new UpdateckanorganizationType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Updateckanorganization200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new UpdateckanorganizationType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Updateckanorganization200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new UpdateckanorganizationType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type updateckanorganizationActionRequestType       = (String, Organization)
    private type updateckanorganizationActionType[T]            = updateckanorganizationActionRequestType => Future[UpdateckanorganizationType[T] forSome { type T }]



        
        import BodyReads._
        
        val updateckanorganizationParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[Organization])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val updateckanorganizationActionConstructor  = Action

def updateckanorganizationAction[T] = (f: updateckanorganizationActionType[T]) => (org_id: String) => updateckanorganizationActionConstructor.async(updateckanorganizationParser) { implicit request: Request[Organization] =>

        currentRequest = request

        def processValidupdateckanorganizationRequest(org_id: String, organization: Organization): Either[Result, Future[UpdateckanorganizationType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((org_id, organization)))
            
            new CkanUpdateOrganizationOrg_idPutValidator(org_id, organization).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val organization: Organization = request.body
            
            

            processValidupdateckanorganizationRequest(org_id, organization) match {
                case Left(l) => success(l)
                case Right(r: Future[UpdateckanorganizationType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { updateckanorganizationResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(updateckanorganizationResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait GetckanuserType[T] extends ResultWrapper[T]
    def Getckanuser401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new GetckanuserType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Getckanuser401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new GetckanuserType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Getckanuser200(resultP: User)(implicit writerP: String => Option[Writeable[User]]) = success(new GetckanuserType[User] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Getckanuser200(resultF: Future[User])(implicit writerP: String => Option[Writeable[User]]) = resultF map { resultP => (new GetckanuserType[User] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type getckanuserActionRequestType       = (String)
    private type getckanuserActionType[T]            = getckanuserActionRequestType => Future[GetckanuserType[T] forSome { type T }]




    val getckanuserActionConstructor  = Action

def getckanuserAction[T] = (f: getckanuserActionType[T]) => (username: String) => getckanuserActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidgetckanuserRequest(username: String): Either[Result, Future[GetckanuserType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((username)))
            
            new CkanUserUsernameGetValidator(username).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidgetckanuserRequest(username) match {
                case Left(l) => success(l)
                case Right(r: Future[GetckanuserType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { getckanuserResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(getckanuserResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait CreateckanuserType[T] extends ResultWrapper[T]
    def Createckanuser401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new CreateckanuserType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Createckanuser401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new CreateckanuserType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Createckanuser200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new CreateckanuserType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Createckanuser200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new CreateckanuserType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type createckanuserActionRequestType       = (User)
    private type createckanuserActionType[T]            = createckanuserActionRequestType => Future[CreateckanuserType[T] forSome { type T }]



        
        import BodyReads._
        
        val createckanuserParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[User])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val createckanuserActionConstructor  = Action

def createckanuserAction[T] = (f: createckanuserActionType[T]) => createckanuserActionConstructor.async(createckanuserParser) { implicit request: Request[User] =>

        currentRequest = request

        def processValidcreateckanuserRequest(user: User): Either[Result, Future[CreateckanuserType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((user)))
            
            new CkanCreateUserPostValidator(user).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val user: User = request.body
            
            

            processValidcreateckanuserRequest(user) match {
                case Left(l) => success(l)
                case Right(r: Future[CreateckanuserType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { createckanuserResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(createckanuserResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait GetckandatasetbyidType[T] extends ResultWrapper[T]
    def Getckandatasetbyid401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new GetckandatasetbyidType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Getckandatasetbyid401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new GetckandatasetbyidType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Getckandatasetbyid200(resultP: Dataset)(implicit writerP: String => Option[Writeable[Dataset]]) = success(new GetckandatasetbyidType[Dataset] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Getckandatasetbyid200(resultF: Future[Dataset])(implicit writerP: String => Option[Writeable[Dataset]]) = resultF map { resultP => (new GetckandatasetbyidType[Dataset] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type getckandatasetbyidActionRequestType       = (String)
    private type getckandatasetbyidActionType[T]            = getckandatasetbyidActionRequestType => Future[GetckandatasetbyidType[T] forSome { type T }]




    val getckandatasetbyidActionConstructor  = Action

def getckandatasetbyidAction[T] = (f: getckandatasetbyidActionType[T]) => (dataset_id: String) => getckandatasetbyidActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidgetckandatasetbyidRequest(dataset_id: String): Either[Result, Future[GetckandatasetbyidType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((dataset_id)))
            
            new CkanDatasetsDataset_idGetValidator(dataset_id).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidgetckandatasetbyidRequest(dataset_id) match {
                case Left(l) => success(l)
                case Right(r: Future[GetckandatasetbyidType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { getckandatasetbyidResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(getckandatasetbyidResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_dcat2DafthemeType[T] extends ResultWrapper[T]
    def Voc_dcat2Daftheme401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_dcat2DafthemeType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_dcat2Daftheme401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_dcat2DafthemeType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Voc_dcat2Daftheme200(resultP: Seq[KeyValue])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = success(new Voc_dcat2DafthemeType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_dcat2Daftheme200(resultF: Future[Seq[KeyValue]])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = resultF map { resultP => (new Voc_dcat2DafthemeType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type voc_dcat2DafthemeActionRequestType       = (String)
    private type voc_dcat2DafthemeActionType[T]            = voc_dcat2DafthemeActionRequestType => Future[Voc_dcat2DafthemeType[T] forSome { type T }]




    val voc_dcat2DafthemeActionConstructor  = Action

def voc_dcat2DafthemeAction[T] = (f: voc_dcat2DafthemeActionType[T]) => (themeid: String) => voc_dcat2DafthemeActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_dcat2DafthemeRequest(themeid: String): Either[Result, Future[Voc_dcat2DafthemeType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((themeid)))
            
            new VocThemesDcat2***REMOVED***ThemeidGetValidator(themeid).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidvoc_dcat2DafthemeRequest(themeid) match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_dcat2DafthemeType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_dcat2DafthemeResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_dcat2DafthemeResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait PatchckanorganizationType[T] extends ResultWrapper[T]
    def Patchckanorganization401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new PatchckanorganizationType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Patchckanorganization401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new PatchckanorganizationType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Patchckanorganization200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new PatchckanorganizationType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Patchckanorganization200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new PatchckanorganizationType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type patchckanorganizationActionRequestType       = (String, Organization)
    private type patchckanorganizationActionType[T]            = patchckanorganizationActionRequestType => Future[PatchckanorganizationType[T] forSome { type T }]



        
        import BodyReads._
        
        val patchckanorganizationParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[Organization])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val patchckanorganizationActionConstructor  = Action

def patchckanorganizationAction[T] = (f: patchckanorganizationActionType[T]) => (org_id: String) => patchckanorganizationActionConstructor.async(patchckanorganizationParser) { implicit request: Request[Organization] =>

        currentRequest = request

        def processValidpatchckanorganizationRequest(org_id: String, organization: Organization): Either[Result, Future[PatchckanorganizationType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((org_id, organization)))
            
            new CkanPatchOrganizationOrg_idPutValidator(org_id, organization).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val organization: Organization = request.body
            
            

            processValidpatchckanorganizationRequest(org_id, organization) match {
                case Left(l) => success(l)
                case Right(r: Future[PatchckanorganizationType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { patchckanorganizationResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(patchckanorganizationResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait DatasetcatalogbyidType[T] extends ResultWrapper[T]
    def Datasetcatalogbyid401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new DatasetcatalogbyidType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Datasetcatalogbyid401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new DatasetcatalogbyidType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Datasetcatalogbyid200(resultP: MetaCatalog)(implicit writerP: String => Option[Writeable[MetaCatalog]]) = success(new DatasetcatalogbyidType[MetaCatalog] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Datasetcatalogbyid200(resultF: Future[MetaCatalog])(implicit writerP: String => Option[Writeable[MetaCatalog]]) = resultF map { resultP => (new DatasetcatalogbyidType[MetaCatalog] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type datasetcatalogbyidActionRequestType       = (String)
    private type datasetcatalogbyidActionType[T]            = datasetcatalogbyidActionRequestType => Future[DatasetcatalogbyidType[T] forSome { type T }]




    val datasetcatalogbyidActionConstructor  = Action

def datasetcatalogbyidAction[T] = (f: datasetcatalogbyidActionType[T]) => (catalog_id: String) => datasetcatalogbyidActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValiddatasetcatalogbyidRequest(catalog_id: String): Either[Result, Future[DatasetcatalogbyidType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((catalog_id)))
            
            new Catalog_dsGetCatalog_idGetValidator(catalog_id).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValiddatasetcatalogbyidRequest(catalog_id) match {
                case Left(l) => success(l)
                case Right(r: Future[DatasetcatalogbyidType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { datasetcatalogbyidResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(datasetcatalogbyidResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_***REMOVED***2dcatthemeType[T] extends ResultWrapper[T]
    def Voc_***REMOVED***2dcattheme200(resultP: Seq[KeyValue])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = success(new Voc_***REMOVED***2dcatthemeType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_***REMOVED***2dcattheme200(resultF: Future[Seq[KeyValue]])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = resultF map { resultP => (new Voc_***REMOVED***2dcatthemeType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    def Voc_***REMOVED***2dcattheme401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_***REMOVED***2dcatthemeType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_***REMOVED***2dcattheme401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_***REMOVED***2dcatthemeType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    

    private type voc_***REMOVED***2dcatthemeActionRequestType       = (String)
    private type voc_***REMOVED***2dcatthemeActionType[T]            = voc_***REMOVED***2dcatthemeActionRequestType => Future[Voc_***REMOVED***2dcatthemeType[T] forSome { type T }]




    val voc_***REMOVED***2dcatthemeActionConstructor  = Action

def voc_***REMOVED***2dcatthemeAction[T] = (f: voc_***REMOVED***2dcatthemeActionType[T]) => (themeid: String) => voc_***REMOVED***2dcatthemeActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_***REMOVED***2dcatthemeRequest(themeid: String): Either[Result, Future[Voc_***REMOVED***2dcatthemeType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((themeid)))
            
            new VocDcatthemesDaf2dcatThemeidGetValidator(themeid).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidvoc_***REMOVED***2dcatthemeRequest(themeid) match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_***REMOVED***2dcatthemeType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_***REMOVED***2dcatthemeResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_***REMOVED***2dcatthemeResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait Voc_dcatsubthemesgetbyidType[T] extends ResultWrapper[T]
    def Voc_dcatsubthemesgetbyid401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new Voc_dcatsubthemesgetbyidType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Voc_dcatsubthemesgetbyid401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new Voc_dcatsubthemesgetbyidType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Voc_dcatsubthemesgetbyid200(resultP: Seq[KeyValue])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = success(new Voc_dcatsubthemesgetbyidType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Voc_dcatsubthemesgetbyid200(resultF: Future[Seq[KeyValue]])(implicit writerP: String => Option[Writeable[Seq[KeyValue]]]) = resultF map { resultP => (new Voc_dcatsubthemesgetbyidType[Seq[KeyValue]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type voc_dcatsubthemesgetbyidActionRequestType       = (String)
    private type voc_dcatsubthemesgetbyidActionType[T]            = voc_dcatsubthemesgetbyidActionRequestType => Future[Voc_dcatsubthemesgetbyidType[T] forSome { type T }]




    val voc_dcatsubthemesgetbyidActionConstructor  = Action

def voc_dcatsubthemesgetbyidAction[T] = (f: voc_dcatsubthemesgetbyidActionType[T]) => (themeid: String) => voc_dcatsubthemesgetbyidActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidvoc_dcatsubthemesgetbyidRequest(themeid: String): Either[Result, Future[Voc_dcatsubthemesgetbyidType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((themeid)))
            
            new VocDcatsubthemesGetbyidThemeidGetValidator(themeid).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidvoc_dcatsubthemesgetbyidRequest(themeid) match {
                case Left(l) => success(l)
                case Right(r: Future[Voc_dcatsubthemesgetbyidType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { voc_dcatsubthemesgetbyidResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(voc_dcatsubthemesgetbyidResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait PublicdatasetcatalogbynameType[T] extends ResultWrapper[T]
    def Publicdatasetcatalogbyname401(resultP: String)(implicit writerP: String => Option[Writeable[String]]) = success(new PublicdatasetcatalogbynameType[String] { val statusCode = 401; val result = resultP; val writer = writerP })
    def Publicdatasetcatalogbyname401(resultF: Future[String])(implicit writerP: String => Option[Writeable[String]]) = resultF map { resultP => (new PublicdatasetcatalogbynameType[String] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def Publicdatasetcatalogbyname200(resultP: MetaCatalog)(implicit writerP: String => Option[Writeable[MetaCatalog]]) = success(new PublicdatasetcatalogbynameType[MetaCatalog] { val statusCode = 200; val result = resultP; val writer = writerP })
    def Publicdatasetcatalogbyname200(resultF: Future[MetaCatalog])(implicit writerP: String => Option[Writeable[MetaCatalog]]) = resultF map { resultP => (new PublicdatasetcatalogbynameType[MetaCatalog] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type publicdatasetcatalogbynameActionRequestType       = (String)
    private type publicdatasetcatalogbynameActionType[T]            = publicdatasetcatalogbynameActionRequestType => Future[PublicdatasetcatalogbynameType[T] forSome { type T }]




    val publicdatasetcatalogbynameActionConstructor  = Action

def publicdatasetcatalogbynameAction[T] = (f: publicdatasetcatalogbynameActionType[T]) => (name: String) => publicdatasetcatalogbynameActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidpublicdatasetcatalogbynameRequest(name: String): Either[Result, Future[PublicdatasetcatalogbynameType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((name)))
            
            new PublicCatalog_dsGetbynameNameGetValidator(name).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            
            

            processValidpublicdatasetcatalogbynameRequest(name) match {
                case Left(l) => success(l)
                case Right(r: Future[PublicdatasetcatalogbynameType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { publicdatasetcatalogbynameResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(publicdatasetcatalogbynameResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait GetckanorganizationListType[T] extends ResultWrapper[T]
    def GetckanorganizationList401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new GetckanorganizationListType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def GetckanorganizationList401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new GetckanorganizationListType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def GetckanorganizationList200(resultP: Seq[String])(implicit writerP: String => Option[Writeable[Seq[String]]]) = success(new GetckanorganizationListType[Seq[String]] { val statusCode = 200; val result = resultP; val writer = writerP })
    def GetckanorganizationList200(resultF: Future[Seq[String]])(implicit writerP: String => Option[Writeable[Seq[String]]]) = resultF map { resultP => (new GetckanorganizationListType[Seq[String]] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type getckanorganizationListActionRequestType       = (Unit)
    private type getckanorganizationListActionType[T]            = getckanorganizationListActionRequestType => Future[GetckanorganizationListType[T] forSome { type T }]




    val getckanorganizationListActionConstructor  = Action

def getckanorganizationListAction[T] = (f: getckanorganizationListActionType[T]) => getckanorganizationListActionConstructor.async { implicit request: Request[AnyContent] =>

        currentRequest = request

        def processValidgetckanorganizationListRequest(): Either[Result, Future[GetckanorganizationListType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f(()))
            apiFirstTempResultHolder
        }

            
            

            processValidgetckanorganizationListRequest() match {
                case Left(l) => success(l)
                case Right(r: Future[GetckanorganizationListType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { getckanorganizationListResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(getckanorganizationListResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    sealed trait StartKyloFeddType[T] extends ResultWrapper[T]
    def StartKyloFedd401(resultP: Error)(implicit writerP: String => Option[Writeable[Error]]) = success(new StartKyloFeddType[Error] { val statusCode = 401; val result = resultP; val writer = writerP })
    def StartKyloFedd401(resultF: Future[Error])(implicit writerP: String => Option[Writeable[Error]]) = resultF map { resultP => (new StartKyloFeddType[Error] { val statusCode = 401; val result = resultP; val writer = writerP }) }
    def StartKyloFedd200(resultP: Success)(implicit writerP: String => Option[Writeable[Success]]) = success(new StartKyloFeddType[Success] { val statusCode = 200; val result = resultP; val writer = writerP })
    def StartKyloFedd200(resultF: Future[Success])(implicit writerP: String => Option[Writeable[Success]]) = resultF map { resultP => (new StartKyloFeddType[Success] { val statusCode = 200; val result = resultP; val writer = writerP }) }
    

    private type startKyloFeddActionRequestType       = (String, MetaCatalog)
    private type startKyloFeddActionType[T]            = startKyloFeddActionRequestType => Future[StartKyloFeddType[T] forSome { type T }]



        
        import BodyReads._
        
        val startKyloFeddParser = parse.using { request =>
            request.contentType.map(_.toLowerCase(java.util.Locale.ENGLISH)) match {
                case Some("application/json") => play.api.mvc.BodyParsers.parse.tolerantJson.map(_.as[MetaCatalog])
                
                case other => play.api.mvc.BodyParsers.parse.error(Future.successful(UnsupportedMediaType(s"Invalid content type specified $other")))
            }
        }

    val startKyloFeddActionConstructor  = Action

def startKyloFeddAction[T] = (f: startKyloFeddActionType[T]) => (file_type: String) => startKyloFeddActionConstructor.async(startKyloFeddParser) { implicit request: Request[MetaCatalog] =>

        currentRequest = request

        def processValidstartKyloFeddRequest(file_type: String, feed: MetaCatalog): Either[Result, Future[StartKyloFeddType[_]]] = {
          lazy val apiFirstTempResultHolder = Right(f((file_type, feed)))
            
            new KyloFeedFile_typePostValidator(file_type, feed).errors match {
                case e if e.isEmpty =>
                    apiFirstTempResultHolder
                case parsingErrors: Seq[ParsingError] =>
                    import ResponseWriters.jsonTranslatedParsingErrorsContainerWrites
                    Left(BadRequest(Json.toJson(translateParsingErrors(parsingErrors))))
            }
            
          
        }

            val feed: MetaCatalog = request.body
            
            

            processValidstartKyloFeddRequest(file_type, feed) match {
                case Left(l) => success(l)
                case Right(r: Future[StartKyloFeddType[_] @unchecked]) =>
                    val providedTypes = Seq[String]("application/json")
                    val result = negotiateContent(request.acceptedTypes, providedTypes) map { startKyloFeddResponseMimeType =>
                        import ResponseWrites._
                        r.map(_.toResult(startKyloFeddResponseMimeType).getOrElse(Results.NotAcceptable))
                    }
                    result getOrElse notAcceptable
            }
            
    }

    abstract class EmptyReturn(override val statusCode: Int, headers: Seq[(String, String)]) extends ResultWrapper[Result]  with AutocompletedummyType[Result] with SearchdatasetType[Result] with GetckanorganizationbyidType[Result] with CreatedatasetcatalogExtOpenDataType[Result] with GetckandatasetListType[Result] with Voc_subthemesgetallType[Result] with DatasetcatalogsType[Result] with Voc_subthemesgetbyidType[Result] with Voc_dcat2***REMOVED***subthemeType[Result] with AddQueueCatalogType[Result] with StandardsuriType[Result] with DatasetcatalogbynameType[Result] with AutocompletedatasetType[Result] with IsPresentOnCatalogType[Result] with CreatedatasetcatalogType[Result] with TestType[Result] with VerifycredentialsType[Result] with Voc_dcatthemegetallType[Result] with CreateckandatasetType[Result] with GetckandatasetListWithResType[Result] with GetckanuserorganizationListType[Result] with Voc_themesgetallType[Result] with Voc_dcatsubthemesgetallType[Result] with Voc_***REMOVED***2dcatsubthemeType[Result] with CreateckanorganizationType[Result] with UpdateckanorganizationType[Result] with GetckanuserType[Result] with CreateckanuserType[Result] with GetckandatasetbyidType[Result] with Voc_dcat2DafthemeType[Result] with PatchckanorganizationType[Result] with DatasetcatalogbyidType[Result] with Voc_***REMOVED***2dcatthemeType[Result] with Voc_dcatsubthemesgetbyidType[Result] with PublicdatasetcatalogbynameType[Result] with GetckanorganizationListType[Result] with StartKyloFeddType[Result] { val result = Results.Status(statusCode).withHeaders(headers:_*); val writer = (x: String) => Some(new Writeable((_:Any) => emptyByteString, None)); override def toResult(mimeType: String): Option[play.api.mvc.Result] = Some(result) }
    case object NotImplementedYetSync extends ResultWrapper[Results.EmptyContent]  with AutocompletedummyType[Results.EmptyContent] with SearchdatasetType[Results.EmptyContent] with GetckanorganizationbyidType[Results.EmptyContent] with CreatedatasetcatalogExtOpenDataType[Results.EmptyContent] with GetckandatasetListType[Results.EmptyContent] with Voc_subthemesgetallType[Results.EmptyContent] with DatasetcatalogsType[Results.EmptyContent] with Voc_subthemesgetbyidType[Results.EmptyContent] with Voc_dcat2***REMOVED***subthemeType[Results.EmptyContent] with AddQueueCatalogType[Results.EmptyContent] with StandardsuriType[Results.EmptyContent] with DatasetcatalogbynameType[Results.EmptyContent] with AutocompletedatasetType[Results.EmptyContent] with IsPresentOnCatalogType[Results.EmptyContent] with CreatedatasetcatalogType[Results.EmptyContent] with TestType[Results.EmptyContent] with VerifycredentialsType[Results.EmptyContent] with Voc_dcatthemegetallType[Results.EmptyContent] with CreateckandatasetType[Results.EmptyContent] with GetckandatasetListWithResType[Results.EmptyContent] with GetckanuserorganizationListType[Results.EmptyContent] with Voc_themesgetallType[Results.EmptyContent] with Voc_dcatsubthemesgetallType[Results.EmptyContent] with Voc_***REMOVED***2dcatsubthemeType[Results.EmptyContent] with CreateckanorganizationType[Results.EmptyContent] with UpdateckanorganizationType[Results.EmptyContent] with GetckanuserType[Results.EmptyContent] with CreateckanuserType[Results.EmptyContent] with GetckandatasetbyidType[Results.EmptyContent] with Voc_dcat2DafthemeType[Results.EmptyContent] with PatchckanorganizationType[Results.EmptyContent] with DatasetcatalogbyidType[Results.EmptyContent] with Voc_***REMOVED***2dcatthemeType[Results.EmptyContent] with Voc_dcatsubthemesgetbyidType[Results.EmptyContent] with PublicdatasetcatalogbynameType[Results.EmptyContent] with GetckanorganizationListType[Results.EmptyContent] with StartKyloFeddType[Results.EmptyContent] { val statusCode = 501; val result = Results.EmptyContent(); val writer = (x: String) => Some(new DefaultWriteables{}.writeableOf_EmptyContent); override def toResult(mimeType: String): Option[play.api.mvc.Result] = Some(Results.NotImplemented) }
    lazy val NotImplementedYet = Future.successful(NotImplementedYetSync)
}
