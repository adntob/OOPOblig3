package no.hiof.no.aadnet.oblig2;

/**
 * Created by lefdal on 02.02.2018.
 */
public class Character {

    private Person actor;
    private String characterName;
    private String characterSurname;

    public Character(Person actor, String characterName, String characterSurname){
        this.actor = actor;
        this.characterName=characterName;
        this.characterSurname=characterSurname;
    }

    public Person getActor() {
        return actor;
    }

    public void setActor(Person actor) {
        this.actor = actor;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterSurname() {
        return characterSurname;
    }

    public void setCharacterSurname(String characterSurname) {
        this.characterSurname = characterSurname;
    }


}
