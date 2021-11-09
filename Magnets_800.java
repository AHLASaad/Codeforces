//https://codeforces.com/problemset/problem/344/A
import java.util.Scanner;

public class Magnets_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMagnets = scanner.nextInt();
        scanner.nextLine();
        String[] PlusMinus = new String[numberOfMagnets];
        for (int i = 0; i < numberOfMagnets; i++) {
            PlusMinus[i] = scanner.nextLine();
        }
        int count = 1;
        for (int i = 0; i < numberOfMagnets; i++) {
            if (i < numberOfMagnets - 1 && PlusMinus[i].compareTo(PlusMinus[i + 1])!=0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
