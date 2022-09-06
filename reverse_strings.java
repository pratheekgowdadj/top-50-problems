public class reverse_strings {
    public static void main(String[] args) {
        String string = "my name is khan";
       //char[] str = string.toCharArray();
       String rev = "";
       for(int i = string.length() - 1; i >= 0; i--){
           rev += string.charAt(i);
       }
       System.out.println(rev);
    }
}
