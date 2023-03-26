package Lab14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args){
        Point[] p1= new Point[3];

        p1[0]= new Point(3,5);
        p1[1]= new Point(1,8);
        p1[2]= new Point(6,3);

        for( Point p: p1){
            System.out.println(p.toString());
        }
        Arrays.sort(p1);
        System.out.println("\nAfter sort");
        for( Point p: p1){

            System.out.println(p.toString());
        }
    }
}
