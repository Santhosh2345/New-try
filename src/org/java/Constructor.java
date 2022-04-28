package org.java;

public class Constructor {
	public void Constructor(int x) { //many parameterized constructor
		System.out.println(+x);
	}
	public Constructor() { //more than one non parameterized constructor
		int b = 5;
		System.out.println(b);
	}
	public Constructor(float f) {
		System.out.println(+f);
	}
	public static void main(String[] args) {
		Constructor w = new Constructor();
		Constructor ww = new Constructor(0.34f);
		Constructor www = new Constructor(2);
	}
	

}
