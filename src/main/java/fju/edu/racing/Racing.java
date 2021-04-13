package fju.edu.racing;

public class Racing {


    public static void main(String[] args) {
        Horse h1 = new Horse();
        Horse h2 = new Horse();
        HorseRunable h3 = new HorseRunable();
        Thread th = new Thread(h3);
        h1.start();
        h2.start();
        h3.run();
    }
}
