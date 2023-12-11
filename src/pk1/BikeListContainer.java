package pk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BikeListContainer {
    private List<Bike> bikeList;

    public BikeListContainer() {
        this.bikeList = new ArrayList<>();
    }

    public void populateList(List<Bike> bikes) {
        bikeList.addAll(bikes);
    }

    public void displayList() {
        for (Bike bike : bikeList) {
            System.out.println(bike);
        }
    }

    public void iterateList() {
        Iterator<Bike> iterator = bikeList.iterator();
        while (iterator.hasNext()) {
            Bike bike = iterator.next();
            // Process each bike as needed
        }
    }

    public void insertBike(Bike bike) {
        bikeList.add(bike);
    }

    public Bike retrieveBike(int index) {
        if (index >= 0 && index < bikeList.size()) {
            return bikeList.get(index);
        }
        return null;
    }

    public void removeBike(Bike bike) {
        bikeList.remove(bike);
    }

    public boolean searchBike(Bike bike) {
        return bikeList.contains(bike);
    }

    public void sortList() {
        Collections.sort(bikeList);
    }

    public List<Bike> copyToList() {
        return new ArrayList<>(bikeList);
    }

    public void shuffleList() {
        Collections.shuffle(bikeList);
    }

    public void reverseList() {
        Collections.reverse(bikeList);
    }

    public List<Bike> extractSubList(int fromIndex, int toIndex) {
        return new ArrayList<>(bikeList.subList(fromIndex, toIndex));
    }

    public boolean compareLists(BikeListContainer otherListContainer) {
        return bikeList.equals(otherListContainer.bikeList);
    }

    public void swapElements(int index1, int index2) {
        Collections.swap(bikeList, index1, index2);
    }

    public void clearList() {
        bikeList.clear();
    }

    public boolean isListEmpty() {
        return bikeList.isEmpty();
    }
}