package ro.fasttrackit.curs25.movies.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs25.movies.domain.Movie;
import ro.fasttrackit.curs25.movies.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(final MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    public Movie getMovie(final Integer id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not find movie with id " + id));
    }
}
