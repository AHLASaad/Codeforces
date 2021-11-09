//https://codeforces.com/problemset/problem/25/A
import java.util.Scanner;

public class IQ_test_1300 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[number];
        int lastEvenIndex = 0, lastOddIndex = 0, even = 0;
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                lastEvenIndex = i;
                even++;
            } else {
                lastOddIndex = i;
                even--;
            }
        }
        if (even > 0) {
            System.out.println(lastOddIndex+1);
        }else System.out.println(lastEvenIndex+1);


    }
}
