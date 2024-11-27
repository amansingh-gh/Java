public class binary_search {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,80};
        int target = -40;
        System.out.println(binarysearch(arr, target));
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
