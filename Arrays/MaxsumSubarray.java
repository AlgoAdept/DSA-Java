package Arrays;

public class MaxsumSubarray {
    public static void main(String[] args) {
        int[] arr = {5,-4,-2,6,-1};
        int ans = KadensAlgorithm(arr);
        System.out.println("Maxsum : "+ans);
    }
    public static int KadensAlgorithm(int[] array){
        int maxSum = 0;
        int currentSum = 0;
        for (int j : array) {
            currentSum = currentSum + j;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return  maxSum;
    }
}
