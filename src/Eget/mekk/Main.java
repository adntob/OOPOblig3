package Eget.mekk;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Figur> liste = new ArrayList<Figur>();
        Sirkel s = new Sirkel(5);

        liste.add(s);

        System.out.println(s.area());
        Figur k = new Sirkel(4);

        liste.add(k);

        for (Figur f : liste){
            System.out.println(f.area());
        }

        System.out.println((Boolean) liste.contains(k));

    }
}
