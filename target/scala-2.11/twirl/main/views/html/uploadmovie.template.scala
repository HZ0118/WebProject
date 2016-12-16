
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object uploadmovie_Scope0 {
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

     object uploadmovie_Scope1 {
import helper._

class uploadmovie extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Movies],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(uploadMovieForm: Form[models.Movies]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.40*/("""
"""),_display_(/*5.2*/main("Upload Movie")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""

    """),_display_(/*7.6*/form(action = routes.HomeController.uploadMovieSubmit(), 'class -> "form-horizontal", 'role->"form")/*7.106*/ {_display_(Seq[Any](format.raw/*7.108*/("""

        """),_display_(/*9.10*/inputText(uploadMovieForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*9.88*/("""
        """),_display_(/*10.10*/inputText(uploadMovieForm("genre"), '_label -> "Genre",'class -> "form-control")),format.raw/*10.90*/("""
        """),_display_(/*11.10*/inputText(uploadMovieForm("studio"), '_label -> "Studio",'class -> "form-control")),format.raw/*11.92*/("""
        """),_display_(/*12.10*/inputText(uploadMovieForm("realeaseYear"), '_label -> "Release Year",'class -> "form-control")),format.raw/*12.104*/("""
        """),_display_(/*13.10*/inputText(uploadMovieForm("rating"), '_label -> "Rating",'class -> "form-control")),format.raw/*13.92*/("""

            """),format.raw/*15.13*/("""<div class="actions">
                <input type="submit" value="Save" class="btn btn-primary">
                    <a href=""""),_display_(/*17.31*/routes/*17.37*/.HomeController.movies()),format.raw/*17.61*/(""""><button class="btn btn-warning">Cancel</button>
                    </a>
                </div>
    """)))}),format.raw/*20.6*/("""


""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(uploadMovieForm:Form[models.Movies]): play.twirl.api.HtmlFormat.Appendable = apply(uploadMovieForm)

  def f:((Form[models.Movies]) => play.twirl.api.HtmlFormat.Appendable) = (uploadMovieForm) => apply(uploadMovieForm)

  def ref: this.type = this

}


}
}

/**/
object uploadmovie extends uploadmovie_Scope0.uploadmovie_Scope1.uploadmovie
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 00:30:40 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/uploadmovie.scala.html
                  HASH: ed41953a8be8789999aa3faf3a04a0a401abcd5e
                  MATRIX: 820->23|953->61|981->64|1009->84|1048->86|1082->95|1191->195|1231->197|1270->210|1368->288|1406->299|1507->379|1545->390|1648->472|1686->483|1802->577|1840->588|1943->670|1987->686|2143->815|2158->821|2203->845|2339->951|2376->958
                  LINES: 30->4|35->4|36->5|36->5|36->5|38->7|38->7|38->7|40->9|40->9|41->10|41->10|42->11|42->11|43->12|43->12|44->13|44->13|46->15|48->17|48->17|48->17|51->20|54->23
                  -- GENERATED --
              */
          