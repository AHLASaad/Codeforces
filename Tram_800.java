//https://codeforces.com/problemset/problem/116/A
import javax.print.attribute.standard.NumberUp;
import java.util.Scanner;

public class Tram_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of the tram's stops :");
        int numberOfStops = scanner.nextInt();
        int a, b, max, currentCapacity;
        a = b = max = currentCapacity = 0;
        for (int i = 0; i < numberOfStops; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            currentCapacity += b - a;
            if (currentCapacity > max) {
                max = currentCapacity;
            }

        }
//        System.out.println("the minimum possible capacity of the tram : " + max);
        System.out.println(max);

    }
}
