public class RainWaterTrapingProblem {
    static int TrapedWater(int[] a){
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        left[0] = a[0];
        for(int i = 1;i < a.length;i++){
           left[i] = Math.max(a[i],left[i-1]);
        }

        right[a.length - 1] = a[a.length - 1];
        for(int i = a.length - 2;i >= 0;i--){
            right[i] = Math.max(right[i+1],a[i]);
        }

        int ans = 0;
        for(int i = 0;i < a.length;i++){
            ans += (Math.min(left[i],right[i]) - a[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {8,8,2,4,5,5,1};
        int ans = TrapedWater(a);
        System.out.println(ans);
    }
}
