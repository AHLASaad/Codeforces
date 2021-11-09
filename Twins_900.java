//https://codeforces.com/problemset/problem/160/A
import java.util.Scanner;

public class Twins_900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer : ");
        int integer = scanner.nextInt();
        scanner.nextLine();
        while (integer < 1 || integer > 100) {
//            System.out.println("Enter an integer : ");
            integer = scanner.nextInt();
            scanner.nextLine();
        }
        double sum = 0;
        int[] coins = new int[integer];
        for (int i = 0; i < integer; i++) {
            coins[i] = scanner.nextInt();
            sum += coins[i];
        }
        int tmp = 0;
        for (int i = 0; i < integer; i++) {
            for (int j = i+1; j < integer; j++) {
                if (coins[j] > coins[i]) {
                    tmp = coins[i];
                    coins[i] = coins[j];
                    coins[j] = tmp;
                }
            }
        }
        double halfMoney = (double)(sum / 2);
//        System.out.println(halfMoney);
        int counter = 0;
        int sumCounter = 0;
        for (int i = 0; i < integer; i++) {
            sumCounter += coins[i];
            counter++;
            if (sumCounter > halfMoney) {
                break;
            }
        }
        System.out.println(counter);
    }
}
