
public class P12 {
//三角数の数列は自然数の和で表わされ, 7番目の三角数は 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28 である. 三角数の最初の10項は:
//1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
//となる.
//最初の7項について, その約数を列挙すると, 以下のとおり.
// 1: 1
// 3: 1,3
// 6: 1,2,3,6
//10: 1,2,5,10
//15: 1,3,5,15
//21: 1,3,7,21
//28: 1,2,4,7,14,28
//これから, 7番目の三角数である28は, 5個より多く約数をもつ最初の三角数であることが分かる.
//では, 500個より多く約数をもつ最初の三角数はいくつか.

	public static void main(String[] args) {

		long start = System.nanoTime();

		int x = 0;
		int n = 0;
		int i = 0;

		while(n<50){
			n = 0;
			i++;
			x = x + i;
			for(int j=1;j*j<=x;j++){
				if(isDivisor(x,j)==true){
					n++;
				}
			}
			System.out.println(x);
			System.out.println(n);
		}

		System.out.println(x);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;

	}

	public static boolean isDivisor(int x, int i){

		if(x%i==0){
			return true;
		}else{
			return false;
		}
	}

}
