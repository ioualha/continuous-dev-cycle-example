package com.devopsinsight.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.embeddable.EJBContainer;

import org.junit.Test;

import com.devopsinsight.SimpleService;

/**
 *
 * @author Marcel Friedmann
 */
public class SimpleServiceTest {

	/**
	 * Test method for
	 * {@link com.devopsinisght.SimpleService#greet(java.lang.String)}.
	 */
	@Test
	public void testtestableMethod() throws Exception {
		String name = "DevOps";

		//Simply testing the EJB by instantiating the class
		try {

			SimpleService service = new SimpleService();
			String expResult = "Hello DevOps";
			String result = service.testableMethod(name).get();
			assertEquals(expResult, result);
		} finally {
		}
	}

}
