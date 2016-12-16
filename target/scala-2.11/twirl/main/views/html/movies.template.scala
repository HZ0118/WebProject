
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object movies_Scope0 {
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

class movies extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Movies],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(movies: List[models.Movies]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

  """),_display_(/*3.4*/main("Anime Movies")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
  """),format.raw/*4.3*/("""<div class="container">
    <div class="row">
    <div class="col-sm-2">
      <div class="well">
        <h4>Anime Movies</h4>
      </div>
    </div>
    <div class="col-sm-10">

        """),_display_(/*13.10*/if(flash.containsKey("success"))/*13.42*/ {_display_(Seq[Any](format.raw/*13.44*/("""
            """),format.raw/*14.13*/("""<div class="alert alert-success">
                """),_display_(/*15.18*/flash/*15.23*/.get("success")),format.raw/*15.38*/("""
            """),format.raw/*16.13*/("""</div>
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
              """),_display_(/*31.16*/for(m <- movies) yield /*31.32*/ {_display_(Seq[Any](format.raw/*31.34*/("""
                """),format.raw/*32.17*/("""<tr>
                    <td class="numeric">"""),_display_(/*33.42*/m/*33.43*/.getId),format.raw/*33.49*/("""</td>
                    <td>"""),_display_(/*34.26*/m/*34.27*/.getName),format.raw/*34.35*/("""</td>
                    <td>"""),_display_(/*35.26*/m/*35.27*/.getGenre),format.raw/*35.36*/("""</td>
                    <td>"""),_display_(/*36.26*/m/*36.27*/.getStudio),format.raw/*36.37*/("""</td>
                    <td class="numeric">"""),_display_(/*37.42*/m/*37.43*/.getRealeaseYear),format.raw/*37.59*/("""</td>
                    <td class="numeric">"""),_display_(/*38.42*/m/*38.43*/.getRating),format.raw/*38.53*/("""</td>
                    <!-- Delete a product from stock -->
                    <td>
                        <a href=""""),_display_(/*41.35*/routes/*41.41*/.HomeController.deleteMovie(m.getId)),format.raw/*41.77*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>
                    </td>
                </tr>
              """)))}),format.raw/*46.16*/("""
            """),format.raw/*47.13*/("""</tbody>
        </table>
        <p>
            <a href=""""),_display_(/*50.23*/routes/*50.29*/.HomeController.uploadmovie()),format.raw/*50.58*/("""">
                <button class="btn btn-primary">Upload a Movie</button>
            </a>
        </p>
    </div>
    </div>
    </div>

    <script>
        function confirmDel() """),format.raw/*59.31*/("""{"""),format.raw/*59.32*/("""
            """),format.raw/*60.13*/("""return confirm('Are you sure?');
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/("""
    """),format.raw/*62.5*/("""</script>
  """)))}),format.raw/*63.4*/("""
"""))
      }
    }
  }

  def render(movies:List[models.Movies]): play.twirl.api.HtmlFormat.Appendable = apply(movies)

  def f:((List[models.Movies]) => play.twirl.api.HtmlFormat.Appendable) = (movies) => apply(movies)

  def ref: this.type = this

}


}

/**/
object movies extends movies_Scope0.movies
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 00:30:40 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/movies.scala.html
                  HASH: 614dcb201b5ac6d73746226aedee588d873f683a
                  MATRIX: 760->1|884->30|916->37|944->57|983->59|1013->63|1239->262|1280->294|1320->296|1362->310|1441->362|1455->367|1491->382|1533->396|1581->413|1620->425|2030->808|2062->824|2102->826|2148->844|2222->891|2232->892|2259->898|2318->930|2328->931|2357->939|2416->971|2426->972|2456->981|2515->1013|2525->1014|2556->1024|2631->1072|2641->1073|2678->1089|2753->1137|2763->1138|2794->1148|2946->1273|2961->1279|3018->1315|3282->1548|3324->1562|3414->1625|3429->1631|3479->1660|3698->1851|3727->1852|3769->1866|3838->1908|3867->1909|3900->1915|3944->1929
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|50->19|62->31|62->31|62->31|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|72->41|72->41|72->41|77->46|78->47|81->50|81->50|81->50|90->59|90->59|91->60|92->61|92->61|93->62|94->63
                  -- GENERATED --
              */
          