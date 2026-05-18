package demo2;

public class Student1 {
    public String name;
    public int age;
    public double gpa;

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Nguyen Anh Duy";
        s1.age = 21;
        s1.gpa = 3.5;
        System.out.println(s1.name + " - " + s1.age + " - " + s1.gpa);
    }

}
