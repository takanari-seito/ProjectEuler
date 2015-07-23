
public class P7 {
//素数を小さい方から6つ並べると 2, 3, 5, 7, 11, 13 であり, 6番目の素数は 13 である.
//10 001 番目の素数を求めよ.

	public static void main(String[] args) {

		long start = System.nanoTime();

		int n = 0;
		int i = 0;

		do{
			i++;
			if(P3.isPrime(i)==true){n++;};
		}while(n!=10001);

		System.out.println(i);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;
	}

}
