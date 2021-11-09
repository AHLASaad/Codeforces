//https://codeforces.com/problemset/problem/467/A
import java.util.Scanner;

public class GeorgeAndAccommodation_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRoom = scanner.nextInt();
        int[] eachRoom = new int[2];
        int count = 0;
        for (int i = 0; i < numberOfRoom; i++) {
            eachRoom[0] = scanner.nextInt();
            eachRoom[1] = scanner.nextInt();
            if (eachRoom[1] - eachRoom[0] >= 2) {
                count++;
            }
            scanner.nextLine();
        }
        System.out.println(count);
    }
}
