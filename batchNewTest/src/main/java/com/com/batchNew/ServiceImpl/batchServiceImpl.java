package com.com.batchNew.ServiceImpl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.com.batchNew.Service.batchService;


@Service("batchService")
public class batchServiceImpl implements batchService {
	
	
	@Override
	public void testBatch() {
		Date date = new Date();
		System.out.println(date +"¹èÄ¡Áß");
	}

}
