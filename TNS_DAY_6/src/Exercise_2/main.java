package Exercise_2;

public class main {
    public static void main(String[] args) {
        // Create a Car object
        Car car1 = new Car("Toyota Camry", 25000.0);

        // Create a Driver object
        Driver driver1 = new Driver("Jay", 30);

        // Driver "Jay" drives the car "Toyota Camry"
        driver1.drive(car1);

        // Let's change the car's model and price using the setters
        car1.setModel("Honda Civic");
        car1.setPrice(22000.0);

        // Start and move the car
        car1.start();
        car1.move();

        // Create another Car and Driver
        Car car2 = new Car("Ford Mustang", 45000.0);
        Driver driver2 = new Driver("Vivek", 25);

        // Driver "Vivek" drives the car "Ford Mustang"
        driver2.drive(car2);

        // Let's change the car's model and price using the setters
        car2.setModel("Chevrolet Camaro");
        car2.setPrice(42000.0);

        // Start and move the car
        car2.start();
        car2.move();
    }
}
