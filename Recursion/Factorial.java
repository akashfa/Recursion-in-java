import java.util.*;
public class Factorial{
    public static int  factorialNumber(int n){
            if(n==1){
                return 1;
            }
            int result=n* factorialNumber(n-1);
            return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number calcuate factorial value:");
        int n=sc.nextInt();
        int factorial=factorialNumber(n);
        System.out.println("factorialNumber: "+factorial);
    }
}