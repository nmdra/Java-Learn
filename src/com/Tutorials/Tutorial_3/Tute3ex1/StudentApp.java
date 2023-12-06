package Tutorials.Tutorial_3.Tute3ex1;

public class StudentApp {
    public static void main(String[] args) {
        Student[] std = new Student[5];

        std[0] = new Student();
        std[1] = new Student();

        std[0].setDetails("nmdra", "IT", "123-456-7890");
        std[1].setDetails("Linus", "IT", "987-654-3210");

        std[2] = new Student("John", "Computer Science", "123-456-7890");
        std[3] = new Student("Jane", "Mathematics", "987-654-3210");
        std[4] = new Student("Bob", "Physics", "456-789-0123");

//        for (int i = 0; i < students.length; i++) {
//            students[i].print();
//            System.out.println("------------------------");
//        }


//         for(dataType item : array)
        for (Student student : std) {
            student.print();
            System.out.println("------------------------");
        }

        System.out.println();
        System.out.println("Next Student ID:" + Student.getNextStudentID());
    }
}
