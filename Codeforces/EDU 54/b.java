import java.math.BigInteger;
import java.util.*;
public class Edu54B {
	static long n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextLong();
		long fact = factor();
		long ans = 0;
		if(fact==-1){
			System.out.println(1);
			return;
		}
		if(n%2==1){
			n-=fact;
			ans++;
			ans+=n/2;
		}else{
			ans+=n/2;
		}
		System.out.println(ans);
	}
	static long factor(){
		for(long i = 2;i*i<=n;i++){
			if(n%i==0){
				return i;
			}
		}
		return -1;
	}

}
