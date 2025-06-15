package org.example.Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapExperiment {

    private static final Map<Integer, String> map = new HashMap<>();
    private static final Map<Integer, String> map2 = new ConcurrentHashMap<>();
    private static final Map<Integer, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());


    public static void main(String[] args) {
        synchronizedMap.put(1, "One");
        synchronizedMap.put(2, "Two");

        synchronized (synchronizedMap){
            synchronizedMap.forEach((key, value) -> {
                System.out.println("Key: " + key + ", Value: " + value);
            });
        }
    }
}
