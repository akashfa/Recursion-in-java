import java.util.*;
public class NaturalNumberSum{
    public static int  sumOfNumber(int n){
        //base case
        // int sum=0;
        if(n==1){
            return 1;
        }
           int sum= n+sumOfNumber(n-1);
        
        return sum;
        }
    
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    int sum=sumOfNumber(n);
    System.out.println("Sum of natural number: "+sum);
    }
}