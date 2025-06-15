package org.example.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColllectionsUtilityClass {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
      //  list.add(null); // Adding a null value to the list, which is allowed in ArrayList but will throw an NPE if used with Collections. Cannot invoke "java.lang.Comparable.compareTo(Object)" because "next" is null

        System.out.println("List elements: " + list);
        System.out.println("max value : " + Collections.max(list));
        System.out.println("min value : " + Collections.min(list));
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
        Collections.sort(list);

        System.out.println("Sorted list: " + list);
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        list.forEach(
                (Integer element) -> System.out.println("Element: " + element)
        );



        }

}
