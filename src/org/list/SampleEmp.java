package org.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleEmp {
	public static void main(String[] args) {
		Employee s=new Employee();
		s.setId(120);
        s.setName("meeral");	
        s.setAge(28);
        
		Employee s1=new Employee();
		s1.setId(130);
        s1.setName("narmadha");	
        s1.setAge(19);
		/*List<Employee>li=new ArrayList<Employee>();
li.add(s);
li.add(s1);
for(int i=0;i<li.size();i++) {
	System.out.println(li.get(i).getId());
	System.out.println(li.get(i).getName());
	System.out.println(li.get(i).getAge());	
}*/

/*Set<Employee>si=new HashSet<Employee>();
si.add(s);
si.add(s1);
for(Employee x:si) {
System.out.println(x.getId());
System.out.println(x.getName());
	}*/
        Map<Integer,Employee>si=new HashMap<>();
        si.put(1,s);
        si.put(2, s1);
        Set<Entry<Integer, Employee>> mp = si.entrySet();
        for(Entry<Integer,Employee>x:mp) {
System.out.println(x.getKey());      
System.out.println(x.getValue().getId());
System.out.println(x.getValue().getName());


        
        }
        
      
        
        
        
	}
}
