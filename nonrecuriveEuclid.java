public class nonrecuriveEuclid {

    
  // with non-recursive implementation
    public static int gcd(int a, int b) {
        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }
    public static void main(String[] args) {
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        int d = gcd(a, b);
        System.out.println("gcd(" + a + ", " + b + ") = " + d);
    }
}
