//https://codeforces.com/problemset/problem/490/A
import java.util.Scanner;

public class TeamOlympiad_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[number];
        int[] array1 = new int[number];
        int[] array2 = new int[number];
        int[] array3 = new int[number];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
            if (array[i] == 1) {
                array1[index1] = i+1;
                index1++;
            }
            if (array[i] == 2) {
                array2[index2] = i+1;
                index2++;
            }
            if (array[i] == 3) {
                array3[index3] = i+1;
                index3++;
            }
        }
        int min = 5000;
        index1 = 0;
        index2 = 0;
        index3 = 0;
        for (int i = 0; i < number; i++) {
            if (array1[i] != 0) {
                index1++;
            }
            if (array2[i] != 0) {
                index2++;
            }
            if (array3[i] != 0) {
                index3++;
            }
        }
        if (index1 < min) {
            min = index1;
        }
        if (index2 < min) {
            min = index2;
        }
        if (index3 < min) {
            min = index3;
        }
        System.out.println(min);
        for (int i = 0; i < min; i++) {
            System.out.println(array1[i]+" "+array2[i]+" "+array3[i]);
        }
    }
}
