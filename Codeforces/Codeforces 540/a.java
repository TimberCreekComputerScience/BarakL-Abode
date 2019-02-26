import java.util.*;
public class R540A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		while(n-->0){
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = scan.nextLong();
			if(c>=b*2){
				System.out.println(a*b);
			}else{
				System.out.println((a/2)*c+(a%2*b));
			}
		}
		
	}

}
