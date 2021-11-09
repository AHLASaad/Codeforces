//https://codeforces.com/problemset/problem/405/A
import java.util.Scanner;

public class GravityFlip_900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfColumns = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[numberOfColumns];
        for (int i = 0; i < numberOfColumns; i++) {
            array[i] = scanner.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < numberOfColumns; i++) {
            for (int j = i + 1; j < numberOfColumns; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        for (int i = 0; i < numberOfColumns; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
