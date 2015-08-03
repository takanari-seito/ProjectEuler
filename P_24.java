public class P_24 {
//順列とはモノの順番付きの並びのことである.
//たとえば, 3124は数 1, 2, 3, 4 の一つの順列である.
//すべての順列を数の大小でまたは辞書式に並べたものを辞書順と呼ぶ.
//0と1と2の順列を辞書順に並べると
//012 021 102 120 201 210
//になる.
//0,1,2,3,4,5,6,7,8,9からなる順列を辞書式に並べたときの100万番目はいくつか?

	public static void main(String[] args) {

		long start = System.nanoTime();

		int[] a = new int[10];
		for(int i=0;i<a.length;i++){
			a[i] = i;
		}
		showArray(a);
		for(int i=0;i<1000000-1;i++){
			a= nextDictionalNumber(a);
		}
		showArray(a);

		long end = System.nanoTime();
		System.out.println("Time:" + (end - start) / 1000000 + "ms");

		return;
	}

	public static int[] nextDictionalNumber(int[] a){
		//重複のない整数配列aの辞書順における次の整数配列をint[]として出力
		//a[p]とa[p+1]~a[q]内のa[p]より大きく一番小さいものと交換し、a[p+1]~a[q]をソート
		int p = 0;
		int x;
		for(int i=0;i<a.length-1;i++){
			if(a[i]<a[i+1]){
				p = i;
			}
		}
		//System.out.println(p + "," + q);
		//int[] b = Arrays.copyOfRange(a,p+1,q);		//なぜコピーできない????
		bubbleSortArray(a, p);
		for(int i=p+1;i<a.length;i++){
			if(a[p]<a[i]){
				x = a[p];
				a[p] = a[i];
				a[i] = x;
				break;
			}
		}
		//showArray(a);
		return a;
	}

	public static void showArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		System.out.println("");
		return;
	}

	public static int[] bubbleSortArray(int[] a,int s){
		//整数配列をsからソートしint[]として出力
		int x;
		for(int i=s+1;i<a.length-1;i++){
			for(int j=s+1;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
					//showArray(a);
				}
			}
		}
		//showArray(a);
		return a;
	}

}
