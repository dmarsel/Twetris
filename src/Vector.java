/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public class Vector {
    int x;
    int y;

static Vector test = new Vector(3,7);


    public Vector(double x, double y) {
        this.x = (int)x;
        this.y = (int)y;
    }

    public Vector() {
        this.x = 0;
        this.y = 0;
    }

    public Vector(Point a, Point b) {
        this.x = b.getX() - a.getX();
        this.y = b.getY() - a.getY();
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void rotate(double a) {
        int c = x;
        int d = y;
        x = (int) Math.round(c * Math.cos(a) - d * Math.sin(a));
        y = (int) Math.round(-c * Math.sin(a) - d * Math.cos(a));
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    /*
    //* метод выдает тангенс угла наклона вектора
    public double tanAngle(){
        return this.y/this.x;
    }*/

    //* метод приьавляет к данному вектору вектор v
    public void add(Vector v) {
        x += v.x;
        y += v.y;
    }

    //* метод выдает точку радиус-вектора
    public Point toPoint() {
        return new Point(x, y);
    }

    //*метод выдает обратный вектор
    public void back() {
        x = -x;
        y = -y;
    }

    //* метод увеличивает вектор в k раз
    public void times(double k) {
        x = (int)(x * k);
        y = (int)(y * k);
    }

    public String toString() {
        return "вектор {" + x + ";" + y + "}";
    }

    public void print() {
        System.out.println(this.toString());
    }

}
