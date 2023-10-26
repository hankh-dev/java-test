package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Map statusMap = new HashMap<>();
        statusMap.put(1, 1);
        statusMap.put(1, 2);

        System.out.println(statusMap);
    }
}