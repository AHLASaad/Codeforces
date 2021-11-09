
//A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).
//
//He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?
//
//Input
//The first line contains three positive integers k,n,w (1≤k,w≤1000, 0≤n≤10^9), the cost of the first banana, initial number of dollars the soldier has and number of bananas he wants.
//
//Output
//Output one integer — the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.
//
//Examples
//input
//3 17 4
//output
//13
import java.util.Arrays;
import java.util.Scanner;

public class SoldierAndBananas_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter k,n,w in one line separated by space :");
        String line = scanner.nextLine();
        String[] numbersChar = line.split(" ");
        int[] numbers = new int[3];
        int result = 0 ;
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(numbersChar[i]);
        }
        int sum = 0;
        for (int i = 0; i < numbers[2]; i++) {
            sum += (i+1) * numbers[0];
        }
//        System.out.println("sum :"+sum);

        result = sum - numbers[1];
//        System.out.println("result "+result);
        if (result <= 0) {
            System.out.println(0);
        }else System.out.println(result);
//        System.out.println(Arrays.toString(numbers));

    }
}
