public class Primos {
	public static void main(String[] args) {
		int max=51;
		System.out.println("Suma de los primeros "+max+" primos: "+sumFirst(max));
		System.out.println("Suma los primos hasta el número "+max+": "+sumUntil(max));
	}
	
	public static int sumFirst(int max) {
		int n=2;
		int sum=0;
		int nPrimos=1;
		while (nPrimos<max) {
			if (isPrime(n)) {
				nPrimos++;
				sum+=n;
				System.out.println(nPrimos+" "+n);
			}
			n++;
		}
		return sum;
	}
	
	public static int sumUntil(int max) {
		int sum=0;
		for (int i=2;i<=max;i++)
			if (isPrime(i))
				sum+=i;
		return sum;
	}
	
	public static boolean isPrime(int num) {
		if (num==2) 
			return true;
		int divisor=(int) Math.sqrt(num)+1;
		while (num%divisor!=0 && divisor>2)
			divisor--;
		return num%divisor!=0;
	}
	
}
