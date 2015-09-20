package com.jprogrammers.spring;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alireza on 9/20/15.
 */
public class MovieLister {

    private Finder finder;

/*
    private Finder finderProperty;

    public void setFinderProperty(Finder finderProperty) {
        this.finderProperty = finderProperty;
    }
*/

    // inject through constructor
    public MovieLister(Finder finder) {
        this.finder = finder;
    }

    public List<Movie> moviesDirectedBy(String directorName){

        List<Movie> foundMovies = new ArrayList<Movie>();

        List<Movie> movies = finder.findAll();
        for (Movie movie : movies) {
            if (movie.getDirector().equals(directorName)) {
                foundMovies.add(movie);
            }
        }

        return foundMovies;
    }

}
