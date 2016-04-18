/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public class Vector{
    private int x;
    private int y;

    public Vector (double x, double y){
        this.x = (int)x;
        this.y = (int)y;
    }

    public Vector (){
        this.x = 0;
        this.y = 0;
    }

    public Vector (Point a,Point b){
        this.x=b.getX()-a.getX();
        this.y=b.getY()-a.getY();
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(double x){
        this.x = (int)x;
    }

    public void setY(double y){
        this.y = (int)y;
    }

    public void set(double x, double y){
        this.x = (int)x;
        this.y = (int)y;
    }

    public Vector rotate(double a){
        int c = this.x;
        int d = this.y;
        return new Vector(c*Math.cos(a)-d*Math.sin(a),c*Math.sin(a)+d*Math.cos(a));
        }

    public double length(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }

    /*
    //* метод выдает тангенс угла наклона вектора
    public double tanAngle(){
        return this.y/this.x;
    }*/

    //* метод приьавляет к данному вектору вектор v
       public Vector add(Vector v){
        return new Vector(this.x+v.x,this.y+v.y);
    }

    //* метод выдает точку радиус-вектора
    public Point toPoint(){
        return new Point(this.x,this.y);
    }

    //*метод выдает обратный вектор
    public Vector back(){
        return new Vector(-this.x,-this.y);
    }

    //* метод увеличивает вектор в k раз
    public Vector times(int k){
        return new Vector(this.x*k,this.x*k);
    }

    public  String toString(){
        return "вектор {"+this.x+";"+this.y+"}";
    }

    public void print(){
        System.out.println(this.toString());
    }

}
