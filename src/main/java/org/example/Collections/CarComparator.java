package org.example.Collections;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.carPrice.compareTo(o2.carPrice);
    }
}
