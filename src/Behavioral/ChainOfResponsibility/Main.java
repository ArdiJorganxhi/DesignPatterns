package Behavioral.ChainOfResponsibility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ATMDispenser atmDispenser = new ATMDispenser();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter amount you want to dispense?");
            int amount = scanner.nextInt();
            if(amount % 10 != 0) {
                System.out.println("Please enter an amount that is multiple of 10's");
                return;
            }

            atmDispenser.euro200.dispense(new Money(amount));
            break;
        }
    }
}
