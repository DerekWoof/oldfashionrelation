package sda.spriing;

import java.util.ArrayList;
import java.util.List;

// java -jar target/old-fashion-relation-1.0-SNAPSHOT.jar

public class ArrayListRentABike implements BikeListInterface {

    private String name;
    private List<Bike> bikes = new ArrayList<Bike>();

    public ArrayListRentABike(String name) {
        this.name = name;

        bikes.add(new Bike("Trek","x111","17","good"));
        bikes.add(new Bike("Romet","orkan","21", "excellent"));
        bikes.add(new Bike("Canonadle","r500", "15","bad"));
    }

    @Override
    public String toString() {
        return "ArrayListRentABike{" + "\n" +
                "name='" + name + '\'' + "\n" +
                ", bikes=" + bikes + "\n" +
                '}' + "\n" ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bike> getBikes() {
        return bikes;
    }

    public Bike getBike(String model) {
        return null;
    }

    public void setBikes(List<Bike> bikes) {
        this.bikes = bikes;
    }
}
