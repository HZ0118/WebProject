
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.4*/main("Signup")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""

  """),format.raw/*4.3*/("""<div class="container">

  <h4 class="container text-center">Sign Up</h4>
  <form>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="name">Username:</label>
      <input type="name" class="form-control" id="name" placeholder="Enter username">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
    <button type="submit" class="btn btn-primary btn-sm center-block">Sign Up</button>
  </form>
</div>
""")))}),format.raw/*23.2*/("""
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
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Fri Dec 16 00:30:40 GMT 2016
                  SOURCE: C:/Users/71740/webapps/CA2/app/views/signup.scala.html
                  HASH: 71fd33311ec07cc1ac5e9e8009319824c36743a4
                  MATRIX: 829->5|851->19|890->21|922->27|1662->737
                  LINES: 32->2|32->2|32->2|34->4|53->23
                  -- GENERATED --
              */
          