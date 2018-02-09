package no.hiof.no.aadnet.oblig2;
import java.util.ArrayList;

/**
 * Created by lefdal on 02.02.2018.
 */
public class Production {

    private String title;
    private String description;
    private int releaseYear;
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

    public ArrayList<Character> getCharacters()
    {
        return characters;
    }

    public void setCharacters(ArrayList<Character> roles, Character role) {
        roles.add(role);
    }

    public Production(String title, String description, int releaseYear){
        this.title = title;
        this.description=description;
        this.releaseYear= releaseYear;
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

    public void setReleaseYear(int releaseYear)
    {
        this.releaseYear = releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

    @Override
    public String   toString() {
        return "Production" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", director=" + director +
                ", characters=" + characters;
    }
}
