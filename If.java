import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนจำนวนเต็ม: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("จำนวนเต็มบวก");
        } else {
            System.out.println("ไม่ใช่จำนวนเต็มบวก");
        }
        System.out.println("จบ");
        scanner.close();
    }
}
