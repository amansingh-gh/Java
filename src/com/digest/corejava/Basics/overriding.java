package com.digest.corejava.Basics;

class Shape {
    void show() {
        System.out.println("overriding");
    }
}
class Square extends Shape {
    void show()
    {
        System.out.println("Over");
    }
}

class OverridingCheck {
    public static void main(String[] args)
    {
        Shape r = new Square();
        r.show();
    }
}