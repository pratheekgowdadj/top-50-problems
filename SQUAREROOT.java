

public class SQUAREROOT {

    public static void main(String[] args) {
    System.out.println(sqrt(13));
    }
    static double sqrt(double n){
        for(int i = 1; i < n; i++){
            if(i*i == n) return i;
            if(i*i > n) return sqrt(n, i-1, i);

        }
        return 0.00;
    }
    static double sqrt(double n, double start, double end){
        double mid = start + (end - start) / 2;
        double p = mid * mid;
        if(p == n  || (Math.abs(p - n) < 0.00001 )) return mid;
        else if(p < n) return sqrt(n,mid,end);
        else return sqrt(n, start, mid);
    }

}
