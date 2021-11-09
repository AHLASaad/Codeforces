//https://codeforces.com/problemset/problem/732/A
import java.util.Scanner;

public class BuyAShovel_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        int value = 0, priceMade = 0;
        boolean flag = true;
        while (flag) {
            if ((priceMade % 10 == 0 && priceMade != 0) || priceMade % 10 == r) {
                flag = false;
            }
            value++;
            priceMade += k;
        }
        System.out.println(value-1);
    }
}
