import java.util.*;
public class hi{
    public static void reverse(int[] arr,int k){
        int len=arr.length;
        for(int i=0;i<len;i=i+k){
            int start=i;
            int end= Math.min(i+k-1,len-1);
            while(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

        }
    }

    public static void main(String[] args){
        int[] arr={9,8,7,8,5,6,3,2,1,8};
        int k=3;
        reverse(arr, k);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
