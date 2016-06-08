package com.parfait.judge.iss01002;

import org.junit.Test;

import static com.parfait.judge.iss01002.Main.*;
import static org.junit.Assert.assertEquals;

public class MainTest {

	@Test
	public void testCalculate1() throws Exception {

		Point p1 = new Point("0", "0", "1");
		Point p2 = new Point("0", "0", "1");

		assertEquals(calculate(p1, p2), -1);
	}

	@Test
	public void testCalculate2() throws Exception {

		Point p1 = new Point("0", "0", "1");
		Point p2 = new Point("0", "0", "2");

		assertEquals(calculate(p1, p2), 0);
	}

	@Test
	public void testCalculate3() throws Exception {

		Point p1 = new Point("0", "0", "3");
		Point p2 = new Point("5", "0", "2");

		assertEquals(calculate(p1, p2), 1);
	}

	@Test
	public void testCalculate4() throws Exception {

		Point p1 = new Point("0", "0", "3");
		Point p2 = new Point("5", "0", "3");

		assertEquals(calculate(p1, p2), 2);
	}

	@Test
	public void testCalculate5() throws Exception {

		Point p1 = new Point("0", "0", "1");
		Point p2 = new Point("10", "0", "1");

		assertEquals(calculate(p1, p2), 0);
	}

	@Test
	public void testCalculate6() throws Exception {

		Point p1 = new Point("0", "0", "3");
		Point p2 = new Point("3", "4", "3");

		assertEquals(calculate(p1, p2), 2);
	}
}
