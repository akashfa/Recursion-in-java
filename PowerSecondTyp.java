import java.util.*;
public class PowerSecondTyp{
    public static int  powerNumber(int a,int  b){
       int   finalResult=0;
       int mid=0;
       int result=0;
            if(b==1){
                return a;
            }
            else{
            mid=b/2;
            result= powerNumber(a,mid);
            finalResult= result*result;
            
            if(b%2==0){
                return finalResult;
            }else{
                return a*finalResult;
            }
            }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number calcuate a to the power b value:");
        int  a=sc.nextInt();
        int b=sc.nextInt();
        int power=powerNumber(a,b);
        System.out.println("factorialNumber: "+power);
    }
}