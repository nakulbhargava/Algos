class GCD
{
	public int gcd(int a,int b){
		if (a == 0)
			return b;
		return gcd(b%a, a);
	}
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public int generalizedGCD(int num, int[] arr)
	{
		// WRITE YOUR CODE HERE
		int gcd = 0;
		for(int number: arr){
			gcd = gcd(gcd, number);
			if(gcd == 1) return 1;
		}
		return gcd;
	}
	// METHOD SIGNATURE ENDS
}