package javaLibraryExamples;

public class Duck {
    private int kilos = 6;
    private String name = "Generic";
    private float floatability = 2.1F;
    private boolean canFly = true;
    private int maxSpeed = 25;

    public Duck(){
        System.out.println("type 1 duck");
    }
    public Duck(boolean fly){
        canFly = fly;
        System.out.println("type 2 duck");
    }
    public Duck(String n){
      name = n;
        System.out.println("type 3 duck");
    }
    public Duck(int weight, float flot){
        kilos = weight;
        floatability = flot;
        System.out.println("type 4 duck");
    }
    public Duck(int speed, String n){
        maxSpeed = speed;
        name = n;
        System.out.println("type 5 duck");
    }
}
