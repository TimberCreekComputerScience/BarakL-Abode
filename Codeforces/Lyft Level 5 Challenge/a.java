import java.util.*;
public class LyftA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ax = scan.nextInt();
		int ay = scan.nextInt();
		int bx = scan.nextInt();
		int by = scan.nextInt();
		int cx = scan.nextInt();
		int cy = scan.nextInt();
		
		
		
		
		
		if(bx<ax && cx<ax && by<ay && cy<ay){
			System.out.println("YES");
		}
		else if( bx<ax  && cx<ax && by>ay && cy>ay){
			System.out.println("YES");
		}
		else if(bx>ax && cx>ax && by>ay && cy>ay){
			System.out.println("YES");
		}else if(bx>ax && cx>ax && by<ay && cy<ay){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}


	}
}
