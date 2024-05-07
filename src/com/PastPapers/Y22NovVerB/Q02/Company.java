package PastPapers.Y22NovVerB.Q02;

import java.util.HashMap;
/**
 *  {@code Employee<?,?>} Wildcard
 *  <p>
 *  {@link OOP.Generics.Examples.WildCards.WildCard}
 *
 * @author nimendra
 * **/
public class Company {
    public static void main(String[] args) {
        HashMap<Integer,Employee<?,?>> empList = new HashMap<>();

        Employee<String, String> emp = new Employee<>("Nishan Perera", "EMP12345");
        empList.put(1,emp);

        Employee<String, Integer> emp2 = new Employee<>("Krishan Gamage", 12345);
        empList.put(2,emp2);

        for (int id: empList.keySet()) {
            Employee<?,?> value = empList.get(id);
            System.out.println("Employee Number: " + id
                                + " and the Employee ID is: "
                                + value.getEmpId());
        }
    }
}
