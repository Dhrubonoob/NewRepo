public class OOP {
    public static void main(String[] args) {
        
        // int[] roll = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        // Student[] students = new Student[5];
        Student dhrubo = new Student(); //Student() is a constructor
        Student ob = new Student();

        // dhrubo.roll = 1;
        // dhrubo.name = "dhr";
        // dhrubo.marks = 99.4f;

        // System.out.println(dhrubo.name);
        // System.out.println(dhrubo.roll);
        // System.out.println(dhrubo.marks);
        
        ob.greet();

        System.out.println(ob.name);
        System.out.println(ob.roll);
        System.out.println(ob.marks);
        

    }
}

class Student{
    int roll ;
    String name ;
    float marks ;

    void greet(){
        System.out.println("my name is " + name);
    }

    Student(){
        this.roll = 1;
        this.name = "bishop";
        this.marks = 1.2f;
    }

}
