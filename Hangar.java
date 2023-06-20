package JavaQuete7;

public class Hangar {
    
    public static void main(String[] args) {
        var car1 = new Car("Clio", 120250);
        var boat1 = new Boat("Titanic", 2700);

        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());
    }
}
