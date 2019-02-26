// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
public class R540B {
	static long[] arr;
	static int n;
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] arr =new int[n];
		int even = 0;
		int odd = 0;
		int[] oTo = new int[n];
		int[] eTo = new int[n];
		for(int i = 1;i<=n;i++){
			arr[i-1] = scan.nextInt();
			if(i%2==1){
				odd+=arr[i-1];
			}else{
				even+=arr[i-1];
			}
			oTo[i-1] = odd;
			eTo[i-1] = even;
		}
		//take out an odd and your odds will be odds up to that point and evens from that point onward
		//take out an even and your evens will evens up to that point and odds from that point onward
		int good = 0;
		int o = 0;
		int e = 0;
		for(int i = 0;i<n;i++){
			if(i==0){
				if(n%2==0){
					o = even;
					e = odd-arr[i];
				}else{
					e = odd-arr[i];
					o = even;
				}
			}
			else if(i==n-1){
				if(n%2==0){
					o = odd;
					e = even-arr[i];
				}else{
					o = odd-arr[i];
					e = even;
				}
			}else{
				o = oTo[i-1]+eTo[n-1]-eTo[i];
				e = eTo[i-1]+oTo[n-1]-oTo[i];
			}
			if(o==e){
				good++;
			}

		}
		System.out.println(good);
	}
}
