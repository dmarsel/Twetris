/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public class Point extends Vector{
    private int x;
    private int y;

    public Point (double x, double y){
        this.x = (int)x;
        this.y = (int)y;
    }

    public Point (){
        this.x = 0;
        this.y = 0;
    }

    //* поворот точки на угол a вокруг точки p
    public Point rotate(Point p,double a){
        int c = this.x-p.x;
        int d = this.y-p.y;
        return new Point(p.x+c*Math.cos(a)-d*Math.sin(a),p.y+c*Math.sin(a)+d*Math.cos(a));

    }

    // метод выдает точку сдвинутую на вектор (x,y)
    public Point move(int x, int y){

        return new Point(x+this.x,this.y + y);
    }

    // сдвигает точку на вектор p
    public Point move(Point p){
        return this.move(p.x,p.y);
    }

    public Vector toVector(){
        return new Vector(this.x, this.y);
    }

    public double abs(){
        return this.length();
    }

    public  String toString(){
        return "точка ("+this.x+";"+this.y+")";
    }
}
