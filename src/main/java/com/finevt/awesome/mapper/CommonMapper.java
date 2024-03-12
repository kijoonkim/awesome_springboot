package com.finevt.awesome.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CommonMapper {
	/**
	 * Hello World를 가져온다.
	 * @return String
	 * @throws Exception
	 */
	@Select("select 'Hello World'"
			+ " from dual"
			+ " where 1=1")
	public String getHelloWorld() throws Exception;

	
}