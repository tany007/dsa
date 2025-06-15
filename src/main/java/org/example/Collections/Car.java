package org.example.Collections;

import java.util.*;

public class Car implements Comparator<Car> {

    String carName;
    String carModel;
    Double carPrice;

    Car(String carName, String carModel) {
        this.carName = carName;
        this.carModel = carModel;
    }

    Car(String carName, String carModel, double carPrice) {
        this.carName = carName;
        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    Car (){
    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.carPrice.compareTo(o2.carPrice);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName) &&
                Objects.equals(carModel, car.carModel) &&
                Objects.equals(carPrice, car.carPrice);
    }


    public static void main(String[] args) {
        // Example usage of the Car class with sorting
        /*Car[] cars = new Car[3];
        cars[0] = new Car("Toyota", "Corolla");
        cars[1] = new Car("Honda", "Civic");
        cars[2] = new Car("Ford", "Focus");

        Arrays.sort(cars, (a, b) -> a.carModel.compareTo(b.carModel));
        System.out.println("Cars sorted by Model name :");
        for (Car car : cars) {
            System.out.println(car.carName + " - " + car.carModel);
        }*/

        List<Car> cars = new ArrayList<>();
        /*cars.add(new Car("Toyota", "Corolla"));
        cars.add(new Car("Honda", "Civic"));
        cars.add(new Car("Ford", "Focus"));*/
        cars.add(new Car("Toyota", "Corolla", 20000.0));
        cars.add(new Car("Honda", "Civic", 22000.0));
        cars.add(new Car("Ford", "Focus", 18000.0));

        Collections.sort(cars, new Car());

        cars.forEach((Car obj) ->
                System.out.println("Car Name: " + obj.carName + ", Car Model: " + obj.carModel + ", Car Price: " + obj.carPrice));

        Collections.sort(cars, new CarComparator()); // implementing functional interface Comparator<Car> to sort by car price
        Collections.sort(cars, (a, b) -> a.carPrice.compareTo(b.carPrice)); // using lambda expression to sort by car price
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.carPrice.compareTo(o2.carPrice); // using anonymous class to sort by car price
            }
        });
    }
}
