package LambdaDemo1;

interface iA2{
	void show();
}

interface iA3{
	void show(int i);
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
		/*iA2 obj =  () ->
			{
				// TODO Auto-generated method stub
				System.out.println("Implemented inside Lambda expression");
			};*/
		iA2 obj =  () -> System.out.println("Implemented inside Lambda expression");
		//iA3 obj1 =  (int i) -> System.out.println("Implemented inside Lambda expression pass a value:"+i);
		//iA3 obj1 =  (i) -> System.out.println("Implemented inside Lambda expression pass a value:"+i);
		iA3 obj1 =  i -> System.out.println("Implemented inside Lambda expression pass a value:"+i);
		
		
		obj.show();
		obj1.show(3);
	}

}
