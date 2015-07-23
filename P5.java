
public class P5 {
//2520 は 1 から 10 の数字の全ての整数で割り切れる数字であり, そのような数字の中では最小の値である.
//では, 1 から 20 までの整数全てで割り切れる数字の中で最小の正の数はいくらになるか.

	public static void main(String[] args) {

		long start = System.nanoTime();

		boolean b;
		int i = 0;

		do{
			i++;
			b = isDividable(i);
		}while(b==false);

		System.out.println(i);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;

	}

	public static boolean isDividable(int x){

		int p = 1;
		int q = 20;

		for(int i=p;i<=q;i++){
			if(x%i!=0){
				return false;
			};
		};

		return true;
	}

}
