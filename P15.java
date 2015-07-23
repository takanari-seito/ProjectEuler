import java.util.ArrayList;
import java.util.Collections;

public class P15 {
//2×2 のマス目の左上からスタートした場合, 引き返しなしで右下にいくルートは 6 つある.
//では, 20×20 のマス目ではいくつのルートがあるか.

	public static void main(String[] args) {

		long start = System.nanoTime();

		System.out.println("階乗を表示");
		ArrayList<Integer> a = makeFactorialArray(200);
		ArrayList<Integer> b = makeFactorialArray(200);
		ArrayList<Integer> c = makeFactorialArray(400);
		System.out.println("素因数分解");
		a = arrayPrimeDecomposition(a);
		b = arrayPrimeDecomposition(b);
		c = arrayPrimeDecomposition(c);
		System.out.println("aとcを約分");
		Pair ac = arrayReduction(a,c);;
		//a = ac.a;
		c = ac.b;
		System.out.println("bとcを約分");
		Pair bc = arrayReduction(b,c);
		//b = bc.b;
		c = bc.b;
		System.out.println("積を計算");
		calcProduct(c);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000f + "ms");

		return;
	}

	public static ArrayList<Integer> makeFactorialArray(int n){
		//nの階乗をリストとして出力
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=2;i<=n;i++){a.add(i);}
		System.out.println(a);
		return a;
	}

	public static ArrayList<Integer> arrayPrimeDecomposition(ArrayList<Integer> a){
		//リストaのすべての整数の素因数分解をリストとして出力
		int n = a.size();
		for(int i=0;i<n;i++){
			ArrayList<Integer> b = primeDecomposition(a.get(0));
			for(int j=0;j<b.size();j++){a.add(b.get(j));}
			a.remove(0);
			//System.out.println(a);
		}
		Collections.sort(a);
		System.out.println(a);
		return a;
	}

	public static ArrayList<Integer> primeDecomposition(int n){
		//整数nの素因数分解をリストとして出力
		ArrayList<Integer> a = new ArrayList<Integer>();
		int i = 1;
		while(n!=1){
			do{i++;}while(Function.isPrime(i)!=true);
			while(n%i==0){
				n = n / i;
				a.add(i);
			}
		}
		//System.out.println(a);
		return a;
	}

	public static Pair arrayReduction(ArrayList<Integer> a, ArrayList<Integer> b){
		//リストaとリストbの約分後のそれぞれのリストをクラスPairとして出力
		int m = a.size();
		int n = b.size();
		int j = 0;
		int k = 0;
		//ここに不具合あり。jとkの動かし方、要修正
		for(int i=0;i<m;i++){
			do{
				if(a.get(k)==b.get(j)){
					a.remove(k);
					b.remove(j);
					n--;
					break;
				}else if(a.get(k)>b.get(j)){
					j++;
				}else if(a.get(k)<b.get(j)){
					k++;
					break;
				}
			}while(j<n);
			//System.out.println(a);
			//System.out.println(b);
		}
		System.out.println(a);
		System.out.println(b);
		Pair output = new Pair(a,b);
		return output;
	}

	public static long calcProduct(ArrayList<Integer> a){
		//リストaの要素の積をlongとして出力
		long x = 1;
		for(int i=0;i<a.size();i++){
			x = x * a.get(i);
		}
		System.out.println(x);
		return x;
	}
}
