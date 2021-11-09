//https://codeforces.com/problemset/problem/144/A -
import java.util.Scanner;

public class ArrivalOfTheGeneral_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSoldiers = scanner.nextInt();
        scanner.nextLine();
        int[] soldiersHeights = new int[numberOfSoldiers];
        for (int i = 0; i < numberOfSoldiers; i++) {
            soldiersHeights[i] = scanner.nextInt();
        }
        int count = 0;
        int min = 100, max = 0;
        int indexMin = 0, indexMax = 0;
        for (int i = 0; i < numberOfSoldiers; i++) {
            for (int j = 0; j < numberOfSoldiers; j++) {
                if (soldiersHeights[i] > max) {
                    max = soldiersHeights[i];
                    indexMax = i;
                }
                if (soldiersHeights[i] <= min) {
                    min = soldiersHeights[i];
                    indexMin = i;
                }
            }
        }
        int tmp = 0;
//        System.out.println("Min = "+min+" , index min = "+indexMin);
//        System.out.println("Max = "+max+" , index max = "+indexMax);
        for (int i = indexMax; i >= 0; i--) {
            if (i > 0) {
                tmp = soldiersHeights[i];
                soldiersHeights[i] = soldiersHeights[i - 1];
                soldiersHeights[i - 1] = tmp;
            }

        }
        for (int i = 0; i < numberOfSoldiers; i++) {
            for (int j = 0; j < numberOfSoldiers; j++) {
                if (soldiersHeights[i] <= min) {
                    min = soldiersHeights[i];
                    indexMin = i;
                }
            }
        }
        for (int i = indexMin; i < numberOfSoldiers; i++) {
            if (i < numberOfSoldiers - 1) {
                tmp = soldiersHeights[i];
                soldiersHeights[i] = soldiersHeights[i +1];
                soldiersHeights[i + 1] = tmp;
            }
        }
        count = indexMax + ((numberOfSoldiers-1) - indexMin);
        System.out.println(count);
//        String result = Arrays.toString(soldiersHeights); q
//        System.out.println(result);
    }
}
