package ir.ac.kntu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import static ir.ac.kntu.OrderCondition.*;

public class Main {

    public static void main(String []args){

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
        Filtering.showCostumersConsignments(consignments);
        Date date = new Date();
        boolean res = date.after(new Date(2022,3,4));
        System.out.println(res);
        System.out.println(date);
        //Filtering.showCostumersDetails(consignments);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        java.util.Date date = new Date();
//        System.out.println(dateFormat.format(date));
    }
}
