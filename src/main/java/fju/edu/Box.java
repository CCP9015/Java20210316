package fju.edu;

public class Box {
    String id;
    int lenth;
    int width;
    int hight;
    int price;
    public Box(String id , int lenth , int width , int hight , int price){
        this.id = id;
        this.lenth = lenth;
        this.width = width;
        this.hight = hight;
        this.price = price;

    }
    public void print(){
        System.out.println("id" + id + "\t" + "lenth" + lenth + "\t" + "width" + width + "\t" + "hight" + hight + "price" + price);
    }
}
