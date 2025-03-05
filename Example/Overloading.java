public class Overloading {

    //Overloaded main method with int parameter
    public static void main(int args) {
        System.out.println("Overloaded main with int");   
    }

    //Overloaded main method with double parameter
    public static void main(double args) {
        System.out.println("Overloaded main with double");
    }

    //Original main method
    public static void main(String[] args) {
        System.out.println("Original Main Method");

        //Calling the overloaded methods from the original main
        main(5); //Calls main(int args)
        main(3.14); //Calls main(double args)
    }
}