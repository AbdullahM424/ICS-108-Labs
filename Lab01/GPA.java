package Lab01;
import java.util.*;
public class GPA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int course;
        double sumCredit=0;
        int sumAll=0;
        System.out.println("How many courses:");
        course= input.nextInt();
        System.out.println("Enter letter garde, credit hours for "+course+ " courses:");

          for(int i=0; i<course;i++){
              String element= input.next();
              int num= input.nextInt();
              switch (element){
                  case "A+"-> sumCredit+=(4.0*num);
                  case "A"-> sumCredit+=(3.75*num);
                  case "B+"-> sumCredit+=(3.5*num);
                  case "B"-> sumCredit+=(3.0*num);
                  case "C+"-> sumCredit+=(2.5*num);
                  case "C"-> sumCredit+=(2.0*num);
                  case "D+"-> sumCredit+=(1.5*num);
                  case "D"-> sumCredit+=(1.0*num);
                  case "F"-> sumCredit+=0.0;

              }
              sumAll+=num;
          }
          double Average= sumCredit/sumAll;
        System.out.println("GPA: "+Average);
    }
}