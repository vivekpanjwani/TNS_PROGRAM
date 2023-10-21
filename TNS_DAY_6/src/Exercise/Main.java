package Exercise;

public class Main {
 public static void main(String[] args) {
     Flyable obj1 = new Spacecraft();
     Flyable obj2 = new Airplane();
     Flyable obj3 = new Helicopter();

     obj1.fly_obj();
     obj2.fly_obj();
     obj3.fly_obj();
 }
}
