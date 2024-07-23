package Stacks;

import java.util.Stack;

public class HistogramMaxArea {
    static int maxArea(int[] a){
        int maxAns = 0;
        int[] PS = PSE(a);
        int[] NS = NSE(a);

        for(int i=0;i<a.length;i++){
                int cur = (NS[i]-PS[i]+1) * a[i];
                maxAns = Math.max(cur,maxAns);
            }
            return maxAns;
        }
    // Return Array Of Previous Smaller Element
    static int[] PSE(int[] a){
        Stack <Integer> s = new Stack<>();
        int[] PS = new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                PS[i] = 0;
            }
            else {
                PS[i] = s.peek()+1;
            }
            s.push(i);
        }
        return PS;
    }
    // Return Array Of Next Smaller Element
    static int[] NSE(int[] a){
        Stack <Integer> s = new Stack<>();
        int[] NS = new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NS[i] = a.length-1;
            }
            else {
                NS[i] = s.peek()-1;
            }
            s.push(i);
        }
        return NS;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int area = maxArea(heights);

        System.out.println("Maximum Area Of The Histogram Is : "+area);
    }
}
