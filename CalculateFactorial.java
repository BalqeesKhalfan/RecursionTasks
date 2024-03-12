/*
*Objective:

Develop a Java program that calculates the factorial of a given non-negative integer. The factorial of a number n is the product of all positive integers less than or equal to n. It is denoted by n!.

Requirements:

The program should use a recursive function to compute the factorial.
Handle the base case properly: the factorial of 0 is 1.
The input will be an integer representing the number for which the factorial is to be computed.
The output should be the factorial of the input number.
Assume that the input is always a valid non-negative integer.
Implement error handling for unexpected situations, such as negative inputs */
import java.util.Scanner;

public class CalculateFactorial {
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to which you need to find the factorial :");
        Integer num=scanner.nextInt();

        if(num<0)//check number entered by user is not negative number
        {
            System.out.println("Factorial is not defined for negative numbers.");
        }else{
        Integer factorial = factorialNumber(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        }

    }
    //using recursion to find factorial
    public static Integer factorialNumber(Integer num){
        if(num>1){
            return num*factorialNumber(num-1);// make function call itself
        }else {
            return 1;
        }
    }
}
