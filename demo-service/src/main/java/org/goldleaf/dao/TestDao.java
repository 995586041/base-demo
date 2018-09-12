package org.goldleaf.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.goldleaf.entity.TestEntity;

@Mapper
public interface TestDao {
	TestEntity getById(@Param("userId") Integer userId);
}
