package minmax;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Test
	void testFindMinMax() {
		assertArrayEquals(new int[] {3,56} , MinMaxFinder.findMinMax(new int[] {56, 34, 7,3, 54, 3, 34, 34, 53}));
        assertArrayEquals(new int[] {2,99} , MinMaxFinder.findMinMax(new int[] {89,2,56,43,99}));
        assertArrayEquals(new int[] {-1,9} , MinMaxFinder.findMinMax(new int[] {5,6,0,7,-1,8,9}));
        assertArrayEquals(new int[] {0,15} , MinMaxFinder.findMinMax(new int[] {15, 8, 5, 3, 0}));
        assertArrayEquals(new int[] {42,69}, MinMaxFinder.findMinMax(new int[] {55,65,54,59,62,42,69}));

	}
	
	@Test
	void testFindMin() {
		assertAll( 
			() -> assertEquals (3 , MinMaxFinder.findMin(new int[] {56, 34, 7,3, 54, 3, 34, 34, 53})),
			() -> assertEquals (2 , MinMaxFinder.findMin(new int[] {89,2,56,43,99})),
			() -> assertEquals (-1, MinMaxFinder.findMin(new int[] {5,6,0,7,-1,8,9})),
			() -> assertEquals (42, MinMaxFinder.findMin(new int[] {55,65,54,59,62,42,69}))
				); 
	}
	@Test
	void testFindMax() {
		assertAll( 
			() -> assertEquals (56, MinMaxFinder.findMax(new int[] {56, 34, 7,3, 54, 3, 34, 34, 53})),
			() -> assertEquals (99, MinMaxFinder.findMax(new int[] {89,2,56,43,99})),
			() -> assertEquals (9 , MinMaxFinder.findMax(new int[] {5,6,0,7,-1,8,9})),
			() -> assertEquals (69, MinMaxFinder.findMax(new int[] {55,65,54,59,62,42,69}))
				); 
}

}
