package program;

import java.util.Scanner;

//find  Factorial Program in Java
public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter Any Number : ");
        int num = scanner.nextInt();

        int factorial = 1;
        for (int i=1; i<=num; i++){
            factorial*=i;
        }
        System.out.printf("is "+ factorial);
    }
}
