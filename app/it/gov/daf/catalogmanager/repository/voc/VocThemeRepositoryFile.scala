package it.gov.***REMOVED***.catalogmanager.repository.voc

import java.io.FileInputStream

import catalog_manager.yaml.{KeyValue, VocKeyValueSubtheme}
import play.api.libs.json._

class VocThemeRepositoryFile extends VocThemeRepository{

  def listThemeAll() :Seq[KeyValue] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try { (Json.parse(stream) \ "voc").asOpt[JsArray]} finally {stream.close()}

    json match {
      case Some(s) => s.value.map(x=> KeyValue((x \ "theme_***REMOVED***_code").as[String], (x \ "theme_***REMOVED***_ita").as[String]))
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }


  def listSubthemeAll(): Seq[VocKeyValueSubtheme] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try { (Json.parse(stream) \ "voc").asOpt[JsArray]} finally {stream.close()}

    json match {
      case Some(s) => s.value.map(x => ((x \ "theme_***REMOVED***_code").as[String],
        (x \ "subthemes").as[List[JsValue]])).map{ x=>

        x._2.map{ y=>
          VocKeyValueSubtheme((y \ "subtheme_***REMOVED***_code").as[String], (y \ "subtheme_***REMOVED***_ita").as[String], x._1, None)
        }
      }.flatMap(x=>x)
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }
  def listSubtheme(themeId: String): Seq[KeyValue] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try { (Json.parse(stream) \ "voc").asOpt[JsArray]} finally {stream.close()}
    json match {
      case Some(s) => s.value.map(x => ((x \ "theme_***REMOVED***_code").as[String],
        (x \ "subthemes").as[List[JsValue]]))
        .filter(x => x._1.equals(themeId))
        .map{ x=>

          x._2.map{ y=>
            KeyValue((y \ "subtheme_***REMOVED***_code").as[String], (y \ "subtheme_***REMOVED***_ita").as[String])
          }
        }.flatten
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }
  def ***REMOVED***2dcatTheme(***REMOVED***ThemeId: String): Seq[KeyValue] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try { (Json.parse(stream) \ "voc").asOpt[JsArray]} finally {stream.close()}
    json match {
      case Some(s) => s.value.map(x => ((x \ "theme_***REMOVED***_code").as[String],
        (x \ "theme_ita").as[String],
        (x \ "theme_code").as[String]))
        .filter(x => x._1.equals(***REMOVED***ThemeId))
        .map(x=> KeyValue(x._2, x._3))
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }
  def ***REMOVED***2dcatSubtheme(***REMOVED***ThemeId: String, ***REMOVED***SubthemeId: String = "__-1NOFILTER__"): Seq[VocKeyValueSubtheme] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try { (Json.parse(stream) \ "voc").asOpt[JsArray]} finally {stream.close()}


    json match {
      case Some(s) => s.value.map(x => (
        (x \ "theme_***REMOVED***_code").as[String],
        (x \ "theme_code").as[String],
        (x \ "theme_ita").as[String],
        (x \ "subthemes").as[List[JsValue]]))
        .filter(x => x._1.equals(***REMOVED***ThemeId))
        .map{ x=>
          x._4.map{ y=>
            //(Theme Ita, SubthemesIta, Subtheme Daf Code)
            (x._2, x._3, (y \ "subthemes_ita").as[List[List[String]]], (y \ "subtheme_***REMOVED***_code").as[String])
          }
        }
        .flatten
        .filter(x=> x._4.equals(***REMOVED***SubthemeId) || ***REMOVED***SubthemeId.equals("__-1NOFILTER__"))
        .map{ x=>
          x._3.map{ y=>
            VocKeyValueSubtheme(y(0), y(1), x._1, Some(x._2))
          }
        }.flatten
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }

  def listDcatThemeAll(): Seq[KeyValue] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try { (Json.parse(stream) \ "voc").asOpt[JsArray]} finally {stream.close()}

    json match {
      case Some(s) => s.value.map(x=> KeyValue((x \ "theme_code").as[String], (x \ "theme_ita").as[String]))
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }

  def listDcatSubthemeAll(): Seq[VocKeyValueSubtheme] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try { (Json.parse(stream) \ "voc").asOpt[JsArray]} finally {stream.close()}

    json match {
      case Some(s) => s.value.map(x => ((x \ "theme_code").as[String],
        (x \ "subthemes").as[List[JsValue]])).map{ x=>

        x._2.map{ y=> //subthemes

          (x._1, (y \ "subthemes_ita").as[List[List[String]]])
        }
      }.flatten.map{x=>
        x._2.map{y=>
          VocKeyValueSubtheme(y(0), y(1), x._1, None)
        }
      }.flatMap(x=>x)
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }
  def listDcatSubtheme(dcatapitThemeId: String): Seq[KeyValue] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try { (Json.parse(stream) \ "voc").asOpt[JsArray]} finally {stream.close()}

    json match {
      case Some(s) => s.value.map(x => ((x \ "theme_code").as[String],
        (x \ "subthemes").as[List[JsValue]])).map{ x=>

        x._2.map{ y=> //subthemes

          (x._1, (y \ "subthemes_ita").as[List[List[String]]])
        }
      }.flatten
        .filter(x=>x._1.equals(dcatapitThemeId))
        .map{x=>
          x._2.map{y=>
            KeyValue(y(0), y(1))
          }
        }.flatMap(x=>x)
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }

  def dcat2DafTheme(dcatapitThemeId: String): Seq[KeyValue] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try { (Json.parse(stream) \ "voc").asOpt[JsArray]} finally {stream.close()}

    json match {
      case Some(s) => s.value.map{x=>
        ((x \ "theme_***REMOVED***_code").as[String], (x \ "theme_***REMOVED***_ita").as[String], (x \ "theme_code").as[String])
      }
        .filter(x=> x._3.equals(dcatapitThemeId))
        .map(x=>KeyValue(x._1, x._2))
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }

  def dcat2DafSubtheme(dcatapitThemeId: String, dcatapitSubthemeId: String): Seq[VocKeyValueSubtheme] = {
    val stream = new FileInputStream("data/voc/cv_theme-subtheme_bk.json")
    val json = try {
      (Json.parse(stream) \ "voc").asOpt[JsArray]
    } finally {
      stream.close()
    }

    json match {
      case Some(s) => s.value.map(x => (
        (x \ "theme_***REMOVED***_code").as[String],
        (x \ "subthemes").as[List[JsValue]],
        (x \ "theme_code").as[String]))
        .filter(x => x._3.equals(dcatapitThemeId))
        .map { x =>

          x._2.map { y =>
            (VocKeyValueSubtheme((y \ "subtheme_***REMOVED***_code").as[String], (y \ "subtheme_***REMOVED***_ita").as[String], x._1, None), (y \ "subthemes_ita").as[List[List[String]]])
          }
        }
        .flatten
        .filter(x => x._2.map(_ (0)).contains(dcatapitSubthemeId))
        .map(x => x._1)
      case None =>
        println("VocRepositoryFile - Error occurred with Json")
        Seq()
    }
  }
}
