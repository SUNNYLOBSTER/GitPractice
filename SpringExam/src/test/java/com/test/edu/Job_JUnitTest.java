package com.test.edu;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.min.edu.model.mapper.IJobDao;
import com.min.edu.model.mapper.JobDaoImpl;
import com.min.edu.service.IJobService;
import com.min.edu.vo.JobsVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class Job_JUnitTest {
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Autowired
	private IJobService service;
	
//	@Test
	public void db_ConnectTest() {
		SqlSessionTemplate st = context.getBean("sqlSessionTemplate",SqlSessionTemplate.class);
		assertNotNull(st);
	}
	
//	@Test
	public void db_ConnectTest2() {
		assertNotNull(session);
	}
	
	@Test
	public void insertTest() {
		JobsVo vo = new JobsVo("IT_DEV", "Developer", 1000, 10000);
		int n = service.insertJob(vo);
		assertEquals(1, n);
	}
	
}
