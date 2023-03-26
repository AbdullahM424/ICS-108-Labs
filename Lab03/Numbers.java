package Lab03;
import java.util.*;
public class Numbers {
    public static void main(String[] args){
        int Size, contents;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        Size= input.nextInt();
        int[] array= new int[Size];
        System.out.println("Enter the contents of the array:");
        contents= input.nextInt();
        for(int i=0;i<Size;i++) {
            array[i] = contents;
        }
        if (isValid(array)){
            System.out.println("The array is valid");

        }
        else{
            System.out.println("The array is not valid");
        }


        isValid(array);

    }

    public static boolean isValid(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j))
                {
                    return true;
                }
                else{
                    return false;

                }

            }

        }

        return true;
    }



}
