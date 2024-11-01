import java.util.*;

public class Reverse{

	public static void main(String[] args) {

		var r = new Reverse();

		var result = r.add("Hello");

		System.out.println(result);
		
	}

	static String add(String message){

		String s= "";

		for(int i =message.length(); i>0; --i ){

			s = s+(message.charAt(i-1));
		}

		return s;
	}

}