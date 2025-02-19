import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== Cube Calculator Menu =====");
            System.out.println("1. Calculate Volume");
            System.out.println("2. Calculate Surface Area");
            System.out.println("3. Calculate Perimeter (Total Edge Length)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter the length of the cube: ");
                double length = input.nextDouble();
                System.out.print("Enter the width of the cube: ");
                double width = input.nextDouble();
                System.out.print("Enter the height of the cube: ");
                double height = input.nextDouble();

                double volume = calculateVolume(length, width, height);
                System.out.println("Volume of the cube: " + volume);
            } 
            else if (choice == 2) {
                System.out.print("Enter the side length of the cube: ");
                double sideLength = input.nextDouble();

                double surfaceArea = calculateSurfaceArea(sideLength);
                System.out.println("Surface Area of the cube: " + surfaceArea);
            } 
            else if (choice == 3) {
                System.out.print("Enter the side length of the cube: ");
                double side = input.nextDouble();

                double perimeter = calculatePerimeter(side);
                System.out.println("Perimeter (Total Edge Length) of the cube: " + perimeter);
            } 
            else if (choice == 4) {
                System.out.println("Exiting program. Thank you!");
            } 
            else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        input.close();
    }
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    public static double calculateSurfaceArea(double sideLength) {
        return 6 * (sideLength * sideLength);
    }
    public static double calculatePerimeter(double sideLength) {
        return 12 * sideLength; 
    }
}
