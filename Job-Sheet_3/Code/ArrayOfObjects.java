// public class ArrayOfObjects {
//     public static void main(String[] args) {
//         Rectangle[] rectangleArray = new Rectangle[3];  
        
//         rectangleArray[0] = new Rectangle();
//         rectangleArray[0].length = 110;
//         rectangleArray[0].width = 30; 

//         rectangleArray[1] = new Rectangle();  
//         rectangleArray[1].length = 80;  
//         rectangleArray[1].width = 40;
        
//         rectangleArray[2] = new Rectangle();
//         rectangleArray[2].length = 100;   
//         rectangleArray[2].width = 20; 
        
//         System.out.println("First rectangle, width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
//         System.out.println("Second rectangle, width: " + rectangleArray[1].width + ", length: " + rectangleArray[1].length);
//         System.out.println("Third rectangle, width: " + rectangleArray[2].width + ", length: " + rectangleArray[2].length);
//     }
// } 

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                       
        Rectangle[] rectangleArray = new Rectangle[3];  
        
        for (int i = 0; i < 3; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);
            

            System.out.print("Input length : ");           
            rectangleArray[i].length = scanner.nextInt();

            System.out.print("Input width : ");
            rectangleArray[i].width = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("width " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
        }
  
    }
} 
