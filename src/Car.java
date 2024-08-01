public class Car {


    // Attributes
    private int speed;
    private String color;
    private String model;



    // Methods

 // SETTERS & GETTERS
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    void turnOn(){
        System.out.println("Car is being turned on now");
    }

    void brake(){
        System.out.println("Brake");
    }

    void turnOff(){
        System.out.println("Car has been stopped now");
    }

    public Car(int speed, String color, String model) {
        this.speed = speed;
        this.color = color;
        this.model = model;
    }
}
