public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Starting Engine");
    }

    public  void drive() {
        System.out.println("Driving Car");
    }

    protected void runEngine() {
        System.out.println("Engine is running");
    }
}
