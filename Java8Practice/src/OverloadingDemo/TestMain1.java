package OverloadingDemo;

public class TestMain1 {
	
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(Integer a,Integer b) {
		System.out.println("2nd"+a+b);
	}

	public static void main(String[] args) {
		
		Integer a =5;
		Integer b=6;
		TestMain1 obj = new TestMain1();
		obj.sum(a,b);
		
		//added today
		
	}
}
