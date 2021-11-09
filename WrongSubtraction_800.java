//Little girl Tanya is learning how to decrease a number by one, but she does it wrong with a number consisting of two or more digits. Tanya subtracts one from a number by the following algorithm:
//
//if the last digit of the number is non-zero, she decreases the number by one;
//if the last digit of the number is zero, she divides the number by 10 (i.e. removes the last digit).
//You are given an integer number n. Tanya will subtract one from it k times. Your task is to print the result after all k subtractions.
//
//It is guaranteed that the result will be positive integer number.
//
//Input
//The first line of the input contains two integer numbers n and k (2≤n≤109, 1≤k≤50) — the number from which Tanya will subtract and the number of subtractions correspondingly.
//
//Output
//Print one integer number — the result of the decreasing n by one k times.
//
//It is guaranteed that the result will be positive integer number.
//
//Examples
//inputCopy
//512 4
//outputCopy
//50
//inputCopy
//1000000000 9
//outputCopy
//1
//Note
//The first example corresponds to the following sequence: 512→511→510→51→50.
import java.util.Scanner;

public class WrongSubtraction_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Line :");
        String line = scanner.nextLine();
        String[] numberString = line.split(" ");
        int[] numbers = new int[2];
        numbers[0] = Integer.parseInt(numberString[0]);
        numbers[1] = Integer.parseInt(numberString[1]);
        int numberMax = (int) Math.pow(10,9);
//        System.out.println(numberMax);
        while (numbers[0] < 2 || numbers[0] > numberMax || numbers[1] < 1 || numbers[1] > 50) {
            System.out.println("Enter the Line :");
            line = scanner.nextLine();
            numberString = line.split(" ");
            numbers = new int[2];
            numbers[0] = Integer.parseInt(numberString[0]);
            numbers[1] = Integer.parseInt(numberString[1]);
        }
        int result = 0 ;
        for (int i = 0; i < numbers[1]; i++) {
            if (numbers[0] % 10 == 0) {
                result = numbers[0] / 10;
                numbers[0] /= 10;
            }else {
                result = numbers[0] - 1;
                numbers[0]--;
            }
        }
        System.out.println("The results is : " + result);
//        System.out.println(result);

    }
}
