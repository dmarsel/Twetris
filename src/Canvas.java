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


    /*Метод, перерисовывающий элемент внутри окна
     *при обновлении*/
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        Graphics2D g2d=(Graphics2D)g;
        g.drawLine(20, 20, 360, 20);



        g2d.setColor(Color.blue);

        Triangle tr = new Triangle(0,185,130);
        //tr.drawOn(g);

       // g2d.setPaint(Color.RED);
        Square s = new Square(3,150,150);
        //s.drawOn(g);

/* 	Устанавливает цвет рисования в зелёный*/
       // g2d.setPaint(Color.GREEN);
        Diamond d = new Diamond(0,150,150);
        Diamond d1 = new Diamond(1,150,150);
        Diamond d2 = new Diamond(2,150,150);
        //d.drawOn(g);

        Shape[] sh={tr,s,d,d1,d2};
//        drawOn(sh,g);

        ArrayList<Shape> ShapeList = new ArrayList<>();
        ShapeList.add(tr);
        ShapeList.add(s);
        ShapeList.add(d);
        ShapeList.add(new Diamond(1,150,150));
        drawOn(ShapeList,g);

     /* int[] arrayX = {20, 100, 100, 250, 250, 20, 20, 200};
        int[] arrayY = {180, 180, 200, 200, 220, 200, 200, 200};
        Polygon poly = new Polygon(arrayX, arrayY, 8);
        g.drawPolygon(poly);
*/


/* 	Вызывает обновление себя после завершения рисования	*/
        super.repaint();


    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.err.println("На канве тыкнули в точку (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



}
