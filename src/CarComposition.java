public class CarComposition {
    private String model;
    private String color;
    private int doors;

    private EngineComposition myEngine;

    public CarComposition() {
    }

    public CarComposition(String model, String color, int doors, EngineComposition myEngine) {
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.myEngine = myEngine;
    }

    public EngineComposition getEngine() {
        return myEngine;
    }

    public void setEngine(EngineComposition myEngine) {
        this.myEngine = myEngine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
