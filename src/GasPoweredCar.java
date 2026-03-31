public class GasPoweredCar extends  Car{

    public  GasPoweredCar(String description) {
        super(description);
    }

    public double avKmPerLitre(){
        double aveKmPerLitre = 45.50;
        return  aveKmPerLitre;
    }

    public int cylinders() {
        int noOfCylinders = 10;
        System.out.printf("number Of Cylinders = %d", noOfCylinders);
        return  noOfCylinders;
    }

}
