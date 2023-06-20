
import java.lang.reflect.Constructor;

// public class Point {
//     private int x, y;

//     public Point(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }

//     public void setX(int x) {
//         this.x = x;
//     }

//     public int getX() {
//         return x;
//     }

//     public void setY(int y) {
//         this.y = y;
//     }

//     public int getY() {
//         return y;
//     }

// }

 class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

}

 class Line {
    Point start = new Point(0, 0);
    Point end = new Point(3, 4);

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        start = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public String toString() {
        return "[" + start.toString() + "," + end.toString() + "]";
    }
}

class pointTest {
    public static void main(String args[]) {
        // Point original = new Point(3, 5);
        // Point copy = new Point(original.getX(), original.getY());
        // System.out.println("Original: " + copy.getX() + ", " + copy.getY());

        Line line = new Line(0, 0, 3, 4);
        System.out.println(line);
        System.out.println(line.toString());

    }
}