package catalog_manager.yaml
import play.api.mvc.{Action, Controller}
import play.api.data.validation.Constraint
import de.zalando.play.controllers._
import PlayBodyParsing._
import PlayValidations._

import scala.math.BigInt
// ----- constraints and wrapper validations -----
class OrganizationNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Organization⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class OrganizationNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Organization⌿name"
    override val validators = Seq(new OrganizationNameConstraints(instance))
}
class MetadataCatOptConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Metadata⌿cat⌿Opt"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class MetadataCatOptValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿cat⌿Opt"
    override val validators = Seq(new MetadataCatOptConstraints(instance))
}
class MetadataIs_createdateOptConstraints(override val instance: Boolean) extends ValidationBase[Boolean] {
    override val reference = "⌿definitions⌿Metadata⌿is_createdate⌿Opt"
    override def constraints: Seq[Constraint[Boolean]] =
        Seq()
}
class MetadataIs_createdateOptValidator(instance: Boolean) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿is_createdate⌿Opt"
    override val validators = Seq(new MetadataIs_createdateOptConstraints(instance))
}
class VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetSubthemeidConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/voc/subthemes/dcat2***REMOVED***/{themeid}/{subthemeid}⌿get⌿subthemeid"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetSubthemeidValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/voc/subthemes/dcat2***REMOVED***/{themeid}/{subthemeid}⌿get⌿subthemeid"
    override val validators = Seq(new VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetSubthemeidConstraints(instance))
}
class PublicCatalog_dsGetbynameNameGetNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/public/catalog-ds/getbyname/{name}⌿get⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class PublicCatalog_dsGetbynameNameGetNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/public/catalog-ds/getbyname/{name}⌿get⌿name"
    override val validators = Seq(new PublicCatalog_dsGetbynameNameGetNameConstraints(instance))
}
class VocSubthemesGetbyidThemeidGetThemeidConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/voc/subthemes/getbyid/{themeid}⌿get⌿themeid"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class VocSubthemesGetbyidThemeidGetThemeidValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/voc/subthemes/getbyid/{themeid}⌿get⌿themeid"
    override val validators = Seq(new VocSubthemesGetbyidThemeidGetThemeidConstraints(instance))
}
class ResourceSizeOptConstraints(override val instance: BigInt) extends ValidationBase[BigInt] {
    override val reference = "⌿definitions⌿Resource⌿size⌿Opt"
    override def constraints: Seq[Constraint[BigInt]] =
        Seq()
}
class ResourceSizeOptValidator(instance: BigInt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Resource⌿size⌿Opt"
    override val validators = Seq(new ResourceSizeOptConstraints(instance))
}
class Dataset_catalogsGetLimitOptConstraints(override val instance: Int) extends ValidationBase[Int] {
    override val reference = "⌿paths⌿/dataset-catalogs⌿get⌿limit⌿Opt"
    override def constraints: Seq[Constraint[Int]] =
        Seq(max(500.toInt, false), min(1.toInt, false))
}
class Dataset_catalogsGetLimitOptValidator(instance: Int) extends RecursiveValidator {
    override val reference = "⌿paths⌿/dataset-catalogs⌿get⌿limit⌿Opt"
    override val validators = Seq(new Dataset_catalogsGetLimitOptConstraints(instance))
}
class VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetThemeidConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/voc/subthemes/dcat2***REMOVED***/{themeid}/{subthemeid}⌿get⌿themeid"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetThemeidValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/voc/subthemes/dcat2***REMOVED***/{themeid}/{subthemeid}⌿get⌿themeid"
    override val validators = Seq(new VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetThemeidConstraints(instance))
}
class MetadataRequiredOptConstraints(override val instance: Int) extends ValidationBase[Int] {
    override val reference = "⌿definitions⌿Metadata⌿required⌿Opt"
    override def constraints: Seq[Constraint[Int]] =
        Seq()
}
class MetadataRequiredOptValidator(instance: Int) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿required⌿Opt"
    override val validators = Seq(new MetadataRequiredOptConstraints(instance))
}
class CkanOrganizationOrg_idGetOrg_idConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/ckan/organization/{org_id}⌿get⌿org_id"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class CkanOrganizationOrg_idGetOrg_idValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/ckan/organization/{org_id}⌿get⌿org_id"
    override val validators = Seq(new CkanOrganizationOrg_idGetOrg_idConstraints(instance))
}
class CkanUpdateOrganizationOrg_idPutOrg_idConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/ckan/update/organization/{org_id}⌿put⌿org_id"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class CkanUpdateOrganizationOrg_idPutOrg_idValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/ckan/update/organization/{org_id}⌿put⌿org_id"
    override val validators = Seq(new CkanUpdateOrganizationOrg_idPutOrg_idConstraints(instance))
}
class CkanUserUsernameGetUsernameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/ckan/user/{username}⌿get⌿username"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class CkanUserUsernameGetUsernameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/ckan/user/{username}⌿get⌿username"
    override val validators = Seq(new CkanUserUsernameGetUsernameConstraints(instance))
}
class AvroNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Avro⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class AvroNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Avro⌿name"
    override val validators = Seq(new AvroNameConstraints(instance))
}
class AvroTypeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Avro⌿type"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class AvroTypeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Avro⌿type"
    override val validators = Seq(new AvroTypeConstraints(instance))
}
class AvroNamespaceConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Avro⌿namespace"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class AvroNamespaceValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Avro⌿namespace"
    override val validators = Seq(new AvroNamespaceConstraints(instance))
}
class MetadataTagOptArrConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Metadata⌿tag⌿Opt⌿Arr"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class MetadataTagOptArrValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿tag⌿Opt⌿Arr"
    override val validators = Seq(new MetadataTagOptArrConstraints(instance))
}
class FieldNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Field⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class FieldNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Field⌿name"
    override val validators = Seq(new FieldNameConstraints(instance))
}
class FieldTypeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Field⌿type"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class FieldTypeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Field⌿type"
    override val validators = Seq(new FieldTypeConstraints(instance))
}
class FlatSchemaNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿FlatSchema⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class FlatSchemaNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿FlatSchema⌿name"
    override val validators = Seq(new FlatSchemaNameConstraints(instance))
}
class FlatSchemaTypeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿FlatSchema⌿type"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class FlatSchemaTypeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿FlatSchema⌿type"
    override val validators = Seq(new FlatSchemaTypeConstraints(instance))
}
class SemanticIdConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Semantic⌿id"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class SemanticIdValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Semantic⌿id"
    override val validators = Seq(new SemanticIdConstraints(instance))
}
class FormatStdNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿FormatStd⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class FormatStdNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿FormatStd⌿name"
    override val validators = Seq(new FormatStdNameConstraints(instance))
}
class PersonalIspersonalConstraints(override val instance: Boolean) extends ValidationBase[Boolean] {
    override val reference = "⌿definitions⌿Personal⌿ispersonal"
    override def constraints: Seq[Constraint[Boolean]] =
        Seq()
}
class PersonalIspersonalValidator(instance: Boolean) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Personal⌿ispersonal"
    override val validators = Seq(new PersonalIspersonalConstraints(instance))
}
class OperationalDataset_typeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Operational⌿dataset_type"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class OperationalDataset_typeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿dataset_type"
    override val validators = Seq(new OperationalDataset_typeConstraints(instance))
}
class OperationalRead_typeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Operational⌿read_type"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class OperationalRead_typeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿read_type"
    override val validators = Seq(new OperationalRead_typeConstraints(instance))
}
class OperationalIs_stdConstraints(override val instance: Boolean) extends ValidationBase[Boolean] {
    override val reference = "⌿definitions⌿Operational⌿is_std"
    override def constraints: Seq[Constraint[Boolean]] =
        Seq()
}
class OperationalIs_stdValidator(instance: Boolean) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿is_std"
    override val validators = Seq(new OperationalIs_stdConstraints(instance))
}
class OperationalLogical_uriConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Operational⌿logical_uri"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class OperationalLogical_uriValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿logical_uri"
    override val validators = Seq(new OperationalLogical_uriConstraints(instance))
}
class OperationalThemeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Operational⌿theme"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class OperationalThemeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿theme"
    override val validators = Seq(new OperationalThemeConstraints(instance))
}
class OperationalSubthemeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Operational⌿subtheme"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class OperationalSubthemeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿subtheme"
    override val validators = Seq(new OperationalSubthemeConstraints(instance))
}
class OperationalGroup_ownConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Operational⌿group_own"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class OperationalGroup_ownValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿group_own"
    override val validators = Seq(new OperationalGroup_ownConstraints(instance))
}
class GeoRefLatConstraints(override val instance: Double) extends ValidationBase[Double] {
    override val reference = "⌿definitions⌿GeoRef⌿lat"
    override def constraints: Seq[Constraint[Double]] =
        Seq()
}
class GeoRefLatValidator(instance: Double) extends RecursiveValidator {
    override val reference = "⌿definitions⌿GeoRef⌿lat"
    override val validators = Seq(new GeoRefLatConstraints(instance))
}
class GeoRefLonConstraints(override val instance: Double) extends ValidationBase[Double] {
    override val reference = "⌿definitions⌿GeoRef⌿lon"
    override def constraints: Seq[Constraint[Double]] =
        Seq()
}
class GeoRefLonValidator(instance: Double) extends RecursiveValidator {
    override val reference = "⌿definitions⌿GeoRef⌿lon"
    override val validators = Seq(new GeoRefLonConstraints(instance))
}
class StorageHbaseNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿StorageHbase⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class StorageHbaseNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageHbase⌿name"
    override val validators = Seq(new StorageHbaseNameConstraints(instance))
}
class StorageHdfsNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿StorageHdfs⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class StorageHdfsNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageHdfs⌿name"
    override val validators = Seq(new StorageHdfsNameConstraints(instance))
}
class StorageKuduNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿StorageKudu⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class StorageKuduNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageKudu⌿name"
    override val validators = Seq(new StorageKuduNameConstraints(instance))
}
class ExtOpenDataResourceIdConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿ExtOpenData⌿resourceId"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class ExtOpenDataResourceIdValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ExtOpenData⌿resourceId"
    override val validators = Seq(new ExtOpenDataResourceIdConstraints(instance))
}
class ExtOpenDataNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿ExtOpenData⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class ExtOpenDataNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ExtOpenData⌿name"
    override val validators = Seq(new ExtOpenDataNameConstraints(instance))
}
class ExtOpenDataUrlConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿ExtOpenData⌿url"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class ExtOpenDataUrlValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ExtOpenData⌿url"
    override val validators = Seq(new ExtOpenDataUrlConstraints(instance))
}
class ExtOpenDataResourceNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿ExtOpenData⌿resourceName"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class ExtOpenDataResourceNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ExtOpenData⌿resourceName"
    override val validators = Seq(new ExtOpenDataResourceNameConstraints(instance))
}
class ExtOpenDataIdConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿ExtOpenData⌿id"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class ExtOpenDataIdValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ExtOpenData⌿id"
    override val validators = Seq(new ExtOpenDataIdConstraints(instance))
}
class ExtOpenDataResourceUrlConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿ExtOpenData⌿resourceUrl"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class ExtOpenDataResourceUrlValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ExtOpenData⌿resourceUrl"
    override val validators = Seq(new ExtOpenDataResourceUrlConstraints(instance))
}
class SourceSftpNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿SourceSftp⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class SourceSftpNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿SourceSftp⌿name"
    override val validators = Seq(new SourceSftpNameConstraints(instance))
}
class SourceSrvPushNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿SourceSrvPush⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class SourceSrvPushNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿SourceSrvPush⌿name"
    override val validators = Seq(new SourceSrvPushNameConstraints(instance))
}
class SourceSrvPushUrlConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿SourceSrvPush⌿url"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class SourceSrvPushUrlValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿SourceSrvPush⌿url"
    override val validators = Seq(new SourceSrvPushUrlConstraints(instance))
}
class GroupAccessNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿GroupAccess⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class GroupAccessNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿GroupAccess⌿name"
    override val validators = Seq(new GroupAccessNameConstraints(instance))
}
class GroupAccessRoleConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿GroupAccess⌿role"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class GroupAccessRoleValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿GroupAccess⌿role"
    override val validators = Seq(new GroupAccessRoleConstraints(instance))
}
class StdSchemaStd_uriConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿StdSchema⌿std_uri"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class StdSchemaStd_uriValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StdSchema⌿std_uri"
    override val validators = Seq(new StdSchemaStd_uriConstraints(instance))
}
class ConversionFieldField_stdConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿ConversionField⌿field_std"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class ConversionFieldField_stdValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ConversionField⌿field_std"
    override val validators = Seq(new ConversionFieldField_stdConstraints(instance))
}
class ConversionFieldFormulaConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿ConversionField⌿formula"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class ConversionFieldFormulaValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ConversionField⌿formula"
    override val validators = Seq(new ConversionFieldFormulaConstraints(instance))
}
class PartitionsNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Partitions⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class PartitionsNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Partitions⌿name"
    override val validators = Seq(new PartitionsNameConstraints(instance))
}
class PartitionsFieldConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Partitions⌿field"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class PartitionsFieldValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Partitions⌿field"
    override val validators = Seq(new PartitionsFieldConstraints(instance))
}
class PartitionsFormulaConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Partitions⌿formula"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class PartitionsFormulaValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Partitions⌿formula"
    override val validators = Seq(new PartitionsFormulaConstraints(instance))
}
class DatasetProcDataset_typeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿DatasetProc⌿dataset_type"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class DatasetProcDataset_typeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿DatasetProc⌿dataset_type"
    override val validators = Seq(new DatasetProcDataset_typeConstraints(instance))
}
class DatasetProcCronConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿DatasetProc⌿cron"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class DatasetProcCronValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿DatasetProc⌿cron"
    override val validators = Seq(new DatasetProcCronConstraints(instance))
}
class DatasetProcRead_typeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿DatasetProc⌿read_type"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class DatasetProcRead_typeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿DatasetProc⌿read_type"
    override val validators = Seq(new DatasetProcRead_typeConstraints(instance))
}
class DatasetProcMerge_strategyConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿DatasetProc⌿merge_strategy"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class DatasetProcMerge_strategyValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿DatasetProc⌿merge_strategy"
    override val validators = Seq(new DatasetProcMerge_strategyConstraints(instance))
}
class DatasetNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Dataset⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class DatasetNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿name"
    override val validators = Seq(new DatasetNameConstraints(instance))
}
class DatasetNotesConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿definitions⌿Dataset⌿notes"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class DatasetNotesValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿notes"
    override val validators = Seq(new DatasetNotesConstraints(instance))
}
class VocDcatsubthemesGetbyidThemeidGetThemeidConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/voc/dcatsubthemes/getbyid/{themeid}⌿get⌿themeid"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class VocDcatsubthemesGetbyidThemeidGetThemeidValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/voc/dcatsubthemes/getbyid/{themeid}⌿get⌿themeid"
    override val validators = Seq(new VocDcatsubthemesGetbyidThemeidGetThemeidConstraints(instance))
}
class VocDcatsubthemesDaf2dcatThemeidSubthemeidGetSubthemeidConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/voc/dcatsubthemes/***REMOVED***2dcat/{themeid}/{subthemeid}⌿get⌿subthemeid"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class VocDcatsubthemesDaf2dcatThemeidSubthemeidGetSubthemeidValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/voc/dcatsubthemes/***REMOVED***2dcat/{themeid}/{subthemeid}⌿get⌿subthemeid"
    override val validators = Seq(new VocDcatsubthemesDaf2dcatThemeidSubthemeidGetSubthemeidConstraints(instance))
}
class CkanUserOrganizationsUsernameGetUsernameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/ckan/userOrganizations/{username}⌿get⌿username"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class CkanUserOrganizationsUsernameGetUsernameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/ckan/userOrganizations/{username}⌿get⌿username"
    override val validators = Seq(new CkanUserOrganizationsUsernameGetUsernameConstraints(instance))
}
class CkanPatchOrganizationOrg_idPutOrg_idConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/ckan/patch/organization/{org_id}⌿put⌿org_id"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class CkanPatchOrganizationOrg_idPutOrg_idValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/ckan/patch/organization/{org_id}⌿put⌿org_id"
    override val validators = Seq(new CkanPatchOrganizationOrg_idPutOrg_idConstraints(instance))
}
class VocThemesDcat2***REMOVED***ThemeidGetThemeidConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/voc/themes/dcat2***REMOVED***/{themeid}⌿get⌿themeid"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class VocThemesDcat2***REMOVED***ThemeidGetThemeidValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/voc/themes/dcat2***REMOVED***/{themeid}⌿get⌿themeid"
    override val validators = Seq(new VocThemesDcat2***REMOVED***ThemeidGetThemeidConstraints(instance))
}
class KyloFeedFile_typePostFile_typeConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/kylo/feed/{file_type}⌿post⌿file_type"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class KyloFeedFile_typePostFile_typeValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/kylo/feed/{file_type}⌿post⌿file_type"
    override val validators = Seq(new KyloFeedFile_typePostFile_typeConstraints(instance))
}
class Catalog_dsIs_presentNameGetNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/catalog-ds/is_present/{name}⌿get⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class Catalog_dsIs_presentNameGetNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/catalog-ds/is_present/{name}⌿get⌿name"
    override val validators = Seq(new Catalog_dsIs_presentNameGetNameConstraints(instance))
}
class VocDcatthemesDaf2dcatThemeidGetThemeidConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/voc/dcatthemes/***REMOVED***2dcat/{themeid}⌿get⌿themeid"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class VocDcatthemesDaf2dcatThemeidGetThemeidValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/voc/dcatthemes/***REMOVED***2dcat/{themeid}⌿get⌿themeid"
    override val validators = Seq(new VocDcatthemesDaf2dcatThemeidGetThemeidConstraints(instance))
}
class CkanDatasetsDataset_idGetDataset_idConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/ckan/datasets/{dataset_id}⌿get⌿dataset_id"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class CkanDatasetsDataset_idGetDataset_idValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/ckan/datasets/{dataset_id}⌿get⌿dataset_id"
    override val validators = Seq(new CkanDatasetsDataset_idGetDataset_idConstraints(instance))
}
class Catalog_dsGetbynameNameGetNameConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/catalog-ds/getbyname/{name}⌿get⌿name"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class Catalog_dsGetbynameNameGetNameValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/catalog-ds/getbyname/{name}⌿get⌿name"
    override val validators = Seq(new Catalog_dsGetbynameNameGetNameConstraints(instance))
}
class VocDcatsubthemesDaf2dcatThemeidSubthemeidGetThemeidConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/voc/dcatsubthemes/***REMOVED***2dcat/{themeid}/{subthemeid}⌿get⌿themeid"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class VocDcatsubthemesDaf2dcatThemeidSubthemeidGetThemeidValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/voc/dcatsubthemes/***REMOVED***2dcat/{themeid}/{subthemeid}⌿get⌿themeid"
    override val validators = Seq(new VocDcatsubthemesDaf2dcatThemeidSubthemeidGetThemeidConstraints(instance))
}
class Catalog_dsGetCatalog_idGetCatalog_idConstraints(override val instance: String) extends ValidationBase[String] {
    override val reference = "⌿paths⌿/catalog-ds/get/{catalog_id}⌿get⌿catalog_id"
    override def constraints: Seq[Constraint[String]] =
        Seq()
}
class Catalog_dsGetCatalog_idGetCatalog_idValidator(instance: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿/catalog-ds/get/{catalog_id}⌿get⌿catalog_id"
    override val validators = Seq(new Catalog_dsGetCatalog_idGetCatalog_idConstraints(instance))
}
// ----- complex type validators -----
class OrganizationValidator(instance: Organization) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Organization"
    override val validators = Seq(
        new OrganizationNameValidator(instance.name), 
        new MetadataCatValidator(instance.image_url), 
        new MetadataCatValidator(instance.email), 
        new MetadataCatValidator(instance.state), 
        new MetadataCatValidator(instance.description), 
        new OrganizationUsersValidator(instance.users), 
        new MetadataIs_createdateValidator(instance.is_organization), 
        new MetadataCatValidator(instance.id), 
        new MetadataCatValidator(instance.title), 
        new MetadataCatValidator(instance.`type`), 
        new MetadataCatValidator(instance.revision_id), 
        new MetadataCatValidator(instance.approval_status), 
        new MetadataCatValidator(instance.created)
    )
}
class UserOrgValidator(instance: UserOrg) extends RecursiveValidator {
    override val reference = "⌿definitions⌿UserOrg"
    override val validators = Seq(
        new MetadataCatValidator(instance.name), 
        new MetadataCatValidator(instance.capacity)
    )
}
class CredentialsValidator(instance: Credentials) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Credentials"
    override val validators = Seq(
        new MetadataCatValidator(instance.username), 
        new MetadataCatValidator(instance.password)
    )
}
class MetaCatalogValidator(instance: MetaCatalog) extends RecursiveValidator {
    override val reference = "⌿definitions⌿MetaCatalog"
    override val validators = Seq(
        new DatasetCatalogValidator(instance.dataschema), 
        new OperationalValidator(instance.operational), 
        new DatasetValidator(instance.dcatapit)
    )
}
class DatasetCatalogValidator(instance: DatasetCatalog) extends RecursiveValidator {
    override val reference = "⌿definitions⌿DatasetCatalog"
    override val validators = Seq(
        new AvroValidator(instance.avro), 
        new DatasetCatalogFlatSchemaValidator(instance.flatSchema), 
        new MetadataCatValidator(instance.kyloSchema)
    )
}
class AvroValidator(instance: Avro) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Avro"
    override val validators = Seq(
        new AvroNameValidator(instance.name), 
        new AvroTypeValidator(instance.`type`), 
        new AvroNamespaceValidator(instance.namespace), 
        new FieldProfileStandardizationValidator(instance.aliases), 
        new AvroFieldsValidator(instance.fields)
    )
}
class FieldValidator(instance: Field) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Field"
    override val validators = Seq(
        new FieldNameValidator(instance.name), 
        new FieldTypeValidator(instance.`type`)
    )
}
class FlatSchemaValidator(instance: FlatSchema) extends RecursiveValidator {
    override val reference = "⌿definitions⌿FlatSchema"
    override val validators = Seq(
        new FlatSchemaNameValidator(instance.name), 
        new FlatSchemaTypeValidator(instance.`type`), 
        new FlatSchemaMetadataValidator(instance.metadata)
    )
}
class MetadataValidator(instance: Metadata) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata"
    override val validators = Seq(
        new MetadataField_profileValidator(instance.field_profile), 
        new MetadataSemanticsValidator(instance.semantics), 
        new MetadataCatValidator(instance.desc), 
        new MetadataFormat_stdValidator(instance.format_std), 
        new FieldProfileStandardizationValidator(instance.tag), 
        new MetadataIs_createdateValidator(instance.uniq_dim), 
        new MetadataCatValidator(instance.field_type), 
        new MetadataIs_createdateValidator(instance.is_createdate), 
        new MetadataIs_createdateValidator(instance.is_updatedate), 
        new MetadataPersonalValidator(instance.personal), 
        new MetadataConstrValidator(instance.constr), 
        new MetadataCatValidator(instance.title), 
        new MetadataRequiredValidator(instance.required), 
        new MetadataCatValidator(instance.cat)
    )
}
class FieldProfileValidator(instance: FieldProfile) extends RecursiveValidator {
    override val reference = "⌿definitions⌿FieldProfile"
    override val validators = Seq(
        new MetadataIs_createdateValidator(instance.is_index), 
        new MetadataIs_createdateValidator(instance.is_profile), 
        new FieldProfileStandardizationValidator(instance.validation), 
        new FieldProfileStandardizationValidator(instance.standardization)
    )
}
class SemanticValidator(instance: Semantic) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Semantic"
    override val validators = Seq(
        new SemanticIdValidator(instance.id), 
        new MetadataCatValidator(instance.predicate), 
        new MetadataCatValidator(instance.subject), 
        new MetadataCatValidator(instance.context), 
        new MetadataCatValidator(instance.id_label), 
        new MetadataCatValidator(instance.context_label), 
        new MetadataCatValidator(instance.uri_voc), 
        new FieldProfileStandardizationValidator(instance.property_hierarchy), 
        new MetadataCatValidator(instance.rdf_object), 
        new MetadataCatValidator(instance.uri_property)
    )
}
class FormatStdValidator(instance: FormatStd) extends RecursiveValidator {
    override val reference = "⌿definitions⌿FormatStd"
    override val validators = Seq(
        new FormatStdNameValidator(instance.name), 
        new MetadataCatValidator(instance.param)
    )
}
class PersonalValidator(instance: Personal) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Personal"
    override val validators = Seq(
        new PersonalIspersonalValidator(instance.ispersonal), 
        new MetadataCatValidator(instance.cat)
    )
}
class ConstrValidator(instance: Constr) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Constr"
    override val validators = Seq(
        new MetadataCatValidator(instance.`type`), 
        new MetadataCatValidator(instance.param)
    )
}
class OperationalValidator(instance: Operational) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational"
    override val validators = Seq(
        new OperationalDataset_typeValidator(instance.dataset_type), 
        new OperationalRead_typeValidator(instance.read_type), 
        new OperationalIs_stdValidator(instance.is_std), 
        new OperationalLogical_uriValidator(instance.logical_uri), 
        new OperationalThemeValidator(instance.theme), 
        new OperationalSubthemeValidator(instance.subtheme), 
        new OperationalGroup_ownValidator(instance.group_own), 
        new OperationalGeorefValidator(instance.georef), 
        new OperationalStorage_infoValidator(instance.storage_info), 
        new OperationalExt_opendataValidator(instance.ext_opendata), 
        new MetadataCatValidator(instance.physical_uri), 
        new FieldProfileStandardizationValidator(instance.ingestion_pipeline), 
        new InputSrcValidator(instance.input_src), 
        new OperationalAclValidator(instance.acl), 
        new OperationalGroup_accessValidator(instance.group_access), 
        new OperationalStd_schemaValidator(instance.std_schema), 
        new MetadataCatValidator(instance.file_type), 
        new DatasetProcPartitionsValidator(instance.partitions), 
        new OperationalDataset_procValidator(instance.dataset_proc)
    )
}
class GeoRefValidator(instance: GeoRef) extends RecursiveValidator {
    override val reference = "⌿definitions⌿GeoRef"
    override val validators = Seq(
        new GeoRefLatValidator(instance.lat), 
        new GeoRefLonValidator(instance.lon)
    )
}
class StorageInfoValidator(instance: StorageInfo) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageInfo"
    override val validators = Seq(
        new StorageInfoHbaseValidator(instance.hbase), 
        new StorageInfoMongoValidator(instance.mongo), 
        new StorageInfoKuduValidator(instance.kudu), 
        new StorageInfoMongoValidator(instance.textdb), 
        new StorageInfoMongoValidator(instance.hdfs)
    )
}
class StorageHbaseValidator(instance: StorageHbase) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageHbase"
    override val validators = Seq(
        new StorageHbaseNameValidator(instance.name), 
        new MetadataCatValidator(instance.metric), 
        new FieldProfileStandardizationValidator(instance.tags), 
        new MetadataCatValidator(instance.param)
    )
}
class StorageHdfsValidator(instance: StorageHdfs) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageHdfs"
    override val validators = Seq(
        new StorageHdfsNameValidator(instance.name), 
        new MetadataCatValidator(instance.path), 
        new MetadataCatValidator(instance.param)
    )
}
class StorageKuduValidator(instance: StorageKudu) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageKudu"
    override val validators = Seq(
        new StorageKuduNameValidator(instance.name), 
        new MetadataCatValidator(instance.table_name), 
        new MetadataCatValidator(instance.param)
    )
}
class ExtOpenDataValidator(instance: ExtOpenData) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ExtOpenData"
    override val validators = Seq(
        new ExtOpenDataResourceIdValidator(instance.resourceId), 
        new ExtOpenDataNameValidator(instance.name), 
        new ExtOpenDataUrlValidator(instance.url), 
        new ExtOpenDataResourceNameValidator(instance.resourceName), 
        new ExtOpenDataIdValidator(instance.id), 
        new ExtOpenDataResourceUrlValidator(instance.resourceUrl)
    )
}
class InputSrcValidator(instance: InputSrc) extends RecursiveValidator {
    override val reference = "⌿definitions⌿InputSrc"
    override val validators = Seq(
        new InputSrcSftpValidator(instance.sftp), 
        new InputSrcSrv_pushValidator(instance.srv_pull), 
        new InputSrcSrv_pushValidator(instance.srv_push), 
        new InputSrcDaf_datasetValidator(instance.***REMOVED***_dataset)
    )
}
class SourceSftpValidator(instance: SourceSftp) extends RecursiveValidator {
    override val reference = "⌿definitions⌿SourceSftp"
    override val validators = Seq(
        new SourceSftpNameValidator(instance.name), 
        new MetadataCatValidator(instance.url), 
        new MetadataCatValidator(instance.username), 
        new MetadataCatValidator(instance.param), 
        new MetadataCatValidator(instance.password)
    )
}
class SourceSrvPushValidator(instance: SourceSrvPush) extends RecursiveValidator {
    override val reference = "⌿definitions⌿SourceSrvPush"
    override val validators = Seq(
        new SourceSrvPushNameValidator(instance.name), 
        new SourceSrvPushUrlValidator(instance.url), 
        new MetadataCatValidator(instance.access_token), 
        new MetadataCatValidator(instance.username), 
        new MetadataCatValidator(instance.param), 
        new MetadataCatValidator(instance.password)
    )
}
class SourceDafDatasetValidator(instance: SourceDafDataset) extends RecursiveValidator {
    override val reference = "⌿definitions⌿SourceDafDataset"
    override val validators = Seq(
        new FieldProfileStandardizationValidator(instance.dataset_uri), 
        new MetadataCatValidator(instance.sql), 
        new MetadataCatValidator(instance.param)
    )
}
class AclValidator(instance: Acl) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Acl"
    override val validators = Seq(
        new MetadataCatValidator(instance.groupName), 
        new MetadataCatValidator(instance.groupType), 
        new MetadataCatValidator(instance.permission)
    )
}
class GroupAccessValidator(instance: GroupAccess) extends RecursiveValidator {
    override val reference = "⌿definitions⌿GroupAccess"
    override val validators = Seq(
        new GroupAccessNameValidator(instance.name), 
        new GroupAccessRoleValidator(instance.role)
    )
}
class StdSchemaValidator(instance: StdSchema) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StdSchema"
    override val validators = Seq(
        new StdSchemaStd_uriValidator(instance.std_uri), 
        new StdSchemaFields_convValidator(instance.fields_conv)
    )
}
class ConversionFieldValidator(instance: ConversionField) extends RecursiveValidator {
    override val reference = "⌿definitions⌿ConversionField"
    override val validators = Seq(
        new ConversionFieldField_stdValidator(instance.field_std), 
        new ConversionFieldFormulaValidator(instance.formula)
    )
}
class PartitionsValidator(instance: Partitions) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Partitions"
    override val validators = Seq(
        new PartitionsNameValidator(instance.name), 
        new PartitionsFieldValidator(instance.field), 
        new PartitionsFormulaValidator(instance.formula)
    )
}
class DatasetProcValidator(instance: DatasetProc) extends RecursiveValidator {
    override val reference = "⌿definitions⌿DatasetProc"
    override val validators = Seq(
        new DatasetProcDataset_typeValidator(instance.dataset_type), 
        new DatasetProcCronValidator(instance.cron), 
        new DatasetProcRead_typeValidator(instance.read_type), 
        new DatasetProcMerge_strategyValidator(instance.merge_strategy), 
        new DatasetProcPartitionsValidator(instance.partitions)
    )
}
class DatasetValidator(instance: Dataset) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset"
    override val validators = Seq(
        new DatasetNameValidator(instance.name), 
        new DatasetNotesValidator(instance.notes), 
        new DatasetOrganizationValidator(instance.organization), 
        new MetadataCatValidator(instance.author), 
        new MetadataCatValidator(instance.license_id), 
        new DatasetRelationships_as_subjectValidator(instance.relationships_as_object), 
        new MetadataCatValidator(instance.holder_identifier), 
        new MetadataCatValidator(instance.identifier), 
        new DatasetTagsValidator(instance.tags), 
        new DatasetGroupsValidator(instance.groups), 
        new MetadataCatValidator(instance.modified), 
        new MetadataIs_createdateValidator(instance.privatex), 
        new MetadataCatValidator(instance.alternate_identifier), 
        new DatasetRelationships_as_subjectValidator(instance.relationships_as_subject), 
        new MetadataCatValidator(instance.holder_name), 
        new MetadataCatValidator(instance.publisher_identifier), 
        new DatasetResourcesValidator(instance.resources), 
        new MetadataCatValidator(instance.frequency), 
        new MetadataCatValidator(instance.title), 
        new MetadataCatValidator(instance.owner_org), 
        new MetadataCatValidator(instance.theme), 
        new MetadataCatValidator(instance.publisher_name)
    )
}
class RelationshipValidator(instance: Relationship) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Relationship"
    override val validators = Seq(
        new MetadataCatValidator(instance.subject), 
        new MetadataCatValidator(instance.`object`), 
        new MetadataCatValidator(instance.`type`), 
        new MetadataCatValidator(instance.comment)
    )
}
class TagValidator(instance: Tag) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Tag"
    override val validators = Seq(
        new MetadataCatValidator(instance.name), 
        new MetadataCatValidator(instance.state), 
        new MetadataCatValidator(instance.vocabulary_id), 
        new MetadataCatValidator(instance.display_name), 
        new MetadataCatValidator(instance.id)
    )
}
class GroupValidator(instance: Group) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Group"
    override val validators = Seq(
        new MetadataCatValidator(instance.name), 
        new MetadataCatValidator(instance.description), 
        new MetadataCatValidator(instance.display_name), 
        new MetadataCatValidator(instance.image_display_url), 
        new MetadataCatValidator(instance.id), 
        new MetadataCatValidator(instance.title)
    )
}
class ResourceValidator(instance: Resource) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Resource"
    override val validators = Seq(
        new MetadataCatValidator(instance.mimetype), 
        new MetadataCatValidator(instance.format), 
        new MetadataCatValidator(instance.name), 
        new MetadataCatValidator(instance.package_id), 
        new MetadataIs_createdateValidator(instance.datastore_active), 
        new ResourceSizeValidator(instance.size), 
        new MetadataCatValidator(instance.state), 
        new MetadataCatValidator(instance.url), 
        new MetadataCatValidator(instance.description), 
        new MetadataCatValidator(instance.resource_type), 
        new MetadataCatValidator(instance.distribution_format), 
        new MetadataCatValidator(instance.last_modified), 
        new MetadataCatValidator(instance.hash), 
        new MetadataCatValidator(instance.id), 
        new MetadataCatValidator(instance.cache_url), 
        new ResourceSizeValidator(instance.position), 
        new MetadataCatValidator(instance.mimetype_inner), 
        new MetadataCatValidator(instance.cache_last_updated), 
        new MetadataCatValidator(instance.revision_id), 
        new MetadataCatValidator(instance.created)
    )
}
class AutocompResValidator(instance: AutocompRes) extends RecursiveValidator {
    override val reference = "⌿definitions⌿AutocompRes"
    override val validators = Seq(
        new MetadataCatValidator(instance.match_field), 
        new MetadataCatValidator(instance.match_displayed), 
        new MetadataCatValidator(instance.name), 
        new MetadataCatValidator(instance.title)
    )
}
class UserValidator(instance: User) extends RecursiveValidator {
    override val reference = "⌿definitions⌿User"
    override val validators = Seq(
        new MetadataCatValidator(instance.name), 
        new MetadataCatValidator(instance.email), 
        new MetadataCatValidator(instance.fullname), 
        new MetadataCatValidator(instance.about), 
        new MetadataCatValidator(instance.password)
    )
}

// ----- option delegating validators -----
class MetadataCatValidator(instance: MetadataCat) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿cat"
    override val validators = instance.toSeq.map { new MetadataCatOptValidator(_) }
}
class OrganizationUsersValidator(instance: OrganizationUsers) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Organization⌿users"
    override val validators = instance.toSeq.map { new OrganizationUsersOptValidator(_) }
}
class MetadataIs_createdateValidator(instance: MetadataIs_createdate) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿is_createdate"
    override val validators = instance.toSeq.map { new MetadataIs_createdateOptValidator(_) }
}
class ResourceSizeValidator(instance: ResourceSize) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Resource⌿size"
    override val validators = instance.toSeq.map { new ResourceSizeOptValidator(_) }
}
class Dataset_catalogsGetLimitValidator(instance: Dataset_catalogsGetLimit) extends RecursiveValidator {
    override val reference = "⌿paths⌿/dataset-catalogs⌿get⌿limit"
    override val validators = instance.toSeq.map { new Dataset_catalogsGetLimitOptValidator(_) }
}
class MetadataRequiredValidator(instance: MetadataRequired) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿required"
    override val validators = instance.toSeq.map { new MetadataRequiredOptValidator(_) }
}
class FieldProfileStandardizationValidator(instance: FieldProfileStandardization) extends RecursiveValidator {
    override val reference = "⌿definitions⌿FieldProfile⌿standardization"
    override val validators = instance.toSeq.map { new MetadataTagOptValidator(_) }
}
class AvroFieldsValidator(instance: AvroFields) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Avro⌿fields"
    override val validators = instance.toSeq.map { new AvroFieldsOptValidator(_) }
}
class FlatSchemaMetadataValidator(instance: FlatSchemaMetadata) extends RecursiveValidator {
    override val reference = "⌿definitions⌿FlatSchema⌿metadata"
    override val validators = instance.toSeq.map { new MetadataValidator(_) }
}
class MetadataField_profileValidator(instance: MetadataField_profile) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿field_profile"
    override val validators = instance.toSeq.map { new FieldProfileValidator(_) }
}
class MetadataSemanticsValidator(instance: MetadataSemantics) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿semantics"
    override val validators = instance.toSeq.map { new SemanticValidator(_) }
}
class MetadataFormat_stdValidator(instance: MetadataFormat_std) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿format_std"
    override val validators = instance.toSeq.map { new FormatStdValidator(_) }
}
class MetadataPersonalValidator(instance: MetadataPersonal) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿personal"
    override val validators = instance.toSeq.map { new PersonalValidator(_) }
}
class MetadataConstrValidator(instance: MetadataConstr) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿constr"
    override val validators = instance.toSeq.map { new MetadataConstrOptValidator(_) }
}
class OperationalGeorefValidator(instance: OperationalGeoref) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿georef"
    override val validators = instance.toSeq.map { new OperationalGeorefOptValidator(_) }
}
class OperationalStorage_infoValidator(instance: OperationalStorage_info) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿storage_info"
    override val validators = instance.toSeq.map { new StorageInfoValidator(_) }
}
class StorageInfoHbaseValidator(instance: StorageInfoHbase) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageInfo⌿hbase"
    override val validators = instance.toSeq.map { new StorageHbaseValidator(_) }
}
class StorageInfoMongoValidator(instance: StorageInfoMongo) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageInfo⌿mongo"
    override val validators = instance.toSeq.map { new StorageHdfsValidator(_) }
}
class StorageInfoKuduValidator(instance: StorageInfoKudu) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StorageInfo⌿kudu"
    override val validators = instance.toSeq.map { new StorageKuduValidator(_) }
}
class OperationalExt_opendataValidator(instance: OperationalExt_opendata) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿ext_opendata"
    override val validators = instance.toSeq.map { new ExtOpenDataValidator(_) }
}
class InputSrcSftpValidator(instance: InputSrcSftp) extends RecursiveValidator {
    override val reference = "⌿definitions⌿InputSrc⌿sftp"
    override val validators = instance.toSeq.map { new InputSrcSftpOptValidator(_) }
}
class InputSrcSrv_pushValidator(instance: InputSrcSrv_push) extends RecursiveValidator {
    override val reference = "⌿definitions⌿InputSrc⌿srv_push"
    override val validators = instance.toSeq.map { new InputSrcSrv_pullOptValidator(_) }
}
class InputSrcDaf_datasetValidator(instance: InputSrcDaf_dataset) extends RecursiveValidator {
    override val reference = "⌿definitions⌿InputSrc⌿***REMOVED***_dataset"
    override val validators = instance.toSeq.map { new InputSrcDaf_datasetOptValidator(_) }
}
class OperationalAclValidator(instance: OperationalAcl) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿acl"
    override val validators = instance.toSeq.map { new OperationalAclOptValidator(_) }
}
class OperationalGroup_accessValidator(instance: OperationalGroup_access) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿group_access"
    override val validators = instance.toSeq.map { new OperationalGroup_accessOptValidator(_) }
}
class OperationalStd_schemaValidator(instance: OperationalStd_schema) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿std_schema"
    override val validators = instance.toSeq.map { new StdSchemaValidator(_) }
}
class DatasetProcPartitionsValidator(instance: DatasetProcPartitions) extends RecursiveValidator {
    override val reference = "⌿definitions⌿DatasetProc⌿partitions"
    override val validators = instance.toSeq.map { new PartitionsValidator(_) }
}
class OperationalDataset_procValidator(instance: OperationalDataset_proc) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿dataset_proc"
    override val validators = instance.toSeq.map { new DatasetProcValidator(_) }
}
class DatasetOrganizationValidator(instance: DatasetOrganization) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿organization"
    override val validators = instance.toSeq.map { new OrganizationValidator(_) }
}
class DatasetRelationships_as_subjectValidator(instance: DatasetRelationships_as_subject) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿relationships_as_subject"
    override val validators = instance.toSeq.map { new DatasetRelationships_as_subjectOptValidator(_) }
}
class DatasetTagsValidator(instance: DatasetTags) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿tags"
    override val validators = instance.toSeq.map { new DatasetTagsOptValidator(_) }
}
class DatasetGroupsValidator(instance: DatasetGroups) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿groups"
    override val validators = instance.toSeq.map { new DatasetGroupsOptValidator(_) }
}
class DatasetResourcesValidator(instance: DatasetResources) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿resources"
    override val validators = instance.toSeq.map { new DatasetResourcesOptValidator(_) }
}
// ----- array delegating validators -----
class OrganizationUsersOptConstraints(override val instance: OrganizationUsersOpt) extends ValidationBase[OrganizationUsersOpt] {
    override val reference = "⌿definitions⌿Organization⌿users⌿Opt"
    override def constraints: Seq[Constraint[OrganizationUsersOpt]] =
        Seq()
}
class OrganizationUsersOptValidator(instance: OrganizationUsersOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Organization⌿users⌿Opt"
    override val validators = new OrganizationUsersOptConstraints(instance) +: instance.map { new UserOrgValidator(_)}
}
class MetadataTagOptConstraints(override val instance: MetadataTagOpt) extends ValidationBase[MetadataTagOpt] {
    override val reference = "⌿definitions⌿Metadata⌿tag⌿Opt"
    override def constraints: Seq[Constraint[MetadataTagOpt]] =
        Seq()
}
class MetadataTagOptValidator(instance: MetadataTagOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿tag⌿Opt"
    override val validators = new MetadataTagOptConstraints(instance) +: instance.map { new MetadataTagOptArrValidator(_)}
}
class AvroFieldsOptConstraints(override val instance: AvroFieldsOpt) extends ValidationBase[AvroFieldsOpt] {
    override val reference = "⌿definitions⌿Avro⌿fields⌿Opt"
    override def constraints: Seq[Constraint[AvroFieldsOpt]] =
        Seq()
}
class AvroFieldsOptValidator(instance: AvroFieldsOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Avro⌿fields⌿Opt"
    override val validators = new AvroFieldsOptConstraints(instance) +: instance.map { new FieldValidator(_)}
}
class DatasetCatalogFlatSchemaConstraints(override val instance: DatasetCatalogFlatSchema) extends ValidationBase[DatasetCatalogFlatSchema] {
    override val reference = "⌿definitions⌿DatasetCatalog⌿flatSchema"
    override def constraints: Seq[Constraint[DatasetCatalogFlatSchema]] =
        Seq()
}
class DatasetCatalogFlatSchemaValidator(instance: DatasetCatalogFlatSchema) extends RecursiveValidator {
    override val reference = "⌿definitions⌿DatasetCatalog⌿flatSchema"
    override val validators = new DatasetCatalogFlatSchemaConstraints(instance) +: instance.map { new FlatSchemaValidator(_)}
}
class MetadataConstrOptConstraints(override val instance: MetadataConstrOpt) extends ValidationBase[MetadataConstrOpt] {
    override val reference = "⌿definitions⌿Metadata⌿constr⌿Opt"
    override def constraints: Seq[Constraint[MetadataConstrOpt]] =
        Seq()
}
class MetadataConstrOptValidator(instance: MetadataConstrOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Metadata⌿constr⌿Opt"
    override val validators = new MetadataConstrOptConstraints(instance) +: instance.map { new ConstrValidator(_)}
}
class OperationalGeorefOptConstraints(override val instance: OperationalGeorefOpt) extends ValidationBase[OperationalGeorefOpt] {
    override val reference = "⌿definitions⌿Operational⌿georef⌿Opt"
    override def constraints: Seq[Constraint[OperationalGeorefOpt]] =
        Seq()
}
class OperationalGeorefOptValidator(instance: OperationalGeorefOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿georef⌿Opt"
    override val validators = new OperationalGeorefOptConstraints(instance) +: instance.map { new GeoRefValidator(_)}
}
class InputSrcSftpOptConstraints(override val instance: InputSrcSftpOpt) extends ValidationBase[InputSrcSftpOpt] {
    override val reference = "⌿definitions⌿InputSrc⌿sftp⌿Opt"
    override def constraints: Seq[Constraint[InputSrcSftpOpt]] =
        Seq()
}
class InputSrcSftpOptValidator(instance: InputSrcSftpOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿InputSrc⌿sftp⌿Opt"
    override val validators = new InputSrcSftpOptConstraints(instance) +: instance.map { new SourceSftpValidator(_)}
}
class InputSrcSrv_pullOptConstraints(override val instance: InputSrcSrv_pullOpt) extends ValidationBase[InputSrcSrv_pullOpt] {
    override val reference = "⌿definitions⌿InputSrc⌿srv_pull⌿Opt"
    override def constraints: Seq[Constraint[InputSrcSrv_pullOpt]] =
        Seq()
}
class InputSrcSrv_pullOptValidator(instance: InputSrcSrv_pullOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿InputSrc⌿srv_pull⌿Opt"
    override val validators = new InputSrcSrv_pullOptConstraints(instance) +: instance.map { new SourceSrvPushValidator(_)}
}
class InputSrcDaf_datasetOptConstraints(override val instance: InputSrcDaf_datasetOpt) extends ValidationBase[InputSrcDaf_datasetOpt] {
    override val reference = "⌿definitions⌿InputSrc⌿***REMOVED***_dataset⌿Opt"
    override def constraints: Seq[Constraint[InputSrcDaf_datasetOpt]] =
        Seq()
}
class InputSrcDaf_datasetOptValidator(instance: InputSrcDaf_datasetOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿InputSrc⌿***REMOVED***_dataset⌿Opt"
    override val validators = new InputSrcDaf_datasetOptConstraints(instance) +: instance.map { new SourceDafDatasetValidator(_)}
}
class OperationalAclOptConstraints(override val instance: OperationalAclOpt) extends ValidationBase[OperationalAclOpt] {
    override val reference = "⌿definitions⌿Operational⌿acl⌿Opt"
    override def constraints: Seq[Constraint[OperationalAclOpt]] =
        Seq()
}
class OperationalAclOptValidator(instance: OperationalAclOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿acl⌿Opt"
    override val validators = new OperationalAclOptConstraints(instance) +: instance.map { new AclValidator(_)}
}
class OperationalGroup_accessOptConstraints(override val instance: OperationalGroup_accessOpt) extends ValidationBase[OperationalGroup_accessOpt] {
    override val reference = "⌿definitions⌿Operational⌿group_access⌿Opt"
    override def constraints: Seq[Constraint[OperationalGroup_accessOpt]] =
        Seq()
}
class OperationalGroup_accessOptValidator(instance: OperationalGroup_accessOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Operational⌿group_access⌿Opt"
    override val validators = new OperationalGroup_accessOptConstraints(instance) +: instance.map { new GroupAccessValidator(_)}
}
class StdSchemaFields_convConstraints(override val instance: StdSchemaFields_conv) extends ValidationBase[StdSchemaFields_conv] {
    override val reference = "⌿definitions⌿StdSchema⌿fields_conv"
    override def constraints: Seq[Constraint[StdSchemaFields_conv]] =
        Seq()
}
class StdSchemaFields_convValidator(instance: StdSchemaFields_conv) extends RecursiveValidator {
    override val reference = "⌿definitions⌿StdSchema⌿fields_conv"
    override val validators = new StdSchemaFields_convConstraints(instance) +: instance.map { new ConversionFieldValidator(_)}
}
class DatasetRelationships_as_subjectOptConstraints(override val instance: DatasetRelationships_as_subjectOpt) extends ValidationBase[DatasetRelationships_as_subjectOpt] {
    override val reference = "⌿definitions⌿Dataset⌿relationships_as_subject⌿Opt"
    override def constraints: Seq[Constraint[DatasetRelationships_as_subjectOpt]] =
        Seq()
}
class DatasetRelationships_as_subjectOptValidator(instance: DatasetRelationships_as_subjectOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿relationships_as_subject⌿Opt"
    override val validators = new DatasetRelationships_as_subjectOptConstraints(instance) +: instance.map { new RelationshipValidator(_)}
}
class DatasetTagsOptConstraints(override val instance: DatasetTagsOpt) extends ValidationBase[DatasetTagsOpt] {
    override val reference = "⌿definitions⌿Dataset⌿tags⌿Opt"
    override def constraints: Seq[Constraint[DatasetTagsOpt]] =
        Seq()
}
class DatasetTagsOptValidator(instance: DatasetTagsOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿tags⌿Opt"
    override val validators = new DatasetTagsOptConstraints(instance) +: instance.map { new TagValidator(_)}
}
class DatasetGroupsOptConstraints(override val instance: DatasetGroupsOpt) extends ValidationBase[DatasetGroupsOpt] {
    override val reference = "⌿definitions⌿Dataset⌿groups⌿Opt"
    override def constraints: Seq[Constraint[DatasetGroupsOpt]] =
        Seq()
}
class DatasetGroupsOptValidator(instance: DatasetGroupsOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿groups⌿Opt"
    override val validators = new DatasetGroupsOptConstraints(instance) +: instance.map { new GroupValidator(_)}
}
class DatasetResourcesOptConstraints(override val instance: DatasetResourcesOpt) extends ValidationBase[DatasetResourcesOpt] {
    override val reference = "⌿definitions⌿Dataset⌿resources⌿Opt"
    override def constraints: Seq[Constraint[DatasetResourcesOpt]] =
        Seq()
}
class DatasetResourcesOptValidator(instance: DatasetResourcesOpt) extends RecursiveValidator {
    override val reference = "⌿definitions⌿Dataset⌿resources⌿Opt"
    override val validators = new DatasetResourcesOptConstraints(instance) +: instance.map { new ResourceValidator(_)}
}
// ----- catch all simple validators -----
// ----- composite validators -----
// ----- call validations -----
class CkanPatchOrganizationOrg_idPutValidator(org_id: String, organization: Organization) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿patch⌿organization⌿{org_id}⌿put"
    override val validators = Seq(
        new CkanPatchOrganizationOrg_idPutOrg_idValidator(org_id), 
    
        new OrganizationValidator(organization)
    
    )
}
class VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetValidator(themeid: String, subthemeid: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿voc⌿subthemes⌿dcat2***REMOVED***⌿{themeid}⌿{subthemeid}⌿get"
    override val validators = Seq(
        new VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetThemeidValidator(themeid), 
    
        new VocSubthemesDcat2***REMOVED***ThemeidSubthemeidGetSubthemeidValidator(subthemeid)
    
    )
}
class CkanUpdateOrganizationOrg_idPutValidator(org_id: String, organization: Organization) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿update⌿organization⌿{org_id}⌿put"
    override val validators = Seq(
        new CkanUpdateOrganizationOrg_idPutOrg_idValidator(org_id), 
    
        new OrganizationValidator(organization)
    
    )
}
class CkanDatasetsWithResourcesGetValidator(limit: ResourceSize, offset: ResourceSize) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿datasetsWithResources⌿get"
    override val validators = Seq(
        new ResourceSizeValidator(limit), 
    
        new ResourceSizeValidator(offset)
    
    )
}
class VocThemesDcat2***REMOVED***ThemeidGetValidator(themeid: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿voc⌿themes⌿dcat2***REMOVED***⌿{themeid}⌿get"
    override val validators = Seq(
        new VocThemesDcat2***REMOVED***ThemeidGetThemeidValidator(themeid)
    
    )
}
class Dataset_catalogsGetValidator(page: MetadataRequired, limit: Dataset_catalogsGetLimit) extends RecursiveValidator {
    override val reference = "⌿paths⌿dataset-catalogs⌿get"
    override val validators = Seq(
        new MetadataRequiredValidator(page), 
    
        new Dataset_catalogsGetLimitValidator(limit)
    
    )
}
class VocDcatsubthemesDaf2dcatThemeidSubthemeidGetValidator(themeid: String, subthemeid: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿voc⌿dcatsubthemes⌿***REMOVED***2dcat⌿{themeid}⌿{subthemeid}⌿get"
    override val validators = Seq(
        new VocDcatsubthemesDaf2dcatThemeidSubthemeidGetThemeidValidator(themeid), 
    
        new VocDcatsubthemesDaf2dcatThemeidSubthemeidGetSubthemeidValidator(subthemeid)
    
    )
}
class CkanCreateUserPostValidator(user: User) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿create⌿user⌿post"
    override val validators = Seq(
        new UserValidator(user)
    
    )
}
class KyloFeedFile_typePostValidator(file_type: String, feed: MetaCatalog) extends RecursiveValidator {
    override val reference = "⌿paths⌿kylo⌿feed⌿{file_type}⌿post"
    override val validators = Seq(
        new KyloFeedFile_typePostFile_typeValidator(file_type), 
    
        new MetaCatalogValidator(feed)
    
    )
}
class CkanAutocompleteDummyPostValidator(autocompRes: AutocompRes) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿autocompleteDummy⌿post"
    override val validators = Seq(
        new AutocompResValidator(autocompRes)
    
    )
}
class VocSubthemesGetbyidThemeidGetValidator(themeid: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿voc⌿subthemes⌿getbyid⌿{themeid}⌿get"
    override val validators = Seq(
        new VocSubthemesGetbyidThemeidGetThemeidValidator(themeid)
    
    )
}
class CkanDatasetsDataset_idGetValidator(dataset_id: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿datasets⌿{dataset_id}⌿get"
    override val validators = Seq(
        new CkanDatasetsDataset_idGetDataset_idValidator(dataset_id)
    
    )
}
class Catalog_dsExtAddPostValidator(catalog: MetaCatalog) extends RecursiveValidator {
    override val reference = "⌿paths⌿catalog-ds⌿ext⌿add⌿post"
    override val validators = Seq(
        new MetaCatalogValidator(catalog)
    
    )
}
class Catalog_dsAdd_queuePostValidator(catalog: MetaCatalog) extends RecursiveValidator {
    override val reference = "⌿paths⌿catalog-ds⌿add-queue⌿post"
    override val validators = Seq(
        new MetaCatalogValidator(catalog)
    
    )
}
class CkanUserUsernameGetValidator(username: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿user⌿{username}⌿get"
    override val validators = Seq(
        new CkanUserUsernameGetUsernameValidator(username)
    
    )
}
class Catalog_dsGetCatalog_idGetValidator(catalog_id: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿catalog-ds⌿get⌿{catalog_id}⌿get"
    override val validators = Seq(
        new Catalog_dsGetCatalog_idGetCatalog_idValidator(catalog_id)
    
    )
}
class Catalog_dsIs_presentNameGetValidator(name: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿catalog-ds⌿is_present⌿{name}⌿get"
    override val validators = Seq(
        new Catalog_dsIs_presentNameGetNameValidator(name)
    
    )
}
class Catalog_dsGetbynameNameGetValidator(name: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿catalog-ds⌿getbyname⌿{name}⌿get"
    override val validators = Seq(
        new Catalog_dsGetbynameNameGetNameValidator(name)
    
    )
}
class CkanSearchDatasetGetValidator(q: MetadataCat, sort: MetadataCat, rows: ResourceSize, start: ResourceSize) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿searchDataset⌿get"
    override val validators = Seq(
        new MetadataCatValidator(q), 
    
        new MetadataCatValidator(sort), 
    
        new ResourceSizeValidator(rows), 
    
        new ResourceSizeValidator(start)
    
    )
}
class VocDcatsubthemesGetbyidThemeidGetValidator(themeid: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿voc⌿dcatsubthemes⌿getbyid⌿{themeid}⌿get"
    override val validators = Seq(
        new VocDcatsubthemesGetbyidThemeidGetThemeidValidator(themeid)
    
    )
}
class CkanOrganizationOrg_idGetValidator(org_id: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿organization⌿{org_id}⌿get"
    override val validators = Seq(
        new CkanOrganizationOrg_idGetOrg_idValidator(org_id)
    
    )
}
class CkanVerifyCredentialsPostValidator(credentials: Credentials) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿verifyCredentials⌿post"
    override val validators = Seq(
        new CredentialsValidator(credentials)
    
    )
}
class VocDcatthemesDaf2dcatThemeidGetValidator(themeid: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿voc⌿dcatthemes⌿***REMOVED***2dcat⌿{themeid}⌿get"
    override val validators = Seq(
        new VocDcatthemesDaf2dcatThemeidGetThemeidValidator(themeid)
    
    )
}
class PublicCatalog_dsGetbynameNameGetValidator(name: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿public⌿catalog-ds⌿getbyname⌿{name}⌿get"
    override val validators = Seq(
        new PublicCatalog_dsGetbynameNameGetNameValidator(name)
    
    )
}
class CkanUserOrganizationsUsernameGetValidator(username: String) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿userOrganizations⌿{username}⌿get"
    override val validators = Seq(
        new CkanUserOrganizationsUsernameGetUsernameValidator(username)
    
    )
}
class CkanCreateDatasetPostValidator(dataset: Dataset) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿create⌿dataset⌿post"
    override val validators = Seq(
        new DatasetValidator(dataset)
    
    )
}
class Catalog_dsAddPostValidator(catalog: MetaCatalog) extends RecursiveValidator {
    override val reference = "⌿paths⌿catalog-ds⌿add⌿post"
    override val validators = Seq(
        new MetaCatalogValidator(catalog)
    
    )
}
class CkanAutocompleteDatasetGetValidator(q: MetadataCat, limit: ResourceSize) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿autocompleteDataset⌿get"
    override val validators = Seq(
        new MetadataCatValidator(q), 
    
        new ResourceSizeValidator(limit)
    
    )
}
class CkanCreateOrganizationPostValidator(organization: Organization) extends RecursiveValidator {
    override val reference = "⌿paths⌿ckan⌿create⌿organization⌿post"
    override val validators = Seq(
        new OrganizationValidator(organization)
    
    )
}
