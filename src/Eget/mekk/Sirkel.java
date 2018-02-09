package Eget.mekk;

/**
 * Created by lefdal on 08.02.2018.
 */
public class Sirkel extends Figur {
    public double r;

    Sirkel(){

    }

    public void utskrift(){
        System.out.println("\t_" + "\n( \t\t)" + "\n\t_");
    }


    Sirkel(double r){
        this.r = r;
    }

      public double area(){
       return Math.PI*Math.pow(r,2);
    }

    public double perimeter(){
          double p = 2*Math.PI*r;
          return p;

    }
}
