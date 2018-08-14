package catalog_manager


    import scala.math.BigInt

    import de.zalando.play.controllers.PlayPathBindables


//noinspection ScalaStyle
package yaml {


    case class DatasetCatalog(avro: Avro, flatSchema: DatasetCatalogFlatSchema, kyloSchema: MetadataCat) 
    case class ConversionField(field_std: String, formula: String) 
    case class Extra(key: MetadataCat, value: MetadataCat) 
    case class Partitions(name: String, field: String, formula: String) 
    case class Semantic(id: String, predicate: MetadataCat, subject: MetadataCat, context: MetadataCat, id_label: MetadataCat, context_label: MetadataCat, uri_voc: MetadataCat, property_hierarchy: FieldProfileStandardization, rdf_object: MetadataCat, uri_property: MetadataCat) 
    case class StdSchema(std_uri: String, fields_conv: StdSchemaFields_conv) 
    case class ExtOpenData(resourceId: String, name: String, url: String, resourceName: String, id: String, resourceUrl: String) 
    case class Personal(ispersonal: Boolean, cat: MetadataCat) 
    case class StorageHdfs(name: String, path: MetadataCat, param: MetadataCat) 
    case class Metadata(field_profile: MetadataField_profile, semantics: MetadataSemantics, desc: MetadataCat, format_std: MetadataFormat_std, tag: FieldProfileStandardization, uniq_dim: MetadataIs_createdate, field_type: MetadataCat, is_createdate: MetadataIs_createdate, is_updatedate: MetadataIs_createdate, personal: MetadataPersonal, constr: MetadataConstr, title: MetadataCat, required: MetadataRequired, cat: MetadataCat) 
    case class Acl(groupName: MetadataCat, groupType: MetadataCat, permission: MetadataCat) 
    case class Constr(`type`: MetadataCat, param: MetadataCat) 
    case class User(name: MetadataCat, email: MetadataCat, fullname: MetadataCat, about: MetadataCat, password: MetadataCat) 
    case class VocKeyValueSubtheme(key: String, value: String, keyTheme: String, valueTheme: MetadataCat) 
    case class Tag(name: MetadataCat, state: MetadataCat, vocabulary_id: MetadataCat, display_name: MetadataCat, id: MetadataCat) 
    case class StdUris(label: MetadataCat, value: MetadataCat) 
    case class Success(message: String, fields: MetadataCat) 
    case class Avro(name: String, `type`: String, namespace: String, aliases: FieldProfileStandardization, fields: AvroFields) 
    case class Group(name: MetadataCat, description: MetadataCat, display_name: MetadataCat, image_display_url: MetadataCat, id: MetadataCat, title: MetadataCat) 
    case class Credentials(username: MetadataCat, password: MetadataCat) 
    case class UserOrg(name: MetadataCat, capacity: MetadataCat) 
    case class GeoRef(lat: Double, lon: Double) 
    case class Operational(dataset_type: String, read_type: String, is_std: Boolean, logical_uri: String, theme: String, subtheme: String, group_own: String, georef: OperationalGeoref, storage_info: OperationalStorage_info, ext_opendata: OperationalExt_opendata, physical_uri: MetadataCat, ingestion_pipeline: FieldProfileStandardization, input_src: InputSrc, acl: OperationalAcl, group_access: OperationalGroup_access, std_schema: OperationalStd_schema, file_type: MetadataCat, partitions: DatasetProcPartitions, dataset_proc: OperationalDataset_proc) 
    case class SourceDafDataset(dataset_uri: FieldProfileStandardization, sql: MetadataCat, param: MetadataCat) 
    case class Field(name: String, `type`: String) 
    case class SourceSftp(name: String, url: MetadataCat, username: MetadataCat, param: MetadataCat, password: MetadataCat) 
    case class Relationship(subject: MetadataCat, `object`: MetadataCat, `type`: MetadataCat, comment: MetadataCat) 
    case class StorageInfo(hbase: StorageInfoHbase, mongo: StorageInfoMongo, kudu: StorageInfoKudu, textdb: StorageInfoMongo, hdfs: StorageInfoMongo) 
    case class Token(token: MetadataCat) 
    case class DatasetProc(dataset_type: String, cron: String, read_type: String, merge_strategy: String, partitions: DatasetProcPartitions) 
    case class AutocompRes(match_field: MetadataCat, match_displayed: MetadataCat, name: MetadataCat, title: MetadataCat) 
    case class Dataset(name: String, notes: String, organization: DatasetOrganization, author: MetadataCat, license_id: MetadataCat, relationships_as_object: DatasetRelationships_as_subject, holder_identifier: MetadataCat, identifier: MetadataCat, tags: DatasetTags, groups: DatasetGroups, modified: MetadataCat, privatex: MetadataIs_createdate, alternate_identifier: MetadataCat, relationships_as_subject: DatasetRelationships_as_subject, holder_name: MetadataCat, publisher_identifier: MetadataCat, resources: DatasetResources, frequency: MetadataCat, title: MetadataCat, owner_org: MetadataCat, theme: MetadataCat, publisher_name: MetadataCat) 
    case class MetaCatalog(dataschema: DatasetCatalog, operational: Operational, dcatapit: Dataset) 
    case class InputSrc(sftp: InputSrcSftp, srv_pull: InputSrcSrv_push, srv_push: InputSrcSrv_push, ***REMOVED***_dataset: InputSrcDaf_dataset) 
    case class KeyValue(key: String, value: String) 
    case class Lang(eng: MetadataCat, ita: MetadataCat) 
    case class ConversionSchema(fields_conv: StdSchemaFields_conv, fields_custom: ConversionSchemaFields_custom) 
    case class SourceSrvPush(name: String, url: String, access_token: MetadataCat, username: MetadataCat, param: MetadataCat, password: MetadataCat) 
    case class FormatStd(name: String, param: MetadataCat) 
    case class StorageKudu(name: String, table_name: MetadataCat, param: MetadataCat) 
    case class Error(message: String, code: MetadataRequired, fields: MetadataCat) 
    case class Resource(mimetype: MetadataCat, format: MetadataCat, name: MetadataCat, package_id: MetadataCat, datastore_active: MetadataIs_createdate, size: ResourceSize, state: MetadataCat, url: MetadataCat, description: MetadataCat, resource_type: MetadataCat, distribution_format: MetadataCat, last_modified: MetadataCat, hash: MetadataCat, id: MetadataCat, cache_url: MetadataCat, position: ResourceSize, mimetype_inner: MetadataCat, cache_last_updated: MetadataCat, revision_id: MetadataCat, created: MetadataCat) 
    case class StorageHbase(name: String, metric: MetadataCat, tags: FieldProfileStandardization, param: MetadataCat) 
    case class FieldProfile(is_index: MetadataIs_createdate, is_profile: MetadataIs_createdate, validation: FieldProfileStandardization, standardization: FieldProfileStandardization) 
    case class GroupAccess(name: String, role: String) 
    case class Organization(name: String, image_url: MetadataCat, email: MetadataCat, state: MetadataCat, description: MetadataCat, users: OrganizationUsers, is_organization: MetadataIs_createdate, id: MetadataCat, title: MetadataCat, `type`: MetadataCat, revision_id: MetadataCat, approval_status: MetadataCat, created: MetadataCat) 
    case class FlatSchema(name: String, `type`: String, metadata: FlatSchemaMetadata) 
    case class CustomField(name: String) 


    import play.api.libs.json._
    import play.api.libs.functional.syntax._
    import de.zalando.play.controllers.MissingDefaultReads
    object BodyReads extends MissingDefaultReads {
        implicit val UserReads: Reads[User] = (
            (JsPath \ "name").readNullable[String] and (JsPath \ "email").readNullable[String] and (JsPath \ "fullname").readNullable[String] and (JsPath \ "about").readNullable[String] and (JsPath \ "password").readNullable[String]
        )(User.apply _)
        implicit val CredentialsReads: Reads[Credentials] = (
            (JsPath \ "username").readNullable[String] and (JsPath \ "password").readNullable[String]
        )(Credentials.apply _)
        implicit val ResourceReads: Reads[Resource] = (
            (JsPath \ "mimetype").readNullable[String] and (JsPath \ "format").readNullable[String] and (JsPath \ "name").readNullable[String] and (JsPath \ "package_id").readNullable[String] and (JsPath \ "datastore_active").readNullable[Boolean] and (JsPath \ "size").readNullable[BigInt] and (JsPath \ "state").readNullable[String] and (JsPath \ "url").readNullable[String] and (JsPath \ "description").readNullable[String] and (JsPath \ "resource_type").readNullable[String] and (JsPath \ "distribution_format").readNullable[String] and (JsPath \ "last_modified").readNullable[String] and (JsPath \ "hash").readNullable[String] and (JsPath \ "id").readNullable[String] and (JsPath \ "cache_url").readNullable[String] and (JsPath \ "position").readNullable[BigInt] and (JsPath \ "mimetype_inner").readNullable[String] and (JsPath \ "cache_last_updated").readNullable[String] and (JsPath \ "revision_id").readNullable[String] and (JsPath \ "created").readNullable[String]
        )(Resource.apply _)
        implicit val GroupReads: Reads[Group] = (
            (JsPath \ "name").readNullable[String] and (JsPath \ "description").readNullable[String] and (JsPath \ "display_name").readNullable[String] and (JsPath \ "image_display_url").readNullable[String] and (JsPath \ "id").readNullable[String] and (JsPath \ "title").readNullable[String]
        )(Group.apply _)
        implicit val TagReads: Reads[Tag] = (
            (JsPath \ "name").readNullable[String] and (JsPath \ "state").readNullable[String] and (JsPath \ "vocabulary_id").readNullable[String] and (JsPath \ "display_name").readNullable[String] and (JsPath \ "id").readNullable[String]
        )(Tag.apply _)
        implicit val RelationshipReads: Reads[Relationship] = (
            (JsPath \ "subject").readNullable[String] and (JsPath \ "`object`").readNullable[String] and (JsPath \ "`type`").readNullable[String] and (JsPath \ "comment").readNullable[String]
        )(Relationship.apply _)
        implicit val UserOrgReads: Reads[UserOrg] = (
            (JsPath \ "name").readNullable[String] and (JsPath \ "capacity").readNullable[String]
        )(UserOrg.apply _)
        implicit val OrganizationReads: Reads[Organization] = (
            (JsPath \ "name").read[String] and (JsPath \ "image_url").readNullable[String] and (JsPath \ "email").readNullable[String] and (JsPath \ "state").readNullable[String] and (JsPath \ "description").readNullable[String] and (JsPath \ "users").readNullable[OrganizationUsersOpt] and (JsPath \ "is_organization").readNullable[Boolean] and (JsPath \ "id").readNullable[String] and (JsPath \ "title").readNullable[String] and (JsPath \ "`type`").readNullable[String] and (JsPath \ "revision_id").readNullable[String] and (JsPath \ "approval_status").readNullable[String] and (JsPath \ "created").readNullable[String]
        )(Organization.apply _)
        implicit val DatasetReads: Reads[Dataset] = (
            (JsPath \ "name").read[String] and (JsPath \ "notes").read[String] and (JsPath \ "organization").readNullable[Organization] and (JsPath \ "author").readNullable[String] and (JsPath \ "license_id").readNullable[String] and (JsPath \ "relationships_as_object").readNullable[DatasetRelationships_as_subjectOpt] and (JsPath \ "holder_identifier").readNullable[String] and (JsPath \ "identifier").readNullable[String] and (JsPath \ "tags").readNullable[DatasetTagsOpt] and (JsPath \ "groups").readNullable[DatasetGroupsOpt] and (JsPath \ "modified").readNullable[String] and (JsPath \ "privatex").readNullable[Boolean] and (JsPath \ "alternate_identifier").readNullable[String] and (JsPath \ "relationships_as_subject").readNullable[DatasetRelationships_as_subjectOpt] and (JsPath \ "holder_name").readNullable[String] and (JsPath \ "publisher_identifier").readNullable[String] and (JsPath \ "resources").readNullable[DatasetResourcesOpt] and (JsPath \ "frequency").readNullable[String] and (JsPath \ "title").readNullable[String] and (JsPath \ "owner_org").readNullable[String] and (JsPath \ "theme").readNullable[String] and (JsPath \ "publisher_name").readNullable[String]
        )(Dataset.apply _)
        implicit val DatasetProcReads: Reads[DatasetProc] = (
            (JsPath \ "dataset_type").read[String] and (JsPath \ "cron").read[String] and (JsPath \ "read_type").read[String] and (JsPath \ "merge_strategy").read[String] and (JsPath \ "partitions").readNullable[Partitions]
        )(DatasetProc.apply _)
        implicit val PartitionsReads: Reads[Partitions] = (
            (JsPath \ "name").read[String] and (JsPath \ "field").read[String] and (JsPath \ "formula").read[String]
        )(Partitions.apply _)
        implicit val ConversionFieldReads: Reads[ConversionField] = (
            (JsPath \ "field_std").read[String] and (JsPath \ "formula").read[String]
        )(ConversionField.apply _)
        implicit val StdSchemaReads: Reads[StdSchema] = (
            (JsPath \ "std_uri").read[String] and (JsPath \ "fields_conv").read[StdSchemaFields_conv]
        )(StdSchema.apply _)
        implicit val GroupAccessReads: Reads[GroupAccess] = (
            (JsPath \ "name").read[String] and (JsPath \ "role").read[String]
        )(GroupAccess.apply _)
        implicit val AclReads: Reads[Acl] = (
            (JsPath \ "groupName").readNullable[String] and (JsPath \ "groupType").readNullable[String] and (JsPath \ "permission").readNullable[String]
        )(Acl.apply _)
        implicit val SourceDafDatasetReads: Reads[SourceDafDataset] = (
            (JsPath \ "dataset_uri").readNullable[MetadataTagOpt] and (JsPath \ "sql").readNullable[String] and (JsPath \ "param").readNullable[String]
        )(SourceDafDataset.apply _)
        implicit val SourceSrvPushReads: Reads[SourceSrvPush] = (
            (JsPath \ "name").read[String] and (JsPath \ "url").read[String] and (JsPath \ "access_token").readNullable[String] and (JsPath \ "username").readNullable[String] and (JsPath \ "param").readNullable[String] and (JsPath \ "password").readNullable[String]
        )(SourceSrvPush.apply _)
        implicit val SourceSftpReads: Reads[SourceSftp] = (
            (JsPath \ "name").read[String] and (JsPath \ "url").readNullable[String] and (JsPath \ "username").readNullable[String] and (JsPath \ "param").readNullable[String] and (JsPath \ "password").readNullable[String]
        )(SourceSftp.apply _)
        implicit val InputSrcReads: Reads[InputSrc] = (
            (JsPath \ "sftp").readNullable[InputSrcSftpOpt] and (JsPath \ "srv_pull").readNullable[InputSrcSrv_pullOpt] and (JsPath \ "srv_push").readNullable[InputSrcSrv_pullOpt] and (JsPath \ "***REMOVED***_dataset").readNullable[InputSrcDaf_datasetOpt]
        )(InputSrc.apply _)
        implicit val ExtOpenDataReads: Reads[ExtOpenData] = (
            (JsPath \ "resourceId").read[String] and (JsPath \ "name").read[String] and (JsPath \ "url").read[String] and (JsPath \ "resourceName").read[String] and (JsPath \ "id").read[String] and (JsPath \ "resourceUrl").read[String]
        )(ExtOpenData.apply _)
        implicit val StorageKuduReads: Reads[StorageKudu] = (
            (JsPath \ "name").read[String] and (JsPath \ "table_name").readNullable[String] and (JsPath \ "param").readNullable[String]
        )(StorageKudu.apply _)
        implicit val StorageHdfsReads: Reads[StorageHdfs] = (
            (JsPath \ "name").read[String] and (JsPath \ "path").readNullable[String] and (JsPath \ "param").readNullable[String]
        )(StorageHdfs.apply _)
        implicit val StorageHbaseReads: Reads[StorageHbase] = (
            (JsPath \ "name").read[String] and (JsPath \ "metric").readNullable[String] and (JsPath \ "tags").readNullable[MetadataTagOpt] and (JsPath \ "param").readNullable[String]
        )(StorageHbase.apply _)
        implicit val StorageInfoReads: Reads[StorageInfo] = (
            (JsPath \ "hbase").readNullable[StorageHbase] and (JsPath \ "mongo").readNullable[StorageHdfs] and (JsPath \ "kudu").readNullable[StorageKudu] and (JsPath \ "textdb").readNullable[StorageHdfs] and (JsPath \ "hdfs").readNullable[StorageHdfs]
        )(StorageInfo.apply _)
        implicit val GeoRefReads: Reads[GeoRef] = (
            (JsPath \ "lat").read[Double] and (JsPath \ "lon").read[Double]
        )(GeoRef.apply _)
        implicit val OperationalReads: Reads[Operational] = (
            (JsPath \ "dataset_type").read[String] and (JsPath \ "read_type").read[String] and (JsPath \ "is_std").read[Boolean] and (JsPath \ "logical_uri").read[String] and (JsPath \ "theme").read[String] and (JsPath \ "subtheme").read[String] and (JsPath \ "group_own").read[String] and (JsPath \ "georef").readNullable[OperationalGeorefOpt] and (JsPath \ "storage_info").readNullable[StorageInfo] and (JsPath \ "ext_opendata").readNullable[ExtOpenData] and (JsPath \ "physical_uri").readNullable[String] and (JsPath \ "ingestion_pipeline").readNullable[MetadataTagOpt] and (JsPath \ "input_src").read[InputSrc] and (JsPath \ "acl").readNullable[OperationalAclOpt] and (JsPath \ "group_access").readNullable[OperationalGroup_accessOpt] and (JsPath \ "std_schema").readNullable[StdSchema] and (JsPath \ "file_type").readNullable[String] and (JsPath \ "partitions").readNullable[Partitions] and (JsPath \ "dataset_proc").readNullable[DatasetProc]
        )(Operational.apply _)
        implicit val ConstrReads: Reads[Constr] = (
            (JsPath \ "`type`").readNullable[String] and (JsPath \ "param").readNullable[String]
        )(Constr.apply _)
        implicit val PersonalReads: Reads[Personal] = (
            (JsPath \ "ispersonal").read[Boolean] and (JsPath \ "cat").readNullable[String]
        )(Personal.apply _)
        implicit val FormatStdReads: Reads[FormatStd] = (
            (JsPath \ "name").read[String] and (JsPath \ "param").readNullable[String]
        )(FormatStd.apply _)
        implicit val SemanticReads: Reads[Semantic] = (
            (JsPath \ "id").read[String] and (JsPath \ "predicate").readNullable[String] and (JsPath \ "subject").readNullable[String] and (JsPath \ "context").readNullable[String] and (JsPath \ "id_label").readNullable[String] and (JsPath \ "context_label").readNullable[String] and (JsPath \ "uri_voc").readNullable[String] and (JsPath \ "property_hierarchy").readNullable[MetadataTagOpt] and (JsPath \ "rdf_object").readNullable[String] and (JsPath \ "uri_property").readNullable[String]
        )(Semantic.apply _)
        implicit val FieldProfileReads: Reads[FieldProfile] = (
            (JsPath \ "is_index").readNullable[Boolean] and (JsPath \ "is_profile").readNullable[Boolean] and (JsPath \ "validation").readNullable[MetadataTagOpt] and (JsPath \ "standardization").readNullable[MetadataTagOpt]
        )(FieldProfile.apply _)
        implicit val MetadataReads: Reads[Metadata] = (
            (JsPath \ "field_profile").readNullable[FieldProfile] and (JsPath \ "semantics").readNullable[Semantic] and (JsPath \ "desc").readNullable[String] and (JsPath \ "format_std").readNullable[FormatStd] and (JsPath \ "tag").readNullable[MetadataTagOpt] and (JsPath \ "uniq_dim").readNullable[Boolean] and (JsPath \ "field_type").readNullable[String] and (JsPath \ "is_createdate").readNullable[Boolean] and (JsPath \ "is_updatedate").readNullable[Boolean] and (JsPath \ "personal").readNullable[Personal] and (JsPath \ "constr").readNullable[MetadataConstrOpt] and (JsPath \ "title").readNullable[String] and (JsPath \ "required").readNullable[Int] and (JsPath \ "cat").readNullable[String]
        )(Metadata.apply _)
        implicit val FlatSchemaReads: Reads[FlatSchema] = (
            (JsPath \ "name").read[String] and (JsPath \ "`type`").read[String] and (JsPath \ "metadata").readNullable[Metadata]
        )(FlatSchema.apply _)
        implicit val FieldReads: Reads[Field] = (
            (JsPath \ "name").read[String] and (JsPath \ "`type`").read[String]
        )(Field.apply _)
        implicit val AvroReads: Reads[Avro] = (
            (JsPath \ "name").read[String] and (JsPath \ "`type`").read[String] and (JsPath \ "namespace").read[String] and (JsPath \ "aliases").readNullable[MetadataTagOpt] and (JsPath \ "fields").readNullable[AvroFieldsOpt]
        )(Avro.apply _)
        implicit val DatasetCatalogReads: Reads[DatasetCatalog] = (
            (JsPath \ "avro").read[Avro] and (JsPath \ "flatSchema").read[DatasetCatalogFlatSchema] and (JsPath \ "kyloSchema").readNullable[String]
        )(DatasetCatalog.apply _)
        implicit val MetaCatalogReads: Reads[MetaCatalog] = (
            (JsPath \ "dataschema").read[DatasetCatalog] and (JsPath \ "operational").read[Operational] and (JsPath \ "dcatapit").read[Dataset]
        )(MetaCatalog.apply _)
        implicit val AutocompResReads: Reads[AutocompRes] = (
            (JsPath \ "match_field").readNullable[String] and (JsPath \ "match_displayed").readNullable[String] and (JsPath \ "name").readNullable[String] and (JsPath \ "title").readNullable[String]
        )(AutocompRes.apply _)
    }

    import play.api.libs.json._
    import play.api.libs.functional.syntax._
    import de.zalando.play.controllers.MissingDefaultWrites
    object ResponseWrites extends MissingDefaultWrites {
    implicit val UserWrites: Writes[User] = new Writes[User] {
        def writes(ss: User) =
          Json.obj(
            "name" -> ss.name, 
            "email" -> ss.email, 
            "fullname" -> ss.fullname, 
            "about" -> ss.about, 
            "password" -> ss.password
          )
        }
    implicit val TokenWrites: Writes[Token] = new Writes[Token] {
        def writes(ss: Token) =
          Json.obj(
            "token" -> ss.token
          )
        }
    implicit val AutocompResWrites: Writes[AutocompRes] = new Writes[AutocompRes] {
        def writes(ss: AutocompRes) =
          Json.obj(
            "match_field" -> ss.match_field, 
            "match_displayed" -> ss.match_displayed, 
            "name" -> ss.name, 
            "title" -> ss.title
          )
        }
    implicit val StdUrisWrites: Writes[StdUris] = new Writes[StdUris] {
        def writes(ss: StdUris) =
          Json.obj(
            "label" -> ss.label, 
            "value" -> ss.value
          )
        }
    implicit val KeyValueWrites: Writes[KeyValue] = new Writes[KeyValue] {
        def writes(ss: KeyValue) =
          Json.obj(
            "key" -> ss.key, 
            "value" -> ss.value
          )
        }
    implicit val DatasetProcWrites: Writes[DatasetProc] = new Writes[DatasetProc] {
        def writes(ss: DatasetProc) =
          Json.obj(
            "dataset_type" -> ss.dataset_type, 
            "cron" -> ss.cron, 
            "read_type" -> ss.read_type, 
            "merge_strategy" -> ss.merge_strategy, 
            "partitions" -> ss.partitions
          )
        }
    implicit val PartitionsWrites: Writes[Partitions] = new Writes[Partitions] {
        def writes(ss: Partitions) =
          Json.obj(
            "name" -> ss.name, 
            "field" -> ss.field, 
            "formula" -> ss.formula
          )
        }
    implicit val ConversionFieldWrites: Writes[ConversionField] = new Writes[ConversionField] {
        def writes(ss: ConversionField) =
          Json.obj(
            "field_std" -> ss.field_std, 
            "formula" -> ss.formula
          )
        }
    implicit val StdSchemaWrites: Writes[StdSchema] = new Writes[StdSchema] {
        def writes(ss: StdSchema) =
          Json.obj(
            "std_uri" -> ss.std_uri, 
            "fields_conv" -> ss.fields_conv
          )
        }
    implicit val GroupAccessWrites: Writes[GroupAccess] = new Writes[GroupAccess] {
        def writes(ss: GroupAccess) =
          Json.obj(
            "name" -> ss.name, 
            "role" -> ss.role
          )
        }
    implicit val AclWrites: Writes[Acl] = new Writes[Acl] {
        def writes(ss: Acl) =
          Json.obj(
            "groupName" -> ss.groupName, 
            "groupType" -> ss.groupType, 
            "permission" -> ss.permission
          )
        }
    implicit val SourceDafDatasetWrites: Writes[SourceDafDataset] = new Writes[SourceDafDataset] {
        def writes(ss: SourceDafDataset) =
          Json.obj(
            "dataset_uri" -> ss.dataset_uri, 
            "sql" -> ss.sql, 
            "param" -> ss.param
          )
        }
    implicit val SourceSrvPushWrites: Writes[SourceSrvPush] = new Writes[SourceSrvPush] {
        def writes(ss: SourceSrvPush) =
          Json.obj(
            "name" -> ss.name, 
            "url" -> ss.url, 
            "access_token" -> ss.access_token, 
            "username" -> ss.username, 
            "param" -> ss.param, 
            "password" -> ss.password
          )
        }
    implicit val SourceSftpWrites: Writes[SourceSftp] = new Writes[SourceSftp] {
        def writes(ss: SourceSftp) =
          Json.obj(
            "name" -> ss.name, 
            "url" -> ss.url, 
            "username" -> ss.username, 
            "param" -> ss.param, 
            "password" -> ss.password
          )
        }
    implicit val InputSrcWrites: Writes[InputSrc] = new Writes[InputSrc] {
        def writes(ss: InputSrc) =
          Json.obj(
            "sftp" -> ss.sftp, 
            "srv_pull" -> ss.srv_pull, 
            "srv_push" -> ss.srv_push, 
            "***REMOVED***_dataset" -> ss.***REMOVED***_dataset
          )
        }
    implicit val ExtOpenDataWrites: Writes[ExtOpenData] = new Writes[ExtOpenData] {
        def writes(ss: ExtOpenData) =
          Json.obj(
            "resourceId" -> ss.resourceId, 
            "name" -> ss.name, 
            "url" -> ss.url, 
            "resourceName" -> ss.resourceName, 
            "id" -> ss.id, 
            "resourceUrl" -> ss.resourceUrl
          )
        }
    implicit val StorageKuduWrites: Writes[StorageKudu] = new Writes[StorageKudu] {
        def writes(ss: StorageKudu) =
          Json.obj(
            "name" -> ss.name, 
            "table_name" -> ss.table_name, 
            "param" -> ss.param
          )
        }
    implicit val StorageHdfsWrites: Writes[StorageHdfs] = new Writes[StorageHdfs] {
        def writes(ss: StorageHdfs) =
          Json.obj(
            "name" -> ss.name, 
            "path" -> ss.path, 
            "param" -> ss.param
          )
        }
    implicit val StorageHbaseWrites: Writes[StorageHbase] = new Writes[StorageHbase] {
        def writes(ss: StorageHbase) =
          Json.obj(
            "name" -> ss.name, 
            "metric" -> ss.metric, 
            "tags" -> ss.tags, 
            "param" -> ss.param
          )
        }
    implicit val StorageInfoWrites: Writes[StorageInfo] = new Writes[StorageInfo] {
        def writes(ss: StorageInfo) =
          Json.obj(
            "hbase" -> ss.hbase, 
            "mongo" -> ss.mongo, 
            "kudu" -> ss.kudu, 
            "textdb" -> ss.textdb, 
            "hdfs" -> ss.hdfs
          )
        }
    implicit val GeoRefWrites: Writes[GeoRef] = new Writes[GeoRef] {
        def writes(ss: GeoRef) =
          Json.obj(
            "lat" -> ss.lat, 
            "lon" -> ss.lon
          )
        }
    implicit val OperationalWrites: Writes[Operational] = new Writes[Operational] {
        def writes(ss: Operational) =
          Json.obj(
            "dataset_type" -> ss.dataset_type, 
            "read_type" -> ss.read_type, 
            "is_std" -> ss.is_std, 
            "logical_uri" -> ss.logical_uri, 
            "theme" -> ss.theme, 
            "subtheme" -> ss.subtheme, 
            "group_own" -> ss.group_own, 
            "georef" -> ss.georef, 
            "storage_info" -> ss.storage_info, 
            "ext_opendata" -> ss.ext_opendata, 
            "physical_uri" -> ss.physical_uri, 
            "ingestion_pipeline" -> ss.ingestion_pipeline, 
            "input_src" -> ss.input_src, 
            "acl" -> ss.acl, 
            "group_access" -> ss.group_access, 
            "std_schema" -> ss.std_schema, 
            "file_type" -> ss.file_type, 
            "partitions" -> ss.partitions, 
            "dataset_proc" -> ss.dataset_proc
          )
        }
    implicit val ConstrWrites: Writes[Constr] = new Writes[Constr] {
        def writes(ss: Constr) =
          Json.obj(
            "`type`" -> ss.`type`, 
            "param" -> ss.param
          )
        }
    implicit val PersonalWrites: Writes[Personal] = new Writes[Personal] {
        def writes(ss: Personal) =
          Json.obj(
            "ispersonal" -> ss.ispersonal, 
            "cat" -> ss.cat
          )
        }
    implicit val FormatStdWrites: Writes[FormatStd] = new Writes[FormatStd] {
        def writes(ss: FormatStd) =
          Json.obj(
            "name" -> ss.name, 
            "param" -> ss.param
          )
        }
    implicit val SemanticWrites: Writes[Semantic] = new Writes[Semantic] {
        def writes(ss: Semantic) =
          Json.obj(
            "id" -> ss.id, 
            "predicate" -> ss.predicate, 
            "subject" -> ss.subject, 
            "context" -> ss.context, 
            "id_label" -> ss.id_label, 
            "context_label" -> ss.context_label, 
            "uri_voc" -> ss.uri_voc, 
            "property_hierarchy" -> ss.property_hierarchy, 
            "rdf_object" -> ss.rdf_object, 
            "uri_property" -> ss.uri_property
          )
        }
    implicit val FieldProfileWrites: Writes[FieldProfile] = new Writes[FieldProfile] {
        def writes(ss: FieldProfile) =
          Json.obj(
            "is_index" -> ss.is_index, 
            "is_profile" -> ss.is_profile, 
            "validation" -> ss.validation, 
            "standardization" -> ss.standardization
          )
        }
    implicit val MetadataWrites: Writes[Metadata] = new Writes[Metadata] {
        def writes(ss: Metadata) =
          Json.obj(
            "field_profile" -> ss.field_profile, 
            "semantics" -> ss.semantics, 
            "desc" -> ss.desc, 
            "format_std" -> ss.format_std, 
            "tag" -> ss.tag, 
            "uniq_dim" -> ss.uniq_dim, 
            "field_type" -> ss.field_type, 
            "is_createdate" -> ss.is_createdate, 
            "is_updatedate" -> ss.is_updatedate, 
            "personal" -> ss.personal, 
            "constr" -> ss.constr, 
            "title" -> ss.title, 
            "required" -> ss.required, 
            "cat" -> ss.cat
          )
        }
    implicit val FlatSchemaWrites: Writes[FlatSchema] = new Writes[FlatSchema] {
        def writes(ss: FlatSchema) =
          Json.obj(
            "name" -> ss.name, 
            "`type`" -> ss.`type`, 
            "metadata" -> ss.metadata
          )
        }
    implicit val FieldWrites: Writes[Field] = new Writes[Field] {
        def writes(ss: Field) =
          Json.obj(
            "name" -> ss.name, 
            "`type`" -> ss.`type`
          )
        }
    implicit val AvroWrites: Writes[Avro] = new Writes[Avro] {
        def writes(ss: Avro) =
          Json.obj(
            "name" -> ss.name, 
            "`type`" -> ss.`type`, 
            "namespace" -> ss.namespace, 
            "aliases" -> ss.aliases, 
            "fields" -> ss.fields
          )
        }
    implicit val DatasetCatalogWrites: Writes[DatasetCatalog] = new Writes[DatasetCatalog] {
        def writes(ss: DatasetCatalog) =
          Json.obj(
            "avro" -> ss.avro, 
            "flatSchema" -> ss.flatSchema, 
            "kyloSchema" -> ss.kyloSchema
          )
        }
    implicit val MetaCatalogWrites: Writes[MetaCatalog] = new Writes[MetaCatalog] {
        def writes(ss: MetaCatalog) =
          Json.obj(
            "dataschema" -> ss.dataschema, 
            "operational" -> ss.operational, 
            "dcatapit" -> ss.dcatapit
          )
        }
    implicit val VocKeyValueSubthemeWrites: Writes[VocKeyValueSubtheme] = new Writes[VocKeyValueSubtheme] {
        def writes(ss: VocKeyValueSubtheme) =
          Json.obj(
            "key" -> ss.key, 
            "value" -> ss.value, 
            "keyTheme" -> ss.keyTheme, 
            "valueTheme" -> ss.valueTheme
          )
        }
    implicit val ResourceWrites: Writes[Resource] = new Writes[Resource] {
        def writes(ss: Resource) =
          Json.obj(
            "mimetype" -> ss.mimetype, 
            "format" -> ss.format, 
            "name" -> ss.name, 
            "package_id" -> ss.package_id, 
            "datastore_active" -> ss.datastore_active, 
            "size" -> ss.size, 
            "state" -> ss.state, 
            "url" -> ss.url, 
            "description" -> ss.description, 
            "resource_type" -> ss.resource_type, 
            "distribution_format" -> ss.distribution_format, 
            "last_modified" -> ss.last_modified, 
            "hash" -> ss.hash, 
            "id" -> ss.id, 
            "cache_url" -> ss.cache_url, 
            "position" -> ss.position, 
            "mimetype_inner" -> ss.mimetype_inner, 
            "cache_last_updated" -> ss.cache_last_updated, 
            "revision_id" -> ss.revision_id, 
            "created" -> ss.created
          )
        }
    implicit val GroupWrites: Writes[Group] = new Writes[Group] {
        def writes(ss: Group) =
          Json.obj(
            "name" -> ss.name, 
            "description" -> ss.description, 
            "display_name" -> ss.display_name, 
            "image_display_url" -> ss.image_display_url, 
            "id" -> ss.id, 
            "title" -> ss.title
          )
        }
    implicit val TagWrites: Writes[Tag] = new Writes[Tag] {
        def writes(ss: Tag) =
          Json.obj(
            "name" -> ss.name, 
            "state" -> ss.state, 
            "vocabulary_id" -> ss.vocabulary_id, 
            "display_name" -> ss.display_name, 
            "id" -> ss.id
          )
        }
    implicit val RelationshipWrites: Writes[Relationship] = new Writes[Relationship] {
        def writes(ss: Relationship) =
          Json.obj(
            "subject" -> ss.subject, 
            "`object`" -> ss.`object`, 
            "`type`" -> ss.`type`, 
            "comment" -> ss.comment
          )
        }
    implicit val UserOrgWrites: Writes[UserOrg] = new Writes[UserOrg] {
        def writes(ss: UserOrg) =
          Json.obj(
            "name" -> ss.name, 
            "capacity" -> ss.capacity
          )
        }
    implicit val OrganizationWrites: Writes[Organization] = new Writes[Organization] {
        def writes(ss: Organization) =
          Json.obj(
            "name" -> ss.name, 
            "image_url" -> ss.image_url, 
            "email" -> ss.email, 
            "state" -> ss.state, 
            "description" -> ss.description, 
            "users" -> ss.users, 
            "is_organization" -> ss.is_organization, 
            "id" -> ss.id, 
            "title" -> ss.title, 
            "`type`" -> ss.`type`, 
            "revision_id" -> ss.revision_id, 
            "approval_status" -> ss.approval_status, 
            "created" -> ss.created
          )
        }
    implicit val DatasetWrites: Writes[Dataset] = new Writes[Dataset] {
        def writes(ss: Dataset) =
          Json.obj(
            "name" -> ss.name, 
            "notes" -> ss.notes, 
            "organization" -> ss.organization, 
            "author" -> ss.author, 
            "license_id" -> ss.license_id, 
            "relationships_as_object" -> ss.relationships_as_object, 
            "holder_identifier" -> ss.holder_identifier, 
            "identifier" -> ss.identifier, 
            "tags" -> ss.tags, 
            "groups" -> ss.groups, 
            "modified" -> ss.modified, 
            "privatex" -> ss.privatex, 
            "alternate_identifier" -> ss.alternate_identifier, 
            "relationships_as_subject" -> ss.relationships_as_subject, 
            "holder_name" -> ss.holder_name, 
            "publisher_identifier" -> ss.publisher_identifier, 
            "resources" -> ss.resources, 
            "frequency" -> ss.frequency, 
            "title" -> ss.title, 
            "owner_org" -> ss.owner_org, 
            "theme" -> ss.theme, 
            "publisher_name" -> ss.publisher_name
          )
        }
    implicit val SuccessWrites: Writes[Success] = new Writes[Success] {
        def writes(ss: Success) =
          Json.obj(
            "message" -> ss.message, 
            "fields" -> ss.fields
          )
        }
    implicit val ErrorWrites: Writes[Error] = new Writes[Error] {
        def writes(ss: Error) =
          Json.obj(
            "message" -> ss.message, 
            "code" -> ss.code, 
            "fields" -> ss.fields
          )
        }
    }
}

