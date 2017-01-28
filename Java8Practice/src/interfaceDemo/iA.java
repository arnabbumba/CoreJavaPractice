package interfaceDemo;

public interface iA {

	void show();
	
	default public void call(){
		System.out.println("default method inside iA interface");
	}
}
