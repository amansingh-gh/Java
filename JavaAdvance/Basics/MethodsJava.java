package com.learningpackage.JavaAdvance.Basics;

public class MethodsJava {
    public static void sumofArr(int arr[]) {
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        System.out.println("Sum is :: " + res);
    }
    public static String funToUpper(String str){
        return str.trim().toUpperCase();
    }

    public static void sumofTwo(int num1, int num2){
        System.out.println("Sum is: "+(num1+num2));
    }

    public static String upper(String a){
        return a.toUpperCase();
    }

//    public static Cat makeCatUpp(Cat cat){
//        cat.name = cat.name.toUpperCase();
////        cat.name = "Bubbu";
//        return cat;
//    }
    public static void moreSum(int... a){
        int res = 0;
        for(int i : a){
            res += i;
        }
        System.out.println("The more sum res is : "+res);
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        sumofArr(arr);
        int brr[] = {100, 20, 30, 40, 50};
            sumofArr(brr);
        moreSum(1,9,19,1);


        String str = "aman singh";
        String res = funToUpper(str);
        System.out.println("The string ans is : "+res);

        int n1 = 40, n2 = 60;
        sumofTwo(n1,n2);

        String name = "Value";
        System.out.println(upper(name));
        System.out.println(name);

//        Cat a = new Cat();
//        a.name = "bob";
//        Cat cat = makeCatUpp(a);
//        System.out.println(cat.name);
    }
}

