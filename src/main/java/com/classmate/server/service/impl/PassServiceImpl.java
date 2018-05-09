package com.classmate.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classmate.server.dao.mapper.PassMapper;
import com.classmate.server.model.Pass;
import com.classmate.server.model.PassExample;
import com.classmate.server.service.PassService;
@Service("passService")
public class PassServiceImpl implements PassService{
	@Autowired
	private PassMapper passMapper;

	@Override
	public Object passList(Integer userId) {
		PassExample example = new PassExample();
		example.createCriteria().andIdEqualTo(userId);
		return passMapper.selectByExample(example);
	}

	@Override
	public int insert(Pass pass) {
		return passMapper.insert(pass);
	}

	@Override
	public int update(Pass pass) {
		return passMapper.updateByPrimaryKeySelective(pass);
	}

	@Override
	public int delete(Pass pass) {
		return passMapper.deleteByPrimaryKey(pass.getId());
	}


}
