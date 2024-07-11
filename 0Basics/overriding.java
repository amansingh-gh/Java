class shape{
    void show() {
        System.out.println("overriding");
    }
}
class square extends shape{
    void show()
    {
        System.out.println("Over");
    }
}

class check {
    public static void main(String[] args)
    {
        shape r = new square();
        r.show();
    }
}