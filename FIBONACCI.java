public class FIBONACCI {
    public static void main(String[] args) {
        System.out.println(fibo(0));
    }

    static int fibo(int n){

        if(n <= 0) return -1;
        if(n == 1)
            return 1;

        return n * fibo(n-1);
    }
}
