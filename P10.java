
public class P10 {
//10以下の素数の和は 2 + 3 + 5 + 7 = 17 である.
//200万以下の全ての素数の和を求めよ.

	public static void main(String[] args) {

		long start = System.nanoTime();

		long sum = 0;

		for(int i=1;i<=2000000;i++){
			if(Function.isPrime(i)==true){
				sum = sum + i;
			}
		}

		System.out.println(sum);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;

	}

}
