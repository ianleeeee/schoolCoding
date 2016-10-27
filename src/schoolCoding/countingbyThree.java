package schoolCoding;

public class countingbyThree {
	public static void main(String[] args) {
		int number = 3;
		while (number <= 300) {
			if (number % 3 == 0 && number %30 != 0) {
				
				System.out.println(number + " ");
				number++;
			} 
			if (number % 30 == 0) {
				System.out.print(number + " ");
			}
			else {
				number++;
			}
		}
	}
}