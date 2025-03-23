import java.util.Scanner;

public class PowerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int elements = input.nextInt();
        
        Power[] powerArray = new Power[elements]; 
        
        for (int i = 0; i < elements; i++) {
            System.out.print("Enter base number for element " + (i + 1) + ": ");
            int base = input.nextInt();
            System.out.print("Enter exponent for element " + (i + 1) + ": ");
            int exp = input.nextInt(); 
            powerArray[i] = new Power(base, exp);
        }
        
        System.out.println("POWER RESULTS USING BRUTE FORCE:");
        for (Power p : powerArray) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerBF(p.baseNumber, p.exponent));
        }
        
        System.out.println("POWER RESULTS USING DIVIDE AND CONQUER:");
        for (Power p : powerArray) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerDC(p.baseNumber, p.exponent));
        }
        
        input.close();
    }
}
