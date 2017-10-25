package sda.spriing;

public class CommandLineView {

    private BikeListInterface rentABike;

    public BikeListInterface getRentABike() {
        return rentABike;
    }

    public void setRentABike(BikeListInterface rentABike) {
        this.rentABike = rentABike;
    }

    public CommandLineView() {
    }

    public void printAllBikes() {
        System.out.println(rentABike.getBikes().toString());
    }
}
