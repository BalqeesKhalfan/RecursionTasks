/**
 * Objective:
 *
 * Develop a Java program capable of calculating the nth Fibonacci number. The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
 *
 * Requirements:
 *
 * The program should use recursion to calculate the nth Fibonacci number.
 *
 * The first two numbers in the Fibonacci sequence are 0 and 1, respectively.
 *
 * The input will be an integer n, representing the position in the Fibonacci sequence.
 *
 * The output should be the nth Fibonacci number.
 *
 * Assume that the input is always a valid non-negative integer.
 *
 * Implement error handling for unexpected situations, such
 *
 * as negative inputs or inputs that are not integers.
 */

import java.util.Scanner;

public class FibonacciSequence {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer maxNumber = 0;
        System.out.println("How many numbers you want in Fibonacci:");
        maxNumber = scanner.nextInt();


        if (maxNumber<=0)//check number entered by user is not negative number
        {
            System.out.println("The maximum number of  should be a positive integer ");
        } else {
            System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
            for(int i = 0; i < maxNumber; i++){
                System.out.print(fibonacciRecursion(i) +" ");
            }
        }
    }
    //Using  Recursion to find  the fibonacci sequence
    public static int fibonacciRecursion(Integer n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }

}
