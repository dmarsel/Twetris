/**
 * Created by Марсель on 20.12.2016.
 */

import java.awt.*;

public class Diamond extends Shape{

    public Diamond (int i, Point p){
        angle = i;
        firstPoint = p;
    }

    public Diamond (int i, int a, int b){
        Point p = new Point(a,b);
        angle = i;
        firstPoint = p;
    }


    /** представляет Diamond в виде Polygon */
    @Override
    public Polygon toPolygon() {
        Point p1 = new Point(firstPoint);
        Point p2 = new Point(firstPoint);
        p2.move(Shape.getSide(angle));
        Point p4 = new Point(firstPoint);
        p4.move(Shape.getSide(angle+1));
        Point p3 = new Point(p2);
        p3.move(Shape.getSide(angle+1));
        int[] arrayX = {p1.x, p2.x, p3.x,p4.x};
        int[] arrayY = {p1.y, p2.y, p3.y,p4.y};
        Polygon pol = new Polygon(arrayX, arrayY, 4);
        return pol;
    }

    @Override
    public void rotate(int i) {
        Point p = new Point();
        Point p2 = new Point(firstPoint);
        p2.move(Shape.getSide(angle));
        Point p4 = new Point(firstPoint);
        p4.move(Shape.getSide(angle+1));
        p = p.middle(p2,p4);
        Vector v =new Vector(p,this.firstPoint);
        v.rotate(Math.PI *i / 6);
        p.move(v);
        firstPoint=p;
        angle=(angle-i+12)%12;
    }

    /** 	Рисует зеленый ромб с черной обводкой	*/
    @Override
    void drawOn(Graphics g){
        Polygon pol = this.toPolygon();
        Graphics2D g2d=(Graphics2D)g;
        g2d.setPaint(Color.GREEN);
        g.fillPolygon(pol);
        g2d.setPaint(Color.BLACK);
        g.drawPolygon(pol);}

}
