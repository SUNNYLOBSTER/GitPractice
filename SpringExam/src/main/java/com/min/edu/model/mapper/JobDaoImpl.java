package com.min.edu.model.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import com.min.edu.vo.JobsVo;

@Repository
public class JobDaoImpl implements IJobDao {
	
	private String NS = "com.min.edu.model.mapper.JobDaoImpl.";

	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public List<JobsVo> selAll() {
		List<JobsVo> lists = session.selectList(NS+"selAll");
		return lists;
	}

	@Override
	public int insertJob(JobsVo vo) {
		int n = session.insert(NS+"insertJob",vo);
		return n;
	}

	@Override
	public int updateJob(Map<String, Object> map) {
		return session.insert(NS+"updateJob", map);
	}
	
	
	
}
