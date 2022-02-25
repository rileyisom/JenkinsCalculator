import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator \nEnter command:");

        while(true) {
            String input=scanner.nextLine();
            String[] inputArray=input.split(" ");

            if (inputArray[0].equals("add")) {
                System.out.println(calculator.add(Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2])));
            } else if (inputArray[0].equals("subtract")) {
                System.out.println(calculator.subtract(Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2])));
            } else if (inputArray[0].equals("multiply")) {
                System.out.println(calculator.multiply(Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2])));
            } else if (inputArray[0].equals("divide")) {
                System.out.println(calculator.divide(Integer.parseInt(inputArray[1]), Integer.parseInt(inputArray[2])));
            } else if (inputArray[0].equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(inputArray[1])));
            } else if (inputArray[0].equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(inputArray[1])));
            } else if (inputArray[0].equals("exit")) {
                System.out.println("See ya!");
                break;
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
