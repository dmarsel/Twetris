/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */

import java.awt.*;

public abstract class Shape {
    /*задает первый вектор направления*/
    int angle;
    /*задает первую точку*/
    Point firstPoint;
    /*длину стороны, работая с int, нужно брать ЧЁТНОЙ!!!*/
    static int sideLength=40;
    
    private static Vector[] sides;

    /*задаём направления сторон многоугольников*/
     static {
        sides = new Vector[12];
        for (int i = 0; i < 12; i++) {
            Vector v = new Vector(sideLength, 0);
            v.rotate(Math.PI *i / 6);
            sides[i] = v;
        }}

    /*Возвращает вектор направления */
    public static Vector getSide(int i) {
        return sides[i%12];
    }
    Shape() {
    }
    void drawOn(Graphics g){}


    /* представляет Shape в виде Polygon */
    abstract Polygon toPolygon();

    /*проверяет содержание Point внутри Shape*/
    public boolean contains(Point p){
        return this.contains(p.getX(),p.getY());}


    /*проверяет содержание точки из двух координат внутри Shape*/
    public boolean contains(double x, double y){
        Polygon pol = this.toPolygon();
        return pol.contains(x,y);}


   // abstract public void draw();
    abstract public void rotate(int i);
}
