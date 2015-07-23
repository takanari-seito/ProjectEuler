
public class P4 {
//左右どちらから読んでも同じ値になる数を回文数という.
//2桁の数の積で表される回文数のうち, 最大のものは 9009 = 91 × 99 である.
//では, 3桁の数の積で表される回文数の最大値を求めよ.

	public static void main(String[] args) {
		long start = System.nanoTime();

		int x;
		int y = 0;
		boolean b;

		for(int i=100;i<1000;i++){
			for(int j=100;j<1000;j++){
				x = i * j;
				b = isCircular(x);
				if(b==true){
					y = Math.max(x,y);
				};
			};
		};

		System.out.println(y);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;

	}

	public static boolean isCircular(int x){

		String s = "" + x;
		int n = s.length();

		for(int i=0;i<=Math.ceil(n/2)-1;i++){
			if(!(s.substring(i,i+1).equals(s.substring(n-i-1,n-i)))){
				return false;
			};
		};

		return true;
	}

}
