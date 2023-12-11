package pk1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BikeArrayContainer {
	private Bike[] bikes;

    public BikeArrayContainer(Bike[] bikes) {
        this.bikes = bikes;
    }

    public void sortBikes() {
        Arrays.sort(bikes);
    }

    public void addBike(Bike bike) {
        // Resize the array to accommodate the new bike
        bikes = Arrays.copyOf(bikes, bikes.length + 1);
        bikes[bikes.length - 1] = bike;
    }

    public void removeBike(Bike bike) {
        List<Bike> bikeList = new ArrayList<>(Arrays.asList(bikes));
        bikeList.remove(bike);
        bikes = bikeList.toArray(new Bike[0]);
    }

    public int countBikes() {
        return bikes.length;
    }

    public void reverseOrder() {
        List<Bike> bikeList = Arrays.asList(bikes);
        Collections.reverse(bikeList);
        bikes = bikeList.toArray(new Bike[0]);
    }

    public void displayBikes() {
        for (Bike bike : bikes) {
            System.out.println(bike);
        }
    }

    public Bike findLargestBike() {
        return Arrays.stream(bikes)
                .max(Comparator.naturalOrder())
                .orElse(null);
    }

    public boolean testArrayEquality(Bike[] otherBikes) {
        return Arrays.equals(bikes, otherBikes);
    }


}