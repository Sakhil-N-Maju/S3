import java.util.*;

public class MultiplicationTable {
    public static void printMultiplicationTable(int number, int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to print its multiplication table: ");
        int number = scanner.nextInt();
        System.out.print("Enter the limit up to which the multiplication table should be printed: ");
        int limit = scanner.nextInt();
        System.out.println("Multiplication Table for " + number + ":");
        printMultiplicationTable(number, limit);
        scanner.close();
    }
}
