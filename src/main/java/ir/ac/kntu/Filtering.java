package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Scanner;

public class Filtering {
    static Scanner scanner = new Scanner(System.in);

    public static void showWaysToSend(ArrayList<Consignment> consignments){
        System.out.println("1-See airway consignments ,2-See overland consignments ,3-See seaway consignments");
        String res = scanner.nextLine();
        switch (res){
            case "1":
                for (Consignment consignment:consignments){
                    if (consignment.getWayToSend().equals(WayToSend.AIRWAY)){
                        System.out.println(consignment.toString());
                    }
                }
                break;
            case "2":
                for (Consignment consignment:consignments){
                    if (consignment.getWayToSend().equals(WayToSend.OVERLAND)){
                        System.out.println(consignment.toString());
                    }
                }
                break;
            case "3":
                for (Consignment consignment:consignments){
                    if (consignment.getWayToSend().equals(WayToSend.SEAWAY)){
                        System.out.println(consignment.toString());
                    }
                }
                break;
        }
    }

    public static void showOrderConditions(ArrayList<Consignment> consignments){
        System.out.println("1-See received consignments ,2-See unreached consignments ,3-See unsent consignments");
        String res = scanner.nextLine();
        switch (res){
            case "1":
                for (Consignment consignment:consignments){
                    if (consignment.getOrderCondition().equals(OrderCondition.RECEIVED)){
                        System.out.println(consignment.toString());
                    }
                }
                break;
            case "2":
                for (Consignment consignment:consignments){
                    if (consignment.getOrderCondition().equals(OrderCondition.UNREACHED)){
                        System.out.println(consignment.toString());
                    }
                }
                break;
            case "3":
                for (Consignment consignment:consignments){
                    if (consignment.getOrderCondition().equals(OrderCondition.UNSENT)){
                        System.out.println(consignment.toString());
                    }
                }
                break;
        }
    }
    public static void showCostumersConsignments(ArrayList<Consignment> consignments){
        System.out.println("Enter the costumer name :");
        String name = scanner.nextLine();
        System.out.println("Enter the costumer national code :");
        String nationalCode = scanner.nextLine();
        Costumer costumer = new Costumer(name ,nationalCode);
        for (Consignment consignment:consignments)  {
            if (consignment.getTransferee().equals(costumer) || consignment.getConsignor().equals(costumer)){
                System.out.println(consignment.toString());
            }
        }
    }

    public static void showDestinationAndHome(ArrayList<Consignment> consignments){

        System.out.println("Enter the city name :");
        String cityName = scanner.nextLine();
        City city = new City(cityName);
        for (Consignment consignment:consignments){
            if (consignment.getDestination().equals(city) || consignment.getHome().equals(city)){
                System.out.println(consignment.toString());
            }
        }
    }
    public static void showCostumersDetails(ArrayList<Costumer> costumers){
        System.out.println("Enter the costumer name :");
        String name = scanner.nextLine();
        System.out.println("Enter the costumer national code :");
        String nationalCode = scanner.nextLine();
        Costumer costumer = new Costumer(name ,nationalCode);
        for (Costumer costumer1:costumers)  {
            if (costumer1.equals(costumer)){
                System.out.println(costumer.toString());
            }
        }

    }

}
