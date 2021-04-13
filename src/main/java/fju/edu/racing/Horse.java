package fju.edu.racing;

public class Horse extends Thread {
    String name2 = "horse2";
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(name2 + " " + i);
        }
    }
}
