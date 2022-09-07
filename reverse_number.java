public class reverse_number {
    public static void main(String[] args) {
        int n = 1234, reverse = 0;

        while(n != 0){
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        System.out.println(reverse);

    }
}
