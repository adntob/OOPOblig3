package no.hiof.no.aadnet.oblig2;
import java.time.LocalDate;

public class Episode extends Production {

    private int episodeNumber;
    private int season;
    private int lengthEpisode; //In minutes

    /**
    * Constructors
    * */

    public Episode(){
    }

    public Episode(int episodeNumber, int season, String title, int lengthEpisode){
        this.episodeNumber = episodeNumber;
        this.season = season;
        super.title = title;
        this.lengthEpisode = lengthEpisode;
    }

    public Episode(int episodeNumber, int season, String title){
        this.episodeNumber = episodeNumber;
        this.season = season;
        super.title = title;
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

    public void setLengthEpisode(int lengthEpisode)
    {
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
