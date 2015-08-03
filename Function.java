import java.math.BigInteger;
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
		for(int i=1;i<=n;i++){a.add(i);}
		System.out.println(a);
		return a;
	}

	public static ArrayList<Integer> arrayPrimeDecomposition(ArrayList<Integer> a){
		//リストaのすべての整数の素因数分解をリストとして出力
		int n = a.size();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			b = primeDecomposition(a.get(0));
			a.remove(0);
			for(int j=0;j<b.size();j++){a.add(b.get(j));}
		}
		Collections.sort(a);
		System.out.println(a);
		return a;
	}

	public static ArrayList<Integer> primeDecomposition(int n){
		//整数nの素因数分解をリストとして出力
		ArrayList<Integer> a = new ArrayList<Integer>();
		int i = 0;
		while(n!=1){
			do{i++;}while(isPrime(i)==false);
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
		int i = 0;
		int j = 0;
		while(i<m&&j<n){
			if(a.get(i)>b.get(j)){
				j++;
			}else if(a.get(i)<b.get(j)){
				i++;
			}else{
				a.remove(i);
				b.remove(j);
				m--;
				n--;
				System.out.println(a);
				System.out.println(b);
			}
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

	public static BigInteger makePowerBig(int m, int n){
		//m^nをBigIntegerとして出力
		BigInteger x = new BigInteger("1");
		x = BigInteger.valueOf(m);
		x = x.pow(n);
		System.out.println(x);
		return x;
	}

	public static int calcSumOfString(String s){
		//String形式の数の各桁の数字の和をintとして出力
		int n = 0;
		for(int i=0;i<s.length();i++){
			n = n + s.charAt(i) - 48;
			//System.out.println(n);
		}
		System.out.println(n);
		return n;
	}

	public static BigInteger makeFactorialBig(int n){
		BigInteger x = new BigInteger("1");
		BigInteger y = new BigInteger("1");
		for(int i=1;i<=n;i++){
			y = BigInteger.valueOf(i);
			x = x.multiply(y);
		}
		System.out.println(x);
		return x;
	}

	public static boolean isAmicable(int n){
		//整数nが友愛数であればtrueを出力
		ArrayList<Integer> x = getProperDivisors(n);
		int m = calcArraySum(x);
		ArrayList<Integer> y = getProperDivisors(m);
		int l = calcArraySum(y);
		if((n!=m)&&(n==l)){
			return true;}else{return false;}
	}

	public static ArrayList<Integer> getProperDivisors(int n){
		//整数nの真の約数をArrayListとして出力
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=1;i<=Math.floor(n/2);i++){
			if(n%i==0){
				a.add(i);
			}
		}
		//System.out.println(a);
		return a;
	}

	public static int calcArraySum(ArrayList<Integer> a){
		//ArrayList<Integer>の各要素の和をintとして出力
		int n = 0;
		for(int i=0;i<a.size();i++){
			n = n + a.get(i);
		}
		//System.out.println(n);
		return n;
	}

	public static boolean isAbundant(int n){
		//整数nが過剰数であればtrueを出力
		if(n<Function.calcArraySum(Function.getProperDivisors(n))){
			return true;
		}else{
			return false;
		}
	}


}