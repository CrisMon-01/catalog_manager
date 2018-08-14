package it.gov.***REMOVED***.catalogmanager.repository.voc

import catalog_manager.yaml._

trait VocThemeRepository {
  import play.api.libs.functional.syntax._

  def listThemeAll() :Seq[KeyValue]
  def listSubthemeAll(): Seq[VocKeyValueSubtheme]
  def listSubtheme(themeId: String): Seq[KeyValue]
  def ***REMOVED***2dcatTheme(***REMOVED***ThemeId: String): Seq[KeyValue]
  def ***REMOVED***2dcatSubtheme(***REMOVED***ThemeId: String, ***REMOVED***SubthemeId: String): Seq[VocKeyValueSubtheme]
  def listDcatThemeAll(): Seq[KeyValue]
  def listDcatSubthemeAll(): Seq[VocKeyValueSubtheme]
  def listDcatSubtheme(dcatapitThemeId: String): Seq[KeyValue]
  def dcat2DafTheme(dcatapitThemeId: String): Seq[KeyValue]
  def dcat2DafSubtheme(dcatapitThemeId: String, dcatapitSubthemeId: String): Seq[VocKeyValueSubtheme]
//  def createTheme(metaCatalog: MetaCatalog,callingUserid :MetadataCat) :Success
}

trait VocThemeRepositoryComponent {
  val vocThemeRepository: VocThemeRepository = null
}


object VocThemeRepository{
  def apply(config: String): VocThemeRepository = config match {
    case "dev" => new VocThemeRepositoryFile
    case "prod" => new VocThemeRepositoryFile
  }
}