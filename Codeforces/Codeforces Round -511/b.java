import java.util.Scanner;
import java.util.*;
public class B511 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = -1;
		for(int i = 0;i<n;i++){
			int one = scan.nextInt();
			int two = scan.nextInt();
			max = Math.max(max, one+two);
		}
		System.out.println(max);
		
	}

}
