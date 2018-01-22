package Innlevering1;
import java.util.ArrayList;

public class Series {
    private String title;
    private String description;
    private int releaseYear;

    private int numberOfSeasons;
    private int averageRunTime;
    private ArrayList <Episode> episodes = new ArrayList<>();

    /*
    *   Constructors
    * */

    public Series(String title, String description, int releaseYear) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
    }

    public Series(String title, String description, int releaseYear, int numberOfSeasons) {
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.numberOfSeasons = numberOfSeasons;
    }


    /*
    * Setters
    * */

    public void setEpisodes(ArrayList<Episode> episodes)
    {
        this.episodes = episodes;
    }

    public void setTitle(String title) {

        this.title = title;
    }


    public void setReleaseYear(int releaseYear)
    {
        this.releaseYear = releaseYear;
    }


    public void setDescription(String description)
    {
        this.description = description;
    }

    /*
    * Getters
    * */


    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public int getAverageRunTime(){
        return averageRunTime;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public ArrayList<Episode> GetEpisodesFromSeason(int i){
        int k;
        ArrayList<Episode> e = new ArrayList<>();

        for (k=0;k<episodes.size();k++){
            if (episodes.get(k).getSeason()==i){
               e.add(episodes.get(k));
            }
        }
        return e;
    }


    public String getTitle()
    {
        return title;
    }


    public String getDescription() {

        return description;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

    /*
    * Metoder
    * */

    public void addEpisode(Episode episode)
    {
        if (episode.getSeason()>(numberOfSeasons +1) ){
            throw new IllegalArgumentException("Error, invalid season");
        }
        else{
            if(episode.getSeason()==(numberOfSeasons +1) ){
                numberOfSeasons +=1;
            }
            episodes.add(episode);
            calculateAverageRunTime();
        }
    }

    @Override
    public String toString() {
        return "Series: "+ title + "\n" +
                "description: "  + description + "\n" +
                "releaseYear: " + releaseYear;
    }

    private void calculateAverageRunTime(){
        int j;
        int totalDuration =0;
        for (j=0;j< episodes.size();j++){
            totalDuration+=episodes.get(j).getLengthEpisode();
        }
        averageRunTime = totalDuration/episodes.size();
    }
}
