public class first_unique_character
{
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int firstIndex = firstnonrepeating(str);
        System.out.println(str.charAt(firstIndex));
    }


    public static int firstnonrepeating(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
