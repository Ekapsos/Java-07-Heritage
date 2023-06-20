package JavaQuete7;

public abstract class Vehicle {
    
    String brand;
    int kilometers;

    public Vehicle (String brand,int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getters
    public String getBrand() {
        return this.brand;
    }
    public int getKilometers() {
        return this.kilometers;
    }
    //setters
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setAware(int kilometers){
        this.kilometers = kilometers;
    }

    public abstract String doStuff();

}
