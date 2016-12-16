package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.*;

@Entity
public class Movies extends Model {

  // Propeties
      @Id
      private Long id;
      @Constraints.Required
      private String name;
      @Constraints.Required
      private String genre;
      @Constraints.Required
      private String studio;
      @Constraints.Required
      private int realeaseYear;
      @Constraints.Required
      private double rating;



      public Movies(){
      }

      public Movies(Long id, String name, String genre, String studio, int  realeaseYear, double rating){
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.studio = studio;
        this.realeaseYear = realeaseYear;
        this.rating = rating;
      }

      public static Finder<Long, Movies> find = new Finder<Long, Movies>(Movies.class);

      public static List<Movies> findAll() {
        return Movies.find.all();
      }

      public Long getId(){
        return id;
      }

      public void setId(Long id){
        this.id = id;
      }

      public String getName(){
        return name;
      }

      public void setName(String name){
        this.name = name;
      }

      public String getGenre(){
        return genre;
      }

      public void setGenre(String genre){
        this.genre = genre;
      }

      public String getStudio(){
        return studio;
      }

      public void setStudio(String studio){
        this.studio = studio;
      }

      public int getRealeaseYear(){
        return realeaseYear;
      }

      public void setRealeaseYear(int realeaseYear){
        this.realeaseYear = realeaseYear;
      }

      public double getRating(){
        return rating;
      }

      public void setRating(double rating){
        this.rating = rating;
      }


}
