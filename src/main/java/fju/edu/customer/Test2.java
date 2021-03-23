package fju.edu.customer;

public class Test2 {
    public static void main(String[] args) {
        Customer cus = new Customer("1234",1000);
        SilverCustomer slcus = new SilverCustomer("5678",5000);
        slcus.print();
    }
}
