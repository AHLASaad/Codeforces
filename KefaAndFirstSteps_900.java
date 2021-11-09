//https://codeforces.com/problemset/problem/580/A
import java.util.Scanner;

public class KefaAndFirstSteps_900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[number];
        if (number == 1) {
            array[0] = scanner.nextInt();
            System.out.println(1);
        } else {
            for (int i = 0; i < number; i++) {
                array[i] = scanner.nextInt();
            }
            int max = 1;
            int count =1;
            for (int i = 0; i < number-1; i++) {
                if (array[i] <= array[i + 1]) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    count = 1;
                }
            }
            System.out.println(max);
        }

    }
}
