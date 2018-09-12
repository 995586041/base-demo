package org.goldleaf.api.es;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试log实时同步到ES
 */
@RequestMapping("/eslog")
public interface TestLogToEsRest {
	
	@GetMapping("/test")
	void test();
}
