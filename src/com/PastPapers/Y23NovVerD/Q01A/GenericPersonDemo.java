package PastPapers.Y23NovVerD.Q01A;

import java.util.ArrayList;

public class GenericPersonDemo {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("IT1234", 6));
        students.add(new Student("IT1234", 6));
        students.add(new Student("IT1234", 6));
        students.add(new Student("IT1234", 6));
        students.add(new Student("IT1234", 6));

        ArrayList<Lecturer> lecturers=new ArrayList<>();
        lecturers.add(new Lecturer("EMP123","IT"));
        lecturers.add(new Lecturer("EMP123","IT"));
        lecturers.add(new Lecturer("EMP123","IT"));
        lecturers.add(new Lecturer("EMP123","IT"));
        lecturers.add(new Lecturer("EMP123","IT"));

        GenericPerson genericPerson = new GenericPerson();
        genericPerson.displayElements(students);
        genericPerson.displayElements(lecturers);
    }
}
