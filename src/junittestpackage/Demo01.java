package junittestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo01 {

	private int count = 0;
	@Test
	public void test1() {
		count++;
		assertEquals(1, count);
	}
	
	@Test
	public void test2() {
		count++;
		assertEquals(1, count);
	}

}
