import java.util.*;
public class Fest18A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		while(n>0){
			n/=2;
			count++;
		}
    System.out.println(count);
	}

}
