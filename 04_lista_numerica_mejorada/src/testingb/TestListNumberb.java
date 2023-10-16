package testingb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestListNumberb {

	@BeforeEach
	void setUp() throws Exception {
		listNumber=new ListNumber();
		listNumber.add(5);
		listNumber.add(10);
		listNumber.add(15);
	}

	@Test
	void testFirst() {
	
		
	}

	@Test
	void testLast() {
		
	}

	@Test
	void testSuma() {
		
	}

	@Test
	void testAddInteger() {
		
	}

	@Test
	void testAddIntInteger() {
		fail("Not yet implemented");
	}

}
