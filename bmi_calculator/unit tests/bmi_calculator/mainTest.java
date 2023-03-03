package bmi_calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.junit.Test;
import org.junit.Test;

public class mainTest {

	@Test
	public void overweightTest() {
		var msg=new Main();
		assertEquals("You are overweight",msg.findmsg(5));
	}
	
	@Test
	public void obesemsgtest() {
		var msg=new Main();
		assertEquals("You are Obese",msg.findmsg(20));
	}
	@Test
	public void normalmsgtest() {
		var msg=new Main();
		assertEquals("Congratulations! You are normal",msg.findmsg(18.5));
	}
	@Test
	public void underweightmsgtest() {
		var msg=new Main();
		assertEquals("You are underweight",msg.findmsg(0));
	}
	
	//tests for find height function
	@Test
	public void heighttest() {
		var height=new Main();
		assertEquals(71.12,height.findheight(2,4),0.0);
	}

	//tests for find bmi function
	@Test
	public void bmitest() {
		var bmi=new Main();
		assertEquals(10000,bmi.findbmi(25,5),0);
	}

}
