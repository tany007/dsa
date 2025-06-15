package org.example.Collections;

public class CarComparableExample implements Comparable<CarComparableExample> {

    private String carName;
    private String carModel;
    private Double carPrice;

    public CarComparableExample(String carName, String carModel, Double carPrice) {
        this.carName = carName;
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    @Override
    public int compareTo(CarComparableExample other) {
        return this.carPrice.compareTo(other.carPrice);
    }


}
