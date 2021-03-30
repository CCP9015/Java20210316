package fju.edu.box;

public class Box3 extends Box {
    public Box3(){
        lenth = 10;
        width = 10;
        hight = 10;
    }

    @Override
    public String getName() {
        return "box 3";
    }

    @Override
    public int getPrice() {
        return 60;

    }
}
