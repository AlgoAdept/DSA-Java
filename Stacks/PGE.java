package Stacks;

import java.util.Stack;

public class PGE {
    static void PreviousGreaterElement(int[] a){
        Stack <Integer> st = new Stack<>();

        for(int i=0;i<a.length;i++){
            while (!st.isEmpty() && st.peek() <= a[i]){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.print(" "+-1);
            }
            else {
                System.out.print(" "+st.peek());
            }
            st.push(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,3,5,15,6,20,12};
        PreviousGreaterElement(arr);
    }
}
