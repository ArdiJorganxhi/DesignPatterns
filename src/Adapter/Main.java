package Adapter;

import Bridge.Car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BasketballPlayerImpl player = new BasketballPlayerImpl();
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please select a scoring option: \n" +
                    "1. Dunk \n" +
                    "2. Hit Three \n" +
                    "3. Midrange \n" +
                    "4. Layup \n" +
                    "5. Exit");
            int user = scanner.nextInt();
            switch (user) {
                case 1:
                    player.score("DUNK");
                    result += 2;
                    System.out.println("And your result is:" + " " + result);
                    break;
                case 2:
                    player.score("THREE");
                    result += 3;
                    System.out.println("And your result is:" + " " + result);
                    break;
                case 3:
                    player.score("MIDRANGE");
                    result += 2;
                    System.out.println("And your result is:" + " " + result);
                    break;
                case 4:
                    player.score("MIDRANGE");
                    result += 2;
                    System.out.println("And your result is:" + " " + result);
                    break;

            }
            if(user == 5) {
                break;
            }
        }
    }
}
