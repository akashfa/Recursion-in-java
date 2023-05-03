//find out kth multplue value of give number
import java.util.*;
public class MultpuleOfKth{
    public static void  multplieNumber(int n,int k){
        //base case
      
        if(k==0) return;
      multplieNumber(n,k-1);
        
        System.out.println(n*k);
    }
    
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n=sc.nextInt();
    int k=sc.nextInt();
   multplieNumber(n,k);
    
    }
}