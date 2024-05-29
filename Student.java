class Student {
    private String student_name;
    private int student_Id;
    public void set_student_name(String name) {
        this.student_name = name;
    }
    public void set_student_Id(int Id){
        this.student_Id = Id;
    }
    public String get_student_name(){
        return this.student_name;
    }
    public int get_student_Id(){
        return this.student_Id;
    }
    public static void main(String[] args) {
        Student s1= new Student();
        s1.set_student_name("Shiva");
        System.out.println(s1.get_student_name());
        s1.set_student_Id(101);
        System.out.println(s1.get_student_Id());
    }
}