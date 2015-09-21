package com.jprogrammers.spring.autowiring;

import com.jprogrammers.spring.Finder;
import com.jprogrammers.spring.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alireza on 9/21/15.
 */
@Component
public class MovieLister {

    @Qualifier("inMemoryMovieFinder")
    @Autowired
    private Finder finder;

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
