package exp11;

import java.util.HashMap;

public class CharCounter {
	public static HashMap<Character,Integer> count(String str){
		HashMap<Character,Integer> countMap=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();++i){
			Character c=Character.toLowerCase(str.charAt(i));
			if(countMap.containsKey(c)){
				int num=countMap.get(c);
				countMap.put(c, num+1);
			}else{
				countMap.put(c, 1);
			}
		}
		return countMap;
	}
	public static void main(String []args){
		HashMap<Character,Integer> countMap;
		countMap=count("Our country is an unity composed of 56 ethnic groups");
		for(Character c:countMap.keySet()){
			System.out.println("\'"+c+"\'"+"³öÏÖ"+countMap.get(c)+"´Î");
		}
	}
}
