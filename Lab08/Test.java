package Lab08;

public class Test {
    public static void main(String[] args){
        MCQuestion object= new MCQuestion("Variables that are shared by every instance of a class are:",
                "public variables","private variables","instance variables","class variables",
                "d");
        System.out.println(object.toString());
    }
}
