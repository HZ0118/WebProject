
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/71740/webapps/CA2/conf/routes
// @DATE:Fri Dec 16 08:59:00 GMT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:24
  CountController_3: controllers.CountController,
  // @LINE:26
  AsyncController_2: controllers.AsyncController,
  // @LINE:29
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:24
    CountController_3: controllers.CountController,
    // @LINE:26
    AsyncController_2: controllers.AsyncController,
    // @LINE:29
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies""", """controllers.HomeController.movies"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """series""", """controllers.HomeController.series"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manga""", """controllers.HomeController.manga"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadmovie""", """controllers.HomeController.uploadmovie"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadseries""", """controllers.HomeController.uploadseries"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadmanga""", """controllers.HomeController.uploadmanga"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadMovieSubmit""", """controllers.HomeController.uploadMovieSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadSerieSubmit""", """controllers.HomeController.uploadSerieSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """uploadMangaSubmit""", """controllers.HomeController.uploadMangaSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delMovie/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteMovie(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delSerie/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteSerie(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delManga/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteManga(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_movies1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies")))
  )
  private[this] lazy val controllers_HomeController_movies1_invoker = createInvoker(
    HomeController_0.movies,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "movies",
      Nil,
      "GET",
      """ A page for movies""",
      this.prefix + """movies"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_series2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("series")))
  )
  private[this] lazy val controllers_HomeController_series2_invoker = createInvoker(
    HomeController_0.series,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "series",
      Nil,
      "GET",
      """ Series routes""",
      this.prefix + """series"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_manga3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manga")))
  )
  private[this] lazy val controllers_HomeController_manga3_invoker = createInvoker(
    HomeController_0.manga,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "manga",
      Nil,
      "GET",
      """ manga""",
      this.prefix + """manga"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_uploadmovie4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadmovie")))
  )
  private[this] lazy val controllers_HomeController_uploadmovie4_invoker = createInvoker(
    HomeController_0.uploadmovie,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "uploadmovie",
      Nil,
      "GET",
      """ u Movies""",
      this.prefix + """uploadmovie"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_uploadseries5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadseries")))
  )
  private[this] lazy val controllers_HomeController_uploadseries5_invoker = createInvoker(
    HomeController_0.uploadseries,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "uploadseries",
      Nil,
      "GET",
      """ u series""",
      this.prefix + """uploadseries"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_uploadmanga6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadmanga")))
  )
  private[this] lazy val controllers_HomeController_uploadmanga6_invoker = createInvoker(
    HomeController_0.uploadmanga,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "uploadmanga",
      Nil,
      "GET",
      """ u Manga""",
      this.prefix + """uploadmanga"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_signup7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup7_invoker = createInvoker(
    HomeController_0.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      """ Sign up""",
      this.prefix + """signup"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login8_invoker = createInvoker(
    HomeController_0.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """ Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CountController_count9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count9_invoker = createInvoker(
    CountController_3.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AsyncController_message10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message10_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_uploadMovieSubmit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadMovieSubmit")))
  )
  private[this] lazy val controllers_HomeController_uploadMovieSubmit12_invoker = createInvoker(
    HomeController_0.uploadMovieSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "uploadMovieSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """uploadMovieSubmit"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_uploadSerieSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadSerieSubmit")))
  )
  private[this] lazy val controllers_HomeController_uploadSerieSubmit13_invoker = createInvoker(
    HomeController_0.uploadSerieSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "uploadSerieSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """uploadSerieSubmit"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_uploadMangaSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("uploadMangaSubmit")))
  )
  private[this] lazy val controllers_HomeController_uploadMangaSubmit14_invoker = createInvoker(
    HomeController_0.uploadMangaSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "uploadMangaSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """uploadMangaSubmit"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_deleteMovie15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delMovie/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteMovie15_invoker = createInvoker(
    HomeController_0.deleteMovie(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteMovie",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """delMovie/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_deleteSerie16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delSerie/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteSerie16_invoker = createInvoker(
    HomeController_0.deleteSerie(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteSerie",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """delSerie/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HomeController_deleteManga17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delManga/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteManga17_invoker = createInvoker(
    HomeController_0.deleteManga(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteManga",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """delManga/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_HomeController_movies1_route(params) =>
      call { 
        controllers_HomeController_movies1_invoker.call(HomeController_0.movies)
      }
  
    // @LINE:10
    case controllers_HomeController_series2_route(params) =>
      call { 
        controllers_HomeController_series2_invoker.call(HomeController_0.series)
      }
  
    // @LINE:12
    case controllers_HomeController_manga3_route(params) =>
      call { 
        controllers_HomeController_manga3_invoker.call(HomeController_0.manga)
      }
  
    // @LINE:14
    case controllers_HomeController_uploadmovie4_route(params) =>
      call { 
        controllers_HomeController_uploadmovie4_invoker.call(HomeController_0.uploadmovie)
      }
  
    // @LINE:16
    case controllers_HomeController_uploadseries5_route(params) =>
      call { 
        controllers_HomeController_uploadseries5_invoker.call(HomeController_0.uploadseries)
      }
  
    // @LINE:18
    case controllers_HomeController_uploadmanga6_route(params) =>
      call { 
        controllers_HomeController_uploadmanga6_invoker.call(HomeController_0.uploadmanga)
      }
  
    // @LINE:20
    case controllers_HomeController_signup7_route(params) =>
      call { 
        controllers_HomeController_signup7_invoker.call(HomeController_0.signup)
      }
  
    // @LINE:22
    case controllers_HomeController_login8_route(params) =>
      call { 
        controllers_HomeController_login8_invoker.call(HomeController_0.login)
      }
  
    // @LINE:24
    case controllers_CountController_count9_route(params) =>
      call { 
        controllers_CountController_count9_invoker.call(CountController_3.count)
      }
  
    // @LINE:26
    case controllers_AsyncController_message10_route(params) =>
      call { 
        controllers_AsyncController_message10_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:29
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:31
    case controllers_HomeController_uploadMovieSubmit12_route(params) =>
      call { 
        controllers_HomeController_uploadMovieSubmit12_invoker.call(HomeController_0.uploadMovieSubmit)
      }
  
    // @LINE:33
    case controllers_HomeController_uploadSerieSubmit13_route(params) =>
      call { 
        controllers_HomeController_uploadSerieSubmit13_invoker.call(HomeController_0.uploadSerieSubmit)
      }
  
    // @LINE:35
    case controllers_HomeController_uploadMangaSubmit14_route(params) =>
      call { 
        controllers_HomeController_uploadMangaSubmit14_invoker.call(HomeController_0.uploadMangaSubmit)
      }
  
    // @LINE:37
    case controllers_HomeController_deleteMovie15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteMovie15_invoker.call(HomeController_0.deleteMovie(id))
      }
  
    // @LINE:39
    case controllers_HomeController_deleteSerie16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteSerie16_invoker.call(HomeController_0.deleteSerie(id))
      }
  
    // @LINE:41
    case controllers_HomeController_deleteManga17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteManga17_invoker.call(HomeController_0.deleteManga(id))
      }
  }
}
