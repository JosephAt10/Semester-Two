import java.util.Scanner;

public class CarPlateToCity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        char[] CODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] CITY = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '}, 
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '}, 
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '}, 
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '}, 
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '}, 
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '}, 
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '}, 
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '}, 
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '}, 
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '} 
        };
        System.out.print("Enter car plate code (A, B, D, E, F, G, H, L, N, T): ");
        char code = input.next().charAt(0); 

        int index = -1;
        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == code) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.print("City name: ");
            for (int j = 0; j < CITY[index].length; j++) {
                System.out.print(CITY[index][j]);
            }
            System.out.println();
        } else {
            System.out.println("Invalid car plate code.");
        }

        input.close();
    }
}
