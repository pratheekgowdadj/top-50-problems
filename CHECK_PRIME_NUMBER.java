public class CHECK_PRIME_NUMBER {
    public static void main(String[] args) {
        if(isPrime(4)) System.out.println("it is a prime number");
        else System.out.println("It is not a prime number");
    }

    static boolean isPrime(int n){
        if(n == 1 || n == 2) return false;

        for (int i = 2; i <= n/2 ; ++i) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
