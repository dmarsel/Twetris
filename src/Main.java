/**
 * Created by Лицей-интернат №2 on 15.04.2016.
 */
public class Main {
    // jswing
    public static void main(String[] args) {
        Vector v = new Vector(2,3);
        Point p = v.toPoint();
        v.print();
        p.print();
        v.times(5);
        v.print();

    }

}
