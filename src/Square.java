/**
 * Created by Марсель on 20.12.2016.
 */

import java.awt.*;

public class Square extends Shape{

    public Square (int i, Point p){
        int angle;
        Point firstPoint;
    }

    public Square (int i, int a, int b){
        Point p = new Point(a,b);
        angle = i;
        firstPoint = p;
    }

    /* представляет Square в виде Polygon */

    public Polygon toPolygon() {
        Point p1 = new Point(this.firstPoint);
        Point p2 = new Point(this.firstPoint);
        p2.move(Shape.getSide(this.angle));
        Point p4 = new Point(this.firstPoint);
        p4.move(Shape.getSide(this.angle+3));
        Point p3 = new Point(p2);
        p3.move(Shape.getSide(this.angle+3));
        int[] arrayX = {p1.x, p2.x, p3.x,p4.x};
        int[] arrayY = {p1.y, p2.y, p3.y,p4.y};
        Polygon pol = new Polygon(arrayX, arrayY, 4);
        return pol;
    }


    /* 	Рисует красный квадрат с черной обводкой	*/
    void drawOn(Graphics g){
        Polygon pol = this.toPolygon();
        Graphics2D g2d=(Graphics2D)g;
        g2d.setPaint(Color.RED);
        g.fillPolygon(pol);
        g2d.setPaint(Color.BLACK);
        g.drawPolygon(pol);   };
}
