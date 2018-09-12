package org.goldleaf.rest.es;

import java.util.UUID;

import org.goldleaf.api.es.TestLogToEsRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLogToEsRestImpl implements TestLogToEsRest {

	private Logger logger = LoggerFactory.getLogger(getClass().getName());
	
	@Override
	public void test() {
		int n = 0;
		while(n < 20) {
			n++;
			logger.info("info" + UUID.randomUUID().toString());
		}
	}

}
