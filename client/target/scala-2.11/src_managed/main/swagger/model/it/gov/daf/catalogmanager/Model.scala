package it.gov.***REMOVED***.catalogmanager

// Generic Key/Value pair object
case class KeyValue(key: String, value: String)
// Generic Key/Value pair object
case class VocKeyValueSubtheme(key: String, value: String, keyTheme: String, valueTheme: Option[String])
case class MetaCatalog(dataschema: DatasetCatalog, operational: Operational, dcatapit: Dataset)
case class DatasetCatalog(avro: Avro, flatSchema: List[FlatSchema], kyloSchema: Option[String])
case class Avro(namespace: String, `type`: String, name: String, aliases: Option[List[String]], fields: Option[List[Field]])
case class Field(name: String, `type`: String)
case class FlatSchema(name: String, `type`: String, metadata: Option[Metadata])
case class Metadata(title: Option[String], desc: Option[String], field_type: Option[String], required: Option[Int], uniq_dim: Option[Boolean], is_createdate: Option[Boolean], is_updatedate: Option[Boolean], cat: Option[String], tag: Option[List[String]], semantics: Option[Semantic], constr: Option[List[Constr]], personal: Option[Personal], format_std: Option[FormatStd], field_profile: Option[FieldProfile])
case class Lang(eng: Option[String], ita: Option[String])
case class Semantic(id: String, id_label: Option[String], context: Option[String], context_label: Option[String], subject: Option[String], predicate: Option[String], rdf_object: Option[String], uri_voc: Option[String], uri_property: Option[String], property_hierarchy: Option[List[String]])
case class Constr(`type`: Option[String], param: Option[String])
case class Personal(ispersonal: Boolean, cat: Option[String])
case class FormatStd(name: String, param: Option[String])
case class FieldProfile(is_index: Option[Boolean], is_profile: Option[Boolean], validation: Option[List[String]], standardization: Option[List[String]])
case class Operational(theme: String, subtheme: String, logical_uri: String, physical_uri: Option[String], is_std: Boolean, group_own: String, group_access: Option[List[GroupAccess]], std_schema: Option[StdSchema], read_type: String, georef: Option[List[GeoRef]], input_src: InputSrc, ingestion_pipeline: Option[List[String]], storage_info: Option[StorageInfo], dataset_type: String, file_type: Option[String], partitions: Option[Partitions], dataset_proc: Option[DatasetProc], ext_opendata: Option[ExtOpenData], acl: Option[List[Acl]])
// Type associated with group_access
case class ExtOpenData(id: String, name: String, url: String, resourceId: String, resourceName: String, resourceUrl: String)
case class Acl(groupName: Option[String], groupType: Option[String], permission: Option[String])
// Type associated with group_access
case class GroupAccess(name: String, role: String)
case class InputSrc(sftp: Option[List[SourceSftp]], srv_pull: Option[List[SourceSrvPull]], srv_push: Option[List[SourceSrvPush]], ***REMOVED***_dataset: Option[List[SourceDafDataset]])
// Info for the ingestion source of type SFTP
case class SourceSftp(name: String, url: Option[String], username: Option[String], password: Option[String], param: Option[String])
// Info for the ingestion source of type pulling a service, that is we make a call to the specified url
case class SourceSrvPull(name: String, url: String, username: Option[String], password: Option[String], access_token: Option[String], param: Option[String])
// Info for the ingestion source of type pushing a service, that is we expose a service that is continuously listening
case class SourceSrvPush(name: String, url: String, username: Option[String], password: Option[String], access_token: Option[String], param: Option[String])
// It contains info to build the dataset based on already existing dataset in DAF.
case class SourceDafDataset(dataset_uri: Option[List[String]], sql: Option[String], param: Option[String])
case class StorageInfo(hdfs: Option[StorageHdfs], kudu: Option[StorageKudu], hbase: Option[StorageHbase], textdb: Option[StorageTextdb], mongo: Option[StorageMongo])
// If compiled, will tell the ingestion manager to store the data into HDFS.
case class StorageHdfs(name: String, path: Option[String], param: Option[String])
// If compiled, will tell the ingestion manager to store the data into Kudu.
case class StorageKudu(name: String, table_name: Option[String], param: Option[String])
// If compiled, will tell the ingestion manager to store the data into Hbase.
case class StorageHbase(name: String, metric: Option[String], tags: Option[List[String]], param: Option[String])
// If compiled, will tell the ingestion manager to store the data into Textdb.
case class StorageTextdb(name: String, path: Option[String], param: Option[String])
// If compiled, will tell the ingestion manager to store the data into Kudu.
case class StorageMongo(name: String, path: Option[String], param: Option[String])
// it contains info about how the dataset has been partitioned, if applicable.
case class Partitions(name: String, field: String, formula: String)
// It contains procedural info that helps to manage the ingestion and egestion of the dataset.
case class DatasetProc(dataset_type: String, read_type: String, partitions: Option[Partitions], merge_strategy: String, cron: String)
case class GeoRef(lat: Double, lon: Double)
case class StdSchema(std_uri: String, fields_conv: List[ConversionField])
case class ConversionSchema(fields_conv: List[ConversionField], fields_custom: Option[List[CustomField]])
case class ConversionField(field_std: String, formula: String)
case class CustomField(name: String)
case class Error(code: Option[Int], message: String, fields: Option[String])
case class Success(message: String, fields: Option[String])
case class Dataset(alternate_identifier: Option[String], author: Option[String], frequency: Option[String], groups: Option[List[Group]], holder_identifier: Option[String], holder_name: Option[String], identifier: Option[String], license_id: Option[String], modified: Option[String], name: String, notes: String, organization: Option[Organization], owner_org: Option[String], privatex: Option[Boolean], publisher_identifier: Option[String], publisher_name: Option[String], relationships_as_object: Option[List[Relationship]], relationships_as_subject: Option[List[Relationship]], resources: Option[List[Resource]], tags: Option[List[Tag]], theme: Option[String], title: Option[String])
case class Group(display_name: Option[String], description: Option[String], image_display_url: Option[String], title: Option[String], id: Option[String], name: Option[String])
case class Organization(approval_status: Option[String], created: Option[String], description: Option[String], email: Option[String], id: Option[String], image_url: Option[String], is_organization: Option[Boolean], name: String, revision_id: Option[String], state: Option[String], title: Option[String], `type`: Option[String], users: Option[List[UserOrg]])
case class Relationship(subject: Option[String], `object`: Option[String], `type`: Option[String], comment: Option[String])
case class Resource(cache_last_updated: Option[String], cache_url: Option[String], created: Option[String], datastore_active: Option[Boolean], description: Option[String], distribution_format: Option[String], format: Option[String], hash: Option[String], id: Option[String], last_modified: Option[String], mimetype: Option[String], mimetype_inner: Option[String], name: Option[String], package_id: Option[String], position: Option[Int], resource_type: Option[String], revision_id: Option[String], size: Option[Int], state: Option[String], url: Option[String])
case class Tag(display_name: Option[String], id: Option[String], name: Option[String], state: Option[String], vocabulary_id: Option[String])
case class Extra(key: Option[String], value: Option[String])
case class StdUris(label: Option[String], value: Option[String])
case class Token(token: Option[String])
case class User(name: Option[String], email: Option[String], password: Option[String], fullname: Option[String], about: Option[String])
case class AutocompRes(match_field: Option[String], match_displayed: Option[String], name: Option[String], title: Option[String])
case class UserOrg(name: Option[String], capacity: Option[String])
case class Credentials(username: Option[String], password: Option[String])