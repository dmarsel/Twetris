/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */

import java.awt.*;
import javax.swing.*;

public class Main {
    // jswing
    public static void main(String[] args) {


        for (int i = 0; i < 12; i++) {
            Shape.getSide(i).print();
        }

        Triangle tr = new Triangle(0,100,200);
        Point p = tr.firstPoint;
        p.move(Shape.getSide(tr.angle+2));
        System.out.println(p.toString());

        /* Задание заголовка окна*/
        JFrame w=new JFrame("Окно с изображением");
	/*Задание размеров окна*/
        w.setSize(400, 400);

/* 	Если у окна не будет функции закрытия,
 *	при нажатии крестика окно не закроется.*/
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

/*	Менеджер определяет
 *  каким образом в окне расположены объекты.*/
        w.setLayout(new BorderLayout(1,1));

        Canvas canv=new Canvas();
        w.add(canv);
        w.setVisible(true);


    }

}
