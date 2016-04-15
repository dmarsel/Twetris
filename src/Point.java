/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public class Point {
    int x;
    int y;

    public Point (double x, double y){
        this.x = (int)x;
        this.y = (int)y;
    }

    public Point (){
        this.x = 0;
        this.y = 0;
    }


    public void setX(double x){
        this.x = (int)x;
    }

    public void setY(double y){
        this.y = (int)y;
    }

    public void setPoint(double x, double y){
        this.x = (int)x;
        this.y = (int)y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    //* поворот точки на угол a вокруг точки p
    public Point rotate(Point p,int a){
        int c = this.x-p.x;
        int d = this.y-p.y;
        Point pp = new Point(p.x+c*Math.cos(a)-d*Math.sin(a),p.y+c*Math.sin(a)+d*Math.cos(a));
        return pp;
    }

    public static String toString(Point p){
        return "("+p.x+";"+p.y+")";

    }

    public void print(){
        System.out.println(toString(this));
    }

    // сдвигает точку на вектор (x,y)
    public void shift(int x, int y){
        setPoint(x+this.x,this.y + y);
    }

    // сдвигает точку на вектор p
    public void shift(Point p){
        shift(p.x,p.y);
    }

    public Vector toVector(){
        Vector v = new Vector(this.x, this.y);
        return v;
    }
}
