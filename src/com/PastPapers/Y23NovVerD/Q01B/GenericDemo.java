package PastPapers.Y23NovVerD.Q01B;

public class GenericDemo {
    public static void main(String[] args) {

        AscendingTable<Integer, String> myTable = new AscendingTable<>();
        myTable.add(40, "ddd");
        myTable.add(10, "sdd");
        myTable.add(30, "fdd");
        myTable.add(20, "sdd");

        AscendingTable<Integer, Double> myTableD = new AscendingTable<>();
        myTableD.add(40, 10.123);
        myTableD.add(30, 33.123);
        myTableD.add(20, 20.123);
        myTableD.add(10, 14.123);

        AscendingTable.display(myTable);
        AscendingTable.display2(myTableD);
    }
}
