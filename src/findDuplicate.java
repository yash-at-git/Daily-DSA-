import java.util.Arrays;

import static java.util.Collections.swap;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,4,0};
        duplicate(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) { //checking if the current position of element is correct or not
                int correct = arr[i] - 1; //correct index
                if (arr[i] == arr[correct]) {
                    return arr[i];
                } else swap(arr,i,correct);
            } else i++;
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
}
