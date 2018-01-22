package Innlevering1;
import java.time.LocalDate;

public class Episode {

    private int episodeNumber;
    private int season;
    private String title;
    private int lengthEpisode; //In minutes

    /**
    * Konstruktører
    * */

    public Episode(int episodeNumber, int season, String title, int lengthEpisode){
        this.episodeNumber = episodeNumber;
        this.season = season;
        this.title = title;
        this.lengthEpisode = lengthEpisode;
    }

    public Episode(int episodeNumber, int season, String title){
        this.episodeNumber = episodeNumber;
        this.season = season;
        this.title = title;
    }

    /**
     * Getters
     **/
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public int getSeason() {
        return season;
    }

    public String getTitle() {
        return title;
    }

    public int getLengthEpisode() {
        return lengthEpisode;
    }

    /**
     * Setters
     **/

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLengthEpisode(int lengthEpisode) {
        this.lengthEpisode = lengthEpisode;
    }

    @Override
    public String toString() {
        return
                "episode: " + episodeNumber + "\n" +
                "season: " + season + "\n" +
                "title:" + title + '\n' +
                "length: " + lengthEpisode;
    }
}
