public class JavaStatements {
	
	private static int[] numbers = {0, 10, 15, 54, 15, 15, 10, 10};

	public static void main(String[] args) {
		// just to check changes
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 10 || numbers[i] == 15)
				System.out.println("I Index Value is " + i + " The value is " + numbers[i]);
			else if(numbers[i] == 15)
				System.out.println("I index value is " + 1 + " The value is " + numbers[i]);
			else
				System.out.println("Not Equal.");
		}
	}

}
