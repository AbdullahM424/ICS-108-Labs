package Lab05;

public class main {
    public static void main(String[] args){
        Point p1= new Point();
        Point p2= new Point(10.0,30.5);

        System.out.println(p1.getPoint());
        System.out.println(p2.getPoint());

        System.out.println(p1.distance(p2));
    }
}
