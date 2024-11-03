public class CapitalLetter{

	public static String change(String str){

		 return Arrays.stream(str.split("\\s"))
                     .map(word -> Character.toTitleCase(word.charAt(0)) + word.substring(1))
                     .collect(Collectors.joining(" "));
    }

}