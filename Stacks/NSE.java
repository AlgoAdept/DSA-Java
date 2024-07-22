package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class NSE {
    static void NextSmallerElement(int[] a){
        Deque<Integer> st = new ArrayDeque<>();
        int[] result = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= a[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(a[i]);
        }

        // Print the result in reverse order
        for (int j : result) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 7, 1, 11};
        NextSmallerElement(arr);
    }
}
