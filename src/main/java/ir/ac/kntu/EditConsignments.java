package ir.ac.kntu;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import ir.ac.kntu.*;

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
        String orderName = scanner.next();consignment.setName(orderName);
        System.out.println("Enter the consignor nationalCode :");
        String consignorNationalCode = scanner.next();
        System.out.println("Enter the transferee nationalCode :");
        String transfereeNationalCode = scanner.next();
        Costumer consignor = null;
        Costumer transferee = null;
        for (Costumer costumer:costumers){
            if (costumer.getNationalCode().equals(consignorNationalCode)){
                consignor  = new Costumer(costumer.getName(),consignorNationalCode);
                consignment.setConsignor(consignor);
            }else if (costumer.getNationalCode().equals(transfereeNationalCode)){
                transferee = new Costumer(costumer.getName(),transfereeNationalCode);
                consignment.setTransferee(transferee);
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
            City home = new City(homeCity);consignment.setHome(home);
            City destination = new City(destinationCity);consignment.setDestination(destination);
            System.out.println("Enter the weight of consignment :");
            double weight = scanner.nextDouble();consignment.setWeight(weight);
            System.out.println("Enter the postage date :(year,month,day,hour) ");
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int hour = scanner.nextInt();
            ir.ac.kntu.Date sendDate = new ir.ac.kntu.Date(year,month,day);
            sendDate.setHour(hour);
            System.out.println("Enter the receive date :(year,month,day,hour) ");
            int year2 = scanner.nextInt();
            int month2 = scanner.nextInt();
            int day2 = scanner.nextInt();
            int hour2 = scanner.nextInt();
            ir.ac.kntu.Date receiveDate = new ir.ac.kntu.Date(year,month,day);
            receiveDate.setHour(hour2);
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
            System.out.println("1-Certified mail ,2-Ordinary mail :");
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
        Consignment c = new Consignment();
        boolean isFound = false;
        for (Consignment consignment:consignments){
            if (consignment.getName().equals(name) && consignment.getConsignor().getNationalCode().equals(consignorNationalCode)){
                c = consignment;
                isFound = true;
                break;
                }
        }
        if (isFound){
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            System.out.println(gregorianCalendar.get(Calendar.MONTH));
            for (Consignment consignment:consignments){
                String loadTime = consignment.getReceiveTime().getMonth()+"/"+consignment.getReceiveTime().getDay()+"/"+consignment.getReceiveTime().getYear()+" "+consignment.getReceiveTime().getMonth()+":mm:ss";
                    if (calculateTimeDifference(loadTime)){
                        consignment.setOrderCondition(OrderCondition.RECEIVED);
                }
            }
        }
        else {
            System.out.println("Consignment not found!");
        }

    }
    public static boolean calculateTimeDifference( String dateStop) {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        Date d1 = new Date();
        Date d2 = null;
        boolean result = false;

        try {
//            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);

            // in milliseconds
            long diff = d2.getTime() - d1.getTime();
//            long diffSeconds = diff / 1000 % 60;
//            long diffMinutes = diff / (60 * 1000) % 60;
//            long diffHours = diff / (60 * 60 * 1000) % 24;
//            long diffDays = diff / (24 * 60 * 60 * 1000);
//            System.out.print(diffDays + " days, ");
//            System.out.print(diffHours + " hours, ");
//            System.out.print(diffMinutes + " minutes, ");
//            System.out.print(diffSeconds + " seconds.");
            if (diff<=0){
                result = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
