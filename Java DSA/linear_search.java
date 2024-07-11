public class linear_search {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 80 };
        int target = 50;
        System.out.println(linearsearch(arr, target));
    }
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
