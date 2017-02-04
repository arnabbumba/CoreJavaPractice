/**
 * 
 */
package FunctionalInterfaceDemo;

/**
 * @author SONY
 *
 */
@FunctionalInterface
public interface InterestCalculator {

	float calculateInterestAmount(float amount,float interestRate);
	
	//public void sayHello();
	
//	boolean equals(Object obj);
}
