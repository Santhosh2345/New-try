package org.java;

public class Static1 extends Static {
@Override
public  void mo() {
	System.out.println("To");
	System.out.println("Let");
	super.mo();
}
public static void main(String[] args) {
	Static1 f = new Static1();
	f.mo();
}
}
