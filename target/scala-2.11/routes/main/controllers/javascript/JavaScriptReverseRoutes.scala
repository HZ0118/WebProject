
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/71740/webapps/CA2/conf/routes
// @DATE:Fri Dec 16 08:59:00 GMT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:26
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def manga: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.manga",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "manga"})
        }
      """
    )
  
    // @LINE:18
    def uploadmanga: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.uploadmanga",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadmanga"})
        }
      """
    )
  
    // @LINE:10
    def series: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.series",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "series"})
        }
      """
    )
  
    // @LINE:41
    def deleteManga: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteManga",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delManga/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:39
    def deleteSerie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteSerie",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delSerie/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:16
    def uploadseries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.uploadseries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadseries"})
        }
      """
    )
  
    // @LINE:14
    def uploadmovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.uploadmovie",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadmovie"})
        }
      """
    )
  
    // @LINE:35
    def uploadMangaSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.uploadMangaSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadMangaSubmit"})
        }
      """
    )
  
    // @LINE:20
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:33
    def uploadSerieSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.uploadSerieSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadSerieSubmit"})
        }
      """
    )
  
    // @LINE:31
    def uploadMovieSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.uploadMovieSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "uploadMovieSubmit"})
        }
      """
    )
  
    // @LINE:37
    def deleteMovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteMovie",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delMovie/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:8
    def movies: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.movies",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:22
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }


}
