package com.zengfeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zengfeng.dao")
public class SqlInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqlInjectionApplication.class, args);
	}

}
