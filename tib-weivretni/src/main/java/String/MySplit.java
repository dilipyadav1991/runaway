package String;

import java.util.ArrayList;
import java.util.List;

public class MySplit {
	public String split(String s, char ch){
		List<String> stringList = new ArrayList<String>();
		int size = s.length();
		int i = 0;
		int start = 0;
		while(i<size){
			if(s.charAt(i) ==  ch){
				stringList.add(s.substring(start, i));
				start = i + 1;
			}
			i++;
		}
		//add last work
		stringList.add(s.substring(start, i));
		return stringList.toString();
	}
	public static void main(String[] args) {
		MySplit obj = new MySplit();
		String sentence = "Can you give me a tenant which is working in prod please";
		String ans = obj.split(sentence, ' ');
		System.out.println("Answer: " + ans);
	}
}
