import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class city {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		while(cases-->0){
			int cities = scan.nextInt();
			ArrayList<town> arr = new ArrayList<>();
			for(int i = 0;i<cities;i++){
				String s = scan.next();
				int cost = scan.nextInt();
				int people = scan.nextInt();
				arr.add(new town(s,cost,people));
			}
			int[][] costs = new int[cities][cities];
			for(int i = 0;i<cities;i++){
				for(int j = 0;j<cities;j++){
					costs[i][j] =scan.nextInt();
					
				}
			}
			String ans = "";
			int min = Integer.MAX_VALUE;
			HashMap<Integer, Integer> map = new HashMap<>();
			ArrayList<town> list= new ArrayList<>();
			for(int i = 0;i<cities;i++){
				int sum = 0;
				town main = arr.get(i);
				for(int j = 0;j<cities;j++){
					town curr = arr.get(j);
					if(i==j)continue;
					sum+=costs[j][i]*curr.people;
					sum+=main.cost*curr.people;
				}
				if(sum<min){
					ans = main.name;
				}
				map.put(i, sum);
				min = Math.min(min, sum);
			}
			for(int i = 0;i<cities;i++){
				town main = arr.get(i);
				if(map.get(i)==min){
					list.add(main);
				}
			}
			Collections.sort(list);
			System.out.println(list.get(0).name);
		}
	}
	static class town implements Comparable<town>{
		String name;
		int cost, people;
		public town(String name1, int cost1, int people1){
			name = name1;
			cost = cost1;
			people = people1;
		}
		@Override
		public int compareTo(town o) {
			return name.compareTo(o.name);
		}
	}
}
