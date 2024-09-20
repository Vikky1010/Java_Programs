/**
 * pattern1
 */
public class pattern1 {

    public static void main(String[] args) {
        int n=6,i,j;
        
         for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}