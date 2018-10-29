import java.util.Scanner;

public class pass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n-->0){
			int a = scan.nextInt();
			if(a>=6){
				System.out.println("PASS");
			}else{
				System.out.println("FAIL");
			}
		}
	}

}
