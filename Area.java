import java.util.*;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter base of triangle ");
        double base = scan.nextDouble();
        System.out.print("Enter height of triangle ");
        double height = scan.nextDouble();
        double triangle = 0.5 * base * height;

        System.out.print("Enter side of square: ");
        double side = scan.nextDouble();
        double square = side * side;

        System.out.println("Triangle area = " + triangle);
        System.out.println("Square area = " + square);
    }
}
