package org.goldleaf.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
public interface TestRest {
	
	@GetMapping("/{userId}")
	Object test(Integer userId);
}
