package bank;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	BankAccount bankAccount ; 
	
	@BeforeAll
    static void beforeAllinit() {
        System.out.println("This needs to execute before All");
    }

	@BeforeEach
	void init() { 
        System.out.println("Cleaning up...");
    }
	
	@AfterEach
	void cleanup() {	
		System.out.println("Cleaning up...");
	}

    @AfterAll
    static void afterAllInit(){
        System.out.println("This needs to execute after All");
    }

	@Test
	@DisplayName("Testing Widhraw Method")
	void testWithdraw() {
        bankAccount = new BankAccount();
        
        //Boolean isServerUp = false;
		//assumeTrue(isServerUp);

        assertThrows(BankAccount.InsufficientFundsException.class, ()-> bankAccount.withdraw(60000));
        
        System.out.println("@Test executed");  
	} 

}