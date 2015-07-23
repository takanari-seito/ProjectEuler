
public class P3 {

//13195 の素因数は 5, 7, 13, 29 である.
//600851475143 の素因数のうち最大のものを求めよ.

	public static void main(String[] args) {

		long start = System.nanoTime();

		long n = 600851475143L;
		long p = 0;

		for(long i=1;i<Math.sqrt(n);i+=2){
			if(isPrime(i)==true&&n%i==0){
				p = i;
			};
		};

		System.out.println(p);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");
	}

	public static boolean isPrime(long n){
		int i;

		if(n<2){
			return false;
		}else if(n==2){
			//System.out.println(n);
			return true;
		}else if(n%2==0){
			return false;
		};

		for(i=3;i<=Math.sqrt(n);i+=2){
			if(n%i==0){return false;};
		};

		//System.out.println(n);
		return true;
	}

}
