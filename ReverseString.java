/*
Objective:

Develop a Java program that reverses a given string using recursion.

Requirements:

The program must use recursion to reverse the input string.

The input will be a string that may include any character (letters, digits, symbols).

The output should be the reverse of the input string.

Consider an empty string as a valid input, for which the output will also be an empty string.

Implement error handling for unexpected situations, if any.
 */
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter A string :");
        String str =scanner.nextLine();
        if(str==null || str.isEmpty()){
            System.out.println("String is empty now or null ");
        }else
        {
            String result=reverseStr(str);
            System.out.println("The reverse Mode of  :"+str+"  is :"+result);
        }
        scanner.close();

    }
    public static String reverseStr(String str){
        if (str.isEmpty()) {
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }


}
