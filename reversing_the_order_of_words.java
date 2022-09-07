import java.util.Arrays;

public class reversing_the_order_of_words {
    public static void main(String[] args) {
        String str = "hey everyone";
        char[] ch = str.toCharArray();
        int i = ch.length - 1, j = 0;
        while(i > j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i--;
            j++;
        }
        //String ne =
        String ne = new String(ch);
        System.out.println(ne);
    }
}
