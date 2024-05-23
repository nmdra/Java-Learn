package PastPapers.Y23NovVerD.Q01A;

import java.util.ArrayList;

public class GenericPerson {

    public void displayElements(ArrayList<? extends IPerson> person){
        for (IPerson per : person){
            System.out.println(per.displayDetails());
        }
        System.out.println();
    }
}
