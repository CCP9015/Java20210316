package fju.edu.box;

import fju.edu.box.Box;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your lenth");
        int len = Integer.parseInt(scan.next());
        System.out.println("please enter your width");
        int wid = Integer.parseInt(scan.next());
        System.out.println("please enter your hight");
        int hig = Integer.parseInt(scan.next());
        System.out.println("lenth:" + len + "\t" + "width:" + wid + "\t" + "hight" + hig);
        System.out.print("you can choose ");
        if (box3.value(len,wid,hig)) {
            System.out.println("size:" + box3.getName() + "\t" + "price:" + box3.getPrice());
        }else if (box5.value(len,wid,hig)) {
            System.out.println("size:" + box5.getName() + "\t" + "price:" + box5.getPrice());
        }




    }
}
