package com.finevt.awesome.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finevt.awesome.mapper.CommonMapper;
import com.finevt.awesome.service.CommonService;

@Component("CommonService")
public class CommonServiceImpl implements CommonService {
	@Autowired
	private CommonMapper mapper;
	
	@Override
	public String getHelloWorld() {
		// TODO Auto-generated method stub
		try {
			return mapper.getHelloWorld();
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
