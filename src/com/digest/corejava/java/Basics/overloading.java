package com.digest.corejava.java.Basics;

class overloading{
    void add()
    {
        int a,b,c;
        a = 10;
        b = 20;
        c = a+b;
        System.out.println(c);
    }

    void add(int x, int y) 
    {
        int c;
        c = x + y;
        System.out.println(c);
    }
}

class OverLoadingCheck {
    public static void main(String [] args)
    {
        overloading r = new overloading();
         r.add ();
    }
}