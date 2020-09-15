package ir.ac.kntu;

public class Consignment {
    private String name;
    private Costumer consignor;
    private Costumer transferee;
    private City home;
    private City destination;
    private double weight;
    private Date loadTime;
    private Date receiveTime;
    private WayToSend wayToSend;
    private OrderCondition orderCondition;
    private Certification certification;
    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Costumer getConsignor() {
        return consignor;
    }

    public void setConsignor(Costumer consignor) {
        this.consignor = consignor;
    }

    public Costumer getTransferee() {
        return transferee;
    }

    public void setTransferee(Costumer transferee) {
        this.transferee = transferee;
    }

    public City getHome() {
        return home;
    }

    public void setHome(City home) {
        this.home = home;
    }

    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Date loadTime) {
        this.loadTime = loadTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public WayToSend getWayToSend() {
        return wayToSend;
    }

    public void setWayToSend(WayToSend wayToSend) {
        this.wayToSend = wayToSend;
    }

    public OrderCondition getOrderCondition() {
        return orderCondition;
    }

    public void setOrderCondition(OrderCondition orderCondition) {
        this.orderCondition = orderCondition;
    }

    public Certification getCertification() {
        return certification;
    }

    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Consignment{" +
                "name='" + name + '\'' +
                //", consignor=" + consignor +
               // ", transferee=" + transferee +
                ", home=" + home +
                ", destination=" + destination +
                ", weight=" + weight +
                ", loadTime=" + loadTime +
                ", receiveTime=" + receiveTime +
                ", wayToSend=" + wayToSend +
                ", orderCondition=" + orderCondition +
                ", certification=" + certification +
                ", price=" + price +
                '}';
    }
}
