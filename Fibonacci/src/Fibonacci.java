
import java.util.Scanner;
public class Fibonacci {
 
    public static void main(String args[]) {
        System.out.println("Nhap so phan tu cua day: ");
        int number = new Scanner(System.in).nextInt();
 
        System.out.println(+ number +" phan tu cua day la: ");
        for(int i=1; i<=number; i++){
            System.out.print(fibonacciRecusion(i) +" ");
        }
    } 

    public static int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        } 
        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2);
    }
}