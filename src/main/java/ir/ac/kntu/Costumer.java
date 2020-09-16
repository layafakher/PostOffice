package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Objects;

public class Costumer {
    private String name;
    private String nationalCode;
    private ArrayList<Consignment> consignments = new ArrayList<>();
    private boolean getDiscount = false;

    public Costumer(String name, String nationalCode) {
        this.name = name;
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public ArrayList<Consignment> getConsignments() {
        return consignments;
    }

    public void setConsignments(ArrayList<Consignment> consignments) {
        this.consignments = consignments;
    }
    public  void addTOConsignments(Consignment consignment){
        this.consignments.add(consignment);
    }

    public boolean isGetDiscount() {
        return getDiscount;
    }

    public void setGeDiscount(boolean geDiscount) {
        this.getDiscount = geDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Costumer costumer = (Costumer) o;
        return name.equals(costumer.name) && nationalCode.equals(costumer.nationalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nationalCode);
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", consignments=" + consignments +
                '}';
    }
    public String toString2() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                '}';
    }
}