// should be defined after the package because of the ***REMOVED***://issues.scala-lang.org/browse/SI-9922

//noinspection ScalaStyle
package object yaml {

    type StorageInfoMongo = Option[StorageHdfs]
    type MetadataCat = Option[String]
    type FieldProfileStandardization = Option[MetadataTagOpt]
    type MetadataIs_createdate = Option[Boolean]
    type MetadataConstr = Option[MetadataConstrOpt]
    type MetadataTagOpt = Seq[String]
    type MetadataFormat_std = Option[FormatStd]
    type DatasetCatalogFlatSchema = Seq[FlatSchema]
    type Dataset_catalogsGetResponses200 = Seq[MetaCatalog]
    type Dataset_catalogsGetLimit = Option[Int]
    type MetadataRequired = Option[Int]
    type MetadataSemantics = Option[Semantic]
    type DatasetResourcesOpt = Seq[Resource]
    type OperationalAclOpt = Seq[Acl]
    type InputSrcSrv_push = Option[InputSrcSrv_pullOpt]
    type CkanSearchDatasetGetResponses200 = Seq[Dataset]
    type InputSrcSftpOpt = Seq[SourceSftp]
    type MetadataPersonal = Option[Personal]
    type OperationalDataset_proc = Option[DatasetProc]
    type InputSrcSftp = Option[InputSrcSftpOpt]
    type VocDcatthemesDaf2dcatThemeidGetResponses200 = Seq[KeyValue]
    type OrganizationUsers = Option[OrganizationUsersOpt]
    type DatasetOrganization = Option[Organization]
    type DatasetProcPartitions = Option[Partitions]
    type OperationalGroup_accessOpt = Seq[GroupAccess]
    type ResourceSize = Option[BigInt]
    type OperationalGroup_access = Option[OperationalGroup_accessOpt]
    type VocSubthemesGetallGetResponses200 = Seq[VocKeyValueSubtheme]
    type DatasetTags = Option[DatasetTagsOpt]
    type AvroFieldsOpt = Seq[Field]
    type CkanUserOrganizationsUsernameGetResponses200 = Seq[Organization]
    type MetadataField_profile = Option[FieldProfile]
    type AvroFields = Option[AvroFieldsOpt]
    type FlatSchemaMetadata = Option[Metadata]
    type DatasetResources = Option[DatasetResourcesOpt]
    type InputSrcDaf_dataset = Option[InputSrcDaf_datasetOpt]
    type ConversionSchemaFields_custom = Option[ConversionSchemaFields_customOpt]
    type InputSrcDaf_datasetOpt = Seq[SourceDafDataset]
    type StorageInfoHbase = Option[StorageHbase]
    type DatasetGroups = Option[DatasetGroupsOpt]
    type DatasetRelationships_as_subject = Option[DatasetRelationships_as_subjectOpt]
    type OrganizationUsersOpt = Seq[UserOrg]
    type StdSchemaFields_conv = Seq[ConversionField]
    type OperationalGeoref = Option[OperationalGeorefOpt]
    type ConversionSchemaFields_customOpt = Seq[CustomField]
    type MetadataConstrOpt = Seq[Constr]
    type InputSrcSrv_pullOpt = Seq[SourceSrvPush]
    type DatasetTagsOpt = Seq[Tag]
    type Dataset_catalogsStandard_urisGetResponses200 = Seq[StdUris]
    type StorageInfoKudu = Option[StorageKudu]
    type DatasetRelationships_as_subjectOpt = Seq[Relationship]
    type OperationalAcl = Option[OperationalAclOpt]
    type CkanAutocompleteDatasetGetResponses200 = Seq[AutocompRes]
    type OperationalGeorefOpt = Seq[GeoRef]
    type OperationalExt_opendata = Option[ExtOpenData]
    type DatasetGroupsOpt = Seq[Group]
    type OperationalStorage_info = Option[StorageInfo]
    type OperationalStd_schema = Option[StdSchema]


import play.api.mvc.{QueryStringBindable, PathBindable}

    implicit val bindable_BigIntQuery = PlayPathBindables.queryBindableBigInt
    implicit val bindable_OptionIntQuery: QueryStringBindable[Option[Int]] = PlayPathBindables.createOptionQueryBindable[Int]
    implicit val bindable_OptionStringQuery: QueryStringBindable[Option[String]] = PlayPathBindables.createOptionQueryBindable[String]
    implicit val bindable_OptionBigIntQuery: QueryStringBindable[Option[BigInt]] = PlayPathBindables.createOptionQueryBindable[BigInt]

}