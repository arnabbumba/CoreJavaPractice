package LambdaDemo1;

interface iA1{
	void show();
}

public class ImplementedByAnonymusClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iA1 obj = new iA1(){
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("Implemented inside anonymus inner class");
			}
		};
		obj.show();
	}

}
