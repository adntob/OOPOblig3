package Innlevering1;
import java.util.ArrayList;

public class Series {
    private String title;
    private String description;
    private int release;

    private int howManySeasons;
    private int averageRunTime;
    private ArrayList <Episode> episodes = new ArrayList<>();

    /*
    *   Constructors
    * */

    public Series(String title, String description, int release) {
        this.title = title;
        this.description = description;
        this.release = release;
    }

    public Series(String title, String description, int release, int howManySeasons) {
        this.title = title;
        this.description = description;
        this.release = release;
        this.howManySeasons = howManySeasons;
    }


    /*
    * Getters & setters
    * */

    public int getHowManySeasons() {
        return howManySeasons;
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

    public void setEpisodes(ArrayList<Episode> episodes)
    {
        this.episodes = episodes;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getRelease()
    {
        return release;
    }

    public void setRelease(int release)
    {
        this.release = release;
    }

    /*
    * Metoder
    * */

    public void addEpisode(Episode episode)
    {
        if (episode.getSeason()>(howManySeasons+1) ){
            throw new IllegalArgumentException("Error, invalid season");
        }
        else{
            if(episode.getSeason()==(howManySeasons+1) ){
                howManySeasons+=1;
            }
            episodes.add(episode);
            calculateAverageRunTime();
        }
    }

    @Override
    public String toString() {
        return "Series: "+ title + "\n" +
                "description: "  + description + "\n" +
                "release: " + release;
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
