import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("PUT 1: "); double num1 = scan.nextDouble();
        System.out.print("PUT 2: "); double num2 = scan.nextDouble();
        System.out.print("PUT 3: "); double num3 = scan.nextDouble();
        System.out.print("PUT 4: "); double num4 = scan.nextDouble();
        System.out.print("PUT 5: "); double num5 = scan.nextDouble();

        double sum = num1 + num2 + num3 + num4 + num5;
        double avg = sum / 5;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
