/**
 * Objective:
 *
 * Develop a Java program that calculates the sum of the first N natural numbers using recursion.
 *
 * Requirements:
 *
 * The program should use a recursive function to calculate the sum.
 *
 * The input will be an integer N representing the number of terms to sum.
 *
 * The output should be the sum of the first N natural numbers.
 *
 * Assume the input is always a valid non-negative integer.
 *
 * Implement error handling for unexpected situations, such as negative inputs.
 */

import java.util.Scanner;

public class SumOfNaturalNumbers{
    public static  void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number to which you need to find the Sum  :");
        Integer num=scanner.nextInt();
        if(num<0){
            System.out.println("The Input   should be a positive and a non-negative integer.");
            return;
        }
        // Calculate  sum of the first N natural numbers
        Integer sum = calcSum(num);
        System.out.println("The sum of the first " + num + " natural numbers is: " + sum);

        scanner.close();

    }
    public static Integer calcSum(Integer  num){
        if (num == 0) {
            return 0;
        }
        return num + calcSum(num - 1);
    }
}
