package org.list;

import java.util.ArrayList;
import java.util.List;

public class SalaryHike {
	public static void main(String[] args) {
Employee e1=new Employee();
e1.setName("sudha");
e1.setAge(28);
e1.setSalary(90000);
Employee e2=new Employee();
e2.setName("soni");
e2.setAge(26);
e2.setSalary(50000);
Employee e3=new Employee();
e3.setName("banu");
e3.setAge(23);
e3.setSalary(80000);
Employee e4=new Employee();
e4.setName("nalini");
e4.setAge(24);
e4.setSalary(80000);
Employee e5=new Employee();
e5.setName("anitha");
e5.setAge(23);
e5.setSalary(80000);
List<Employee>emp=new ArrayList<>();
emp.add(e1);
emp.add(e2);
emp.add(e3);
emp.add(e4);
emp.add(e5);

for(int i=0;i<emp.size();i++) {
	System.out.println(emp.get(i));
	System.out.println(emp.get(i).getName());
	System.out.println(emp.get(i).getAge());
	System.out.println(emp.get(i).getSalary());	
}
int age=20;
if(age>=25) {
	System.out.println("age above 25 hike will be 10%");
}
else {
	System.out.println("below 25 not eligible");
}
}
}