package no.hiof.no.aadnet.oblig2;

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

        /*
        *   MOVIE EXAMPLE
        * */

        System.out.println("************************************************************************************");
        System.out.println("*************************************MOVIE*****************************************");

        Movie calculusTheMovie = new Movie("Calculus: The Movie", "A fairly derivative movie " +
                "about a secret tangent and his his epic quest to achieve change",1675);

        Person leibniz = new Person(29,"Gottfried","Leibniz");

        calculusTheMovie.setDirector(leibniz);

        System.out.println(calculusTheMovie.getDirector() );

        Character theVillain = new Character(new Person(33,"Isaac","Newton"),"Douche","Bag");

        Character scaryBlackGuy = new Character(new Person(40,"Samuel L.", "Jackson"),"Scary","Black Guy");

        Character theLoveInterest = new Character(new Person(25,"Ariana","Grande"),"Token","Love Interest");

        calculusTheMovie.addCharacter(theVillain);

        calculusTheMovie.addCharacter(scaryBlackGuy);
        System.out.println(calculusTheMovie.getCharacters().get(1).toString() );

        /*
        *   TV SERIES EXAMPLE
        * */
        System.out.println("************************************************************************************");
        System.out.println("*************************************TV SERIES**************************************");
        Person whedon = new Person(54, "Joss","Whedon");

        buffy.setDirector(whedon);
        System.out.println(buffy.getDirector());

        Person sarah = new Person(41,"Sarah Michelle", "Gellar");
        Character buffySummers = new Character(sarah, "Buffy","Summers");

        Person david = new Person(49,"David", "Boreanaz");
        Character angel = new Character(david,"Angelus"," ");

        buffy.addCharacter(buffySummers);
        buffy.addCharacter(angel);

        buffy.getCast();

        Character faith = new Character(new Person(38,"Eliza", "Dushku"), "Faith","Lehane");


        faithHopeAndTricks.addCharacter(buffySummers);
        theZeppo.addCharacter(faith);
        faithHopeAndTricks.addCharacter(angel);

        faithHopeAndTricks.addCharacter(faith);

        faithHopeAndTricks.setDirector(whedon);
        faithHopeAndTricks.addCharacter(buffySummers);
        faithHopeAndTricks.addCharacter(angel);
        System.out.println(buffy.getCast());
    }
}