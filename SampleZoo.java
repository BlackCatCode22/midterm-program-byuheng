import java.util.ArrayList;

public class SampleZoo {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to Heng's Zoo program!\n\n");

        // Create an animal
        Animal myAnimal = new Animal();

        myAnimal.name = "Banzai";

        // create a new student
        Student myNewStudent = new Student();

        // Create three students
        Student student01 = new Student();
        Student student02 = new Student();
        Student student03 = new Student();

        // Give the stdents names...
        student01.name = "Manny";
        student02.name = "Moe";
        student03.name = "Jack";

        // Create an ArrayList of Students
        ArrayList<Student> students = new ArrayList<>();

        students.add(student01);
        students.add(student02);
        students.add(student03);

        // Output the student names
        for (Student student : students) {
            System.out.println("Student name is: " + student.name);
        }

        System.out.println();


        myNewStudent.name = "First Last";
        System.out.println("\n The new student's name is: " + myNewStudent.name);


        System.out.println("\n Animal name is " + myAnimal.name);

    }
}