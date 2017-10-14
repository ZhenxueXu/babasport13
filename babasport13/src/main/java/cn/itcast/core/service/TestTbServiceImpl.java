package cn.itcast.core.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.dao.TestTbDao;

@Service
public class TestTbServiceImpl implements TestTbservice {

	@Autowired
	public TestTbDao testTbDao;
	
	public void addTestTb(TestTb testTb) {
		// TODO Auto-generated method stub
		testTbDao.addTestTb(testTb);
	}

}
