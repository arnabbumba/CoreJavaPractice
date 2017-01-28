package LambdaDemo1;

interface iA2{
	void show();
}

public class ImplementedByLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*iA2 obj = new iA2(){
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("Implemented inside Lambda expression");
			}
		};*/
		iA2 obj =  () ->
			{
				// TODO Auto-generated method stub
				System.out.println("Implemented inside Lambda expression");
			};
		
		obj.show();
	}

}
