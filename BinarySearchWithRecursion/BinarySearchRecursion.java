import java.util.*;
public class BinarySearchRecursion{
public static int  binary(int arr[],int low,int high,int target){
    // int mid=(low+(high-low))/2;
    int result=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
    if(arr[mid]==target){
        return mid;
    }else if(arr[mid]<target){
    return binary(arr,mid+1,high,target);    
    }else{
        return binary(arr,low,mid-1,target);
    }
    }
    return result;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array of size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the array of target value: ");
        int m=sc.nextInt();
       int result= binary(arr,0,n-1,m);
        System.out.println(result);
    }
}