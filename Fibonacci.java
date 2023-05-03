// fibonacci
import java.util.*;
public class Fibonacci{


         public static int fibonacciNumber(int n){
            // base case
            if(n<=1){
                return n;
            }else{
                return fibonacciNumber( n-1)+fibonacciNumber(n-2);
            }
         }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the find out fibonacci: ");
        int n=sc.nextInt();
        int result=fibonacciNumber(n);
        System.out.println("Stairs: "+result);
    }
}