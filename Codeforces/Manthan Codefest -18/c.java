import java.util.*;
public class Fest18C {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		String s1 = scan.next();
		int ans = 0;
		for(int i = 0;i<s.length();i++){
			if(s.charAt(i)!=s1.charAt(i)){
				if(i!=s.length()-1){
					if(s.charAt(i+1)==s1.charAt(i) && s.charAt(i) == s1.charAt(i+1)){
						ans++;
						i++;
					}else{
						ans++;
					}
				}else{
					ans++;
				}
				
			}
		}
		System.out.println(ans);
	}

}
