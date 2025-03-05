public class Polygon {
    public void display() {
        System.out.println("Inside the polygon class.");
    }
}
class AnonymousDemo {
    public void CreateClass() {
        //creation of anonymous class extending class polygon
        Polygon p1 = new Polygon() {
            //Override
            @Override public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}
class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.CreateClass();
    }
}
