import java.util.ArrayList;
import java.util.Collections;

public class Function {

	public static boolean isPrime(long n){
		//nが素数であればtrue
		int i;

		if(n<2){
			return false;
		}else if(n==2){
			//System.out.println(n);
			return true;
		}else if(n%2==0){
			return false;
		};

		for(i=3;i<=Math.sqrt(n);i+=2){
			if(n%i==0){return false;};
		};

		//System.out.println(n);
		return true;
	}

	public static boolean isCircular(int x){
		//xが回文数であればtrue
		String s = "" + x;
		int n = s.length();

		for(int i=0;i<=Math.ceil(n/2)-1;i++){
			if(!(s.substring(i,i+1).equals(s.substring(n-i-1,n-i)))){
				return false;
			};
		};

		return true;
	}

	public static boolean isDividable(int x){
		//xが1から20のすべての整数で割り切れればtrue

		int p = 1;
		int q = 20;

		for(int i=p;i<=q;i++){
			if(x%i!=0){
				return false;
			};
		};

		return true;
	}

	public static boolean isPythagoras(int a, int b, int c){
		//a,b,cがピタゴラス数であればtrue
		if((a*a+b*b==c*c)){
			return true;
		}else{
			return false;
		}
	}

	public static long factorial(int i){
		//iの階乗を出力
		if(i==1){
			return 1;
		}else{
			return i * factorial(i-1);
		}
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
				}else{
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
