
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object manga_Scope0 {
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

class manga extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Manga],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(manga: List[models.Manga]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/main("Mangas")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
  """),format.raw/*4.3*/("""<div class="container">
    <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Mangas</h4>
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
          """),_display_(/*31.12*/for(m <- manga) yield /*31.27*/ {_display_(Seq[Any](format.raw/*31.29*/("""
            """),format.raw/*32.13*/("""<tr>
              <td class="numeric">"""),_display_(/*33.36*/m/*33.37*/.getId),format.raw/*33.43*/("""</td>
              <td>"""),_display_(/*34.20*/m/*34.21*/.getName),format.raw/*34.29*/("""</td>
              <td>"""),_display_(/*35.20*/m/*35.21*/.getGenre),format.raw/*35.30*/("""</td>
              <td>"""),_display_(/*36.20*/m/*36.21*/.getStudio),format.raw/*36.31*/("""</td>
              <td class="numeric">"""),_display_(/*37.36*/m/*37.37*/.getRealeaseYear),format.raw/*37.53*/("""</td>
              <td class="numeric">"""),_display_(/*38.36*/m/*38.37*/.getRating),format.raw/*38.47*/("""</td>
                <!-- Delete a product from stock -->
              <td>
                <a href=""""),_display_(/*41.27*/routes/*41.33*/.HomeController.deleteManga(m.getId)),format.raw/*41.69*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                  <span class="glyphicon glyphicon-trash"></span>
                </a>
              </td>
            </tr>
          """)))}),format.raw/*46.12*/("""
          """),format.raw/*47.11*/("""</tbody>
        </table>
        <p>
          <a href=""""),_display_(/*50.21*/routes/*50.27*/.HomeController.uploadmanga()),format.raw/*50.56*/("""">
            <button class="btn btn-primary">Upload a Manga</button>
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

  def render(manga:List[models.Manga]): play.twirl.api.HtmlFormat.Appendable = apply(manga)

  def f:((List[models.Manga]) => play.twirl.api.HtmlFormat.Appendable) = (manga) => apply(manga)

  def ref: this.type = this

}


}

/**/
object manga extends manga_Scope0.manga
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 08:59:02 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/manga.scala.html
                  HASH: 0e7356f5b5cc462dbb76490922d45a547ab7dae7
                  MATRIX: 757->1|879->28|909->33|931->47|970->49|1000->53|1232->258|1273->290|1313->292|1353->304|1426->350|1440->355|1476->370|1516->382|1564->399|1603->411|1959->740|1990->755|2030->757|2072->771|2140->812|2150->813|2177->819|2230->845|2240->846|2269->854|2322->880|2332->881|2362->890|2415->916|2425->917|2456->927|2525->969|2535->970|2572->986|2641->1028|2651->1029|2682->1039|2816->1146|2831->1152|2888->1188|3120->1389|3160->1401|3248->1462|3263->1468|3313->1497|3526->1682|3555->1683|3597->1697|3669->1741|3698->1742|3729->1746|3771->1758
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|50->19|62->31|62->31|62->31|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|72->41|72->41|72->41|77->46|78->47|81->50|81->50|81->50|90->59|90->59|91->60|92->61|92->61|93->62|94->63
                  -- GENERATED --
              */
          