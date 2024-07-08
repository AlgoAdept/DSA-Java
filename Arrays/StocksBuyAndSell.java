package Arrays;


public class StocksBuyAndSell {
    public static void main(String[] args) {
        int[] stocks = {5,2,7,1,9,10,20};
        int profit = Prediction(stocks);

        System.out.println("Maximum profit after selling a stock is : " +profit);
    }
    public static int Prediction(int[] arr){
        int maxProfit = 0;
        int minSoFar = arr[0];
        for (int j : arr) {

            minSoFar = Math.min(minSoFar, j);
            int profit = j - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
