import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("\nWelcome to our University's portal");

        System.out.print("\nID number: ");
        String StudentID = Scan.nextLine();

        System.out.print("Last name: ");
        String LastName = Scan.nextLine();

        System.out.print("First name: ");
        String FirstName = Scan.nextLine();

        System.out.print("Course: ");
        String Course = Scan.nextLine();

        System.out.print("Section: ");
        String Section = Scan.nextLine();

        System.out.println("\nWelcome! " + LastName + ", " + FirstName + " " + Course + " " + Section);

        System.out.print("\nPlease input your scores");

        System.out.print("\nMidterm Exam: ");
        int Midterm = Scan.nextInt();

        System.out.print("Final Exam: ");
        int Final = Scan.nextInt();

        System.out.print("Projects: ");
        int Project = Scan.nextInt();

        System.out.print("Attendance: ");
        int Atten = Scan.nextInt();

        int allOverScore = Midterm + Final + Project + Atten;

        double averageScore = allOverScore / 400.0 * 100;

        if (averageScore > 75) {
            System.out.println("------------------------------------------------");
            System.out.println("PASSED! Your average score is: " + averageScore);
            System.out.println("------------------------------------------------");
        }
        else {
            System.out.println("------------------------------------------------");
            System.out.println("FAILED. Your average score is: " + averageScore);
            System.out.println("------------------------------------------------");
        }

        Scan.close();
    }
}