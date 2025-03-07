import java.util.Scanner;

public class Looping17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input NIM: ");
        double NIM = sc.nextDouble();
        sc.nextLine();
        System.out.println("=====================");

        double n = NIM % 100;

        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
