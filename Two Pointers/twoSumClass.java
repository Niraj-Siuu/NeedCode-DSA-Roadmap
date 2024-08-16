import java.util.Arrays;
import java.util.Scanner;

public class twoSumClass {
    public int[] twoSum(int[] arr, int tgt){
        int[] res = new int[2];
        int l=0,r=arr.length-1;
        while(l<r){
           if(arr[l]+arr[r]==tgt){
            res[0]=l+1;
            res[1]=r+1;
            break;
           }else if(arr[l]+arr[r]<tgt){
            l++;
           }else{
            r--;
           }
        }
        return res ;
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(
            "enter input array"
        );
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i< size;i++){
            arr[i]=sc.nextInt() ;
        }
        System.out.print("enter target: ");
        int tgt = sc.nextInt();
        twoSumClass obj = new twoSumClass();
        int[] res = obj.twoSum(arr,tgt);
        System.out.println(Arrays.toString(res));
    }
}
