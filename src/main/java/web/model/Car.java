package web.model;

public class Car {
    private String model;
    private String color;
    private double price;

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}