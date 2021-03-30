package fju.edu.box;

import fju.edu.box.Box;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your lenth");
        int len = Integer.parseInt(scan.next());
        System.out.println("please enter your width");
        int wid = Integer.parseInt(scan.next());
        System.out.println("please enter your hight");
        int hig = Integer.parseInt(scan.next());
        System.out.println("lenth :" + len + "width" + wid + "hight" + hig);
        if (box3.value(len,wid,hig)) {
            System.out.println(box3.getName());
        }




    }
}
