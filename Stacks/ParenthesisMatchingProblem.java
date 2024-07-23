package Stacks;

import java.util.Stack;

public class ParenthesisMatchingProblem {
    static boolean ParanthesisMatch(String s){
    Stack <Character> st = new Stack<>();

    for(int i=0;i<s.length();i++){
        char currentChar = s.charAt(i);

        if(isOpening(currentChar)){
            st.push(currentChar);
        }
        else{
            if(st.isEmpty()){
                return false;
            } else if (!isMatching(st.peek(),currentChar)) {
                return false;
            }else {
                st.pop();
            }
        }
    }
    return st.isEmpty();
    }
    static boolean isOpening(char a){
        return a == '(' || a == '[' || a == '{';
    }

    static boolean isMatching(char a,char b){
        return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}') ;
    }

    public static void main(String[] args) {
        String str = "[{(()}]";

        if(ParanthesisMatch(str)){
            System.out.println("Paranthesis are Matching !");
        }else {
            System.out.println("Paranthesis aren't Matching !");
        }
    }
}
