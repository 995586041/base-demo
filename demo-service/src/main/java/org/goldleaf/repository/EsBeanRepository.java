package org.goldleaf.repository;

import org.goldleaf.entity.es.TestEsBean;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

// TestEsBean为要存数据的类型,Integer为@id的类型
public interface EsBeanRepository extends ElasticsearchRepository<TestEsBean, Integer> {

}
