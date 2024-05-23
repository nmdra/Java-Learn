package PastPapers.Y23NovVerD.Q01B;

import java.util.Map;
import java.util.TreeMap;

public class AscendingTable<K,V> {
    TreeMap<K,V> table;

    public AscendingTable() {
        table=new TreeMap<>();
    }

    public void add(K key, V value){
        table.put(key,value);
    }

    public static <K,V> void display(AscendingTable<K,V> ascendingTable){
        for(Map.Entry<K, V> entry : ascendingTable.table.entrySet()){
            System.out.print(entry.getKey()+", ");
            System.out.println(entry.getValue());
        }
    }

    // Alternate Method
    public static <K,V> void display2(AscendingTable<K,V> ascendingTable){
        for(K key : ascendingTable.table.keySet()){
            System.out.println("Key: "+key+", Value: "+ascendingTable.table.get(key));
        }
    }

}
