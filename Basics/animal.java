class animal {
    void display() 
    {
        System.out.println("This is the superclass");
    }
}

class dog extends animal {
    void show()
    {
        System.out.println("This is the sub class");
    }
}

class test{
    public static void main(String [] args)
    {
        dog j = new dog();
        j.display();
        j.show();
    }
}