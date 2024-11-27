package com.learningpackage.JavaAdvance.exceptions;

public class ArrayStack {
    public static void main(String[] args) {
        try {
            leve1();
//        }catch (Exception e) {
//            StackTraceElement[] stackTrace = e.getStackTrace();
//            for (int i = 0; i < stackTrace.length; i++) {
//                System.out.println(stackTrace[i]);
//            }
//        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void level3() {
        int[] arr = new int[5];
        arr[5] = 40;
    }

    public static void level2() {
        level3();
    }

    public static void leve1() {
        level2();
    }
}