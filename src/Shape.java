/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public abstract class Shape {
    Point center;
    int angle;
    /*длину стороны, работая с int, нужно брать ЧЁТНОЙ!!!*/
    static int sideLength=40;
    
    private static Vector[] sides;

    /*задаём направления сторон многоугольников*/
    static {
        sides = new Vector[12];
        for (int i = 0; i < 12; i++) {
            Vector v = new Vector(sideLength, 0);
            v.rotate(Math.PI *i / 6);
            sides[i] = v;
        }}

    /*Возвращает вектор направления */
    public static Vector getSide(int i) {
        return sides[i%12];
    }
    Shape() {
    }

   // abstract public void draw();
   // abstract public void rotate();
}
