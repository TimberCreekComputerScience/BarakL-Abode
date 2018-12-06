import java.util.*;
public class Edu54A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		for(int i = 0;i<s.length()-1;i++){
			if(s.charAt(i+1)<s.charAt(i)){
				System.out.println(s.substring(0, i)+s.substring(i+1));
				return;
			}
		}
		System.out.println(s.substring(0,n-1));
	}

}
