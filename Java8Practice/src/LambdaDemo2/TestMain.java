package LambdaDemo2;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//iA obj = i -> System.out.println("hello::"+i);
		iA obj = System.out::println;
		obj.show(5);
	}

}
