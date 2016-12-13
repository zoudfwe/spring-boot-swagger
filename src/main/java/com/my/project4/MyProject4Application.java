package com.my.project4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author zoukeqiang
 *
 */
@SpringBootApplication
@MapperScan("com.my.project4.mapper")
public class MyProject4Application {
	public static void main(String[] args) {
		SpringApplication.run(MyProject4Application.class, args);
	}
}
