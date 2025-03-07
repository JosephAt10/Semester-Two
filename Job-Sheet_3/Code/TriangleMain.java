public class TriangleMain {
    public static void main(String[] args) {
        Triangle[] triangleArray = new Triangle[4];
        triangleArray[0] = new Triangle(10, 4);
        triangleArray[1] = new Triangle(20, 10);
        triangleArray[2] = new Triangle(15, 6);
        triangleArray[3] = new Triangle(25, 10);   
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Triangle " + i);
            System.out.println("Area: " + triangleArray[i].countArea());
            System.out.println("Perimeter: " + triangleArray[i].countArea());                       
        }
    }
}
