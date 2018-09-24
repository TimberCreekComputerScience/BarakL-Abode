import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append(scan.next());
		if(sb.length()==1){
			System.out.println("1");
			return;
		}
		int ans = 0;
		if(sb.charAt(0)!=sb.charAt(sb.length()-1)){
			int streak = 1;
			int streak1 = 1;
			int end = 0;
			for(int i = 1;i<sb.length();i++){
				if(sb.charAt(i)!=sb.charAt(i-1))streak++;
				else{
					end = i;
					break;
				}
			}
			for(int i=sb.length()-2;i>=end;i--){
				if(sb.charAt(i)!=sb.charAt(i+1))streak1++;
				else{
					break;
				}
			}
			ans = streak+streak1;
		}
		int curr =1;
		for(int i = 1;i<sb.length();i++){
			if(sb.charAt(i)!=sb.charAt(i-1)){
				curr++;
			}else{
				ans = Math.max(ans, curr);
				curr = 1;
			}
		}

		System.out.println(ans);
	}

}
