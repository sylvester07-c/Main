import java.util.Scanner;

public class Main {



     public static void main(String[] args) {
         Movie movie = new Adventure("Stranger things");
         movie.getMovie("Science FICTION", "Stranger things");

//         int age = 35;
//
//         System.out.printf("You are %d years old.\n", age);
//         for(int i = 1; i <= 100000; i *= 10){
//
//             System.out.printf("%6d\n" , i);
//         }
//
//         Circle circle = new Circle(10);
//         System.out.println(circle.getArea());
//
//         Cylinder cylinder = new Cylinder(5, 10);
//         System.out.println(cylinder.getVolume());
//
//         SmartKitchen kitchen = new SmartKitchen();
//         kitchen.getCoffeeMaker().setHasWorkToDo(true);
//         kitchen.getCoffeeMaker().brewCoffee();

         Movie movie1 = new Movie("Spider Man");
         movie.watchMovie();

         Adventure adventure = new Adventure("Spider man");
         adventure.watchMovie();

         Scanner s = new Scanner(System.in);
         while(true){
             System.out.println("ENTER TYPE(A FOR ADVENTURE, C FOR COMEDY, S FOR SCIENCE FICTION. OR Q TO QUIT):");
             String type = s.nextLine();
             if("Qq".contains(type)) {
                 break;
             }
             System.out.println("Enter Movie Title: ");
             String title = s.nextLine();
             Movie movie2 = Movie.getMovie(type, title);
             movie2.watchMovie();
         }

         Car car = new Car("Mustange");
         System.out.println(car.getClass());
         car.runEngine();

         Car car1 = new GasPoweredCar("Pajero");
         car1.drive();

     }

     public static void printInfomation(String string){
         int length = string.length();
         System.out.printf("Length = %d %n", length);


     }
 }