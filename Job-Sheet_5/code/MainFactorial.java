import java.util.Scanner;

public class MainFactorial {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial factorial = new Factorial();

        System.out.print("Input a number: ");
        int num = sc.nextInt();    

        System.out.println("Factorial of " + num + " using Brute Force: " + factorial.faktorialBF(num));
        System.out.println("Factorial of " + num + " using Divide and Conquer: " + factorial.faktorialDC(num));
    }
}

