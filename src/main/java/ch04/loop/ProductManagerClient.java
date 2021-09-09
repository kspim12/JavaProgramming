package ch04.loop;

import java.util.Scanner;

public class ProductManagerClient {

    private final String line = "**********************************************";
    String mainMenu = "List(L)\tRegist(R)\tSales(S)\tExit(X)";
    Scanner scanner = new Scanner(System.in);

    private void displayMainMenu() {
        do {
            System.out.printf("%s%n%s%n%s%n", line, mainMenu, line);
            String input = scanner.nextLine();
            if ( input.equalsIgnoreCase("X")) {
                System.out.println("Program Exit...");
                return;
            } else if ( input.equalsIgnoreCase("L")) {
                System.out.println("show current product list");
            } else if ( input.equalsIgnoreCase("S")) {
                System.out.println("Sales Product");
            } else if ( input.equalsIgnoreCase("R")) {
                System.out.println("Regist Product");
            } else {
                System.out.println("It is not proper menu");
            }
        } while ( true) ;
    }


    public static void main(String[] args) {

        ProductManagerClient productManagerClient = new ProductManagerClient();
        productManagerClient.displayMainMenu();


    }
}
