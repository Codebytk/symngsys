package com.teampl.stmngsys.test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

	public abstract List<Map> selectList();	
}
