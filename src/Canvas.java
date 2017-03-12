/**
 * Created by Марсель on 14.12.2016.
 */

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Canvas extends JComponent implements MouseListener, MouseMotionListener{
    private int xPosition, yPosition;
    private boolean drag;
    public  int activeShapeNumber = -1;



	public Canvas() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}

    void drawOn(Shape[] s,Graphics g){
        for (int i = 0; i < s.length; i++) {
            s[i].drawOn(g);
        }
    }

    void drawOn(ArrayList<Shape> s,Graphics g){
        for (int i = 0; i < s.size(); i++) {
            s.get(i).drawOn(g);
        }
    }

    public  void contains(ArrayList<Shape> s,Point p){
        for (int i = 0; i < s.size(); i++) {
            Shape t = s.get(i);
            if(t.contains(p)){
                System.out.println("Да");
                activeShapeNumber=i;}
        }

    }

    //Фигуры:

    Triangle tr = new Triangle(0, 185, 130);
    //tr.drawOn(g);

    // g2d.setPaint(Color.RED);
    Square s = new Square(3, 150, 150);
    //s.drawOn(g);

    /* 	Устанавливает цвет рисования в зелёный*/
    // g2d.setPaint(Color.GREEN);
    Diamond d = new Diamond(0, 150, 150);
    Diamond d1 = new Diamond(1, 150, 150);
    Diamond d2 = new Diamond(2, 150, 150);


   // Shape[] sh = {tr, s, d, d1, d2};
//        drawOn(sh,g);

    public static ArrayList<Shape> ShapeList = new ArrayList<>();

    //Добавим фигуры к списку
        ShapeList.add(tr);
        ShapeList.add(s);
        ShapeList.add(d);
        ShapeList.add(new Diamond(1, 150, 150));








    /*Метод, перерисовывающий элемент внутри окна
     *при обновлении*/
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;

        // g.drawLine(20, 20, 360, 20);


        g2d.setColor(Color.blue);







        drawOn(ShapeList, g);


/* 	Вызывает обновление себя после завершения рисования	*/
        super.repaint();
    }

        @Override
        public void mouseDragged (MouseEvent e){
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseMoved (MouseEvent e){
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseClicked (MouseEvent e){
            // TODO Auto-generated method stub
        }

        @Override
        public void mousePressed (MouseEvent e){
            xPosition = e.getX();
            yPosition = e.getY();
            Point p = new Point(xPosition, yPosition);
            contains(ShapeList, p);
            System.err.println("На канве тыкнули в точку (" + e.getX() + ", " + e.getY() + "). Она лежит в фигуре" + activeShapeNumber);
            System.err.println("всего "+ShapeList.size()+"фигур");
        }

        @Override
        public void mouseReleased (MouseEvent e){
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered (MouseEvent e){
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited (MouseEvent e){
            // TODO Auto-generated method stub

        }



}
