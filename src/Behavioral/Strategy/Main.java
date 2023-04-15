package Behavioral.Strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username:");
        String username = scanner.next();
        System.out.println("Hello" + " " + username + " " + "how do you want to travel? \n" +
                "1. Train \n" +
                "2. Bus \n" +
                "3. Plane");
        int travel = scanner.nextInt();
        switch (travel) {
            case 1:
                Travel trainTravel = new Travel(new TrainTravelStrategy());
                trainTravel.travel(username);
                break;
            case 2:
                Travel busTravel = new Travel(new BusTravelStrategy());
                busTravel.travel(username);
                break;
            case 3:
                Travel planeTravel = new Travel(new PlaneTravelStrategy());
                planeTravel.travel(username);
                break;
        }
    }
}
