/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public class Point extends Vector {
    int x;
    int y;

    public Point(int x, int y) {
        this.x =  x;
        this.y =  y;
    }

    public Point() {

        this.x = 0;
        this.y = 0;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }


    //* поворот точки на угол a вокруг точки p
    public void rotate(Point p, double a) {
        int c = x - p.x;
        int d = y - p.y;
        x = (int)(p.x + c * Math.cos(a) - d * Math.sin(a));
        y = (int) (p.y + c * Math.sin(a) + d * Math.cos(a));

    }

    // метод выдает точку сдвинутую на вектор (x,y)
    public void move(int x, int y) {

        this.x = x + this.x;
        this.y += y;
    }

    public void move(Vector v) {
        this.move(v.getX(),v.getY());
    }

    // сдвигает точку на вектор p
    public void move(Point p) {
        this.move(p.x, p.y);
    }

    public Vector toVector() {
        return new Vector(x, y);
    }

    public double abs() {
        return this.length();
    }

    public String toString() {
        return "точка (" + x + ";" + y + ")";
    }
}
