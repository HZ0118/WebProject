
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
    <meta charset="utf-8">
        <!-- jQuery library -->
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*17.70*/("""" type="text/javascript"></script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*22.50*/routes/*22.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*22.97*/("""">
        <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
      <div class="page-header">
          <img src=""""),_display_(/*30.22*/routes/*30.28*/.Assets.versioned("images/banner.jpg")),format.raw/*30.66*/("""" width="100%"/>
      </div>
        <nav class="navbar navbar-inverse navbar-fixed-top">
          <div class="container-fluid">
            <div class="navbar-header">
              <a class="navbar-brand" href=""""),_display_(/*35.46*/routes/*35.52*/.HomeController.index()),format.raw/*35.75*/("""">Anime World</a>
            </div>
                <ul class="nav navbar-nav">
                <li """),_display_(/*38.22*/if(title =="Home")/*38.40*/{_display_(Seq[Any](format.raw/*38.41*/("""class="active"""")))}),format.raw/*38.56*/("""><a href=""""),_display_(/*38.67*/routes/*38.73*/.HomeController.index()),format.raw/*38.96*/("""">Home</a></li>
                <li """),_display_(/*39.22*/if(title =="Anime Movies")/*39.48*/{_display_(Seq[Any](format.raw/*39.49*/("""class="active"""")))}),format.raw/*39.64*/("""><a href=""""),_display_(/*39.75*/routes/*39.81*/.HomeController.movies()),format.raw/*39.105*/("""">Anime Movies</a></li>
                <li """),_display_(/*40.22*/if(title =="Anime Series")/*40.48*/{_display_(Seq[Any](format.raw/*40.49*/("""class="active"""")))}),format.raw/*40.64*/("""><a href=""""),_display_(/*40.75*/routes/*40.81*/.HomeController.series()),format.raw/*40.105*/("""">Anime Series</a></li>
                <li """),_display_(/*41.22*/if(title =="Manga")/*41.41*/{_display_(Seq[Any](format.raw/*41.42*/("""class="active"""")))}),format.raw/*41.57*/("""><a href=""""),_display_(/*41.68*/routes/*41.74*/.HomeController.manga()),format.raw/*41.97*/("""">Manga</a></li>
                <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="">Upload<span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li """),_display_(/*45.26*/if(title =="Upload Movie")/*45.52*/{_display_(Seq[Any](format.raw/*45.53*/("""class="active"""")))}),format.raw/*45.68*/("""><a href=""""),_display_(/*45.79*/routes/*45.85*/.HomeController.uploadmovie()),format.raw/*45.114*/("""">Upload Movie</a></li>
                    <li """),_display_(/*46.26*/if(title =="Upload Series")/*46.53*/{_display_(Seq[Any](format.raw/*46.54*/("""class="active"""")))}),format.raw/*46.69*/("""><a href=""""),_display_(/*46.80*/routes/*46.86*/.HomeController.uploadseries()),format.raw/*46.116*/("""">Upload Series</a></li>
                    <li """),_display_(/*47.26*/if(title =="Upload Manga")/*47.52*/{_display_(Seq[Any](format.raw/*47.53*/("""class="active"""")))}),format.raw/*47.68*/("""><a href=""""),_display_(/*47.79*/routes/*47.85*/.HomeController.uploadmanga()),format.raw/*47.114*/("""">Upload Manga</a></li>
                  </ul>
              </li>
              </ul>
          <ul class="nav navbar-nav navbar-right">
            <li """),_display_(/*52.18*/if(title =="Signup")/*52.38*/{_display_(Seq[Any](format.raw/*52.39*/("""class="active"""")))}),format.raw/*52.54*/("""><a href=""""),_display_(/*52.65*/routes/*52.71*/.HomeController.signup()),format.raw/*52.95*/(""""><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            <li """),_display_(/*53.18*/if(title =="Login")/*53.37*/{_display_(Seq[Any](format.raw/*53.38*/("""class="active"""")))}),format.raw/*53.53*/("""><a href=""""),_display_(/*53.64*/routes/*53.70*/.HomeController.login()),format.raw/*53.93*/(""""><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
          </ul>
          </div>
        </nav>
        """),format.raw/*58.32*/("""
        """),_display_(/*59.10*/content),format.raw/*59.17*/("""

        """),format.raw/*61.9*/("""<footer class="container-fluid">
        <p>Copyright &#64; 2016 animeworld.com All Rights Reserved.</p>
        </footer>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 00:30:39 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/main.scala.html
                  HASH: a38975d357803d205ce3c3d1aca55f79ef07cf28
                  MATRIX: 1007->266|1132->296|1162->300|1245->408|1282->418|1317->426|1343->431|1499->560|1514->566|1575->605|1628->631|1643->637|1705->678|2076->1022|2091->1028|2153->1069|2532->1421|2547->1427|2606->1465|2854->1686|2869->1692|2913->1715|3045->1820|3072->1838|3111->1839|3157->1854|3195->1865|3210->1871|3254->1894|3319->1932|3354->1958|3393->1959|3439->1974|3477->1985|3492->1991|3538->2015|3611->2061|3646->2087|3685->2088|3731->2103|3769->2114|3784->2120|3830->2144|3903->2190|3931->2209|3970->2210|4016->2225|4054->2236|4069->2242|4113->2265|4381->2506|4416->2532|4455->2533|4501->2548|4539->2559|4554->2565|4605->2594|4682->2644|4718->2671|4757->2672|4803->2687|4841->2698|4856->2704|4908->2734|4986->2785|5021->2811|5060->2812|5106->2827|5144->2838|5159->2844|5210->2873|5398->3034|5427->3054|5466->3055|5512->3070|5550->3081|5565->3087|5610->3111|5721->3195|5749->3214|5788->3215|5834->3230|5872->3241|5887->3247|5931->3270|6085->3487|6123->3498|6151->3505|6190->3517
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|46->16|46->16|46->16|47->17|47->17|47->17|52->22|52->22|52->22|60->30|60->30|60->30|65->35|65->35|65->35|68->38|68->38|68->38|68->38|68->38|68->38|68->38|69->39|69->39|69->39|69->39|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|70->40|70->40|71->41|71->41|71->41|71->41|71->41|71->41|71->41|75->45|75->45|75->45|75->45|75->45|75->45|75->45|76->46|76->46|76->46|76->46|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|77->47|77->47|82->52|82->52|82->52|82->52|82->52|82->52|82->52|83->53|83->53|83->53|83->53|83->53|83->53|83->53|87->58|88->59|88->59|90->61
                  -- GENERATED --
              */
          