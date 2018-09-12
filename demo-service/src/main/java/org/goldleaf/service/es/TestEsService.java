package org.goldleaf.service.es;

import java.util.UUID;

import org.goldleaf.entity.es.TestEsBean;
import org.goldleaf.repository.EsBeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestEsService {

	@Autowired
	private EsBeanRepository esBeanRepository;
	
	public void saveInfoToEs(TestEsBean bean) {
		int a = 0;
		while (a < 10) {
			System.out.println(UUID.randomUUID().toString());
			a++;
		}
		if(bean == null) {
			throw new RuntimeException("error bean");
		}
		esBeanRepository.save(bean);
	}

	public void deleteInfoFromEs(Integer id) {
		if(id == null) {
			esBeanRepository.deleteAll();
		}else {
			esBeanRepository.deleteById(id);	
		}
	}

	public TestEsBean getInfoFromEs(Integer id) {
		return esBeanRepository.findById(id).get();
	}

}
