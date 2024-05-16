package PastPapers.Y22NovVerB.Q01;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<RegisteredCus> regCusArrayList = new ArrayList<>();

        regCusArrayList.add(new RegisteredCus(1234, "Sanjaya"));
        regCusArrayList.add(new RegisteredCus(3456, "dasun"));

        for(RegisteredCus rc: regCusArrayList) rc.display();

    }
}
