package fju.edu.customer;

public class SilverCustomer extends Customer{
    float discount = 0.1f;
    public SilverCustomer(String id, int cus){
        super(id ,cus);
        this.discount = discount;
    }

}
