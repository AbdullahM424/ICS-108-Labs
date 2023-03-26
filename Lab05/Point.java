package Lab05;

public class Point {
    private double x,y;

    public Point(){
        x=0;
        y=0;
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public String getPoint(){
        return "("+x+","+y+")";
    }

    public double distance(Point other){
        return Math.sqrt(Math.pow(other.x-x, 2)+Math.pow(other.y-y,2));
    }

}
