package com.mnl.test.home.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mnl.test.common.dao.BaseDAO;
import com.mnl.test.home.vo.HomeVO;

@Repository
public class HomeDao  extends BaseDAO{
		
	public List<HomeVO> getList() throws Exception {
		
		return getSqlSession().selectList("getList");
	}		
}
