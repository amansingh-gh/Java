package com.digest.corejava.generics.genericMethods;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        switch (this) {
            case ADD -> {
                return a.doubleValue() + b.doubleValue();
            }
            case SUBTRACT -> {
                return a.doubleValue() - b.doubleValue();
            }
            default -> {
                System.out.println("This is default text here");
            }
        }
        return 0;
    }

}

public class genericMehtodArithmetic {
    public static void main(String[] args) {
        int result = (int) Operation.SUBTRACT.apply(23, 27);
        System.out.println(result);

    }
}
