import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalNum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");

            int number = scanner.nextInt();
            totalNum += number;

        }

        System.out.println("\nYour total number is: " + totalNum);
        scanner.close();
    }
}