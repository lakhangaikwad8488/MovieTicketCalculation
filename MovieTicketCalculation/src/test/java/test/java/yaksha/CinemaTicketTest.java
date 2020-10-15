package test.java.yaksha;

 import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;
import org.mockito.Mockito;

import main.java.yaksha.CinemaTicket;
import main.java.yaksha.TestUtils;

//@RunWith(MockitoJUnitRunner.class)
class CinemaTicketTest {

	//@Mock 	 
	//CinemaTicket p = mock(CinemaTicket.class);
	 
	@Test
	void testCalculateCost() throws IOException {
		CinemaTicket p = mock(CinemaTicket.class);
		//assertEquals(1970.00, t.calculateCost(10,"y","y","q"));
		//CinemaTicket t=new CinemaTicket();
		Mockito.when(p.calculateCost(10,"y","y","q")).thenReturn(1970.00);
		double actualTotal=p.calculateCost(10,"y","y","q");
		 TestUtils.yakshaAssert(TestUtils.currentTest(),(actualTotal==1970.00?true:false),TestUtils.businessTestFile);
 
		 
		// Mockito.when(s.generateBill(10,10,10)).thenReturn(1300.0);
			//double actualTotal=s.generateBill(10,10,10);
			// TestUtils.yakshaAssert(TestUtils.currentTest(),(actualTotal==1300.0?true:false),TestUtils.businessTestFile);

	}
	private CinemaTicket mock(Class<CinemaTicket> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}
	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}
	//@Test
	/*public void testExceptionConditon() throws Exception{
	yakshaAssert(currentTest(),true,boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {
	yakshaAssert(currentTest(),true,exceptionTestFile);
	}*/


}
