package org.goldleaf.rest;

import org.goldleaf.api.TestRest;
import org.goldleaf.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestImpl implements TestRest{

	@Autowired
	TestService testService;
	
	public Object test(@PathVariable("userId") Integer userId) {
		return testService.test(userId);
	}

}
