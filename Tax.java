import java.util.*;

public class Tax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("salary: ");
        double sal = scan.nextDouble(); 
        double tax = sal * 0.10;
        System.out.println("Tax: " + tax + " Bath");
    }
}
