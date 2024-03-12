import java.util.Scanner;

public class CountDigits {
    // counter to store the count
    static int counter=0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate its digits :- ");
        Integer num = sc.nextInt();
        // Check for negative input
        if (num < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return;
        }
        // Call the method and store the result
        Integer digits = calcDigits(num);

        System.out.println("The number of digits in "+num+" is "+digits);

        sc.close();
    }
    public static Integer calcDigits(Integer num){
        // Till number is greater than zero keep on incrementing the counter
        if(num!=0)
        {
            counter++;
            // Divides the number by 10 and  call the method of recursion
            calcDigits(num/10);
        }
        return counter;
    }

}
