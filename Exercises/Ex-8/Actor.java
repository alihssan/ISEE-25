import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String name;
    private List<Scene> scenes;

    public Actor(String name) {
        this.name = name;
        this.scenes = new ArrayList<>();
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public List<Scene> getScenes() {
        return scenes;
    }
} 