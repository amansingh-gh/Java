package com.digest.corejava.Pattern;

public class p4 {
    public static void main(String[] args) {
        pattern_4(5);
    }
    static void pattern_4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println( );
        }
    }
}
