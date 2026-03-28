public class SmartKitchen {

    private  CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        this.brewMaster =  new CoffeeMaker();
        this.iceBox = new Refrigerator();
        this.dishWasher = new DishWasher();
    }


    public CoffeeMaker getCoffeeMaker() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}
