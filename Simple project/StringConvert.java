public class StringConvert{

	

	public static String  convert(String message){

		String s = "";

		for(int i = message.length(); i > 0; --i){
			s = s+(message.charAt(i-1));
		}

		return s;
	}
}