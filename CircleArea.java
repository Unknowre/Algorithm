import java.util.Scanner;


public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle that has radius = " + radius + " meters is " + area + " square meters.");
    }
}
