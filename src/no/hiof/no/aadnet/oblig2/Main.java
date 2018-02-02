package no.hiof.no.aadnet.oblig2;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        /*
        *   Oppgave 2
        * */

        Series bojack= new Series("Bojack Horseman","A series about a washed up antropomerphic horse actor",2004);
        Series buffy = new Series("Buffy the Vampire Slayer","A really amazing series about a girl that fights vampires",1997);

        Episode faithHopeAndTricks = new Episode(37, 1, "Faith, Hope & Trick",30);
        Episode bandCandy = new Episode(40, 1, "Band Candy",30);
        Episode theZeppo = new Episode(47, 2, "The Zeppo",30);
        Episode passion = new Episode(29, 3, "Passion",30);
        Episode innocence = new Episode(26, 4, "Innocence",30);

        buffy.addEpisode(faithHopeAndTricks);
        buffy.addEpisode(bandCandy);
        buffy.addEpisode(theZeppo);
        buffy.addEpisode(passion);
        buffy.addEpisode(innocence);



        System.out.println("Oppgave 3");


        System.out.println("=======================================================");
        System.out.println("The season where we have the amazing episode " + faithHopeAndTricks.getTitle() + " is in season " + faithHopeAndTricks.getSeason() );
        System.out.println("The average run-time for an episode of Buffy is " + buffy.getAverageRunTime() +  " minutes"); //Note I am pulling these number from a hat
        System.out.println("=======================================================");
       System.out.println(buffy.toString());
       System.out.println("=======================================================");
       System.out.println(faithHopeAndTricks.toString());
       System.out.println("=======================================================");



        System.out.println("\t Oppgave 4 \t");
        System.out.println("=======================================================Season 4 =======================================================");
        /*
        * 1). Initialize 5 seasons w/. random length for each episode.
        * 2). Print out the entire season 4.
        * */

        Series genericSeries = new Series("Generic Series: AF","A very generic series, " +
                "probably a spin-off series set in the CSI universe", 2019);


        int j;
        int k;
        for(j=1;j<=5;j++){
            for (k=1;k<=20;k++){
                Random r = new Random();
                Episode y = new Episode(k, j, "", r.nextInt(11)+20);
                genericSeries.addEpisode(y);
            }
        }
        System.out.println(genericSeries.GetEpisodesFromSeason(4));

        System.out.println("======================================================= Oppgave 5=======================================================");
        System.out.println("The average runtime for an episode for this series is approximately "+ genericSeries.getAverageRunTime() +
                " minutes per episode");


        /*
        * ======================================================= Oppgave 7 & 8 =======================================================)
        * */
        /*
        System.out.println(buffy.getNumberOfSeasons() );
        Episode e = new Episode(5,6,"lol",50);
        buffy.addEpisode(e);
*/








        // Programmet vil termineres på stedet, s.a vi ikke får printet ut noe mer ss. linjen under
        System.out.println("Sinh(x)=(exp(x)-exp(-x))/2");
    }
}