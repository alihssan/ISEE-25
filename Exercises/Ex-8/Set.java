import java.util.ArrayList;
import java.util.List;

public class Set {
    private String name;
    private String description;
    private List<Scene> scenes;

    public Set(String name, String description) {
        this.name = name;
        this.description = description;
        this.scenes = new ArrayList<>();
    }

    public void addScene(Scene scene) {
        scenes.add(scene);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Scene> getScenes() {
        return scenes;
    }
} 