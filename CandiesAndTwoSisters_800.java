//https://codeforces.com/problemset/problem/1335/A
import java.util.Scanner;

public class CandiesAndTwoSisters_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        scanner.nextLine();
        int[] arrayOfN = new int[testNumber];
        int[] output = new int[testNumber];
        for (int i = 0; i < testNumber; i++) {
            arrayOfN[i] = scanner.nextInt();
            scanner.nextLine();
//            int a = arrayOfN[i]-1, b = 1;
//            output[i] = 0;
//            while (a > b) {
//                output[i]++;
//                a--;
//                b++;
//            }
        }
        for (int i = 0; i < testNumber; i++) {
            if (arrayOfN[i] % 2 != 0) {
                System.out.println((arrayOfN[i]-1)/2);
            }else System.out.println((arrayOfN[i]/2)-1);
        }
    }
}
