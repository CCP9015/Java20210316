package fju.edu.customer;

public class Customer {
    String id;
    int cus;

    public Customer(){
        super();
    }

    public Customer(String id, int cus){
        this.id = id;
        this.cus = cus;


    }
    public void print(){
        System.out.println(id + "\t" + cus );
    }

}
