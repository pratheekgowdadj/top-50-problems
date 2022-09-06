public class Armstrong_number {
    public static void main(String[] args) {
        int num = 231, r, sum = 0, temp;
        temp = num;
        while(num > 0){
            r = num % 10;
            sum = sum + (r*r*r);
            num /= 10;
        }

        if(sum == temp){
            System.out.println("It is a armstrong number");
        }
    }
}
