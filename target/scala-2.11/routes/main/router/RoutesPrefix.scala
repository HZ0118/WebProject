
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/71740/webapps/CA2/conf/routes
// @DATE:Fri Dec 16 08:59:00 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
