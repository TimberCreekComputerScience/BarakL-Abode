import java.util.Scanner;

public class paper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-->0){
			int cases = scan.nextInt();
			int sum = 0;
			while(cases-->0){
				int one = scan.nextInt();
				int two = scan.nextInt();
				if(two%4==0){
					sum+=two/4*one;
				}else{
					sum+=(two/4+1)*one;
				}
			}
			System.out.println(sum);
		}
	}

}
