import java.util.ArrayList;
import java.util.List;

public class Director {
    private String name;
    private List<Movie> movies;

    public Director(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public List<Movie> getMovies() {
        return movies;
    }
} 