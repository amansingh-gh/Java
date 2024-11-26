import java.util.Arrays;

public class LearnComparator{
    public static void main(String[] args) {
        int a[][]  = {{7,2,3},{3,7,4},{2,4,6}};

        Arrays.sort(a, (arr1, arr2)->{
            return arr1[0] - arr2[0];
        });

        for(int e[]: a){
            for(int element : e){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

}