package no.hiof.no.aadnet.oblig2;
import java.util.ArrayList;

public class Series extends Production {

    private int numberOfSeasons;
    private int averageRunTime;
    private ArrayList <Episode> episodes = new ArrayList<>();

    /*
    *   Constructors
    * */

    private String title;
    private String description;
    private int releaseYear;


    public Series(String title, String description, int releaseYear) {
        this.title=title;
        this.description=description;
        this.releaseYear=releaseYear;
        numberOfSeasons=0;
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
        return "Series: "+ getTitle() + "\n" +
                "description: "  + getDescription() + "\n" +
                "releaseYear: " + getReleaseYear();
    }


    private void calculateAverageRunTime(){
        int j;
        int totalDuration =0;
        for (j=0;j< episodes.size();j++){
            totalDuration+=episodes.get(j).getLengthEpisode();
        }
        averageRunTime = totalDuration/episodes.size();
    }

    public ArrayList<Character> getCast() {
        ArrayList<Character> cast = new ArrayList<>();
        Character ro;
        int i, j;


        for (i=0;i<episodes.size();i++){
            for (j=0;j<episodes.get(i).getCharacters().size();j++)
                cast.add( episodes.get(i).getCharacters().get(j) );
            }
                return cast;
            }
    }


