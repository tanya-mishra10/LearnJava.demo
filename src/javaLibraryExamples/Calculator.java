package javaLibraryExamples;

import java.util.Scanner;

public class Calculator {
      public static void main(String[] args) {
          System.out.println("CALCULATOR");
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter first number");
          double num1 = sc.nextDouble();
          System.out.println("Enter any char(+, -, /, *)");
          char operator = sc.next().charAt(0);
          System.out.println("Enter second number");
          double num2 = sc.nextDouble();

          double result = 0;
          switch (operator){
              case '+':
                  result = num1 + num2;
                  break;
              case '-':
                  result = num1 - num2;
                  break;
              case '/':
                  if(num2 != 0){
                      result = num1 / num2;
                  }
                  else{
                      System.out.println("Error: Can't be divide by zero");
                  }
                  break;
              case '*':
                  result = num1 * num2;
                  break;
              default:
                  System.out.println("invalid operator");
                  sc.close();
          }
          System.out.println("Result" + " " + result);


      }
}
