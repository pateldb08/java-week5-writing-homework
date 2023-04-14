package program_1_calculate;

import java.util.Scanner;

public class Homework_Week_9_Calculate_Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Declaring a scanner class
        String answer;
        do {
            System.out.println("Please enter First Number:");  // input wizard
            int a = scanner.nextInt();
            System.out.println("Please enter Second Number:");  // input wizard
            int b = scanner.nextInt();
            System.out.println("Please enter one of the symbol +,_,/,* :");  // input wizard
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculaion Please enter Y or N: "); // input wizard
            answer = scanner.next().toLowerCase();
        }
        while (answer.startsWith("y"));
        // Closing scanner object
        scanner.close();

    }

}
