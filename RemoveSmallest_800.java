//https://codeforces.com/problemset/problem/1399/A
import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        int[] arrayTest = new int[t];
        String[] YesOrNo = new String[t];
        int counter = 0;
        for (int i = 0; i < t; i++) {
            arrayTest[i] = scanner.nextInt();
            scanner.nextLine();
            int[] testCase = new int[arrayTest[i]];
            for (int j = 0; j < arrayTest[i]; j++) {
                testCase[j] = scanner.nextInt();
            }
            Arrays.sort(testCase);
            int count = 0;
            for (int j = 0; j < arrayTest[i]; j++) {
                if (j < arrayTest[i] - 1 && (testCase[j] == testCase[j + 1] || testCase[j + 1] - testCase[j] == 1)) {
                    count++;
                }
                if (j == arrayTest[i]-1 && count == arrayTest[i] - 1) {
                    YesOrNo[counter] = "YES";
                    counter++;
                    if (counter >= t) {
                        break;
                    }

                } else if (j == arrayTest[i] - 1 && count != arrayTest[i] - 1) {
                    YesOrNo[counter] = "NO";
                    counter++;
                    if (counter >= t) {
                        break;
                    }
                }
            }
            scanner.nextLine();
        }
        for (int i = 0; i < t; i++) {
            System.out.println(YesOrNo[i]);
        }
    }
}
