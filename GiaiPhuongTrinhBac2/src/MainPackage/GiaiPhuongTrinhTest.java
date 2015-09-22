package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class GiaiPhuongTrinhTest {

	@Test
	public void test() {
		double a = 1;
        double b = 2;
        double c = -3;
        double delta = 5;
        double[] expectedResult = {1,-3};
        GiaiPhuongTrinh GT1 = new GiaiPhuongTrinh(1,2,-3);
        double[] result = GT1.giaiphuongtrinh();
        assertArrayEquals(expectedResult, result);

        fail("The test case is a prototype.");
	}

}
