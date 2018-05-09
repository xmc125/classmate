package com.classmate.server.service;

import com.classmate.server.model.Pass;

public interface PassService {

	public Object passList(Integer userId);
	
	public int insert(Pass pass);
	
	public int update(Pass pass);
	
	public int delete(Pass pass);
	
}
