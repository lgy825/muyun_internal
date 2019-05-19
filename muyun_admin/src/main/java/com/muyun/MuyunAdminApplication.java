package com.muyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTransactionManagement// 启动注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
//@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages = {"com.muyun.back","com.muyun.appback","com.muyun.core.config"})
@MapperScan(basePackages = {"com.muyun.core.dao"})
public class MuyunAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuyunAdminApplication.class, args);
	}

}
