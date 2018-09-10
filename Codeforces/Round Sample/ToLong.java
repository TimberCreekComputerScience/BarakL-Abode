import java.util.Scanner;

public class ToLong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int runs = scan.nextInt();
		scan.nextLine();
		
		for (int i=0; i<runs; i++) {
			
			String input = scan.nextLine();
			
			if (input.length() > 10) {
				System.out.print(input.substring(0, 1));
				System.out.print(input.length()-2);
				System.out.print(input.substring(input.length()-1, input.length()));
				
				System.out.println();
			} else {
				System.out.println(input);
			}
			
			
		}
	}

}
