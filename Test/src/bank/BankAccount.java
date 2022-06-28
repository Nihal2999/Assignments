package bank;

public class BankAccount {

	int balance = 20000;
    void withdraw(int amt) throws InsufficientFundsException {
    	
       if(amt > balance)
       throw new InsufficientFundsException("Insufficient Balance");

   }
    
    class InsufficientFundsException extends Exception {
    	
		private static final long serialVersionUID = 1L;

		InsufficientFundsException(String str) {
			
            super(str);
        }
    } 
}