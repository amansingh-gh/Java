import java.util.Arrays;
public class bubble_sort{
    public static void main(String[] args) {
        int []arr = {10,20,30,44,11,0,-9};
        // System.out.println(bubble_sort1(Arrays.toString(arr)));
        bubble_sort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort1(int[] arr){
        for(int i =0; i<arr.length; i++){
            for (int j = 1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}