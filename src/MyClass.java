public class MyClass {
    public static void main(String[] args) {
        // declararea viariabilei tipului de date Point
        Point p  = new Point(); // prin new alocam memorie
        Point p2 = new Point();

        p.x = 10;
        p.y = 20;

        System.out.println(p.x);
        System.out.println(p.y);

        p2.x = 100;
        p2.y = 200;

        System.out.println(p2.x);
        System.out.println(p2.y);

        Rectangle rect = new Rectangle();
        rect.topLeft.x = 0;
        rect.topLeft.y = 0;
        rect.bottomRight.x = 100;
        rect.bottomRight.y = 100;




    }
}
