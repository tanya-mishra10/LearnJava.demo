package javaLibraryExamples;

import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);
    public int getGuess(int attempt){
        System.out.println("Enter guess #" + attempt + ": ");
        return sc.nextInt();
    }


}
