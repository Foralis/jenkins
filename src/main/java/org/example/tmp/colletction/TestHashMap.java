package org.example.tmp.colletction;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("0","Olya");
        map.put("1","Alex");
        map.put("2","Michael");
        map.put("3","Artur");

        for (Map.Entry<String, String> entry: map.entrySet()
             ) {
            System.out.printf("Ключ = %s, значение = %s%n", entry.getKey(), entry.getValue());
        }
    }
    
}
