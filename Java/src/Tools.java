import java.util.ArrayList;


public class Tools {
	
	public static void main(String[] args){
		
		
		
	}
	
	/***************************************************************************
	 * check if specific number is pan-digital within passed range
	 */
	public static boolean isPandigital(String digits, int lowLim, int upLim) {
		
		for (int l = lowLim; l <= upLim; l++) {			
			if(!digits.contains(String.valueOf(l)) 
			 || digits.length() != upLim - lowLim + 1){
				return false;
			}
		}
		return true;
	}
	
	/***************************************************************************
	 * check if specific number is prime
	 */
	public static boolean isPrime(int num){
		
		if(num == 1){
			return false;
		}
		for (int i = 2; i <= Math.ceil(Math.sqrt(num)); i++) {
			if(num % i == 0 && num != 2){
				return false;
			}
		}
		return true;
	}
	
	/***************************************************************************
	 * rotate int
	 */
	
	
	public static int[] rotate(int number) {
		int[] numbers = new int[String.valueOf(number).length()];
		
    	int start = number;
    	int numdigits = (int) Math.log10((double)number);
    	int multiplier = (int) Math.pow(10.0, (double)numdigits);
    	int ref = 0;
    	
    	while(true){
    		int r = number % 10;
    		number = number / 10;
    		number = number + multiplier * r;
    		numbers[ref] = number;
    		ref++;
    		if(number == start)
    			break;
    	}
    	return numbers;
	}
	
	/***************************************************************************
	 * decimal to binary
	 */
	public static String toBinary(int num){
	    	
		String bin = "";
        int[] binaryNum = new int[1000];
        int i = 0;
        
        while (num > 0){
            binaryNum[i] = num % 2;
            num = num / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--){
            bin = bin + String.valueOf(binaryNum[j]);
        }
        return bin;
    }
	
	/***************************************************************************
	 * check if integer is a palindrome
	 */
	public static boolean isPalindrome(int num){
		
		boolean isPalindrome = true;
		String temp = Integer.toString(num);
		int[] iBroken = new int[temp.length()];
		int[] iBackwards = new int[temp.length()];
		for (int a = 0, b = temp.length() - 1; a < temp.length(); a++, b--)
		{
			iBroken[a] = temp.charAt(a) - '0';
			iBackwards[b] = temp.charAt(a) - '0';
		}
		for (int a = 0; a < temp.length(); a++) {
			if(iBroken[a] != iBackwards[a]){
				isPalindrome = false;
			}
		}
		return isPalindrome;	
	}
	

	/***************************************************************************
	 * check if string is a palindrome
	 */
	public static boolean isStrPalindrome(String str){
		
		boolean isPalindrome = true;
		
		char[] iBroken = new char[str.length()];
		char[] iBackwards = new char[str.length()];
		for (int a = 0, b = str.length() - 1; a < str.length(); a++, b--)
		{
			iBroken[a] = (char) (str.charAt(a) - '0');
			iBackwards[b] = (char) (str.charAt(a) - '0');
		}
		for (int a = 0; a < str.length(); a++) {
			if(iBroken[a] != iBackwards[a]){
				isPalindrome = false;
			}
		}
		return isPalindrome;	
		
		/*
		String rev = new StringBuilder(str).reverse().toString();
		return str == rev;	
		*/
		
	}
	
	/***************************************************************************
	 * sieve of Eratosthenes
	 * This code has been contributed by Amit Khandelwal. 
	 * 
	 * this only works up to n = 7691
	 */
	
	 public static void sieveOfErt(int n) { 
	      
		 boolean prime[] = new boolean[n+1]; 
		 for(int i=0;i<n;i++) {
	            prime[i] = true; 
		 }
	          
		 for(int p = 2; p*p <=n; p++) { 
			 // If prime[p] is not changed, then it is a prime 
			 if(prime[p] == true){ 
				 // Update all multiples of p 
				 for(int i = p*2; i <= n; i += p){
	                    prime[i] = false;
				 }
			 } 
		 }
		 for(int i = 2; i <= n; i++){ 
			 if(prime[i] == true){
	                System.out.print(i + " "); 
			 }
		 } 
	 }
	
	/***************************************************************************
	 * sieve of Atkin
	 * This code is contributed by Anant Agarwal. 
	 */
static ArrayList<Integer> primes = new ArrayList<Integer>();
	
    public static ArrayList<Integer> sieve(int limit){
    	
    	if (limit > 2){ primes.add(2);}
    	if (limit > 3){ primes.add(3);}
    	  
    	boolean sieve[] = new boolean[limit]; 
    	  
    	for (int i = 0; i < limit; i++){
    		sieve[i] = false; 
    	}
    	for (int x = 1; x * x < limit; x++) { 
    		for (int y = 1; y * y < limit; y++) { 
    			int n = (4 * x * x) + (y * y); 
    			if (n <= limit && (n % 12 == 1 || n % 12 == 5)){
    				sieve[n] ^= true; 
    			}
    			n = (3 * x * x) + (y * y); 
    			if (n <= limit && n % 12 == 7){
    				sieve[n] ^= true; 
    			}
    			n = (3 * x * x) - (y * y); 
    			if (x > y && n <= limit && n % 12 == 11){ 
    				sieve[n] ^= true; 
    			}
    		} 
    	} 
    	  
    	for (int r = 5; r * r < limit; r++) { 
    		if (sieve[r]) { 
    			for (int i = r * r; i < limit; i += r * r){ 
    				sieve[i] = false; 
    			}
    		} 
    	} 
    	  
    	for (int a = 5; a < limit; a++){ 
    		if (sieve[a]){
    			primes.add(a);
    		}
    	}
		return primes;
    }
	
}
