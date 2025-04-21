package javaLibraryExamples;

public class TestDuck {
    public static void main(String[] args) {
        int weight = 5;
        String n = "Donald";
        float flot = 2.2F;
        boolean fly = true;
        int speed = 28;
        Duck[] d = new Duck[5];
        d[0] = new Duck();
        d[1] = new Duck(fly);
        d[2] = new Duck(n);
        d[3] = new Duck(weight, flot);
        d[4] = new Duck(speed, n);
    }
}
