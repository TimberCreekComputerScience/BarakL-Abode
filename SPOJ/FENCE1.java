import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			double a = scan.nextDouble();
			if(a==0)break;
			double r = a/Math.PI;
			double ans = r*r*Math.PI;
			System.out.printf("%.2f",ans/2);
			System.out.println();
		}
	}

}
