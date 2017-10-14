package cn.itcast;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.service.TestTbservice;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class TestTestTb {
	
	@Autowired
	private TestTbservice tbservice;
	
	@Test
	public void testTb() {
		TestTb testTb = new TestTb();
		testTb.setName("nick");
		tbservice.addTestTb(testTb);
	}

}
