import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter score (0-100): ");
        int score = sc.nextInt();
        String grade;
        if (score >= 80 && score <= 100) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("\nResult");
        System.out.println("Name : " + name);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
