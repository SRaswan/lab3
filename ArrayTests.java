import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

	// @Test 
	// public void testReverseInPlace1() {
  //   int[] input1 = { 1, 2 ,3, 4 };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input1);
	// }

  @Test
  public void testReversed1() {
    int[] input1 = { 1, 2, 3, 4};
    assertArrayEquals(new int[]{ 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] input1 = { 1, 2, 3, 3, 1, 1};
    assertEquals(2, (int) ArrayExamples.averageWithoutLowest(input1));
  }

  @Test
  public void testAverageWithoutLowest2() {
      double[] input1 = { 1, 2, 3, 3, 5, 7};
      assertEquals(4, (int) ArrayExamples.averageWithoutLowest(input1));
  }


}
