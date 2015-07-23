
public class P1 {
//10未満の自然数のうち, 3 もしくは 5 の倍数になっているものは 3, 5, 6, 9 の4つがあり, これらの合計は 23 になる.
//同じようにして, 1000 未満の 3 か 5 の倍数になっている数字の合計を求めよ.

	public static void main(String[] args) {

		int s = 0;

		for(int i=1;i<1000;i++){
			if(i%3==0||i%5==0){
				s = s + i;
				System.out.println(i);

			};
		};

		System.out.println();
		System.out.println(s);

	}

}
