package com.lieqihezi.maonaiyi;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ApplicationTest {

	@Test
	public void appStart(){
		String result = Application.start();
		assertEquals("start",result);
	}
}
