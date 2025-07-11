 class Parent {
    public void func(){
        System.out.println("Parent method function.");     //method declared
    }
    public void func(int a) {
        System.out.println("Parent method function." + a);    //method overloading 
    }
}
class Child extends Parent {
    public void func(int a) {
        System.out.println("Child method function." + a);
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        p.func();
        p.func(5);
    Child c = new Child();
        c.func(8);
    }
}
