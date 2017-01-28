package interfaceDemo;

public interface iB {

	void show();
	
	default public void call(){
		System.out.println("default method inside iB interface");
	}
}

