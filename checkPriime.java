public class checkPriime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter element: ");
//        int num = sc.nextInt();
        int num = 12;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 0; i < num / 2; i++) {
                if (num % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime) System.out.println("Number is prime");
        else System.out.println("Number is not prime");
    }
}
