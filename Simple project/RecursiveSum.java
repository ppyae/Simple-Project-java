public class RecursiveSum{

	public static int recursive(int n){
		if(n == 1){
			return 1;
		}else{
			return n + recursive(n-1);
		}
	}
}