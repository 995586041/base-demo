package org.goldleaf.rest.es;

import org.goldleaf.api.es.TestEsRest;
import org.goldleaf.entity.es.TestEsBean;
import org.goldleaf.service.es.TestEsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEsRestImpl implements TestEsRest {

	@Autowired
	private TestEsService testEsService;
	
	@Override
	public String addInfoToEs(@RequestBody TestEsBean bean) {
		testEsService.saveInfoToEs(bean);
		return "ok";
	}

	@Override
	public Object deleteInfoFromEs(@RequestParam(value = "id", required = false)Integer id) {
		testEsService.deleteInfoFromEs(id);
		return "ok";
	}

	@Override
	public Object getInfoFromEs(@PathVariable("id") Integer id) {
		TestEsBean bean = testEsService.getInfoFromEs(id);
		return bean == null ? "no bean" : bean;
	}

}
