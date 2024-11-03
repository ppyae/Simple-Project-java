public class CapitalLetter{

	public static String change(String str){

		 return Arrays.stream(str.split("\\s"))
		 				.map(message -> Character.toUpperCase(message.charAt(0))+ message.substring(1))
		 				.collect(Collectors.joining(" "));
    }

}
