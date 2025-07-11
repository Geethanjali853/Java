abstract class Org {
    abstract void emp_details();
    abstract void emp_names();
}
class Employee extends Org {
    
    public void emp_details() {
        System.out.println("Displaying employee details.");
    }
    public void emp_names() {
        System.out.println("Displaying employee names.");
    }
    public static void main(String[] args) {
        Employee a = new Employee();
        a.emp_details();
        a.emp_names();
    }
}