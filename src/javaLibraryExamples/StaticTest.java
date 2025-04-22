package javaLibraryExamples;

class StaticSuper{
    static {
        System.out.println("super static block");
    }
    StaticSuper(){
        System.out.println("super constructor");
    }
}

public class StaticTest extends StaticSuper {
    static int num;
    static {
        num = (int) (Math.random()* 6);
        System.out.println("static block " + num);
    }
    StaticTest(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        StaticTest st = new StaticTest();
    }
}
