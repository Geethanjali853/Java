public class Car {
    String model;
    int year;
    
    //Parameterized constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    //Method to display car details
    void display() {
        System.out.println("Model: " + model + "Year: " + year);
    }

    public static void main(String[] args) {
        //Creating objects with different values
        Car car1 = new Car("Telsa Model S", 2022);
        Car car2 = new Car("Ford Mustang", 2021);

        //Displaying object details
        car1.display();
        car2.display();
    }
}
