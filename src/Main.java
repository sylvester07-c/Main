 public class Main {
     public static void main(String[] args) {
         int age = 35;

         System.out.printf("You are %d years old.\n", age);
         for(int i = 1; i <= 100000; i *= 10){

             System.out.printf("%6d\n" , i);
         }

         Circle circle = new Circle(10);
         System.out.println(circle.getArea());

         Cylinder cylinder = new Cylinder(5, 10);
         System.out.println(cylinder.getVolume());

         SmartKitchen kitchen = new SmartKitchen();
         kitchen.getCoffeeMaker().setHasWorkToDo(true);
         kitchen.getCoffeeMaker().brewCoffee();

         Movie movie = new Movie("Spider Man");
         movie.watchMovie();
     }

     public static void printInfomation(String string){
         int length = string.length();
         System.out.printf("Length = %d %n", length);


     }
 }