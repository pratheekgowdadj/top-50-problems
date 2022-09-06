public class integer_palindrome {
    public static void main(String[] args) {
        int num = 12311;
        int original = num, reversed = 0;
        while(num != 0){
            int reminder = num % 10;
            reversed = reversed * 10 + reminder;
            num /= 10;

        }
        if(original == reversed) System.out.println("the given number is a palindrome");
        else System.out.println("the given number is n0t a palindrome");
    }
}
