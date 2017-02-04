package FunctionalInterfaceDemo;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account =  new Account();
		float amount = 2000f;
		float interestRate = 5f;
		
		/*account.setInterestCalculator(
				
				new InterestCalculator() {
					
					@Override
					public float calculateInterestAmount(float amount, float interestRate) {
						// TODO Auto-generated method stub
						return amount * interestRate;
					}
				}
				
				);*/
		
		account.setInterestCalculator((amt,iRate) -> amount * interestRate);
		
		System.out.println(account.getInterestCalculator().calculateInterestAmount(amount, interestRate));

	}

}
