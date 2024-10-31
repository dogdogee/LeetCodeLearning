//time complexity: O(sqrt(n))
//space complexity: O(1)
//Given a non-negative integer x, compute and return the square root of x.
//31-10-2024

public class T69_sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
    public static int mySqrt(long x) {
        long i=0;
        while(i*i<=x){
            i++;
        }
        return (int)(i-1);
    }
}
