package com.example.mockservice.learning;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Return {

    // Original inefficient method
    public static void processDataInefficiently(List<String> data) {
        for (String item : data) {
            // Simulating a time-consuming operation
            System.out.println("Processing: " + item);
        }
    }

    // Improved method using HashMap for quick lookups
    public static void processDataEfficiently(List<String> data) {
        Map<String, Integer> dataMap = new HashMap<>();

        for (String item : data) {
            // Simulating a time-consuming operation
            System.out.println("Processing efficiently: " + item);

            // Storing processed data in a HashMap for quick lookups
            dataMap.put(item, item.length());
        }

        // Example of a quick lookup
        String lookupItem = "example";
        if (dataMap.containsKey(lookupItem)) {
            System.out.println("Length of '" + lookupItem + "': " + dataMap.get(lookupItem));
        }
    }

    public static void main(String[] args) {
        // Simulating a list of data
        List<String> dataList = List.of("item1", "item2", "item3", "item4", "item5");

        // Processing data with the original inefficient method
        processDataInefficiently(dataList);

        System.out.println("---------------");

        // Processing data with the improved efficient method
        processDataEfficiently(dataList);
    }

}
