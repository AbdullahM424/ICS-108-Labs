package Lab12;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        Student[] students= {new Undergraduate(22333,3.75),new Graduate(45889,2.5)};

        System.out.println(Arrays.toString(students));
    }
}
