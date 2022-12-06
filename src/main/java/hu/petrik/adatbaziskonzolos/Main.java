package hu.petrik.adatbaziskonzolos;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static DogDb db;
    public static void main(String[] args) throws SQLException {


        try {

            System.out.println(db.getDogs());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    private static void readDogsFromConsole(){
        System.out.println("Hány kutya kő");
        Scanner sc = new Scanner(System.in);
        try {
            int count = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < count ; i++) {
                System.out.println("Dog nevet kérek");
                String name = sc.nextLine();
                System.out.println("Dog életkorát most");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("fajta kutya ez");
                String breed = sc.nextLine();
                Dog dog = new Dog(name , age , breed);
                db.createDog(dog){

                }

            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println("Hülyegyerek számot kérek");
        }
    }
}
