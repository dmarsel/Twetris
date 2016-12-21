import java.awt.*;

/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public class Triangle extends Shape {
    /*задает первый вектор направления*/
    int angle;
    /*задает первую точку*/
    Point firstPoint;

    public Triangle (int i, Point p){
        angle = i;
        firstPoint = p;
    }

    public Triangle (int i, int a, int b){
        Point p = new Point(a,b);
        angle = i;
        firstPoint = p;
    }
/*
    public Polygon toPolygon() {
        Point p1 = this.firstPoint;
        Point p2 = p1;
        p2.move(Shape.getSide(this.angle));
        Point p3 = p1;
        p3.move(Shape.getSide(this.angle+2));
        int[] arrayXX = {p1.x, p2.x, p3.x};
        int[] arrayYY = {p1.y, p2.y, p3.y};
        Polygon pol = new Polygon(arrayXX, arrayYY, 3);
        return pol;
    }
*/
    /* 	Рисует синий треугольник с черной обводкой	*/
    void drawOn(Graphics g){Point p1 = new Point(this.firstPoint);
        Point p2 = new Point(this.firstPoint);
        p2.move(Shape.getSide(this.angle));
        Point p3 = new Point(this.firstPoint);
        p3.move(Shape.getSide(this.angle+2));
        int[] arrayX = {p1.x, p2.x, p3.x};
        int[] arrayY = {p1.y, p2.y, p3.y};
        Polygon pol = new Polygon(arrayX, arrayY, 3);
        Graphics2D g2d=(Graphics2D)g;
        g2d.setPaint(Color.BLUE);
        g.fillPolygon(pol);
        g2d.setPaint(Color.BLACK);
        g.drawPolygon(pol);    };
}
