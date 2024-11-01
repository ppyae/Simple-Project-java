public class GuessNumber{

	public static void main(String[] args) {
		
		var guess = new Guess();
		guess.check(6);
	}
}

class Guess{

	private int random = 5;

	public void check(int ui){

			if(ui == random){
				System.out.println("You win");
			}else{
				for(int i = 0; i < 5; i++) {
				
					if(ui > random){
						System.out.println("Your number is greater than Random number");
					}else if(ui < random){
						System.out.println("Your number is less than Random number");
					}else{
						System.out.println("Please type number only");
				}
			}
		
		}	
		
	}
}
