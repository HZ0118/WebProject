package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import models.*;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render());
    }

    public Result movies() {
      List<Movies> movieList = Movies.findAll();
        return ok(movies.render(movieList));
    }

    public Result series() {
        List<Series> serieList = Series.findAll();
        return ok(series.render(serieList));
    }

    public Result manga() {
        List<Manga> mangaList = Manga.findAll();
        return ok(manga.render(mangaList));
    }

    public Result uploadmovie() {

        Form<Movies> uploadMovieForm = formFactory.form(Movies.class);

        return ok(uploadmovie.render(uploadMovieForm));
    }

    public Result uploadseries() {
        Form<Series> uploadSerieForm = formFactory.form(Series.class);
        return ok(uploadseries.render(uploadSerieForm));
    }

    public Result uploadmanga() {
        Form<Manga> uploadMangaForm = formFactory.form(Manga.class);
        return ok(uploadmanga.render(uploadMangaForm));
    }

    public Result signup() {
      return ok(signup.render());
    }

    public Result login() {
      return ok(login.render());
    }

    public Result uploadMovieSubmit() {
        Form<Movies> newMovieForm = formFactory.form(Movies.class).bindFromRequest();

        if(newMovieForm.hasErrors()) {
            return badRequest(uploadmovie.render(newMovieForm));
        }

        Movies newMovie = newMovieForm.get();

        newMovie.save();

        flash("success", "Product " + newMovie.getName() + " has been created");

        return redirect(controllers.routes.HomeController.movies());
    }

    public Result uploadSerieSubmit() {
        Form<Series> newSerieForm = formFactory.form(Series.class).bindFromRequest();

        if(newSerieForm.hasErrors()) {
            return badRequest(uploadseries.render(newSerieForm));
        }

        Series newSerie = newSerieForm.get();

        newSerie.save();

        flash("success", "Serie " + newSerie.getName() + " has been created");

        return redirect(controllers.routes.HomeController.series());
    }

    public Result uploadMangaSubmit() {
        Form<Manga> newMangaForm = formFactory.form(Manga.class).bindFromRequest();

        if(newMangaForm.hasErrors()) {
            return badRequest(uploadmanga.render(newMangaForm));
        }

        Manga newManga = newMangaForm.get();

        newManga.save();

        flash("success", "Manga " + newManga.getName() + " has been created");

        return redirect(controllers.routes.HomeController.manga());
    }

    public Result deleteMovie(Long id) {
        Movies.find.ref(id).delete();

        flash("success", "Movie has been deleted");

        return redirect(routes.HomeController.movies());
    }

    public Result deleteSerie(Long id) {
        Series.find.ref(id).delete();

        flash("success", "Serie has been deleted");

        return redirect(routes.HomeController.series());
    }

    public Result deleteManga(Long id) {
        Manga.find.ref(id).delete();

        flash("success", "Manga has been deleted");

        return redirect(routes.HomeController.manga());
    }

}
