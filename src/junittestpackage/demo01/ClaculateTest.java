package junittestpackage.demo01;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaculateTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd(){
		assertEquals(4, new Calculate().add(2, 3));
	}
}
