package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Optional;

import static ir.ac.kntu.OrderCondition.*;

public class Main {
    public static void main(String []args){
        System.out.println("hello");
        ArrayList<Consignment> consignments = new ArrayList<>();
        ArrayList<Costumer> costumers = new ArrayList<>();
        Consignment consignment = new Consignment();
        Costumer costumer = new Costumer("laya" ,"1234");
        Costumer costumer1 = new Costumer("lay" ,"123");
        consignment.setOrderCondition(UNSENT);
        consignment.setConsignor(costumer);
        consignment.setTransferee(costumer1);
        consignments.add(consignment);
        Filtering.showCostumersConsignments(consignments);
    }
}
