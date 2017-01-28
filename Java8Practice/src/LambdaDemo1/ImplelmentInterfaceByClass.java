package LambdaDemo1;

interface iA{
	void show();
}

class A implements iA{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("implemented inside A");
	}
}

public class ImplelmentInterfaceByClass {
	
	public static void main(String args[]){
		
		iA obj = new A();
		obj.show();
	}

}
