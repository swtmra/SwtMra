package datatypes;

import dbadapter.MovieDatabase;

import java.util.List;

public class User {
    private String email;
    private String username;
    private int age;
    private List<MovieDatabase> movieList;

    public User() {
    }

    public User(String email, String username, int age, List<MovieDatabase> movieList) {
        this.email = email;
        this.username = username;
        this.age = age;
        this.movieList = movieList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<MovieDatabase> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<MovieDatabase> movieList) {
        this.movieList = movieList;
    }
}
