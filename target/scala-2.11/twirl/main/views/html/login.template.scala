
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
  <title>Anime World</title>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*9.48*/routes/*9.54*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.95*/("""">
  <!-- jQuery library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <!-- Latest compiled JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="shortcut icon" type="image/png" href="/">
</head>
<body>
  """),_display_(/*17.4*/main("Login")/*17.17*/ {_display_(Seq[Any](format.raw/*17.19*/("""

  """),format.raw/*19.3*/("""<div class="container">

  <h4 class="container text-center">Login</h4>
  <form>
    <div class="form-group">
      <label for="name">Username:</label>
      <input type="name" class="form-control" id="name" placeholder="Enter username">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-primary btn-sm center-block">Log In</button>
  </form>
</div>
""")))}),format.raw/*37.2*/("""
"""),format.raw/*38.1*/("""</body>
</html>
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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 00:30:39 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/login.scala.html
                  HASH: 7b3eaed0a05f266f313ed23b243d6748bd879cf2
                  MATRIX: 827->0|1212->359|1226->365|1287->406|1646->739|1668->752|1708->754|1741->760|2407->1396|2436->1398
                  LINES: 32->1|40->9|40->9|40->9|48->17|48->17|48->17|50->19|68->37|69->38
                  -- GENERATED --
              */
          