import java.util.*;

public class list {
     public static void main(String[] args) {
        list<String> ls = new ArrayList<>();
        ls.add("java");
        ls.add("python");
        ls.add("javaScript");
        ls.add("html");

        for(String s: ls){
            System.out.println(s);
        }
        System.out.println("Element at Index 1 :" + li.get(1));
     }
}