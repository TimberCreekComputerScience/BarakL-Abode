import java.util.*;
public class MailA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s = scan.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		for(int i = 0;i<n;i++){
			arr[i] = scan.nextInt();
		}
		for(int i = 0;i<n;i++){
			arr1[i] = scan.nextInt();
		}
		if(arr[0]==0){
			System.out.println("NO");
			return;
		}
		for(int i = 0;i<n;i++){
			if(i+1>s && arr[i]==1){
				if(arr1[i]==1){
					for(int j = i;j>=0;j--){
						if(j+1==s && arr1[j]==1){
							System.out.println("YES");
							return;
						}
					}
				}
			}
			if(i+1==s && arr[i]==1){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");

	}

}
