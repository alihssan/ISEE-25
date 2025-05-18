public class MovieSystem {
    public static void main(String[] args) {
        // Create genres
        Genre action = new Genre("Action");
        Genre drama = new Genre("Drama");
        Genre comedy = new Genre("Comedy");

        // Create directors
        Director director1 = new Director("Christopher Nolan");
        Director director2 = new Director("Steven Spielberg");

        // Create sets
        Set citySet = new Set("City Street", "Urban city street with tall buildings");
        Set beachSet = new Set("Beach", "Tropical beach with palm trees");

        // Create actors
        MainActor mainActor1 = new MainActor("Tom Cruise");
        MainActor mainActor2 = new MainActor("Leonardo DiCaprio");
        SupportingActor supportingActor1 = new SupportingActor("Morgan Freeman");
        SupportingActor supportingActor2 = new SupportingActor("Emma Watson");

        // Create a movie
        Movie movie = new Movie("The Great Adventure");
        
        // Add genres to movie
        movie.addGenre(action);
        movie.addGenre(drama);
        action.addMovie(movie);
        drama.addMovie(movie);

        // Add directors to movie
        movie.addDirector(director1);
        movie.addDirector(director2);
        director1.addMovie(movie);
        director2.addMovie(movie);

        // Add main actors to movie
        movie.addMainActor(mainActor1);
        movie.addMainActor(mainActor2);
        mainActor1.addMovie(movie);
        mainActor2.addMovie(movie);

        // Create scenes
        Scene scene1 = new Scene("Opening chase scene", movie, citySet);
        Scene scene2 = new Scene("Beach confrontation", movie, beachSet);
        Scene scene3 = new Scene("Final showdown", movie, citySet);

        // Add scenes to movie
        movie.addScene(scene1);
        movie.addScene(scene2);
        movie.addScene(scene3);

        // Add scenes to sets
        citySet.addScene(scene1);
        citySet.addScene(scene3);
        beachSet.addScene(scene2);

        // Add actors to scenes
        scene1.addActor(mainActor1);
        scene1.addActor(supportingActor1);
        scene2.addActor(mainActor2);
        scene2.addActor(supportingActor2);
        scene3.addActor(mainActor1);
        scene3.addActor(mainActor2);
        scene3.addActor(supportingActor1);

        // Print movie information
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("\nGenres:");
        for (Genre genre : movie.getGenres()) {
            System.out.println("- " + genre.getName());
        }

        System.out.println("\nDirectors:");
        for (Director director : movie.getDirectors()) {
            System.out.println("- " + director.getName());
        }

        System.out.println("\nMain Actors:");
        for (MainActor actor : movie.getMainActors()) {
            System.out.println("- " + actor.getName());
        }

        System.out.println("\nScenes:");
        for (Scene scene : movie.getScenes()) {
            System.out.println("\nScene: " + scene.getDescription());
            System.out.println("Set: " + scene.getSet().getName());
            System.out.println("Actors in scene:");
            for (Actor actor : scene.getActors()) {
                System.out.println("- " + actor.getName());
            }
        }
    }
} 