
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object series_Scope0 {
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

class series extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Series],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(series: List[models.Series]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("Anime Series")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
  """),format.raw/*4.3*/("""<div class="container">
    <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Anime Series</h4>
        </div>
      </div>
      <div class="col-sm-10">

        """),_display_(/*13.10*/if(flash.containsKey("success"))/*13.42*/ {_display_(Seq[Any](format.raw/*13.44*/("""
          """),format.raw/*14.11*/("""<div class="alert alert-success">
          """),_display_(/*15.12*/flash/*15.17*/.get("success")),format.raw/*15.32*/("""
          """),format.raw/*16.11*/("""</div>
        """)))}),format.raw/*17.10*/("""

        """),format.raw/*19.9*/("""<table class="table table-bordered">
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Genre</th>
              <th>Studio</th>
              <th>Release Year</th>
              <th>Rating</th>
            </tr>
          </thead>
          <tbody>
          """),_display_(/*31.12*/for(s <- series) yield /*31.28*/ {_display_(Seq[Any](format.raw/*31.30*/("""
            """),format.raw/*32.13*/("""<tr>
              <td class="numeric">"""),_display_(/*33.36*/s/*33.37*/.getId),format.raw/*33.43*/("""</td>
              <td>"""),_display_(/*34.20*/s/*34.21*/.getName),format.raw/*34.29*/("""</td>
              <td>"""),_display_(/*35.20*/s/*35.21*/.getGenre),format.raw/*35.30*/("""</td>
              <td>"""),_display_(/*36.20*/s/*36.21*/.getStudio),format.raw/*36.31*/("""</td>
              <td class="numeric">"""),_display_(/*37.36*/s/*37.37*/.getRealeaseYear),format.raw/*37.53*/("""</td>
              <td class="numeric">"""),_display_(/*38.36*/s/*38.37*/.getRating),format.raw/*38.47*/("""</td>
                <!-- Delete a product from stock -->
              <td>
                <a href=""""),_display_(/*41.27*/routes/*41.33*/.HomeController.deleteSerie(s.getId)),format.raw/*41.69*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                  <span class="glyphicon glyphicon-trash"></span>
                </a>
              </td>
            </tr>
          """)))}),format.raw/*46.12*/("""
          """),format.raw/*47.11*/("""</tbody>
        </table>
        <p>
          <a href=""""),_display_(/*50.21*/routes/*50.27*/.HomeController.uploadseries()),format.raw/*50.57*/("""">
            <button class="btn btn-primary">Upload a Serie</button>
          </a>
        </p>
      </div>
    </div>
  </div>

  <script>
          function confirmDel() """),format.raw/*59.33*/("""{"""),format.raw/*59.34*/("""
            """),format.raw/*60.13*/("""return confirm('Are you sure?');
          """),format.raw/*61.11*/("""}"""),format.raw/*61.12*/("""
  """),format.raw/*62.3*/("""</script>
""")))}),format.raw/*63.2*/("""
"""))
      }
    }
  }

  def render(series:List[models.Series]): play.twirl.api.HtmlFormat.Appendable = apply(series)

  def f:((List[models.Series]) => play.twirl.api.HtmlFormat.Appendable) = (series) => apply(series)

  def ref: this.type = this

}


}

/**/
object series extends series_Scope0.series
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 00:40:57 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/series.scala.html
                  HASH: 8aaf2c4b2b85abbb6c6c2e92861e02cfd682c91d
                  MATRIX: 760->1|884->30|914->35|942->55|981->57|1011->61|1249->272|1290->304|1330->306|1370->318|1443->364|1457->369|1493->384|1533->396|1581->413|1620->425|1976->754|2008->770|2048->772|2090->786|2158->827|2168->828|2195->834|2248->860|2258->861|2287->869|2340->895|2350->896|2380->905|2433->931|2443->932|2474->942|2543->984|2553->985|2590->1001|2659->1043|2669->1044|2700->1054|2834->1161|2849->1167|2906->1203|3138->1404|3178->1416|3266->1477|3281->1483|3332->1513|3545->1698|3574->1699|3616->1713|3688->1757|3717->1758|3748->1762|3790->1774
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|50->19|62->31|62->31|62->31|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|72->41|72->41|72->41|77->46|78->47|81->50|81->50|81->50|90->59|90->59|91->60|92->61|92->61|93->62|94->63
                  -- GENERATED --
              */
          