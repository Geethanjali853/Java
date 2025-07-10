package Pack4;
import Pack3.*;

 class Geek3 extends Geek2{         //Using extends keyword we can access outside the package - protected
    public static void main(String[] args) {
        Geek3 g = new Geek3(); 
        g.display();
    }
}
