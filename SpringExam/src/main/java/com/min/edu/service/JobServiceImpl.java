package com.min.edu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.min.edu.model.mapper.IJobDao;
import com.min.edu.vo.JobsVo;

@Service
public class JobServiceImpl implements IJobService {

	@Autowired
	private IJobDao dao;
	
	@Override
	public List<JobsVo> selAll() {
		return dao.selAll();
	}

	@Override
	public int insertJob(JobsVo vo) {
		return dao.insertJob(vo);
	}
	
	//성공하면 알아서 commit
	@Transactional(readOnly = true)
	@Override
	public int transactionJob(JobsVo vo) {
		int n = dao.insertJob(vo);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("val", vo.getMin_salary()*0.01d);
		map.put("id", vo.getJob_id());
		
		int m = dao.updateJob(map);
		vo.setMin_salary((int)(vo.getMin_salary()*0.01f));
		
		return n;
	}

}
