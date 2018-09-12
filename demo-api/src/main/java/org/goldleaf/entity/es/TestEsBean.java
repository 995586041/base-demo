package org.goldleaf.entity.es;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import lombok.Data;

@Document(indexName = "test1", type = "test2")
@Data
public class TestEsBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Field
	private String name;

	@Field
	private int age;

}
