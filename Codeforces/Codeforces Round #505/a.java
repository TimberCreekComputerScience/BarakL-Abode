import java.util.*;
public class R505A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] arr =new int[26];
		String s = scan.next();
		for(int i = 0;i<a;i++){
			arr[s.charAt(i)-'a']++;
		}
		int count = 0;
		int count1 = 0;
		for(int i = 0;i<26;i++){
			if(arr[i]==1){
				count++;
			}else{
				if(arr[i]>1){
					count1++;
				}
			}
		}
		if(count>1 && count1==0){
			System.out.println("No");
			
		}else{
			System.out.println("Yes");
		}
	}

}
//
