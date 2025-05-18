import java.util.ArrayList;
import java.util.List;

public class MainActor extends Actor {
    private List<Movie> movies;

    public MainActor(String name) {
        super(name);
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Getters and setters
    public List<Movie> getMovies() {
        return movies;
    }
} 