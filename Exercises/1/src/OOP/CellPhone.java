package OOP;

public class CellPhone {
    // Private instance variables
    private String brand;
    private String model;
    private double price;

    // Constructor
    public CellPhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getter and setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Other methods
    public void makeCall(String phoneNumber) {
        // Logic for making a call
        System.out.println("Calling " + phoneNumber + "...");
    }

    public void sendText(String message, String phoneNumber) {
        // Logic for sending a text
        System.out.println("Sending text to " + phoneNumber + ": " + message);
    }

    // toString method
    @Override
    public String toString() {
        return "CellPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

}
