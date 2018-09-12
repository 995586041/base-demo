package org.goldleaf.service;

import org.goldleaf.dao.TestDao;
import org.goldleaf.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	private TestDao testDao;
	
	public Object test(Integer userId) {
		TestEntity entity = testDao.getById(userId);
		if(entity != null) {
			return entity.getName() + " " + entity.getAge();
		}else {
			return "no data";
		}
	}
}
