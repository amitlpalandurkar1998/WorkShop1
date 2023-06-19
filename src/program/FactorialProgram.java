package program;

import java.util.Scanner;

//find  Factorial Program in Java
public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter Any Number : ");
        int num = scanner.nextInt();

        int factorial = 1;

        if (num <0) {
            System.out.printf(num+" is Not Valid Number.");
            factorial=num;
        }else {
            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    factorial *= i;
                }
            } else {
                factorial = 0;
            }
            System.out.printf("The  Factorial " + num + " is : " + factorial);
        }
    }
}
