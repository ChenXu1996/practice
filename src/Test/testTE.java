package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import codeIns.TestMe;

public class testTE {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	TestMe tm=new TestMe();
	@Test
	//判定条件覆盖
	public void test() {
		assertEquals(13, tm.noSenseMtd(3,4,6,4));
		assertEquals(2, tm.noSenseMtd(1,6,5,-3));	
	}
	@Test
	//条件组合测试
	public void test2(){
		assertEquals(17, tm.noSenseMtd(5,1,6,4));
		assertEquals(11, tm.noSenseMtd(8,6,6,5));
		assertEquals(6, tm.noSenseMtd(-3,4,0,6));
		assertEquals(1, tm.noSenseMtd(0,10,-3,1));
	}
	
	@Test
	//基本路径测试
	public void test3(){
		assertEquals(7, tm.noSenseMtd(0,8,1,7));
		assertEquals(23, tm.noSenseMtd(9,1,2,8));
		assertEquals(21, tm.noSenseMtd(6,4,6,4));
	}
	@Test
	//循环的测试
	public void test4(){
		assertEquals(8, tm.noSenseMtd(3,5,6,7));
		assertEquals(20, tm.noSenseMtd(6,1,0,4));
		assertEquals(108, tm.noSenseMtd(100,14,8,4));
		assertEquals(1996, tm.noSenseMtd(666,4,661,4));
	}
}
