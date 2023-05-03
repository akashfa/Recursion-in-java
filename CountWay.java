import java.util.*;
public class CountWay{


         public static int coutnNumber(int n){
            // base case
            if(n<=1){
                return n;
            }else{
                return coutnNumber( n-1)+coutnNumber(n-2);
            }
         }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the find out stairs: ");
        int n=sc.nextInt();
        int result=coutnNumber(n+1);
        System.out.println("Stairs: "+result);
    }
}