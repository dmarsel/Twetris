import java.awt.*;

/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public class Triangle extends Shape {


    public Triangle (int i, Point p){
        angle = i;
        firstPoint = p;
    }

    public Triangle (int i, int a, int b){
        Point p = new Point(a,b);
        angle = i;
        firstPoint = p;
    }

    /* представляет Triangle в виде Polygon */

    public Polygon toPolygon() {
        Point p1 = new Point(this.firstPoint);
        Point p2 = new Point(this.firstPoint);
        p2.move(Shape.getSide(this.angle));
        Point p3 = new Point(this.firstPoint);
        p3.move(Shape.getSide(this.angle+2));
        int[] arrayX = {p1.x, p2.x, p3.x};
        int[] arrayY = {p1.y, p2.y, p3.y};
        Polygon pol = new Polygon(arrayX, arrayY, 3);
        return pol;
    }

    /* 	Рисует синий треугольник с черной обводкой	*/
    void drawOn(Graphics g){
        Polygon pol = this.toPolygon();
        Graphics2D g2d=(Graphics2D)g;
        g2d.setPaint(Color.BLUE);
        g.fillPolygon(pol);
        g2d.setPaint(Color.BLACK);
        g.drawPolygon(pol);    };

}
