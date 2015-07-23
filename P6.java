
public class P6 {
//最初の10個の自然数について, その二乗の和は,
//1^2 + 2^2 + ... + 10^2 = 385
//最初の10個の自然数について, その和の二乗は,
//(1 + 2 + ... + 10)^2 = 3025
//これらの数の差は 3025 - 385 = 2640 となる.
//同様にして, 最初の100個の自然数について二乗の和と和の二乗の差を求めよ.

	public static void main(String[] args) {

		long start = System.nanoTime();

		int x = 0;
		int y = 0;
		int z;

		for(int i=1;i<=100;i++){
			x = x + i*i;
			y = y + i;
		};

		y = y*y;

		z = y - x;

		System.out.println(z);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;

	}

}
