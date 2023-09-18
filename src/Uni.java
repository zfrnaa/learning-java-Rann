//Abstraction

abstract class Student {
    String name;
    int age;

    abstract void register();
    //two implementation
}

//inheritance uses keyword "extends"
class Undergraduate extends Student
{
    //first implementation
    void register() {
        System.out.println("Pendaftaran pelajar sarjana muda: " + name + ", " + age + " tahun");
    }
}

//2nd inherit
class Postgraduate extends Student
{
    //second implementation
    void register() {
        System.out.println("Pendaftaran pelajar sarjana: " + name + ", " + age + " tahun");
    }
}

//main class
public class Uni {
    public static void main(String[] args)
    {
        //new object of Student with student1
        //use "new" keyword
        Student student1 = new Undergraduate();
        student1.name = "Ali";
        student1.age = 20;
        student1.register();

        //student2
        Student student2 = new Postgraduate();
        student2.name = "Ahmad";
        student2.age = 25;
        student2.register();
    }
}