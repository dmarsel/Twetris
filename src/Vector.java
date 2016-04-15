/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public class Vector extends Point {

   int x;
   private int y;

    public Vector (double x, double y){
        this.x = (int)x;
        this.y = (int)y;
    }

    public Vector (){
        this.x = 1;
        this.y = 0;
    }

    public Point toPoint(){
        Point p = new Point(this.x,this.y);
        return p;
    }

    public Vector sum(Vector v){
        Vector n = new Vector(this.x+v.x,this.y+v.y);
        return n;
    }

    public Vector back(){
        Vector n = new Vector(-this.x,-this.y);
        return n;
    }

    public void zoom(int k){
        this.x=this.x*k;
        this.y=this.y*k;
    }

    public void print(){
        this.toPoint().print();
    }

}
