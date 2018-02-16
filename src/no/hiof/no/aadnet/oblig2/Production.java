package no.hiof.no.aadnet.oblig2;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * Created by lefdal on 02.02.2018.
 */
public class Production {
    private LocalDate releaseDate;

    private String title;
    private String description;
    //private int releaseDate;
    private Person director;
    public ArrayList<Character> characters = new ArrayList<>();

    public Production(){

    }
    public Production(String title, String description){
        this.title=title;
        this.description=description;
    }

    public Production(String title){
        this.title=title;
    }

    public Production(String title, String description, LocalDate releaseDate){
        this.title = title;
        this.description=description;
        this.releaseDate = releaseDate;
    }

    public Production(String title, LocalDate releaseDate){
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public void setCharacters(ArrayList<Character> roles, Character role) {
        roles.add(role);
    }

    public ArrayList<Character> getCharacters()
    {
        return characters;
    }

    public void addCharacter(Character role){
        this.characters.add(role);
    }

    public void addSeveralCharacters(ArrayList<Character> rolesToBeAdded){
        int i;
        for(i=0;i<rolesToBeAdded.size();i++){
            this.characters.add(rolesToBeAdded.get(i));
        }

    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

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

    public void setReleaseDate(LocalDate releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getReleaseDate()
    {
        return releaseDate;
    }

    @Override
    public String   toString() {
        return "Production" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate=" + releaseDate +
                ", director=" + director +
                ", characters=" + characters;
    }
}
