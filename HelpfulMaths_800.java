//Input
//The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.
//
//Output
//Print the new sum that Xenia can count.
//
//Examples
//input
//3+2+1
//output
//1+2+3
//input
//1+1+3+1+3
//output
//1+1+1+3+3
//input
//2
//output
//2
import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string that contains just 1,2,3,+ without space : ");
        String line = scanner.nextLine();
        String[] numbersInString = line.split("\\+");
        int[] numbers = new int[numbersInString.length];
//        int[] newNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbersInString[i]);
            numbers[i] = Integer.parseInt(numbersInString[i]);
        }
        int tmp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
//        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i]+"+");
            }
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
            }
        }
    }
}
