//Input
//The first line contains a single integer n (1≤n≤150) — the number of statements in the programme.
//
//Next n lines contain a statement each. Each statement contains exactly one operation (++ or --) and exactly one variable x (denoted as letter «X»). Thus, there are no empty statements. The operation and the variable can be written in any order.
//
//Output
//Print a single integer — the final value of x.
//
//Examples
//input
//1
//++X
//output
//1
//input
//2
//X++
//--X
//output
//0
import java.util.Scanner;

public class BitPlusPlus_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of statements in the programme :");
        int numberOfStatements = scanner.nextInt();
        int x = 0;
        scanner.nextLine();
        String statement ;
        for (int i = 0; i < numberOfStatements; i++) {
            System.out.println("Enter the statement number#" + (i + 1) + " : ");
            statement = scanner.nextLine();
            if ( statement.charAt(1)=='+') {
                x++;
            }else x--;
        }
        System.out.println("The final value of x is "+x);
    }
}
