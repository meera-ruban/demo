package org.list;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.net.ssl.SSLContext;

public class Occurance {
	public static void main(String[] args) {
		String s ="Greens";
		//G=1,R=1,E=2,N=1,S=1;
Map<Character,Integer>mp=new LinkedHashMap<>();
for(int i=0;i<s.length();i++) {
char c=s.charAt(i);
if(mp.containsKey(c)) {
	Integer count=mp.get(c);
	mp.put(c, count+1);
}
else {
	mp.put(c, 1);
}
}
	System.out.println(mp);
}
}
