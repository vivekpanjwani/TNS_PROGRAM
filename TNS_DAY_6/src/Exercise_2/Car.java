package Exercise_2;

public class Car {
    // Private attributes with accessors (getters and setters)
    private String model;
    private double price;
    private boolean running;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
        this.running = false;
    }

    // Getter for the model attribute
    public String getModel() {
        return model;
    }

    // Setter for the model attribute
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for the price attribute
    public double getPrice() {
        return price;
    }

    // Setter for the price attribute
    public void setPrice(double price) {
        this.price = price;
    }

    // Start the car
    public void start() {
        running = true;
        System.out.println(model + " is now running.");
    }

    // Stop the car
    public void stop() {
        running = false;
        System.out.println(model + " has stopped.");
    }

    // Move the car
    public void move() {
        if (running) {
            System.out.println(model + " is moving.");
        } else {
            System.out.println(model + " can't move because it's not running.");
        }
    }
}