/**
 * Created by Марсель on 20.12.2016.
 */
public class Square {
    /*задает первый вектор направления*/
    int angle;
    /*задает первую точку*/
    Point firstPoint;

    public Square (int i, Point p){
        int angle;
        Point firstPoint;
    }

    public Square (int i, int a, int b){
        Point p = new Point(a,b);
        angle = i;
        firstPoint = p;
    }

}
