
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object uploadmanga_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object uploadmanga_Scope1 {
import helper._

class uploadmanga extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Manga],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(uploadMangaForm: Form[models.Manga]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.39*/("""
"""),_display_(/*5.2*/main("Upload Manga")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""

  """),_display_(/*7.4*/form(action = routes.HomeController.uploadMangaSubmit(), 'class -> "form-horizontal", 'role->"form")/*7.104*/ {_display_(Seq[Any](format.raw/*7.106*/("""

    """),_display_(/*9.6*/inputText(uploadMangaForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*9.84*/("""
    """),_display_(/*10.6*/inputText(uploadMangaForm("genre"), '_label -> "Genre",'class -> "form-control")),format.raw/*10.86*/("""
    """),_display_(/*11.6*/inputText(uploadMangaForm("studio"), '_label -> "Studio",'class -> "form-control")),format.raw/*11.88*/("""
    """),_display_(/*12.6*/inputText(uploadMangaForm("realeaseYear"), '_label -> "Release Year",'class -> "form-control")),format.raw/*12.100*/("""
    """),_display_(/*13.6*/inputText(uploadMangaForm("rating"), '_label -> "Rating",'class -> "form-control")),format.raw/*13.88*/("""

    """),format.raw/*15.5*/("""<div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
      <a href=""""),_display_(/*17.17*/routes/*17.23*/.HomeController.manga()),format.raw/*17.46*/(""""><button class="btn btn-warning">Cancel</button>
      </a>
    </div>
  """)))}),format.raw/*20.4*/("""


""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(uploadMangaForm:Form[models.Manga]): play.twirl.api.HtmlFormat.Appendable = apply(uploadMangaForm)

  def f:((Form[models.Manga]) => play.twirl.api.HtmlFormat.Appendable) = (uploadMangaForm) => apply(uploadMangaForm)

  def ref: this.type = this

}


}
}

/**/
object uploadmanga extends uploadmanga_Scope0.uploadmanga_Scope1.uploadmanga
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 08:59:02 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/uploadmanga.scala.html
                  HASH: 6294ea42498090205d5e5c1a6501793a1946382f
                  MATRIX: 819->23|951->60|979->63|1007->83|1046->85|1078->92|1187->192|1227->194|1261->203|1359->281|1392->288|1493->368|1526->375|1629->457|1662->464|1778->558|1811->565|1914->647|1949->655|2081->760|2096->766|2140->789|2248->867|2285->874
                  LINES: 30->4|35->4|36->5|36->5|36->5|38->7|38->7|38->7|40->9|40->9|41->10|41->10|42->11|42->11|43->12|43->12|44->13|44->13|46->15|48->17|48->17|48->17|51->20|54->23
                  -- GENERATED --
              */
          