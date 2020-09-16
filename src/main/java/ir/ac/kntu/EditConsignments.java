package ir.ac.kntu;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class EditConsignments {

    static Scanner scanner = new Scanner(System.in);

    public static void addCostumer(ArrayList<Costumer> costumers){

        System.out.println("Enter the costumer name :");
        String name = scanner.next();
        System.out.println("Enter the costumer nationalCode :");
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
        Costumer consignor = null;
        Costumer transferee = null;
        for (Costumer costumer:costumers){
            if (costumer.getNationalCode().equals(consignorNationalCode)){
                consignor  = new Costumer(costumer.getName(),consignorNationalCode);
            }else if (costumer.getNationalCode().equals(transfereeNationalCode)){
                transferee = new Costumer(costumer.getName(),transfereeNationalCode);
            }
        }
        if (consignor!=null && transferee!=null){
            System.out.println("Enter the home City:");
            String homeCity = scanner.nextLine();
//            System.out.println("Enter the location of home City :(x ,Y)");
//            int x1 = scanner.nextInt();
//            int y1 = scanner.nextInt();
            System.out.println("Enter the destination City:");
            String destinationCity = scanner.nextLine();
//            System.out.println("Enter the location of destination City :(x ,Y)");
//            int x2 = scanner.nextInt();
//            int y2 = scanner.nextInt();
            City home = new City(homeCity);
            City destination = new City(destinationCity);
            System.out.println("Enter the weight of consignment :");
            double weight = scanner.nextDouble();
            System.out.println("Enter the postage date :(year,month,day) ");
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            Date sendDate = new Date(year,month,day);
            System.out.println("Enter the receive date :(year,month,day) ");
            int year2 = scanner.nextInt();
            int month2 = scanner.nextInt();
            int day2 = scanner.nextInt();
            Date receiveDate = new Date(year,month,day);
            System.out.println("1-Across land ,2-Across sea ,3-Across air :");
            int ans = scanner.nextInt();
            switch (ans){
                case 1:
                    consignment.setWayToSend(WayToSend.OVERLAND);
                    break;
                case 2:
                    consignment.setWayToSend(WayToSend.SEAWAY);
                    break;
                case 3:
                    consignment.setWayToSend(WayToSend.AIRWAY);
                    break;
            }
            System.out.println("1-Private ,2-Ordinary :");
            int ans1 = scanner.nextInt();
            switch (ans1){
                case 1:
                    consignment.setCertification(Certification.CERTIFICATED);
                    break;
                case 2:
                    consignment.setCertification(Certification.ORDINARY);
                    break;
            }
            System.out.println("Enter the postage condition :");
            System.out.println("1-Unsent ,2-Unreached ,3-received :");
            int ans2 = scanner.nextInt();
            switch (ans2){
                case 1:
                    consignment.setOrderCondition(OrderCondition.UNSENT);
                    break;
                case 2:
                    consignment.setOrderCondition(OrderCondition.UNREACHED);
                    break;
                case 3:
                    consignment.setOrderCondition(OrderCondition.RECEIVED);
                    break;
            }

        }else {
            System.out.println("Costumers not fond!");
            System.out.println("press A to sign up :");
            String s = scanner.nextLine();
            if (s.equals("a")){
                addCostumer(costumers);
            }
        }
    }
    public static void sendAConsignment(ArrayList<Consignment> consignments){
        System.out.println("Enter the consignment name :");
        String name = scanner.nextLine();
        System.out.println("Enter the consignor name :");
        String consignorNationalCode = scanner.nextLine();
        for (Consignment consignment:consignments){
            if (consignment.getName().equals(name) && consignment.getConsignor().getNationalCode().equals(consignorNationalCode)){
                Date date = new Date();
                boolean res = date.before(new Date(consignment.getLoadTime().getYear(),consignment.getLoadTime().getMonth(),consignment.getLoadTime().getDay()));
            }else {
                System.out.println("Consignment not found!");
            }
        }

    }
}
