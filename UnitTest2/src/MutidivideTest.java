import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MutidivideTest {

	
	 @Test
	    void testAdd1() {
		 Mutidivide objAdd = new Mutidivide();
	        int expected =8;
	       int actual =objAdd.AddMethod(4,2,1);
	        assertEquals(expected, actual);
	    }
	 @Test
	 void testAdd() {
		 Mutidivide objAdd = new Mutidivide();
	        int expected =2;
	        int actual =objAdd.AddMethod(4,2);
	        assertEquals(expected, actual);
	    }

}
