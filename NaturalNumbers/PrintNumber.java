import java.util.*;
public class PrintNumber{
    public static void  printNaturalNumber(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.print(n+" ");
    
              printNaturalNumber(n-1);
        }
    
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    printNaturalNumber(n);
    }
}