import java.math.BigInteger;

public class P_25 {
//フィボナッチ数列は以下の漸化式で定義される:
//Fn = Fn-1 + Fn-2, ただし F1 = 1, F2 = 1.
//最初の12項は以下である.
//F1 = 1,F2 = 1,F3 = 2,F4 = 3,F5 = 5,F6 = 8,F7 = 13,F8 = 21,F9 = 34,F10 = 55,F11 = 89,F12 = 144
//12番目の項, F12が3桁になる最初の項である.
//1000桁になる最初の項の番号を答えよ.
	public static void main(String[] args) {

		long start = System.nanoTime();

		BigInteger x = new BigInteger("1");
		BigInteger y = new BigInteger("1");
		BigInteger z = new BigInteger("1");
		int n = 2;
		BigInteger m = new BigInteger("1");
		BigInteger l = BigInteger.valueOf(10);
		for(int i=0;i<1000-1;i++){
			m = m.multiply(l);
		}
		do{
			z = x.add(y);
			x = y;
			y = z;
			n++;
			//System.out.println(n);
			//System.out.println(z);
		}while(z.compareTo(m)==-1);
		System.out.println(n);
		System.out.println(z);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;
	}
}
