/**
 * Created by Марсель on 20.12.2016.
 */
public class Diamond {
    /*задает первый вектор направления*/
    int angle;
    /*задает первую точку*/
    Point firstPoint;

    public Diamond (int i, Point p){
        angle = i;
        firstPoint = p;
    }

    public Diamond (int i, int a, int b){
        Point p = new Point(a,b);
        angle = i;
        firstPoint = p;
    }

}
