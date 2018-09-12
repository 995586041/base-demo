package org.goldleaf.api.es;

import org.goldleaf.entity.es.TestEsBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试数据存储到ES
 */
@RequestMapping("/es")
public interface TestEsRest {
	
	@PostMapping("/add")
	Object addInfoToEs(TestEsBean bean);
	
	@GetMapping("/delete")
	Object deleteInfoFromEs(Integer id);
	
	@GetMapping("/get/{id}")
	@ResponseBody
	Object getInfoFromEs(Integer id);
}
