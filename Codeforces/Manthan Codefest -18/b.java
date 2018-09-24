import java.util.*;
public class Fest18B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s = scan.nextInt();
		int[] arr =new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		long sum = 0;
		if(n%2==1){
			for(int i = 0;i<n/2;i++){
				if(arr[i]>s){
					sum+=arr[i]-s;
				}
			}
			for(int i = n/2+1;i<n;i++){
				if(arr[i]<s){
					sum+=s-arr[i];
				}
			}
			sum+=Math.abs(s-arr[n/2]);
		}
		System.out.println(sum);
	}

}
