package Exercise_2;

public class Driver {
    // Private attributes with accessors (getters and setters)
    private String name;
    private int age;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for the name attribute
    public String getName() {
        return name;
    }

    // Setter for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the age attribute
    public int getAge() {
        return age;
    }

    // Setter for the age attribute
    public void setAge(int age) {
        this.age = age;
    }

    // Driver behavior
    public void drive(Car car) {
        System.out.println(name + " is driving " + car.getModel());
        car.start();
        car.move();
        car.stop();
    }
}