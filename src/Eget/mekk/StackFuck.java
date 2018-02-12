package Eget.mekk;
import java.util.Scanner;
/**
 * Created by lefdal on 11.02.2018.
 */
public class StackFuck {
    public static void main(String[] args){



        ThreeDim h = new ThreeDim() {
            @Override public double surface(){
                return Math.PI;
            }

            @Override public double volume(){
                return Math.E;
            }

        };

    }
}
