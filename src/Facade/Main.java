package Facade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one: \n" +
                "1. iPhone \n" +
                "2. Samsung");
        int user = scanner.nextInt();
        MobileShopOwner owner = new MobileShopOwner();
        switch (user) {
            case 1:
                owner.appleSale();
                break;
            case 2:
                owner.samsungSale();
                break;
        }
    }
}
