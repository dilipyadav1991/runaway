//https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/

package math;

import java.util.ArrayList;
import java.util.List;

public class HammingDistance {
	public static final int modulo = 1000000007;
	
	public static int findHammingDistance(final List<Integer> list){
		int sum = 0;
		int listSize = list.size();
		for(int i = 0; i < 31; i++){
			int setBitcount = 0;
			for(int j = 0; j < listSize; j++){
				int num = list.get(j);
				setBitcount += (num & (1 << i)) != 0 ? 1 : 0;
			}
			//{1,1}, {1,2} * 2 = {1,1}, {1,2}, {2,2}, {2,1} 
			sum += setBitcount * (listSize - setBitcount) * 2;
			sum = sum % modulo;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(findHammingDistance(list));
	}
}
