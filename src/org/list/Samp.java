package org.list;

public class Samp {
	private void text(Object...a) {
		for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
	Samp a=new Samp();
	a.text("JAVA",10,20,"MEERAL,20,50");
	}

}
