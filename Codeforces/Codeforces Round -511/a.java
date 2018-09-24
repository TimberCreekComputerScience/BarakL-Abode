import java.util.Scanner;

public class betterA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n%3==2){
			System.out.println(1+" "+2+" "+(n-3));
		}else{
			System.out.println(1+" "+1+" "+(n-2));
		}
	}

}
