import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class R505B {

	public static void main(String[] args) {
		JS scan = new JS();
		int n = scan.nextInt();
		ArrayList<pairs> arr =new ArrayList<>();
		for(int i = 0;i<n;i++){
			int one = scan.nextInt();
			int two = scan.nextInt();
			arr.add(new pairs(one,two));
		}
		HashSet<Long> factors = new HashSet<Long>();
		long one = arr.get(0).one;
		long two = arr.get(0).two;
		for(long i = 2;i*i <= one;i++){
			if(one%i==0){
				factors.add(i);
				factors.add(one/i);
			}
		}
		factors.add(one);
		factors.add(two);
		for(long i = 2;i*i <= two;i++){
			if(two%i==0){
				factors.add(i);
				factors.add(two/i);
			}
		}
		for(Long fact:factors){
			boolean good = true;
			for(int i = 0;i<n;i++){
				pairs curr = arr.get(i);
				if(curr.one%fact!=0 && curr.two%fact!=0){
					good = false;
					break;
				}
			}
			if(good){
				System.out.println(fact);
				return;
			}
		}
		System.out.println(-1);
	}
	public static class pairs{
		int one, two;
		public pairs(int one1, int two1){
			one = one1;
			two = two1;
		}
	}
	static class JS{
		public int BS = 1<<16;
		public char NC = (char)0;
		byte[] buf = new byte[BS];
		int bId = 0, size = 0;
		char c = NC;
		double num = 1;
		BufferedInputStream in;

		public JS() {
			in = new BufferedInputStream(System.in, BS);
		}

		public JS(String s) throws FileNotFoundException {
			in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
		}

		public char nextChar(){
			while(bId==size) {
				try {
					size = in.read(buf);
				}catch(Exception e) {
					return NC;
				}				
				if(size==-1)return NC;
				bId=0;
			}
			return (char)buf[bId++];
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public long nextLong() {
			num=1;
			boolean neg = false;
			if(c==NC)c=nextChar();
			for(;(c<'0' || c>'9'); c = nextChar()) {
				if(c=='-')neg=true;
			}
			long res = 0;
			for(; c>='0' && c <='9'; c=nextChar()) {
				res = (res<<3)+(res<<1)+c-'0';
				num*=10;
			}
			return neg?-res:res;
		}

		public double nextDouble() {
			double cur = nextLong();
			return c!='.' ? cur:cur+nextLong()/num;
		}

		public String next() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c>32) {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public String nextLine() {
			StringBuilder res = new StringBuilder();
			while(c<=32)c=nextChar();
			while(c!='\n') {
				res.append(c);
				c=nextChar();
			}
			return res.toString();
		}

		public boolean hasNext() {
			if(c>32)return true;
			while(true) {
				c=nextChar();
				if(c==NC)return false;
				else if(c>32)return true;
			}
		}
	}

}
