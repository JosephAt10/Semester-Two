public class RoyalGarden {
    public static void main(String[] args) {

        String[] flowers = {"Aglonema", "Keladi", "Alocasia", "Rose"};
        int[] prices = {75000, 50000, 60000, 10000};
        String[] branches = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};
        int[][] stock = {
            {10, 5, 15, 7},   
            {6, 11, 9, 12},   
            {2, 10, 10, 5},   
            {5, 7, 12, 9}     
        };
        displayRevenue(flowers, prices, branches, stock);
        displayStockBranch4(flowers, stock);
    }
    static void displayRevenue(String[] flowers, int[] prices, String[] branches, int[][] stock) {
        for (int i = 0; i < branches.length; i++) {
            int revenue = 0;
            for (int j = 0; j < flowers.length; j++) {
                revenue = revenue + (stock[i][j] * prices[j]);
            }
            System.out.println("Total revenue of " + branches[i] + " = " + revenue);
        }
    }
    static void displayStockBranch4(String[] flowers, int[][] stock) {
        System.out.println("Stock of flowers at Royal Garden 4:");

        int[] sold = {1, 2, 0, 5};

        for (int j = 0; j < flowers.length; j++) {
            int remainingStock = stock[3][j] - sold[j];
            System.out.println("Stock of " + flowers[j] + " = " + remainingStock);
        }
    }
}
