public class Factorial {
    public static void main(String[] args){
        int number = 10;
        int factorial = Fact(number);
        System.out.println(factorial);
    }
    static int Fact(int no){
        if(no == 0 || no == 1)
            return 1;
        return no * Fact(no-1);
    }
}
