package fju.edu.box;

public abstract class Box {
    String id;
    int lenth;
    int width;
    int hight;
    int price;

    public boolean value(int l ,int w ,int h){
        return (l<= lenth && w <= width && h <= hight);

    }
    public abstract String getName();
    public abstract int getPrice();
   /* public Box(String id , int lenth , int width , int hight , int price){
        this.id = id;
        this.lenth = lenth;
        this.width = width;
        this.hight = hight;
        this.price = price;

    }*/
   /* public void print(){
        System.out.println("id" + id + "\t" + "lenth" + lenth + "\t" + "width" + width + "\t" + "hight" + hight + "price" + price);
    }*/
}
