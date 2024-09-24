package com.teampl.stmngsys;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.teampl.stmngsys.test.mapper.TestMapper;

@SpringBootTest
@MapperScan("com.teampl.stmngsys.test.mapper")
class StmngsysApplicationTests {

	@Autowired
	private TestMapper TestMapper;
	
	@Test
	void contextLoads() {
		List<Map> sl = TestMapper.selectList();
		for(Map sm : sl) {
			System.out.println("TEST1 : "+sm.get("TEST1")+ "TEST2:"+ sm.get("TEST2"));
		}
	}

}
