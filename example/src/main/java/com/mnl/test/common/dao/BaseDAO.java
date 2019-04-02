package com.mnl.test.common.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseDAO {

	@Autowired
	@Qualifier(value = "sessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;

	protected final SqlSession getSqlSession() {
		return sqlSessionTemplate;
	}

}
