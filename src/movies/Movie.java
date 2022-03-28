package movies;

public class Movie {
    private String name;
    private String genre;

    public Movie(String name, String category) {
        this.name = name;
        this.genre = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
