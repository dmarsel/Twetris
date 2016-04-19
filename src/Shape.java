/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public abstract class Shape {
    Point center;
    int angle;
    protected final int sideLength=20;
    
    final Vector[] sides;
    
    Shape() {
        sides = new Vector[12];
        for (int i = 0; i < 12; i++) {
            Vector v = new Vector(1, 0);
            v.times(sideLength);
            v.rotate(Math.PI * i / 12);
            sides[i] = v;
        }
    }

   // abstract public void draw();
   // abstract public void rotate();
}
