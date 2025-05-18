import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<Genre> genres;
    private List<Director> directors;
    private List<Scene> scenes;
    private List<MainActor> mainActors;

    public Movie(String title) {
        this.title = title;
        this.genres = new ArrayList<>();
        this.directors = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.mainActors = new ArrayList<>();
    }

    public void addGenre(Genre genre) {
        if (genres.size() < 5) {
            genres.add(genre);
        }
    }

    public void addDirector(Director director) {
        if (directors.size() < 2) {
            directors.add(director);
        }
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
    }

    public void addMainActor(MainActor actor) {
        if (mainActors.size() < 4) {
            mainActors.add(actor);
        }
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public List<Scene> getScenes() {
        return scenes;
    }

    public List<MainActor> getMainActors() {
        return mainActors;
    }
} 