package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class PSE {
    static void PreviousSmallerElement(int[] a){
        Deque <Integer> st = new ArrayDeque<>();

        int i;
        for(i = 0; i<a.length; i++){
            while(!st.isEmpty() && st.peek() >=a[i]){
                st.pop();
            }

        if(st.isEmpty()){
            System.out.print( " "+-1);
        }
        else {
            System.out.print(" " + st.peek());
        }
        st.push(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,7,4,0,8,5};
        PreviousSmallerElement(arr);
    }
}
