
public class P14 {
//正の整数に以下の式で繰り返し生成する数列を定義する.
//n → n/2 (n が偶数)
//n → 3n + 1 (n が奇数)
//13からはじめるとこの数列は以下のようになる.
//13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//13から1まで10個の項になる.
//この数列はどのような数字からはじめても最終的には 1 になると考えられているが,
//まだそのことは証明されていない(コラッツ問題)
//さて, 100万未満の数字の中でどの数字からはじめれば最長の数列を生成するか.
//注意: 数列の途中で100万以上になってもよい

	public static void main(String[] args) {

		long start = System.nanoTime();

		long j;
		int m = 1;
		int n = 1;
		int x = 1;

		for(int i=1;i<1000000;i++){
			//System.out.println("i" + i);
			j = i;
			m = 1;
			while(j!=1){
				if(j%2==0){
					j = j / 2;
				}else{
					j = 3 * j + 1;
				}
				//System.out.println("j" + j);
				m++;
			}
			//System.out.println("m" + m);
			if(m>n){
				n = m;
				x = i;
			}
		}

		System.out.println(x);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;

	}

}
