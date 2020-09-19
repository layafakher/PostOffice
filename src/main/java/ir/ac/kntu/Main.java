package ir.ac.kntu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import static ir.ac.kntu.OrderCondition.*;

public class Main {

    public static void main(String []args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("hello");
        ArrayList<Consignment> consignments = new ArrayList<>();
        ArrayList<Costumer> costumers = new ArrayList<>();
        ArrayList<City> cities = new ArrayList<>();
        Consignment consignment = new Consignment();
        consignment.setName("c");
        Costumer costumer = new Costumer("laya" ,"1234");
        costumer.setConsignments(consignments);
        Costumer costumer1 = new Costumer("lay" ,"123");
        consignment.setOrderCondition(UNSENT);
        consignment.setConsignor(costumer);
        consignment.setTransferee(costumer1);
        Consignment c = new Consignment();
        c.setTransferee(costumer);
        c.setConsignor(costumer1);
        costumers.add(costumer);
        costumers.add(costumer1);
        consignments.add(consignment);
        consignments.add(c);
        while (true){
            System.out.println("1-Add costumer ,2-Add city ,3-Add consignment ,4-Send a consignment ,5-Pursue a consignment ,");
            System.out.println("6-Update a consignment ,7-Search for a costumer ,8-Search by destination&home ,9-Search by way to send ,");
            System.out.println("10-Search by postage condition ,11-Search for a consignment by costumer ,12-Save reportage in html file");
            String ans = sc.nextLine();
            switch (ans){
                case "1":
                    EditConsignments.addCostumer(costumers);
                    break;
                case "2":
                    EditConsignments.addCity(cities);
                    break;
                case "3":
                    EditConsignments.addConsignment(consignments,costumers);
                    break;
                case "4":
                    EditConsignments.sendAConsignment(consignments);
                    break;
                case "5":
                    EditConsignments.pursueAConsignment(consignments);
                    break;
                case "6":
                    EditConsignments.updateAConsignment(consignments);
                    break;
                case "7":
                    Filtering.showCostumersDetails(costumers);
                    break;
                case "8":
                    Filtering.showDestinationAndHome(consignments);
                    break;
                case "9":
                    Filtering.showWaysToSend(consignments);
                    break;
                case "10":
                    Filtering.showOrderConditions(consignments);
                    break;
                case "11":
                    Filtering.showCostumersConsignments(consignments);
                    break;
                case "12":
                    EditConsignments.writeInHtml(consignments);
                    break;
            }
        }
//        Filtering.showCostumersConsignments(consignments);
//        EditConsignments.addConsignment(consignments,costumers);
        //Filtering.showCostumersDetails(consignments);
        //EditConsignments.writeInHtml(consignments);

    }
}
