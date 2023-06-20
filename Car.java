package JavaQuete7;

public class Car extends Vehicle {
    
    public Car(String brand, int kilometers){
        super(brand, kilometers);
    }

    public String doStuff(){
        return "Je suis "+ this.brand +" et je fais vroum vroum !";
    }
}
