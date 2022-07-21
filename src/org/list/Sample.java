package org.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List <Integer> li=new ArrayList<Integer>();  
		  li.add(10);  
		  li.add(20);  
		  li.add(30);  
		  li.add(43);  
		  li.add(50);  
		  li.add(61);  
		  li.add(70);  
		  li.add(80);  
		  li.add(99);  
		  li.add(10);  
		   System.out.println(li);
		  List <Integer>si=new ArrayList<Integer>();  
		  si.add(100);  
		  si.add(200);  
		  si.add(30);  
		  si.add(40);  
		  si.add(50);  
		  si.add(600);  
		  si.add(700);  
		  si.add(800);  
		  si.add(90);  
		  si.add(100);  
		   System.out.println((si)); 
		   //6.HOW TO COPY VALUE FROM LIST TO SET
		     si.addAll(li);
		   System.out.println(si);
		   //===========================================================================
		   //7.FIND THE LIST LENGTH
		   int p = li.size();
		   System.out.println(p);
		   //==============================================================================
		   //15.GET THE FIRST INDEX VALUE IN LIST
		   Integer first = li.get(1);
		   System.out.println(first);
		   //==============================================================================
		   //13.ITERATE THE LIST BY USING FOR LOOP
		 for(int i=0;i<li.size();i++)
		   {	
			   System.out.println(li.get(i));
		   }
		   //===============================================================================
		   //14.ENHANCED FOR LOOP
		   for(Integer x:li)
		   {	
			   System.out.println(x);
		   }
		   //==============================================================================
           //8.HOW TO GET LAST INDEX VALUE IN LIST
		   Integer last = li.get(9);
		   System.out.println(last);
		   //=============================================================================
  
		   }  
		  
	} 
		
	

