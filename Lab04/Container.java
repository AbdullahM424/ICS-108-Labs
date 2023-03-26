package Lab04;

import java.util.*;

public class Container {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();
        ArrayList<Integer> element = new ArrayList<>();
        containers.add(element);


        System.out.print("Enter the number of objects: ");
        int objects = input.nextInt();
        System.out.print("Enter the weights of the objects: ");

        for (int i = 0; i < objects; i++) {
            int num = input.nextInt();
            if (!check(num, containers)) {
                ArrayList<Integer> alter= new ArrayList<>();
                alter.add(num);
                containers.add(alter);
            }
        }
        for (ArrayList<Integer> sub: containers){
            System.out.println(sub);
        }

    }

    public static boolean check(int number, ArrayList<ArrayList<Integer>> containers) {
        for (ArrayList<Integer> array : containers) {
            int sum = 0;
            for (int i = 0; i < array.size(); i++) {
                sum = sum + array.get(i);
            }

            if (!(sum + number > 10)) {
                array.add(number);
                return true;
            }
        }
        return false;
    }
}
