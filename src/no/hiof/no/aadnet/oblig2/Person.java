package no.hiof.no.aadnet.oblig2;
import java.time.LocalDate;


public class Person {
    private int age;
    private String givenName;
    private String familyName;

    /*
    *   Constructor
    * */

    public Person(){
    }

    public Person(int age, String givenName, String familyName){
        this.age = age;
        this.givenName = givenName;
        this.familyName = familyName;
    }

    /*
    * Getters
    * */


    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }


    public int getAge() {
        return age;
    }


    /*
    * Setters
    * */


    public void setAge(int age) {
        this.age = age;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override public String toString(){
       return "Given-name: " + getGivenName() + " " +"\n" + "Family-name: " + getFamilyName() + "\n" +
               "Age: " +  getAge();
    }

}
