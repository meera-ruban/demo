package org.list;

import java.util.ArrayList;
import java.util.List;

public class AlternateNumber {
	public static void main(String[] args) {
		List <Integer> li=new ArrayList<>();
	  li.add(11);  
	  li.add(22);  
	  li.add(33);  
	  li.add(44);  
	  li.add(50);  
	  li.add(60); 
	  li.add(21);
	  for(int i=0; i<li.size(); i++){
		  if(i%2!=1)
		  {
		  System.out.println(li.get(i)); 
	  }
	  }
	  }

}
