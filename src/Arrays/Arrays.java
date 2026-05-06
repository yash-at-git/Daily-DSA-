package Arrays;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,10,13,15,17,19,21,32};
        int t = 32;

        // accessing an element in arr at a specific index
//        int index = arr[4]; // via variable
//        System.out.println(index);
//        System.out.println(arr[4]); // direct

//        arr[4] = 11; updating an element
//        System.out.println(arr[4]);

        //traversing an array;
//        for(int i=0; i<arr.length;i++){
//            System.out.print(arr[i] + " " );
//        }

//        int length = arr.length;
//        System.out.println(length);
//        //or
//        System.out.println(arr.length);

//        int[] Narr = new int[arr.length+1];
//        int n = arr.length;
//
//        Narr[0] = 1;
//        for(int i=0;i<n;i++){
//            Narr[i+1]=arr[i];
//        }
//        System.out.println(java.util.Arrays.toString(Narr));
//
//        System.arraycopy(arr, 0, Narr, 1, arr.length); //fastest way to copy paste arrays
//        System.out.println(java.util.Arrays.toString(Narr));

        int index = -1;
//
//        //linear search :
//        for (int i=0; i<arr.length;i++){
//            if(arr[i] == t){
//                index = i;
//            }
//        }
//        System.out.println(index);
        int ans = BS(arr, t);
        System.out.println(ans);
    }
    static int BS(int[] arr, int t){
        //binary search :
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==t){
                return mid;
            }else if(t < arr[mid]){
                end = mid-1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
