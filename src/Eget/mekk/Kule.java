package Eget.mekk;

/**
 * Created by lefdal on 08.02.2018.
 */
public class Kule extends Sirkel implements ThreeDim {
    Kule(double r){
        super.r=r;
    }


    public double volume(){
        return (4/3)*Math.PI*Math.pow(r,3);
    }

    public double surface(){
        return 4*Math.pow(this.r, 3)*Math.PI/3;
    }




}
