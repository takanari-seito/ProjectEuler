
public class P2 {

//フィボナッチ数列の項は前の2つの項の和である. 最初の2項を 1, 2 とすれば, 最初の10項は以下の通りである.
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//数列の項の値が400万以下の, 偶数値の項の総和を求めよ.
//Note:この問題は最近更新されました. お使いのパラメータが正しいかどうか確認してください.

	public static void main(String[] args) {
		int a = 0; int b = 1; int c = 0; int s = 0;

		while(c<=4000000){
			c = a + b;

			if(c%2==0){
				s = s + c;
			};

			a = b;
			b = c;
		};

		System.out.println(s);

	}

}
