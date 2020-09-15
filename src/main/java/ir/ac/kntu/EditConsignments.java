package ir.ac.kntu;
import java.util.ArrayList;
import java.util.Scanner;

public class EditConsignments {

    static Scanner scanner = new Scanner(System.in);

    public static void addCostumer(ArrayList<Costumer> costumers){

        System.out.println("Enter your name :");
        String name = scanner.next();
        System.out.println("Enter your nationalCode :");
        String nationalCode = scanner.next();
        Costumer costumer = new Costumer(name,nationalCode);
        costumers.add(costumer);

    }

    public static void addConsignment(ArrayList<Consignment> consignments ,ArrayList<Costumer> costumers){
        Consignment consignment = new Consignment();
        System.out.println("Enter the order name :");
        String orderName = scanner.next();
        System.out.println("Enter the consignor nationalCode :");
        String consignorNationalCode = scanner.next();
        System.out.println("Enter the transferee nationalCode :");
        String transfereeNationalCode = scanner.next();
        Costumer consignor;
        Costumer transferee;



    }
}
