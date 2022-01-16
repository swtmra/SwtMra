package datatypes;

import java.util.Date;

public class Movie {
    int mid;
    String title;
    String actor;
    int director_id;
    Date publishing_date;


    public Movie(int mid, String title, String actor, int director_id, Date publishing_date) {

        this.mid = mid;
        this.actor = actor;
        this.director_id = director_id;
        this.title = title;
        this.publishing_date = publishing_date;
        publishing_date = new Date();

    }


}
