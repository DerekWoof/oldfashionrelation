package sda.spriing;

public class RentABikeAssmbler {

    public static void main(String[] args) {

        CommandLineView clv = new CommandLineView();
        BikeListInterface bli = new ArrayListRentABike("rowery na weekend");
        clv.setRentABike(bli);
        clv.printAllBikes();

    }
}
