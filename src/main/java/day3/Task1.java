package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Country = s.nextLine();
        switch (Country) {
            case "Moscow":
            case "Vladivostok":
            case "Rostov":
                System.out.println("Russian Federation");
                break;
            case "Rome":
            case "Milan":
            case "Torino":
                System.out.println("Italy");
                break;
            case "Liverpool":
            case "Manchester":
            case "London":
                System.out.println("England");
                break;
            case "Cologne":
            case "Munich":
            case "Berlin":
                System.out.println("Germany");
                break;
            case "Stop":
                break;
            default:
                System.out.println("Unknown country");
        }
    }
}
