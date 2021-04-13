package fju.edu.racing;

public class Racing {
    public static void main(String[] args) {
        String name1 = "horse1";
        Horse horse2 = new Horse();
        horse2.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println(name1 + " " + i);

        }
    }
}
