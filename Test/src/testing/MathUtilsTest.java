package testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When running MathUtils")
class MathUtilsTest {
	
	MathUtils mathUtils;
	TestInfo testInfo;
	TestReporter testReporter;
	
	/*@BeforeAll
	static void beforeAllInit() {		
		System.out.println("This needs to Run before All");		
	}*/
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		mathUtils = new MathUtils();
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags" + testInfo.getTags());
	}
	
	/*@AfterAll
	static void afterAllInit() {
		System.out.println("This needs to Run After All");
	}*/
	
	/*@AfterEach
	void cleanup() {	
		System.out.println("Cleaning up...");
	}*/

	@Nested
	@DisplayName("add method")
	@Tag("Math")
	class AddTest {
		
		@Test
		@DisplayName("when adding two positive numbers")
		void testAddPositive() {	
			//int expected = 2;
			//int actual = mathUtils.add(1, 1);
			assertEquals(2, mathUtils.add(1, 1), "Should return the right Sum" );
		}
		
		@Test
		@DisplayName("when adding two negative numbers")
		void testAddNegative() {
			int expected = -2;
			int actual = mathUtils.add(-1, -1);
			assertEquals(expected, actual, () -> "Should return  Sum" + expected + "but returned" + actual);
		}
	}
	
	@Test
	@DisplayName("multiply method")
	@Tag("Math")
	void testMultiply() {
	testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags" + testInfo.getTags());
	//assertEquals(4, mathUtils.multiply(2, 2), "Should return the right Product" );
	assertAll(
			() -> assertEquals(4, mathUtils.multiply(2, 2)),
			() -> assertEquals(0, mathUtils.multiply(2, 0)),
			() -> assertEquals(-2, mathUtils.multiply(2, -1))
			);
	}
	
	@Test
	//@EnabledOnOs(OS.LINUX)
	@DisplayName("divide method")
	@Tag("Math")
	void testDivide() {
		//Boolean isServerUp = false;
		//assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero should throw");	
	}
	
	@RepeatedTest(3)
	@DisplayName("Testing ComputeCircleRadius method")
	@Tag("Circle")
	void testComputeCircleRadius(RepetitionInfo repetitionInfo) {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area" );
	}
	
	@Test
	@Disabled
	@DisplayName("This method should not run")
	void testDisabled() {	
		fail("This Test should be Disabled");
	}

}
