
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object uploadseries_Scope0 {
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

     object uploadseries_Scope1 {
import helper._

class uploadseries extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Series],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(uploadSerieForm: Form[models.Series]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.40*/("""
"""),_display_(/*4.2*/main("Upload Series")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""

    """),_display_(/*6.6*/form(action = routes.HomeController.uploadSerieSubmit(), 'class -> "form-horizontal", 'role->"form")/*6.106*/ {_display_(Seq[Any](format.raw/*6.108*/("""

        """),_display_(/*8.10*/inputText(uploadSerieForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*8.88*/("""
        """),_display_(/*9.10*/inputText(uploadSerieForm("genre"), '_label -> "Genre",'class -> "form-control")),format.raw/*9.90*/("""
        """),_display_(/*10.10*/inputText(uploadSerieForm("studio"), '_label -> "Studio",'class -> "form-control")),format.raw/*10.92*/("""
        """),_display_(/*11.10*/inputText(uploadSerieForm("realeaseYear"), '_label -> "Release Year",'class -> "form-control")),format.raw/*11.104*/("""
        """),_display_(/*12.10*/inputText(uploadSerieForm("rating"), '_label -> "Rating",'class -> "form-control")),format.raw/*12.92*/("""

        """),format.raw/*14.9*/("""<div class="actions">
            <input type="submit" value="Save" class="btn btn-primary">
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.HomeController.series()),format.raw/*16.53*/(""""><button class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*19.6*/("""


""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(uploadSerieForm:Form[models.Series]): play.twirl.api.HtmlFormat.Appendable = apply(uploadSerieForm)

  def f:((Form[models.Series]) => play.twirl.api.HtmlFormat.Appendable) = (uploadSerieForm) => apply(uploadSerieForm)

  def ref: this.type = this

}


}
}

/**/
object uploadseries extends uploadseries_Scope0.uploadseries_Scope1.uploadseries
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 00:40:58 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/uploadseries.scala.html
                  HASH: 984926a19c53b92bcd8546dc386d3bb5e6526244
                  MATRIX: 823->21|956->59|984->62|1013->83|1052->85|1086->94|1195->194|1235->196|1274->209|1372->287|1409->298|1509->378|1547->389|1650->471|1688->482|1804->576|1842->587|1945->669|1984->681|2128->798|2143->804|2188->828|2308->918|2345->925
                  LINES: 30->3|35->3|36->4|36->4|36->4|38->6|38->6|38->6|40->8|40->8|41->9|41->9|42->10|42->10|43->11|43->11|44->12|44->12|46->14|48->16|48->16|48->16|51->19|54->22
                  -- GENERATED --
              */
          