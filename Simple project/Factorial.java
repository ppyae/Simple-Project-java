public class Factorial{

	static int factorial(int message){

		int i,fact = 1;

		for(i = 1; i <= message; i++){
			fact= fact*i;
		}

		return fact;
	}
}