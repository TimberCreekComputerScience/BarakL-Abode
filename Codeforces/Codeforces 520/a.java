import java.util.*;
public class A520 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		for(int i = 0;i<n;i++){

		}
		int end = 0;
		int curr = 1000;
		if(arr.length>1){
			if(arr[n-1]==curr && arr[n-2]==curr-1){
				end = 0;
				for(int i = n-2;i>=0;i--){
					if(curr-arr[i]==1){
						curr = arr[i];
						end++;
					}else{
						break;
					}
				}
			}
		}
		curr = 1;
		int start = 0;
		if(arr.length>1){
			if(arr[0]==curr && arr[1]==curr+1){
				start = 0;
				for(int i =1;i<n;i++){
					if(arr[i]-curr==1){
						curr = arr[i];
						start++;
					}else{
						break;
					}
				}
			}
		}
		int best = 0;
		int temp = 0;
		curr = arr[0];
		for(int i = 1;i<n;i++){
			if(arr[i]-curr==1){
				temp++;
			}else{
				temp--;
				best = Math.max(temp, best);
				temp = 0;
			}
			curr = arr[i];
		}
		temp-=1;
		best = Math.max(temp, best);
		best = Math.max(best, start);
		best = Math.max(best, end);
		System.out.println(best);

	}

}
