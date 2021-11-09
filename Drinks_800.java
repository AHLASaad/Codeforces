//https://codeforces.com/problemset/status?my=on
import java.util.Scanner;

public class Drinks_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDrinks = scanner.nextInt();
        scanner.nextLine();
        double[] orangePortion = new double[numberOfDrinks];
        double sum = 0;
        for (int i = 0; i < numberOfDrinks; i++) {
            orangePortion[i] = scanner.nextInt();
            sum += orangePortion[i];
        }
        System.out.println((sum / numberOfDrinks));
    }
}
