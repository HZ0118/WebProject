
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
  """),format.raw/*3.3*/("""<div class="container text-center">
    <h4 >Welcome to AnimeWorld!</h4>
    <p>The best site for your favourite anime and manga reviews!</p>
    <p>AnimeWorld is the largest anime and manga database and community created by anime fans, for all other anime fans out there.</p>
    <p>We provide users with a quick and no-hassle way to catalog their anime and manga collections, as well as a platform to communicate with like minded fans.</p>
    <p>Read and stay up to date with all Anime Movies, Anime Series and Mangas.</p>
    <p>This is the best site to read the latest reviews of all your favorite anime movies, series and also your favourite mangas.</p>
    <p>Check the latest popular movies，recently updated series and mangas like Naruto, One Piece and Bleach.</p>
    <p>Enjoy Reading!</p>
  </div>
  """)))}),format.raw/*13.4*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 00:30:38 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/index.scala.html
                  HASH: 9741579106ed22a83558ac4ce74d1e1739b39675
                  MATRIX: 827->3|847->15|886->17|916->21|1767->842
                  LINES: 32->2|32->2|32->2|33->3|43->13
                  -- GENERATED --
              */
          