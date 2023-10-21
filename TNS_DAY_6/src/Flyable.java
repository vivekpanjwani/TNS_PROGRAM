
// Define the Flyable interface
interface Flyable1 {
    void fly_obj();
}

// Implement the Flyable interface in the Spacecraft class
class Spacecraft implements Flyable1 {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

// Implement the Flyable interface in the Airplane class
class Airplane implements Flyable1 {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

// Implement the Flyable interface in the Helicopter class
class Helicopter implements Flyable1 {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying in the air.");
    }
}

public class Flyable {
	public static void main(String[] args) {
        Spacecraft obj1 = new Spacecraft();
        Airplane obj2 = new Airplane();
        Helicopter obj3 = new Helicopter();

        obj1.fly_obj(); // Calls the fly_obj method of the Spacecraft class
        obj2.fly_obj(); // Calls the fly_obj method of the Airplane class
        obj3.fly_obj(); // Calls the fly_obj method of the Helicopter class
    }
}
