import java.util.*;
public class LyftB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		loop:for(int q = 0;q<n;q++){
			long a = scan.nextLong();
			long b = scan.nextLong();
			if(a-b==1){
				long check = a+b;
				for(long i = 2;i*i<=check;i++){
					if(check%i==0){
						System.out.println("NO");
						continue loop;
					}
				}
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
