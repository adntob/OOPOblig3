package Innlevering1;
import java.util.Random;

public class Main {

    public static void main(String[] args){




        /*
        *   Oppgave 2
        * */

        Series bojack= new Series("Bojack Horseman","A series about a washed up antropomerphic horse actor",2004, 4);
        Series buffy = new Series("Buffy the Vampire Slayer","A really amazing series about a girl that fights vampires",1997,8);

        Episode faithHopeAndTricks = new Episode(37, 3, "Faith, Hope & Trick",30);
        Episode bandCandy = new Episode(40, 3, "Band Candy",30);
        Episode theZeppo = new Episode(47, 3, "The Zeppo",30);
        Episode passion = new Episode(29, 2, "Passion",30);
        Episode innocence = new Episode(26, 2, "Innocence",30);

        buffy.addEpisode(faithHopeAndTricks);
        buffy.addEpisode(bandCandy);
        buffy.addEpisode(theZeppo);
        buffy.addEpisode(passion);
        buffy.addEpisode(innocence);


        System.out.println(faithHopeAndTricks.getSeason() );
        System.out.println(buffy.getAverageRunTime() );




        System.out.println("\t Oppgave 4 \t");
        System.out.println("=======================================================Season 4 =======================================================");
        /*
        * 1). Initialize 5 seasons w/. random length for each episode.
        * 2). Print out the entire season 4.
        * */

        Series genericSeries = new Series("Generic Series: AF","A very generic series, " +
                "probably a spin-off series set in the CSI universe", 2019,5);


        int j;
        int k;
        for(j=1;j<=5;j++){
            Random r = new Random();
            for (k=1;k<=20;k++){
                Episode y = new Episode(k, 4, "", r.nextInt(11)+20);
                genericSeries.addEpisode(y);
            }
        }
        System.out.println(genericSeries.GetEpisodesFromSeason(4).toString());

        System.out.println("======================================================= Oppgave 5=======================================================");
        System.out.println("The average runtime for an episode of this series is approximately "+ genericSeries.getAverageRunTime() +
                " minutes per episode");


        /*
        * ======================================================= (Oppgave 7 & 8 =======================================================)
        * */

        System.out.println("As of today, there are " + buffy.getNumberOfSeasons() +  " seasons of Buffy the vampire slayer");

        Episode oneMoreSeason = new Episode(133,9,"Faith Arc", 60);
        buffy.addEpisode(oneMoreSeason);

        System.out.println("As of today, there are " + buffy.getNumberOfSeasons() +  " seasons of Buffy the vampire slayer");

        Episode tooHighSeason = new Episode(99,11,"Paying Joss Whedon's bills",40);
        buffy.addEpisode(tooHighSeason);


        // Programmet vil termineres på stedet, s.a vi ikke får printet ut noe mer ss. linjen under
        System.out.println("Sinh(x)=(exp(x)-exp(-x))/2");

    }


}
