public class Refrigerator {

    private boolean hasWorkToDo;

//    public Refrigerator (boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public  void orderFood(){
        if(hasWorkToDo) {
            System.out.println("Food Ordered");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkToDo;

//    public DishWasher(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Doing dishes");
        }
    }

}

class CoffeeMaker {
    private boolean hasWorkToDo;

//    public CoffeeMaker(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Brewing Coffee");
            hasWorkToDo = false;
        }
    }
}
