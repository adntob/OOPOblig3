package no.hiof.no.aadnet.oblig2;

/**
 * Created by lefdal on 02.02.2018.
 */
public class Production {
    public String title;
    public String description;
    public int releaseYear;
    Person director;


    public void setTitle(String title) {

        this.title = title;
    }

    public void setDescription(String description)

    {
        this.description = description;
    }

    public String getTitle()
    {

        return title;
    }

    public void setReleaseYear(int releaseYear)
    {

        this.releaseYear = releaseYear;
    }


    public String getDescription() {

        return description;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }


}
