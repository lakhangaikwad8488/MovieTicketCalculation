package test.java.yaksha;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.junit.Test;
import org.mockito.Mockito;

import main.java.yaksha.CinemaTicket;
import main.java.yaksha.TestUtils;

public class CinemaTkt {

	@Test
	public void test() throws IOException {
		CinemaTicket p = mock(CinemaTicket.class);
		//assertEquals(1970.00, t.calculateCost(10,"y","y","q"));
		//CinemaTicket t=new CinemaTicket();
		 when(p.calculateCost(10,"y","y","q")).thenReturn(1970.00);
		double actualTotal=p.calculateCost(10,"y","y","q");
		 TestUtils.yakshaAssert(TestUtils.currentTest(),(actualTotal==1970.00?true:false),TestUtils.businessTestFile);
 
		 
	}

}
