package no.hiof.no.aadnet.oblig2;
import java.util.ArrayList;
import java.time.LocalDate;
public class Series {

    private int numberOfSeasons;
    private int averageRunTime;
    private ArrayList <Episode> episodes = new ArrayList<>();
    private String title;

    /*
    *   Constructors
    * */

    public Series(String title, String description, LocalDate releaseYear) {
        this.title=title;
        this.description=description;
        this.releaseYear=releaseYear;
        numberOfSeasons=0;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public void setAverageRunTime(int averageRunTime) {
        this.averageRunTime = averageRunTime;
    }

    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDate releaseYear) {
        this.releaseYear = releaseYear;
    }

    private String description;
    private LocalDate releaseYear;



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
        ArrayList<Episode> episodeList = new ArrayList<>();

        for (Episode ep : episodes){
            if (ep.getSeason()==1){
                episodeList.add(ep);
                }
            }
        return episodeList;
        }

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
                "description: "  + getDescription() + "\n";
    }
    private void calculateAverageRunTime(){
        int j;
        int totalDuration =0;
        for ( Episode e : episodes){
            totalDuration+=e.getLengthEpisode();
        }
        averageRunTime = totalDuration/episodes.size();             // Lite effektiv algoritme
    }
    public ArrayList<Character> getCast() {
        ArrayList<Character> cast = new ArrayList<>();
        int j;
                for (Episode e : episodes){
                    for (j=0;j<e.getCharacters().size();j++) {
                        if (! cast.contains(e.getCharacters().get(j))) {//If it does not contain the character -> add
                            cast.add(e.getCharacters().get(j));
                        }
                        cast.get( cast.indexOf(e.getCharacters().get(j) ) ).addOccurances();
                    }
                }
                return cast;
            }
    }