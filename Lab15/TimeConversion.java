package Lab15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TimeConversion {

    public static String getTime(String time) throws TimeFormatException {
        // splitting time by ":"
        String [] spt=time.split(":");
        // extract hours
        int hrs=Integer.parseInt(spt[0])%12;
        // extract minutes
        int mins=Integer.parseInt(spt[1])%60;

        if(Integer.parseInt(spt[1])>=60 || Integer.parseInt(spt[0])>23){
            throw new TimeFormatException(time);
        }

        // string format of 12 hours time
        String s_=String.format("%d:%02d ", hrs,mins);
        // finding AM or PM
        if(Integer.parseInt(spt[0])/12==1){s_=s_+" PM";}
        else{s_=s_+" AM";}
        return s_;
    }


    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String yn="";
        boolean repeated = false;
        do{
            System.out.println("Enter time in 24-hours notification:");
            // user input of time
            String time=sc.next();
            // time in 12 hours format
            try{

                System.out.println("That is the same as\n"+getTime(time));

            }
            catch(TimeFormatException te){
                System.out.println("There is no such time as  "+te.getMessage());

            }

            //
            System.out.println("Again? (y/n)");
            yn=sc.next();
            if(yn.charAt(0)=='n' || yn.charAt(0)=='N'){
                repeated = false;
            } else if (yn.charAt(0)=='y' || yn.charAt(0)=='Y') {
                repeated = true;
            }
        } while (repeated);

        System.out.println("End of program");
        sc.close();
    }
}