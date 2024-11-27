public class order_agnostic_BS {
    public static void main(String[] args) {
        // int[] arr = {40,50,60,70,80,90};
        int[] arr = {90,80,10,2,3,-4,-10};
        int target = 10;
        System.out.println(Agnostic_bs(arr,target));
    }
    static int Agnostic_bs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
