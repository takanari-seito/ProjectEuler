
public class P9 {
//ピタゴラス数(ピタゴラスの定理を満たす自然数)とは a < b < c で以下の式を満たす数の組である.
//a^2 + b^2 = c^2
//例えば, 3^2 + 4^2 = 9 + 16 = 25 = 5^2 である.
//a + b + c = 1000 となるピタゴラスの三つ組が一つだけ存在する.
//これらの積 abc を計算しなさい.

	public static void main(String[] args) {

		long start = System.nanoTime();

		int a;
		int b;
		int c;

		for(int i=1;i<333;i++){
			a = i;
			int j = 1;
			while((1000-a-(a+j))>0){
				b = a + j;
				c = 1000 - a - b;
				if(isPythagoras(a,b,c)==true){
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					System.out.println(a * b * c);
				}
				j++;
			}
		}

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;
	}

	public static boolean isPythagoras(int a, int b, int c){
		if((a*a+b*b==c*c)){
			return true;
		}else{
			return false;
		}
	}

}
