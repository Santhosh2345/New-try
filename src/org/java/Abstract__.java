package org.java;

public class Abstract__ {
   // public abstract  void bb(); 
		// TODO Auto-generated method stub
    private void ss() {
         String h = "Santhosh";
         String d = "Kumar";
         int w = 12;
         System.out.println(h.concat(d).concat(d).concat(h));
         System.out.println(h);
	}
    private void app() {
		StringBuffer v = new StringBuffer("Santhosh");
		String x = "Kumar";
		int e= 12;
		System.out.println(v.append(x).append(x).append(e));
		System.out.println(v.reverse());
	}
    public static void main(String[] args) {
		Abstract__ a = new Abstract__();
		a.ss();
		a.app();
			
		
	}
	
}
