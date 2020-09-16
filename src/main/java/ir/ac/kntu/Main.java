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

        System.out.println("hello");
        ArrayList<Consignment> consignments = new ArrayList<>();
        ArrayList<Costumer> costumers = new ArrayList<>();
        Consignment consignment = new Consignment();
        Costumer costumer = new Costumer("laya" ,"1234");
        costumer.setConsignments(consignments);
        Costumer costumer1 = new Costumer("lay" ,"123");
        consignment.setOrderCondition(UNSENT);
        consignment.setConsignor(costumer);
        consignment.setTransferee(costumer1);
        consignments.add(consignment);
//        Filtering.showCostumersConsignments(consignments);
//        EditConsignments.addConsignment(consignments,costumers);
        //Filtering.showCostumersDetails(consignments);
        EditConsignments.writeInHtml(consignments);

    }
}
