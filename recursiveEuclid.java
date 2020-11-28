public class recursiveEuclid{

// with recursive implementation
public static int gcd(int a, int b){
		if (b == 0) {
			return a;
			
		}
		else{
			return gcd(b, a%b);
		}
	}
	    public static void main(String[] args) {
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int d =gcd(a,b);
				System.out.println("gcd(" + a +", " + b +") = " + d);
	


		}

}