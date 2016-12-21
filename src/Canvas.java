/**
 * Created by Марсель on 14.12.2016.
 */

import java.awt.*;
import javax.swing.*;

public class Canvas extends JComponent{

    /* 	Рисует текущим цветом треугольник	*/
    public void drawTriangle(Triangle t,Graphics g){
        Point p1 = new Point(t.firstPoint);
        Point p2 = new Point(t.firstPoint);
        p2.move(Shape.getSide(t.angle));
        Point p3 = new Point(t.firstPoint);
        p3.move(Shape.getSide(t.angle+2));
        int[] arrayX = {p1.x, p2.x, p3.x};
        int[] arrayY = {p1.y, p2.y, p3.y};
        Polygon pol = new Polygon(arrayX, arrayY, 3);
        g.fillPolygon(pol);
        g.drawPolygon(pol);    }

    /* 	Рисует текущим цветом квадрат	*/
    public void drawSquare(Square t,Graphics g){
        Point p1 = new Point(t.firstPoint);
        Point p2 = new Point(t.firstPoint);
        p2.move(Shape.getSide(t.angle));
        Point p4 = new Point(t.firstPoint);
        p4.move(Shape.getSide(t.angle+3));
        Point p3 = new Point(p2);
        p3.move(Shape.getSide(t.angle+3));
        int[] arrayX = {p1.x, p2.x, p3.x,p4.x};
        int[] arrayY = {p1.y, p2.y, p3.y,p4.y};
        Polygon pol = new Polygon(arrayX, arrayY, 4);
        g.fillPolygon(pol);
        g.drawPolygon(pol);    }

    /* 	Рисует текущим цветом ромб	*/
    public void drawDiamond(Diamond t,Graphics g){
        Point p1 = new Point(t.firstPoint);
        Point p2 = new Point(t.firstPoint);
        p2.move(Shape.getSide(t.angle));
        Point p4 = new Point(t.firstPoint);
        p4.move(Shape.getSide(t.angle+1));
        Point p3 = new Point(p2);
        p3.move(Shape.getSide(t.angle+1));
        int[] arrayX = {p1.x, p2.x, p3.x,p4.x};
        int[] arrayY = {p1.y, p2.y, p3.y,p4.y};
        Polygon pol = new Polygon(arrayX, arrayY, 4);
        g.fillPolygon(pol);
        g.drawPolygon(pol);    }



    /*
        public void drawTriangle(Point p1,Point p2,Point p3,Graphics g){
        int[] arrayX = {p1.x, p2.x, p3.x};
        int[] arrayY = {p1.y, p2.y, p3.y};
        Polygon pol = new Polygon(arrayX, arrayY, 3);
        g.drawPolygon(pol);    }


    public void drawLine(Point p1,Point p2,Graphics g){
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }

*/



    /*Метод, перерисовывающий элемент внутри окна
     *при обновлении*/
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;
        g.drawLine(20, 20, 360, 20);



        g2d.setColor(Color.blue);

        Triangle tr = new Triangle(0,100,200);
        drawTriangle(tr,g);

        g2d.setPaint(Color.RED);
        Square s = new Square(1,200,100);
        drawSquare(s,g);

/* 	Устанавливает цвет рисования в зелёный*/
        g2d.setPaint(Color.GREEN);
        Diamond d = new Diamond(2,150,150);
        drawDiamond(d,g);


     /* int[] arrayX = {20, 100, 100, 250, 250, 20, 20, 200};
        int[] arrayY = {180, 180, 200, 200, 220, 200, 200, 200};
        Polygon poly = new Polygon(arrayX, arrayY, 8);
        g.drawPolygon(poly);
*/


/* 	Вызывает обновление себя после завершения рисования	*/
        super.repaint();
    }
}
