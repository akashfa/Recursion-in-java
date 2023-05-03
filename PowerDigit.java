import java.util.*;
public class PowerDigit{
    public static long  powerNumber(int  a,int  b){
            if(b==1){
                return a;
            }
            long  result=a* powerNumber(a,b-1);
            return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number calcuate a to the power b value:");
        int  a=sc.nextInt();
        int b=sc.nextInt();
        long  power=powerNumber(a,b);
        System.out.println("factorialNumber: "+power);
    }
}