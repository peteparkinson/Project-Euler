/*Project Euler, problem 27
 * Euler discovered the remarkable quadratic formula:
 * 
 * n^2+n+41
 * It turns out that the formula will produce 40 primes for the consecutive integer
 * values 0<=n<=39. However, when n=40,40^2+40+41=40(40+1)+41 is divisible by 41, and
 * certainly when n=41,41^2+41+41 is clearly divisible by 41.
 * 
 * The incredible formula n^2-79n+1601 was discovered, which produces 80 primes for
 * the consecutive values 0<=n<=79. The product of the coefficients, -79 and 1601, is
 * -126479.
 * 
 * Considering quadratics of the form:
 * 
 * n^2+an+b, where |a|<1000 and |b|<=1000
 * 
 * where |n| is the modulus/absolute value of n
 * e.g. |11|=11 and |-4|=4
 * Find the product of the coefficients, a and b, for the quadratic expression that
 * produces the maximum number of primes for consecutive values of n, starting with
 * n=0.
 * 
 * answer = -59231;  //correct
 */



public class Problem027 {
	public static void main(String[] args){
		
		int answer = 0;
		int largest = 0;
		double time = System.currentTimeMillis();
		
		for (int a = -1000; a < 1000; a++) {
			for (int b = -1000; b <= 1000; b++) {
				if(consecutivePrimeCount(a, b) > largest){
					largest = consecutivePrimeCount(a, b);
					answer = a * b;
				}
			}
		}
		System.out.println(answer);
		System.out.println((System.currentTimeMillis() - time) / 1000 + " s");
	}

	private static int consecutivePrimeCount(int a, int b) {
		
		int count = 0;
		
		for (int n = 0; n <= b; n++) {
			if(isPrime(Math.abs((n*n)+(a*n)+b))){
				count++;
			}else{
				break;
			}
		}
		
		return count;
	}

	private static boolean isPrime(int num) {
		boolean prime = true;
		if(num == 2){
			return prime;
		}
		for (int i = 3; i < num; i += 2) {
			if(num % i == 0){
				prime = false;
			}
		}
		return prime;
	}
}
