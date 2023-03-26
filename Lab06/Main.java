package Lab06;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the maximum weight:");
        Container item = new Container(input.nextInt());
        System.out.println("Enter the number of objects:");
        int object= input.nextInt();
        System.out.println("Enter the weights of the objects: ");
        for (int i = 0; i < object; i++) {
            int num = input.nextInt();
            item.addItem(num);
        }
        System.out.println(item.toString());
    }
}
