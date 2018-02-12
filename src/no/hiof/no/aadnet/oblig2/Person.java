package no.hiof.no.aadnet.oblig2;
import java.time.LocalDate;
/**
 * Created by lefdal on 02.02.2018.
 */
public class Person {
    private int age;
    private String givenName;
    private String familyName;

    public Person(){
    }

    public Person(int age, String givenName, String familyName){
        this.age = age;
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override public String toString(){
       return "Given-name: " + getGivenName() + " " +"\n" + "Family-name: " + getFamilyName() + "\n" +
               "Age: " +  getAge();
    }

}
