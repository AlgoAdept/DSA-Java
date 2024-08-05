
public class BoyerMooreAlgorithm {

    private static final int ASCII_SIZE = 256;

    private static int[] preprocessPattern(String pattern) {
        int m = pattern.length();
        int[] badCharTable = new int[ASCII_SIZE];

  
        for (int i = 0; i < ASCII_SIZE; i++) {
            badCharTable[i] = -1;
        }

      
        for (int i = 0; i < m; i++) {
            badCharTable[pattern.charAt(i)] = i;
        }

        return badCharTable;
    }

  
    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        
        if (m > n) {
            return -1;
        }

        int[] badCharTable = preprocessPattern(pattern);

        int s = 0; 

        while (s <= n - m) {
            int j = m - 1;

            
            while (j >= 0 && pattern.charAt(j) == text.charAt(s + j)) {
                j--;
            }

            
            if (j < 0) {
                return s; 

                
            } else {
                
                s += Math.max(1, j - badCharTable[text.charAt(s + j)]);
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        String text = "ABAAABCD";
        String pattern = "ABCD";

        int result = search(text, pattern);
        if (result != -1) {
            System.out.println("Pattern found at index: " + result);
        } else {
            System.out.println("Pattern not found");
        }
    }
}

