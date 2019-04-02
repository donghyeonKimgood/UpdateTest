package com.mnl.test.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnl.test.home.dao.HomeDao;
import com.mnl.test.home.vo.HomeVO;

@Service
public class HomeService {
	
	@Autowired
	private HomeDao homedao;
		
	
	public List<HomeVO> getList() throws Exception {
		
		return homedao.getList();
	}
}
