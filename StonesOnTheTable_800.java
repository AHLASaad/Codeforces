//There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.
//
//Input
//The first line contains integer n (1≤n≤50) — the number of stones on the table.
//
//The next line contains string s, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.
//
//Output
//Print a single integer — the answer to the problem.
//
//Examples
//inputCopy
//3
//RRG
//output
//1
//input
//5
//RRRRR
//output
//4
//input
//4
//BRBG
//output
//0
import java.util.Arrays;
import java.util.Scanner;


public class StonesOnTheTable_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of stones (must be under 51 strict :)");
        int numberOfStones = scanner.nextInt();
        scanner.nextLine();
        while (numberOfStones < 1 || numberOfStones > 50) {
            System.out.println("Enter the number of stones (must be under 51 strict :)");
            numberOfStones = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Enter the color of ith stones :");
        String colors = scanner.nextLine();
        char[] eachColor = colors.toCharArray();
        for (int i = 0; i < eachColor.length; i++) {
            while (eachColor[i] != 'R' && eachColor[i] != 'G' && eachColor[i] != 'B') {
                System.out.println("Enter the color of ith stones :");
                colors = scanner.nextLine();
                eachColor = colors.toCharArray();
            }
        }
        System.out.println(Arrays.toString(eachColor));
        int count = 0;
        for (int i = 0; i < eachColor.length; i++) {
            if (i < eachColor.length - 1) {
                if (eachColor[i] == eachColor[i + 1]  ) {
                    count++;
                }
            }
        }
        System.out.println(count);
//

    }
}
