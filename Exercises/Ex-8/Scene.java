import java.util.ArrayList;
import java.util.List;

public class Scene {
    private String description;
    private Movie movie;
    private Set set;
    private List<Actor> actors;

    public Scene(String description, Movie movie, Set set) {
        this.description = description;
        this.movie = movie;
        this.set = set;
        this.actors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public Movie getMovie() {
        return movie;
    }

    public Set getSet() {
        return set;
    }

    public List<Actor> getActors() {
        return actors;
    }
} 