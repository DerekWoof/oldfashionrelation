package sda.spriing;

public class Bike {
    private String manufacturer;
    private String model;
    private String size;
    private String status;

    @Override
    public String toString() {
        return "Bike{" + "\n" +
                "manufacturer='" + manufacturer + '\'' + "\n" +
                ", model='" + model + '\'' + "\n" +
                ", size='" + size + '\'' + "\n" +
                ", status='" + status + '\'' + "\n" +
                '}' + "\n";
    }

    public Bike(String manufacturer, String model, String size, String status) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.status = status;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
