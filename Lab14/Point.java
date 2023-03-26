package Lab14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point x2) {
        if (x > x2.x) {
            return 1;
        } else if (x < x2.x) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (compareTo((Point) obj) == 0)
            return true;
        else
            return false;
    }

}

