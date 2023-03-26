package Lab02;
import java.util.*;
public class RandomGrade {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("How many letter grades?");
        int n= input.nextInt();
       printNRandomLetterGrade(n);
    }
    public static void printNRandomLetterGrade(int n){
            for(int i=1;i<=n;i++){
                double Value=Math.random()*9;
                switch ((int) Value){
                    case 0-> System.out.println("A+");
                    case 1-> System.out.println("A");
                    case 2-> System.out.println("B+");
                    case 3-> System.out.println("B");
                    case 4-> System.out.println("C+");
                    case 5-> System.out.println("C");
                    case 6-> System.out.println("D+");
                    case 7-> System.out.println("D");
                    case 8-> System.out.println("F");


                }
            }



    }
}
