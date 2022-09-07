public class leap_year {
    public static void main(String[] args) {
        int year = 2012;

        boolean leap = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0)
                    leap = true;
                else leap = false;
            }
            else
                leap = true;
        }
        if(leap) System.out.println("It is a leap year");
        else System.out.println("It is not a leap year");
    }
}
