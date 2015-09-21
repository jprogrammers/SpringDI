package com.jprogrammers.spring.autowiring;

import com.jprogrammers.spring.Finder;
import com.jprogrammers.spring.Movie;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alireza on 9/21/15.
 */
@Component
public class DummyMovieFinder implements Finder {
    @Override
    public List<Movie> findAll() {
        return new ArrayList<Movie>();
    }
}
